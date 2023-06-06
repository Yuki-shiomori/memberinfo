package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.bean.Menu;
import jp.co.aforce.dao.MenuDao;
import jp.co.aforce.tool.Page;

/**
 * Servlet implementation class Setup
 * @param <Set>
 */
@WebServlet("/jp.co.aforce.servlet/setup")
public class Setup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Setup() {
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
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		try {
//		
			
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
			
			
			MenuDao dao = new MenuDao();
			
			
				
//				List<Menu> list =dao.search("password");
//				if(list.size()>0) {
//					out.println("既に使用されています。");
//					request.getRequestDispatcher("../jsp/setup.jsp").forward(request,response);
//				}
				
				Menu m=new Menu();
				
				String error ="";
				if(error.length()==0) {
				m.setMember_id(member_id);
				m.setPassword(password);
				m.setLast_name(last_name);
				m.setFirst_name(first_name);
				m.setGendar(gendar);
				m.setBirth_year(birth_year);
				m.setBirth_mouth(birth_mouth);
				m.setBirth_day(birth_day);
				m.setJob(job);
				m.setPhone(phone);
				m.setMail_addrss(mail_address);
				
				
				
				int line=dao.insert(m);
				
				if (line < 0) {
					out.println("登録に失敗しました。");
				    request.getRequestDispatcher("../jsp/setup.jsp").forward(request,response);
				}else {
				    session.setAttribute("success", "登録に成功しました。");
					request.getRequestDispatcher("../jsp/mis.jsp").forward(request,response);
				}
				
				}
				
			}catch(Exception e){
				e.printStackTrace(out);
				return;
			}
			Page.footer(out);
		}
	}


