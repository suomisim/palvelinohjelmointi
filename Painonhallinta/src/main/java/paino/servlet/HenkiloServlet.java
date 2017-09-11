package paino.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import paino.bean.*;
import paino.dao.*;


@WebServlet("/henkilot")
public class HenkiloServlet extends HttpServlet {
	public static final String FRONT_PAGE = "WEB-INF/jsp/etusivu.jsp";
	private static final String INSIDE_PAGE = "WEB-INF/jsp/secure/inside.jsp";

	public static final String SESSION_ATTR_WEBUSER = "kayttajatiedot";

	private static final long serialVersionUID = 1L;
       
    public HenkiloServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String date = request.getParameter("date");
			int id = Integer.parseInt(request.getParameter("id"));
			String nimi = request.getParameter("nimi");
			double paino = Double.parseDouble(request.getParameter("paino"));
		
			Henkilo h = new Henkilo(date, id, nimi, paino);

			try {
				HenkiloDAO hDao = new HenkiloDAO();
				hDao.lisaa(h);
			} catch (DAOPoikkeus e) {
				throw new ServletException(e);
			}
		
		
			response.sendRedirect("henkilot"); //redirect doGet
			
	}
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(INSIDE_PAGE).forward(request, response);
	}

}
