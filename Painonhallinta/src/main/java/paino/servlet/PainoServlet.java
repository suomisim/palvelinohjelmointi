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


@WebServlet("/painot")
public class PainoServlet extends HttpServlet {
	public static final String FRONT_PAGE = "WEB-INF/jsp/etusivu.jsp";
	private static final String INSIDE_PAGE = "WEB-INF/jsp/secure/inside.jsp";
	public static final String SESSION_ATTR_WEBUSER = "kayttajatiedot";

	private static final long serialVersionUID = 1L;
       
    public PainoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			List<PainoHenkilo> painohenkilot;
			int id = Integer.parseInt(request.getParameter("id"));
			String nimi = request.getParameter("nimi");
			Henkilo h = new Henkilo(id, nimi);

			try {
				HenkiloDAO hDao = new HenkiloDAO();
				painohenkilot = hDao.hae(h);
			} catch (DAOPoikkeus e) {
				throw new ServletException(e);
			}
			System.out.println(painohenkilot);
			request.setAttribute("painohenkilot", painohenkilot);
			request.getRequestDispatcher("WEB-INF/jsp/secure/inside.jsp").forward(request, response);
			
	}
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(INSIDE_PAGE).forward(request, response);
	}

}
