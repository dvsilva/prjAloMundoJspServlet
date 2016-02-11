package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AloMundo
 */
@WebServlet("/alo")
public class AloMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AloMundo() {
        super();
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Servlet - Recebe uma frase via QueryString
		// Exemplo: http://localhost:8080/prjAloMundo/alo?frase=olá mundo
        PrintWriter out = response.getWriter();	
        response.setContentType("text/html");
		
        String valor = request.getParameter("frase");
        
        out.println("<html>");
        out.println("<body>");
        out.println("Primeira servlet :p");
        out.println("<h1>" + valor + "</h1>");
        out.println("</body>");
        out.println("</html>");
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
