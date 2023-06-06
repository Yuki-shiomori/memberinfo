package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.bean.Menu;
import jp.co.aforce.dao.MenuDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/jp.co.aforce.servlet/mi")
public class MI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MI() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}



	/**
	 * @param st 
	 * @param id 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();

		String member_id=request.getParameter("member_id");
		String password=request.getParameter("password");
		String last_name=request.getParameter("last_name");
		String first_name=request.getParameter("first_name");
		String gendar=request.getParameter("gendar");
		String birth_year=request.getParameter("birth_year");
		String birth_mouth=request.getParameter("birth_mouth");
		String birth_day=request.getParameter("birth_day");
		String job=request.getParameter("job");
		String phone=request.getParameter("phone");
		String mail_address=request.getParameter("mail_address");
		
		
		
		MenuDao dao= new MenuDao();
		Menu u;
		
		try {
			u =dao.search(member_id);
			if(u !=null){
				session.setAttribute("success", u);
			    request.getRequestDispatcher("../jsp/mis.jsp").forward(request,response);
			}else {				
				session.setAttribute("error","IDもしくはパスワードが違います");
				response.sendRedirect("/MemberInformation/jsp/mi.jsp");
			}

				
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		

		}
	}

	

	
