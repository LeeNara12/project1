package project1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro01")
public class pro01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("213454354321");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		System.out.println("수정");
		System.out.println("수정2");
<<<<<<< HEAD
		System.out.println("서한수");
		System.out.println("커밋");
=======

		System.out.println("서한수");
>>>>>>> 643345b23351f9e56f3d87850b7384642af767ab

	}

}
