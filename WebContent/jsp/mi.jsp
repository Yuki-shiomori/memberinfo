<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../jp.co.aforce.servlet/mi" method="post">
<h1>ログイン画面</h1>

<h2>会員番号</h2>
<input type="text" name="id">

<h2>パスワード</h2>
<input type="password" placeholder="半角数字8文字" name="password">

<p><input type="submit" value="ログイン">

<p><a href="menu.jsp">会員情報登録等はこちらをクリック<br>
<!-- エラー -->
<p>${error}</p>

</form>
</body>
</html>