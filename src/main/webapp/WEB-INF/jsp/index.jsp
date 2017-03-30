<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>逸家人C1后台管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<jsp:include page="public_include.jsp" />

</head>

<body>
	<jsp:include page="public_view.jsp" />

	<div class="mainbar">
		<div class="page-head">
			<h2 class="pull-left">
				<i class="icon-home"></i> 首页
			</h2>
			<div class="bread-crumb pull-right">
				<a href="<%=request.getContextPath()%>/index"><i class="icon-home"></i> 首页</a> <span
					class="divider">/</span> <a href="#" class="bread-current">控制台</a>
			</div>
			<div class="clearfix"></div>
		</div>

		<div class="container" style="margin: 60px;">
			<div class="row">
				<div class="col-lg-12">
					<h3>欢迎使用逸家人C1信息管理系统！</h3>
				</div>
			</div>
		</div>

	</div>
	<div class="clearfix"></div>

	<jsp:include page="public_footer.jsp" />

</body>

</html>