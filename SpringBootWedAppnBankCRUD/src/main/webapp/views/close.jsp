<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type=""css/text">
	img{
		float:left;
		padding-left: 11cm;
	}
</style>
</head>
<body>
<center>
			<img src="sdfclogo.png" width="100" height="100">
            <h1 style="padding-right: 10cm">SDFC BANK</h1><p></p>
            <h3 style="padding-right: 10cm">EXTRAORDINARY SERVICES</h3><P></P>
            <p style="background-color: lightgreen">
            <a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/account">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/deposite">Deposite</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/about">AboutUs</a>
            </p>
            <h3>CLOSE ACCOUNT</h3>
            <form:form action="/closeac" method="POST">
            <table>
            <tr><td>Account Number:</td>
            <td><input type="number" name="ano"/></td></tr>
            <tr><td>Name:</td>
            <td><input type="text" name="name"/></td></tr>
            <tr><td>Password:</td>
            <td><input type="password" name="psw"/></td></tr>
            <tr><td><input type="submit" value="submit"></td>
            <td><input type="reset" value="clear"></td></tr>
            </table>
            </form:form>
        </center>
</body>
</html>