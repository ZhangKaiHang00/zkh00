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
</head>
<body>
<table>
	<tr>
		<td>商品详情页</td>
	</tr>
	<tr>
		<td>编号：${goods.gid }</td>
	</tr>
	<tr>
		<td>商品：${goods.gname }</td>
	</tr>
	<tr>
		<td>品牌：${goods.bname }</td>
	</tr>
	<tr>
		<td>分类：${goods.kname }</td>
	</tr>
	<tr>
		<td>发布时间：${goods.datea }</td>
	</tr>
	<tr>
		<td><a href="selects">返回</a></td>
	</tr>
</table>
</body>
</html>