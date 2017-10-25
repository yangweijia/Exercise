

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school.SchoolBean;
/**
 * Servlet implementation class DoSchoolServlet
 */
@WebServlet("/DoSchoolServlet")
public class DoSchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoSchoolServlet() {
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
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String school=request.getParameter("school");
		SchoolBean schoolbean=new SchoolBean();
		schoolbean.setName(name);
		schoolbean.setSchool(school);
		request.setAttribute("info",schoolbean);	
		String forwardUrl;
		if(name=="") 
			forwardUrl="/noname.jsp";
		else if(school=="")
			forwardUrl="/noschool.jsp";
		else
			forwardUrl="/ok.jsp";
		RequestDispatcher dispatcher =request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

}
