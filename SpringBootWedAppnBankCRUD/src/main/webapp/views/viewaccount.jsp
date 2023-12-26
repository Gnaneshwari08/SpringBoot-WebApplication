<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
    <p style="background-color: greenyellow">
        <a href="/account">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposite">Deposite</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/close">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/about">AboutUs</a>
        </p>
        <c:if test="${banks==null}">
    <p>Account Does Not Exist!</p>
</c:if>
<c:if test="${banks!=null}">
<table border="1" width="70%" cellpadding="2">
<tr>
<th>ACCOUNT NO</th>
<th>USERNAME</th>
<th>AMOUNT</th>
<th>ADDRESS</th>
<th>PHONE</th>
</tr>
    
    <p>Welcome ${banks.name}</p>
<tr>
<td>${banks.ano}</td>
<td>${banks.name}</td>
<td>${banks.amt}</td>
<td>${banks.add}</td>
<td>${banks.mno}</td>
</tr>


</table></c:if>
</center>