<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Title and other stuffs -->
<title>表格页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<jsp:include page="public_include.jsp" />

<script type="text/javascript">

	<%-- function go_search(index){
		$("#content").html("数据加载中...");
		$.ajax({
			type : "post",
			url : "<%=request.getContextPath()%>/banban/article_list_part",
				data : $("#form").serialize() + "&index=" + index,
				dataType : "html",
				success : function(data) {
					$("#content").html(data);
				}
			});
	} --%>

	function deleteCustomer(btn) {
		
		if (confirm("是否删除该用户，\n删除后不能恢复")) {
			window.location.href = "<%=request.getContextPath()%>/delete_customer/" + btn.value;
		} 
	}
	
	
</script>
</head>

<body>
	<jsp:include page="public_view.jsp" />

	<div class="mainbar">
		<div class="page-head">
			<h2 class="pull-left">
				<i class="icon-table"></i> 客户列表
			</h2>

			<div class="bread-crumb pull-right">
				<a href="index"><i class="icon-home"></i> 首页</a> <span
					class="divider">/</span> <a href="#" class="bread-current">控制台</a>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="container">
			<form class="form-horizontal" role="form" action="find" method="get">
				<h5>&nbsp;&nbsp;客户查询:</h5>

				<div class="form-group col-md-12">
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">客户名称:</span> <input
							type="text" name="custname" class="form-control" placeholder=""
							aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">客户号码:</span> <input
							type="text" name="customerphone" class="form-control"
							placeholder="" aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3 ">学历:</span> <input
							type="text" name="customerlevel" class="form-control"
							placeholder="" aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">常住地:</span> <input
							type="text" name="customeraddress" class="form-control"
							placeholder="" aria-describedby="sizing-addon3">
					</div>

					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">意向出国国家:</span>
						<input type="text" name="customerintentcountry"
							class="form-control" placeholder=""
							aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">意向出国时间:</span>
						<input type="text" name="customerintenttime" class="form-control"
							placeholder="" aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">来源:</span> <input
							type="text" name="resources" class="form-control" placeholder=""
							aria-describedby="sizing-addon3">
					</div>
					<!-- <div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3" style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">客户归属:</span> <input
							type="text" name="留管家" class="form-control" placeholder=""
							aria-describedby="sizing-addon3">
					</div> -->
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">登记时间:</span> <input
							type="text" name="customertime" class="form-control"
							placeholder="" aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">回访时间:</span> <input
							type="text" name="meettime" class="form-control" placeholder=""
							aria-describedby="sizing-addon3">
					</div>
					<div class="input-group input-group-sm col-lg-2 col-md-4 col-xs-3"
						style="margin-top: 4px;">
						<span class="input-group-addon" id="sizing-addon3">客户状态:</span> <input
							type="text" name="status" class="form-control" placeholder=""
							aria-describedby="sizing-addon3">
					</div>
				</div>
				<button type="submit" class="btn btn-primary"
					style="margin: 5px 20px;">立即查询</button>

			</form>
		</div>

		<div class="matter">
			<div class="container">
				<div class="row">
					<!-- Form starts.  -->
					<div class="col-md-12">
						<div class="widget">
							<div class="widget-head">
								<div class="pull-left">客户一览表</div>
								<div class="widget-icons pull-right">
									<a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
									<a href="#" class="wclose"><i class=""></i></a>
								</div>
								<div class="clearfix"></div>
							</div>

							<div class="widget-content">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>序号</th>
											<th>称呼</th>
											<th>等级</th>
											<th>学历</th>
											<th>常住地</th>
											<th>意向国家</th>
											<th>意向出国时间</th>
											<th>登记时间</th>
											<th>下次回访时间</th>
											<th>操作时间</th>
											<th>客户归属</th>
											<th>来源</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list.rows }" var="c" varStatus="idx">
											<tr>
												<td>${idx.index + 1}</td>
												<td>${ c.custname}</td>
												 <td>${c.customerLevelName}</td>
												
												<td>${c.customerlevel }</td>
												<td>${c.customeraddress }</td>
												<td>${c.customerintentcountry }</td>
												<td>${c.customerintenttime }</td>
												<td>${c.customertime }</td>
												<td>${c.meettime }</td>
												<td>${c.opertiontime }</td>
												<td>留管家</td>
												<td>${c.resources }</td>
												<td>
													
													<button class="btn btn-xs btn-warning" type="button"
														onclick="window.location.href='show_customer/${c.id}'">
														<i class="icon-pencil"></i>
													</button>
													<button value="${c.id }" class="btn btn-xs btn-danger"
														type="button" onclick="deleteCustomer(this)">
														<i class="icon-remove"></i>
													</button>
												</td>
											</tr>
										</c:forEach>

									</tbody>
								</table>

								<div class="widget-foot">
									<ul class="pagination pull-right">
										<li><a href="#">Prev</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">Next</a></li>
									</ul>
									<div class="clearfix"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
	<jsp:include page="public_footer.jsp" />

</body>

</html>
