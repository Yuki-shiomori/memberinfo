package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jp.co.aforce.bean.Menu;

public class MenuDao extends DAO {
//public int search(String password, String last_name, String first_name, String gendar, String birth_year,
//		String birth_mouth, String birth_day, String job, String phone, String mail_address) throws Exception {
//		
////		
//		Menu u = new Menu();
//		
//		Connection con = getConnection();
//		
//		PreparedStatement st = con.prepareStatement("SELECT * FROM mi where member_id = ? and password= ?");
//		
//		st.setString(1, password);
//		st.setString(2, last_name);
//		st.setString(3, first_name);
//		st.setString(4, gendar);
//		st.setString(5, birth_year);
//		st.setString(6, birth_mouth);
//		st.setString(7, birth_day);
//		st.setString(8, job);
//		st.setString(9, phone);
//		st.setString(10, mail_address);
//		ResultSet rs = st.executeQuery();
//		
//		while(rs.next()){
//			u.setId(rs.getString("member_id"));
//			u.setPassword(rs.getString("password"));
//			u.setLast_name(rs.getString("last_name"));
//			u.setFirst_name(rs.getString("first_name"));
//			u.setGendar(rs.getString("gendar"));
//			u.setBirth_year(rs.getString("birth_year"));
//			u.setBirth_mouth(rs.getString("birth_mouth"));
//			u.setBirth_mouth(rs.getString("birth_day"));
//			u.setJob(rs.getString("job"));
//			u.setPhone(rs.getString("phone"));
//			u.setMail_addrss(rs.getString("Mail_address"));
//			
//			
//		}
//		return u;
//	}
//	
	//登録
	
	public int insert(Menu user) throws Exception {
		
		Connection con = getConnection();
		
		
		MenuDao dao = new MenuDao();

		PreparedStatement st = con.prepareStatement("insert into mi values (?,?,?,?,?,?,?,?,?,?,?)");
		
		st.setString(1, user.getMember_id());
		st.setString(2, user.getPassword());
		st.setString(3, user.getLast_name());
		st.setString(4, user.getFirst_name());
		st.setString(5, user.getGendar());
		st.setString(6, user.getBirth_year());
		st.setString(7, user.getBirth_mouth());
		st.setString(8, user.getBirth_day());
		st.setString(9, user.getJob());
		st.setString(10, user.getPhone());
		st.setString(11, user.getMail_address());
		
		int line = st.executeUpdate();
		
		st.close();
		con.close();
		
		return line;
	}
//	public Connection getConnection() {
//		
//		return null;
//	}
//	public List<Menu> search(String string, String string2) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	public Menu search(String id) {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}

	public Menu search(String member_id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
	
	//更新



//削除



