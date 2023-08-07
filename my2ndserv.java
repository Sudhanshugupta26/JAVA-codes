package servs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class my2ndserv
 */
public class my2ndserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public my2ndserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try

		{

		PrintWriter out = response.getWriter();

		// Accessing Textbox value from request.

		String nm = request.getParameter("name");

		// Accessing selected list values from request.

		String[] hb = request.getParameterValues("hobbies");

		// Accessing names of all parameters available in request.

		java.util.Enumeration<String> paramNames = request.getParameterNames();

		//Accessing MIME type of request body.

		String cntype = request.getContentType();

		//Accessing size of content in request body.

		int size = request.getContentLength();

		out.println("Employee :- "+nm+ "has the following hobbies:-");

		for(String h:hb)

		{

		out.println(h);

		}

		out.println("Parameter Name are - ");

		while(paramNames.hasMoreElements())

		{

		String pn = paramNames.nextElement();

		out.println(pn);

		}

		out.println("Content type is:- "+cntype);

		out.println("Content Size is:- "+size+" bytes");

		}

		catch (Exception ex)

		{

		System.out.println(ex);

		}

		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
