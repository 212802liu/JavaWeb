package cn.itcast.cookie.example;

//import org.apache.tomcat.util.http.parser.Cookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;

//import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class LastAccessServlet
 */
public class LastAccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setHeader("Refresh", "3");
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("���Ǽٵİɣ�");
		String lastAccessTime=null;
		//javax.servlet.http.Cookie[] cookies=request.getCookies();
		//Cookie[] cookies=request.getCookies();
		Cookie[] cookies=request.getCookies();
		for(int i=0;cookies!=null&&i<cookies.length;i++) {
			if("lastAccess".equals(cookies[i].getName())) {
				lastAccessTime=cookies[i].getValue();
				break;
			}
			
		}
		if(lastAccessTime == null) {
			response.getWriter().print("�����״η��ʱ�վ��");
		}
		else {
			response.getWriter().print("���ϴη��ʵ�ʱ���ǣ�"+lastAccessTime);
		}
		response.getWriter().print("���Ǽٵİɣ�");
		String currentTime=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		response.getWriter().print(currentTime);
		
		Cookie cookie=new Cookie("lastAccess",currentTime);
		System.out.println(cookie.getValue());
		cookie.setMaxAge(1000000);
		response.addCookie(cookie);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
