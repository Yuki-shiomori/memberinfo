<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="../jp.co.aforce.servlet/setup" method="post">
<h1>会員情報登録</h1>

<h2>会員番号</h2>
<p><input type="text" placeholder="半数角数字" name="member_id"></p>

<h2>パスワード</h2>
<p><input type="password" placeholder="半角数字8文字" name="password"></p>

<h2>名前</h2>
<p>姓<input type="text" name="last_name">  名<input type="text" name="first_name"></p>

<h2>性別</h2>
<input type="radio" name="gendar" value="男">男
<input type="radio" name="gendar" value="女">女

<h2>生年月日</h2>
<h3>年</h3>
<select name="birth_year">
<option value="">--</option>
<option value="1990">1990</option>
<option value="1991">1991</option>
<option value="1992">1992</option>
<option value="1993">1993</option>
<option value="1994">1994</option>
<option value="1995">1995</option>
<option value="1996">1996</option>
<option value="1997">1997</option>
<option value="1998">1998</option>
<option value="1999">1999</option>
<option value="2000">2000</option>
<option value="2001">2001</option>
<option value="2002">2002</option>
<option value="2003">2003</option>
<option value="2004">2004</option>
<option value="2005">2005</option>
<option value="2006">2006</option>
<option value="2007">2007</option>
<option value="2008">2008</option>
<option value="2009">2009</option>
<option value="2010">2010</option>
<option value="2011">2011</option>
<option value="2012">2012</option>
<option value="2013">2013</option>
<option value="2014">2014</option>
<option value="2015">2015</option>
<option value="2016">2016</option>
<option value="2017">2017</option>
<option value="2018">2018</option>
<option value="2019">2019</option>
<option value="2020">2020</option>
<option value="2021">2021</option>
<option value="2022">2022</option>
<option value="2023">2023</option>
</select>


<h3>月</h3>
<select name="birth_mouth">
<option value="">--</option>
<option value="01">1</option>
<option value="02">2</option>
<option value="03">3</option>
<option value="04">4</option>
<option value="05">5</option>
<option value="06">6</option>
<option value="07">7</option>
<option value="08">8</option>
<option value="09">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</select>

<h3>日</h3>
<select name="birth_day">
<option value="">--</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>

<h2>職業</h2>
<select name="job">
<option value="">--</option>
<option value="会社員">会社員</option>
<option value="自営業">自営業</option>
<option value="学生">学生</option>
<option value="その他">その他</option>
</select>


<h2>電話番号</h2>
<p><input type="text" placeholder="半角数字ハイフンなし" name="phone"></p>

<h2>メールアドレス</h2>
<p><input type="mail" name="mail_address"></p>




<input type="submit"name="set"  value="登録">
<a href="setup.jsp"/><input type="reset" name="reset" value="リセット">
<a href="menu.jsp"/><input type="submit" name="return" value="戻る">
</form>
<!-- エラー -->
<p>${error2}</p>

</body>
</html>