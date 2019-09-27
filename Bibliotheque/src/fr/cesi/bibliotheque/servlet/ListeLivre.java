package fr.cesi.bibliotheque.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cesi.bibliotheque.classe.Livres;
import fr.cesi.bibliotheque.classe.LivresDAO;

/**
 * Servlet implementation class ListeLivre
 */
@WebServlet("/ListeLivre")
public class ListeLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeLivre() {
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
		doGet(request, response);
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		/*List<Livres> mesLivres = LivresDAO.getAllProducts();
		request.setAttribute("MesLivres", mesLivres);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jsp/ListeLivre.jsp");
		requestDispatcher.forward(request, response);*/
		
		response.sendRedirect(request.getContextPath() + "/jsp/ListeLivre.jsp"); 
		
		
    }

}
