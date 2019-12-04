<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品展示厅</title>
<link rel="stylesheet" href="kk/index3.css">
<script type="text/javascript" src="kk/jquery-1.8.3.js"></script>
<script type="text/javascript" src="kk/WdatePicker.js"></script>
<script type="text/javascript">
	function qx(){
		$("[name=check]").attr("checked",true);
	}
	function add(){
		location.href="toadd"
	}
	function upd(gid){
		location.href="toupd?gid="+gid
	}
	function del(gid){
		
		if(confirm("确认删除"+gid+"吗？")){
			location="updstatus?gid="+gid
		}
	}
	function plsc(){
		var gid = "";
		$("[name=check]:checked").each(function(){
			gid+=","+$(this).val()
		})
		gid=gid.substring(1);
		del(gid);
	}
</script>
</head>
<body>
<form action="selects" method="post">
	<input type="text" name="gname" value="${gname}">
	<input type="submit" value="查询">
	<button type="button" onclick="add()">添加</button>
	<button type="button" onclick="plsc()">批量删除</button>
</form>

<table>
	<tr>
		<td>
			<button onclick="qx()">全选</button>
		</td>
		<td>编号</td>
		<td>商品</td>
		<td>品牌</td>
		<td>分类</td>
		<td>发布时间</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${info.list}" var="g">
		<tr>
			<td><input type="checkbox" name="check" value="${g.gid}"></td>
			<td>${g.gid}</td>
			<td>${g.gname}</td>
			<td>${g.brands.bname}</td>
			<td>${g.kinds.kname}</td>
			<td>${g.datea}</td>
			<td>
				<a href="select?gid=${g.gid}" target="_kkk"><button>详情</button></a>
				<button onclick="upd(${g.gid})">编辑</button>
				<button onclick="del(${g.gid})">删除</button>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="10">
			<a href="selects?pageNum=1&gname=${gname}"><button>首页</button></a>
			<a href="selects?pageNum=${info.prePage}&gname=${gname}"><button>上一页</button></a>
			<a href="selects?pageNum=${info.nextPage}&gname=${gname}"><button>下一页</button></a>
			<a href="selects?pageNum=${info.pages}&gname=${gname}"><button>尾页</button></a>
			当前是${info.pageNum }/${info.pages }页 --- 共${info.total }条数据
		</td>
	</tr>
</table>

</body>
</html>