package fr.cesi.bibliotheque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cesi.bibliotheque.classe.Livres;
import fr.cesi.bibliotheque.classe.LivresDAO;


/**
 * Servlet implementation class AddLivreServlet
 */
@WebServlet("/AddLivre")
public class AddLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLivreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Livres mlivre = new Livres(Long.parseLong(request.getParameter("id")),request.getParameter("titre"),request.getParameter("auteur"), true);
		
		LivresDAO.addLivre(mlivre);
		
		/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListeLivre");
		requestDispatcher.forward(request, response);*/
		response.sendRedirect(request.getContextPath() + "/ListeLivre"); 
	}

}
