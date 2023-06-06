<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String member_id=request.getParameter("member_id");
String password=request.getParameter("password");
String last_name=request.getParameter("last_name");
String first_name=request.getParameter("first_name"); 
String birth_year=request.getParameter("birth_year");
String birth_mouth=request.getParameter("birth_mouth");
String birth_day=request.getParameter("birth_day");
String gendar=request.getParameter("gendar");
String job=request.getParameter("job");
String phone=request.getParameter("phone");
String mail_address=request.getParameter("mail_address");
%>

<p>会員番号 <%=member_id%></p>
<p>名前 <%=last_name%><%=first_name %></p>
<p>性別 <%=gendar%></p>
<p>生年月日 <%=birth_year%><%=birth_mouth %><%=birth_day %></p>
<p>職業 <%=job%></p>
<p>電話番号 <%=phone%></p>
<p>メールアドレス <%=mail_address%></p>

<p><a href="menu.jsp"/>会員情報更新等はこちらをクリック</p>
<p><a href="mi.jsp"/>ログアウト</p>
</body>
</html>