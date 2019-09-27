package fr.cesi.bibliotheque.filtre;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/* Servlet Filter implementation class AuthenticateFilter*/
@WebFilter("/auth/*")
public class AuthenticateFilter implements Filter {

    /* Default constructor.  */
    public AuthenticateFilter() {
        // TODO Auto-generated constructor stub
    }

    /* @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /* @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        // place your code here

        // pass the request along the filter chain
        HttpServletRequest httpRequest = (HttpServletRequest) request ;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession();
        String user = (String)session.getAttribute("username") ;
         if (user == null) {
             res.sendRedirect( httpRequest.getContextPath() + "/jsp/Login.jsp" );
         } 
         else{
             chain.doFilter( request, response );
         }

    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

}