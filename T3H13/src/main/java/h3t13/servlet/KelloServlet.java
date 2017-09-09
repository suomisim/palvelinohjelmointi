package h3t13.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h3t13.kello.Kello;
import h3t13.kello.SuomiKello;
import h3t13.kello.GmtIsoKello;
import h3t13.kello.SysteemiKelloLahde;


/**
 * Servlet implementation class KelloServlet
 */
@WebServlet("/kello")
public class KelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public KelloServlet() {
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Kello kello = new GmtIsoKello(new SysteemiKelloLahde());

		
		request.setAttribute("pvm", kello.getPvm());
		request.setAttribute("aika", kello.getAika());
		request.getRequestDispatcher("WEB-INF/jsp/kello.jsp").forward(request, response);
	}

}
