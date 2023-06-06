package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import jp.co.aforce.bean.Menu;
import jp.co.aforce.tool.Page;

/**
 * Servlet implementation class Search
 * @param <success>
 */
@WebServlet("/jp.co.aforce.servlet/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
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
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup("java:/comp/env/jdbc/book");
			Connection con=ds.getConnection();
			
			String keyword=request.getParameter("keyword");
			
			PreparedStatement st=con.prepareStatement("select * from product where name like ?");
			st.setString(1, "%"+keyword+"%");
			ResultSet rs=st.executeQuery();
			
			while (rs.next()) {			
			
				out.println(((Menu) rs).getMember_id());
				out.println(((Menu) rs).getPassword());
				out.println(((Menu) rs).getLast_name());
				out.println(((Menu) rs).getFirst_name());
				out.println(((Menu) rs).getGendar());
				out.println(((Menu) rs).getBirth_year());
				out.println(((Menu) rs).getBirth_mouth());
				out.println(((Menu) rs).getBirth_day());
				out.println(((Menu) rs).getJob());
				out.println(((Menu) rs).getMail_address());
				
			}
			st.close();
			con.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			Page.footer(out);
	}

}
