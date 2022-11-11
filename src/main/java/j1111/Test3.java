package j1111;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atom") // 이게 컨트롤러
public class Test3 extends HttpServlet { // 웹을 상속받아야하니까 extends HttpServlet
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	System.out.println("이곳은 Get입니다.");
  }
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	System.out.println("이곳은 Post입니다.");
  }
}
