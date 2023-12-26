<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	img{
		float:left;
		padding-left: 11cm;
	}
</style> 
</head>
<body>
<center>
			<img src="sdfclogo.png" width="100" height="100" >	
            <h1 style="padding-right: 10cm">SDFC BANK</h1><p></p>
            <h3 style="padding-right: 10cm">EXTRAORDINARY SERVICES</h3><P></P>
            <p style="background-color: lightgreen">
            <a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/deposite">Deposite</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/close">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/about">AboutUs</a>
            </p>
            <h3>OPEN ACCOUNT FORM</h3>
            <form action="/register" method="post">
            <table>
            <tr><td>Account Number:</td>
            <td><input type="text" name="ano"></td></tr>
            <tr><td>Name:</td>
            <td><input type="text" name="name"></td></tr>
            <tr><td>Password:</td>
            <td><input type="password" name="psw"></td></tr>
            <tr><td>Confirm_Password:</td>
            <td><input type="password" name="cpsw"></td></tr>
            <tr><td>Amount:</td>
            <td><input type="text" name="amt"></td></tr>
            <tr><td>Address:</td>
            <td><input type="text" name="add"></td></tr>
            <tr><td>Mobile No:</td>
            <td><input type="text" name="mno"></td></tr>
            <td></td><td><input type="hidden" name="active" value=1></td>
            <tr><td><input type="submit" value="submit"></td>
            <td><input type="reset" value="clear"></td></tr>
            </table>
            </form>
        </center>
</body>
</html>