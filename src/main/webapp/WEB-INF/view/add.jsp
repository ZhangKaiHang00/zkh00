<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="kk/index3.css">
<script type="text/javascript" src="kk/jquery-1.8.3.js"></script>
<script type="text/javascript" src="kk/WdatePicker.js"></script>
<script type="text/javascript">
function add(){
	$.post("add",$("form").serialize(),function(flag){
		if(flag){
			alert("添加成功！")
			location.href="selects"
		}else{
			alert("添加失败！")
		}
	},"json")
}
</script>

</head>
<body>
<form>
	<h3>添加页面</h3><br><br>
	商品：<input type="text" name="gname"><br><br>
	品牌：<select name="brands.bid">
		<option>--请选择 --</option>
		<c:forEach items="${brands}" var="b">
			<option value="${b.bid}">${b.bname }</option>
		</c:forEach>
	</select><br><br>
	分类：<select name="kinds.kid">
		<option>--请选择 --</option>
		<c:forEach items="${kinds}" var="k">
			<option value="${k.kid}">${k.kname }</option>
		</c:forEach>
	</select><br><br>
	价格：<input type="text" name="price"><br><br>
	发布时间：<input type="text" name="datea" onclick="WdatePicker()"><br><br>
	状态：<input type="text" name="status"><br><br>
	<input type="button" value="保存" onclick="add()"> &nbsp;<input type="reset" value="关闭"><br><br>
</form>
</body>
</html>