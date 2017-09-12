

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetFormTest02
 */
@WebServlet("/GetFormTest02")
public class GetFormTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFormTest02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		Enumeration paramnames=request.getParameterNames();
		while(paramnames.hasMoreElements()) {
			String paramName=(String)paramnames.nextElement();
			out.println(paramName+":");
			
			String[] paramValues=request.getParameterValues(paramName);
			if(paramValues.length==1) {
				String paramValue=paramValues[0];
				if(paramValue.length()==0)
					out.println("No value");
				else
					out.println(paramValue);
				}
			else {
				for(int i=0;i<paramValues.length;i++) {
					out.println(paramValues[i]);
				}
				}
				
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
