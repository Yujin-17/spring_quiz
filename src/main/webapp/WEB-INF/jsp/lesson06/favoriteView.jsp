<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<h1>즐겨찾기 추가하기</h1>
		
		<div class="form-group">
			<label for="name">제목</label>
			<input type="text" id="name" class="form-control">
		</div>
		<div class="form-group">
			<label for="url">URL 주소</label>
			<div class="d-flex">
				<input type="text" id="url" class="form-control">
				<button type="button" class="btn btn-info ml-3" id="urlCheckBtn">중복확인</button>
			</div>
		</div>
		
		<button type="button" id="addFavoriteBtn" class="btn btn-success btn-block">추가</button>
	</div>
	
<script>
	$(document).ready(function() {
		$('#addFavoriteBtn').on('click', function(e) {
			var name = $('#name').val().trim();
			var url = $('#url').val().trim();
				
			if (name == '') {
				alert("제목을 입력하세요.");
				return;
			}
				
			if (url == '') {
				alert("주소를 입력하세요.");
				return;
			}
				
			if (url.startsWith("http") == false && url.startsWith("https") == false) {
				alert("주소 형식이 잘못되었습니다.");
				return;
			}
			$('#urlCheckBtn').on('click', function(e){
				
				let name = $('#url').val().trim();
				
				if(url == ''){
					$('#urlCheckBtn').append('<span class="text-danger">중복된 url 입니다.</span>')
				}else{
					$('#urlCheckBtn').append('<span class="text-danger">저장 가능한 url 입니다.</span>')
				}
			
		
			
			
			$.ajax({
					// Request
					type: "post"		// JSON이기 때문에 ""로 감싸기
					, url: '/lesson06/quiz01/add_favorite'		// 아작스의 결과는 무조건 String
					, data: {"name":name, "url":url}	// JSON
			
					// response 
					, success: function(data) {		// url에서 리턴된 json String을 object로 변환해준다. (jquery ajax함수가)
						//- AJAX 통신 후 response로는 String 또는 JSON이 리턴되어야 한다.
						//alert(data.result);
						if(data.result == "success"){
							location.href="/lesson06/quiz01/favoriteList"
						}
					}, error:function(e) {
						alert(e); 		// [Object object]
					} 
				});
			});
			
		});
	</script>
</body>
</html>