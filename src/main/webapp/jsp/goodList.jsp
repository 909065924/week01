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
	<input type="button" value="全选" onclick="qx()">
	<input type="button" value="反选" onclick="fx()">
	<input type="button" value="删除影片" onclick="del()">
	<input type="button" value="查询影片" onclick="find()">
	<div align="center">
		<form action="<%=path%>/getGoodsAll" method="post">
		
			<input type="hidden" name="gdateId" value="gdate asc"> 
			<input type="hidden" name="gtimeId" value=""> 
			<input type="hidden" name="gdatetimeId" value=""> 
			<table>
				<thead></thead>
				<tbody>
					<tr>
						<td>选择</td>
						<td>影片名</td>
						<td>导演</td>
						<td>票价</td>
						<td><a onclick="gdate()">上映时间</a></td>
						<td><a onclick="gtime()">时长</a></td>
						<td>类型</td>
						<td><a onclick="gdatetime()">年代</a></td>
						<td>区域</td>
						<td>状态</td>
						<td colspan="3">操作</td>
					</tr>
				<c:forEach items="${page.list}" var="l">
					<tr>
						<td><input type="checkbox" value="${l.gid}" class="a"></td>
						<td>${l.gname}</td>
						<td>${l.gdy}</td>
						<td>${l.gprice}</td>
						<td>${l.gdate}</td>
						<td>${l.gtime}</td>
						<td>${l.gtype}</td>
						<td>${l.gdatetime}</td>
						<td>${l.gchina}</td>
						<td><span class="s">${l.gzt == 1?'正在热映':'已经下映'}</span><span class="sss"></span></td>
						<td>&nbsp;详情&nbsp</td>
						<td>&nbsp;编辑&nbsp;</td>
						<td><a onclick="xj()">&nbsp;<span class="ss">下架</span>&nbsp;</a></td>
					</tr>
				</c:forEach>
				</tbody>
				<tfoot>
				<tr>
					<td colspan="15">
						<a href="<%=path%>/getGoodsAll?pageNum=1">首页</a>
						<a href="<%=path%>/getGoodsAll?pageNum=${page.pageNum-1<1?1:page.pageNum-1}">上一页</a>
						<a href="<%=path%>/getGoodsAll?pageNum=${page.pageNum+1>page.pages?page.pages:page.pageNum+1}">下一页</a>
						<a href="<%=path%>/getGoodsAll?pageNum=${page.pages}">尾页</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						当前${page.pageNum}/${page.pages}页
					</td>
				</tr>
				</tfoot>
			</table>
		
		</form>
	
	</div>
</body>
<script type="text/javascript">


	function xj() {
		
		var sum = $(".sss").html();
		if(sum=='正在热映'){
			$(".s").html('');
			$(".sss").html('已经下映');
			$(".ss").html('上架');
		}else{
			$(".s").html('');
			$(".sss").html('正在热映');
			$(".ss").html('下架');
		}
		
	}

	function qx() {
		$(".a").each(function () {
			this.checked=true;
		});
	}

	function fx() {
		$(".a").each(function () {
			this.checked = !this.checked;
		});
	}

	function del() {
		var gids = "";
		$(".a:checked").each(function () {
			gids += ","+$(this).val();
		});
		gids = gids.substring(1);
		if(confirm("确认删除第"+gids+"条数据?")){
			$.post(
					"<%=path%>/deleGoodsByGid",
					{gid:gids},
					function (obj) {
						alert("删除成功~");
						location="<%=path%>/getGoodsAll";
					},
					"json"
				);
		}else{
			alert("删除取消~");
		}
		
	}

	function gdate() {
		location="<%=path%>/getGoodsAlla";
	}
	
	function gtime() {
		location="<%=path%>/getGoodsAllb";
	}
	
	function gdatetime() {
		location="<%=path%>/getGoodsAllc";
		
	}
	
	function find() {
		location="<%=path%>/jsp/find.jsp";
	}
</script>
</html>