package t1h14.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import t1h14.bean.Kirja;


@WebServlet("/nayta_kirja")
public class KirjaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public KirjaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//paketoidaan requestin parametrit yhteen olioon
		String knimi = request.getParameter("kirjanimi");
		String kirjoittaja = request.getParameter("kirjoittaja");
		String isbn = request.getParameter("isbn");
		Kirja kirja = new Kirja(knimi, kirjoittaja, isbn);
		
		//tallennetaan luotu olio requestin atribuutiksi
		request.setAttribute("kirja", kirja);
		
		//ohjataan pyyntö jsp-sivulle, joka hoitaa tulostuksen muotoilun
		request.getRequestDispatcher("nayta_tiedot.jsp").forward(request, response);
	}

}
