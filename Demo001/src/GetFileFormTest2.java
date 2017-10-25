

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class GetFileFormTest2
 */
@WebServlet("/GetFileFormTest2")
public class GetFileFormTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFileFormTest2() {
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
		MultipartRequest request1=new MultipartRequest(request,"../");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		Enumeration paramnames=request1.getParameterNames();
		while(paramnames.hasMoreElements()) {
			String paramName=(String)paramnames.nextElement();
			out.println(toUTF8(paramName));
			
			String[] paramValues=request1.getParameterValues(paramName);
			if(paramValues.length==1) {
				String paramValue=paramValues[0];
				if(paramValue.length()==0)
					out.println(toUTF8("No value"));
				else
					out.println(toUTF8(paramValue));
				}
			else {
				for(int i=0;i<paramValues.length;i++) {
					out.println(toUTF8(paramValues[i]));
				}
				}
				
			}
	}

	protected String toUTF8(String paramName) throws UnsupportedEncodingException {
		paramName=new String(paramName.getBytes("gbk"),"UTF-8");
		return paramName;
	}
	
	 protected boolean isParameterNull(String p) {
		 if(p==null)
			 return true;
		 else 
			 return false;
	 }

}
