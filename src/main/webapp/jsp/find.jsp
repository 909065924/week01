<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE html PUBLIC>

<html>
<head>
<link rel="stylesheet" type="text/css" href="${path}/css/css.css"/>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<form action="<%=path%>/getGoodsAll" method="post" >
		
		影片名称:<input type="text" name="gname">
		上映时间<input type="date" name="gdate">
		至<input type="date" name="egdate">
		<br><br>				
		导演:<input type="text" name="gdy">
		价格<input type="text" name="gprice">
		-<input type="text" name="egprice">
		<br><br>
		电影年代:<input type="text" name="gdatetime">
		电影时间:<input type="text" name="gtime">
		-<input type="text" name="egtime"><br><br>
		<input type="submit" value="查询">
		<input type="reset" value="重置查询" >
	</form>
</div>
</body>
</html>