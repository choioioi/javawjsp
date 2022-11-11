package j1111;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/test10Ok")
public class Test10Ok extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글처리
		request.setCharacterEncoding("utf-8"); // 요청하는 것, 밑에 2개는 응답하는 것
		response.setCharacterEncoding("utf-8"); // 얘는 생략할 수도 있음
		response.setContentType("text/html; charset=utf-8"); // 얘는 생략하면 안됨
		
		String name = request.getParameter("name");
  	int age = Integer.parseInt(request.getParameter("age"));
  	
  	System.out.println("성명 : " + name);
  	System.out.println("나이 : " + age);
	}
}
