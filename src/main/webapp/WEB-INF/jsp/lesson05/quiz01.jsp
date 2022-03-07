<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리(1)</title>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<h2>1. JSTL core 변수</h2>
	<c:set var="number1" value="36" />
	<c:set var="number2">3</c:set>
	<h3>첫번째 숫자: ${number1}</h3>
	<h3>두번째 숫자: ${number2}</h3>
	
	<h2>2. JSTL core 연산</h2>
	<h3>더하기: ${number1 + number2}</h3>
	<h3>빼기: ${number1 - number2 }</h3>
	<h3>곱하기: ${number1 * number2}</h3>
	<h3>나누기: ${number1 / number2}</h3>
	
	<h2>3. JSTL core out</h2>
	<c:out value="<title>core out</title>" />
	
	<h2>4. JSTL core if</h2>
	<c:set var="avg" value="${(number1 + number2) / 2 }"/>
	<c:choose>
		<c:when test="${avg >= 10}"><h1>${avg}</h1></c:when>
		<c:otherwise><h3>${avg}</h3></c:otherwise>
	</c:choose>
	
	<h2>5. JSTL core if</h2>
	<c:if test="${number1 * number2 > 100}">
		<c:out value="<script>alert('너무 큰 수 입니다.');</script>" escapeXml="false" />
	</c:if>
	

	
</body>
</html>