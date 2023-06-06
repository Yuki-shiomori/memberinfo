package jp.co.aforce.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Menu implements Serializable, List<Menu>{
	private String member_id;
	private String password;
	private String last_name;
	private String first_name;
	private String gendar;
	private String birth_year;
	private String birth_mouth;
	private String birth_day;
	private String job;
	private String phone;
	private String mail_address;
	
	
	
	public String getMember_id() {
		return member_id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getGendar() {
		return gendar;
	}
	
	public String getBirth_year() {
		return birth_year;
	}
	
	public String getBirth_mouth() {
		return birth_mouth;
	}
	
	public String getBirth_day() {
		return birth_day;
	}
	
	public String getJob() {
		return job;		
	}
	
	public String getPhone() {
	   return phone;
	}
	
	public String getMail_address() {
		return mail_address;
	
	}
	
	public void setMember_Id(String member_id) {
		this.member_id = member_id;
		
	}
	
	public void setPassword(String password) {
		this.password=password;
		
	}
	
	public void setLast_name(String last_name) {
		this.last_name=last_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name=first_name;
	}
	
	public void setGendar(String gendar) {
		 this. gendar=gendar;
	}
	
	public void setBirth_year(String string) {
		this.birth_year = string;
		
	}
	
	
	public void setBirth_mouth(String string) {
		this.birth_mouth = string;
		
	}
	
	public void setBirth_day(String string) {
		this.birth_day = string;
		
	}
	
	public void setJob(String job) {
		 this. job=job;
	}
	
	public void setPhone(String string) {
		this.phone=string;
		
	}
	public void setMail_addrss(String string) {
		this.mail_address = string;
		
	}

	@Override
	public int size() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Iterator<Menu> iterator() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean add(Menu e) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Menu> c) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Menu> c) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void clear() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public Menu get(int index) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Menu set(int index, Menu element) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void add(int index, Menu element) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public Menu remove(int index) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public ListIterator<Menu> listIterator() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ListIterator<Menu> listIterator(int index) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Menu> subList(int fromIndex, int toIndex) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setMember_id(String member_id2) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	

	
	
	
	
}
