package example01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.group.Response;

/**
 * Servlet implementation class ListBookServlet
 */
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Collection<book> books=bookDB.getAll();
		out.print("��վ�ṩ��ͼ���У�<br/>");
		for(book b:books) {
//			String url="/shoppingCart/PurchaseServlet?id="+abook.getId();
//			out.print(abook.getName()+"<a href='"+url+"'>�������<a/><br/>");
			String name=b.getName();
			String id=b.getId();
			String url="<a href='/shoppingCart/PurchaseServlet?id="+id+"'>�������<a/>";
			out.print("ͼ�����ƣ�"+name+"  "+url+"<br/>");
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
