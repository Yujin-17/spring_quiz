<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과거 날씨</title>

<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<style>
nav{width:200px; height:1000px}
section{width:1000px; height:1000px}
.img{width:100px; height:50px}
</style>

</head>
<body>
<div class="container">
	<div class="d-flex">
		<nav class=bg-info><img class="img" src="/image/logo.png" alt="사진">
			<ul class="nav flex-column">
			  <li class="nav-item">
			    <a class="nav-link" href="#">날씨</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="#">날씨입력</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="#">테마날씨</a>
			  </li>
			   <li class="nav-item">
			    <a class="nav-link" href="#">관측 기후</a>
			  </li>
			</ul>
		</nav>
		<section class="bg-success">
			<table>
				<thead>
					<tr>
						<th>날짜</th>
						<th>날씨</th>
						<th>기온</th>
						<th>강수량</th>
						<th>미세먼지</th>
						<th>풍속</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${ }</td>
				</tbody>	
			</table>
		</section>	
	</div>
	<footer></footer>

</div>


</body>
</html>