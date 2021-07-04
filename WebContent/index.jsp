<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<title>SPRING</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
</head>
<body>
</body>
<script type="text/javascript">
$(document).ready(()=>{
	$.ajax({
		url:"user/load/1",
		type:"post",
		success:(result)=>{
			console.log(result);
		}
	});
});

</script>
</html>