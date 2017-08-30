package t1h20.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import t1h20.bean.Henkilo;
import t1h20.dao.DAOPoikkeus;
import t1h20.dao.HenkiloDAO;


/**
 * Servlet implementation class HenkiloServlet
 */
@WebServlet("/henkilot")
public class HenkiloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HenkiloServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
;
		String button = request.getParameter("button");
		
		if ("lisaa".equals(button)) {
			String enimi = request.getParameter("etunimi");
			String snimi = request.getParameter("sukunimi");
			Henkilo h = new Henkilo(enimi, snimi);

		try {
			HenkiloDAO hDao = new HenkiloDAO();
			hDao.lisaa(h);
		} catch (DAOPoikkeus e) {
			throw new ServletException(e);
		}
		
		
		response.sendRedirect("henkilot"); //redirect doGet
	} else {
		
		int id = Integer.parseInt(request.getParameter("button"));
		String enimi = request.getParameter("etunimi");
		String snimi = request.getParameter("sukunimi");
		Henkilo h = new Henkilo(id,enimi, snimi);
		
		try {
			HenkiloDAO hDao = new HenkiloDAO();
			hDao.poista(h);
		} catch (DAOPoikkeus e) {
			throw new ServletException(e);
		}
		
		response.sendRedirect("henkilot"); //redirect doGet
	}
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Henkilo> henkilot;
		
		try {
			//tietokannasta henkilöt
			HenkiloDAO hDao = new HenkiloDAO();
			henkilot = hDao.haeKaikki();
		} catch(DAOPoikkeus e) {
			throw new ServletException(e);
		}
		
		//requestiin talteen
		request.setAttribute("henkilot", henkilot);
		
		//jsp hoitaa muotoilun
		request.getRequestDispatcher("henkilot.jsp").forward(request, response);
		
	}
	

}
