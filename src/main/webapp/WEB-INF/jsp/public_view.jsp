<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String url = request.getRequestURI();
%>

<div class="navbar navbar-fixed-top bs-docs-nav" role="banner">
	<div class="conjtainer">
		<!-- Menu button for smallar screens -->
		<div class="navbar-header">
			<button class="navbar-toggle btn-navbar" type="button"
				data-toggle="collapse" data-target=".bs-navbar-collapse">
				<span>Menu</span>
			</button>
			<!-- Site name for smallar screens -->
			<a href="index.html" class="navbar-brand hidden-lg">逸家人</a>
		</div>

		<!-- Navigation starts -->
		<nav class="collapse navbar-collapse bs-navbar-collapse"
			role="navigation">

			<ul class="nav navbar-nav">

				<!-- Upload to server link. Class "dropdown-big" creates big dropdown -->
				<li class="dropdown dropdown-big"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><span
						class="label label-success"><i class="icon-cloud-upload"></i></span>
						上传到云服务器</a> <!-- Dropdown -->
					<ul class="dropdown-menu">
						<li>
							<!-- Progress bar -->
							<p>Photo Upload in Progress</p> <!-- Bootstrap progress bar -->
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-info" role="progressbar"
									aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"
									style="width: 40%">
									<span class="sr-only">40% Complete</span>
								</div>
							</div>

							<hr /> <!-- Progress bar -->
							<p>Video Upload in Progress</p> <!-- Bootstrap progress bar -->
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-success"
									role="progressbar" aria-valuenow="80" aria-valuemin="0"
									aria-valuemax="100" style="width: 80%">
									<span class="sr-only">80% Complete</span>
								</div>
							</div>

							<hr /> <!-- Dropdown menu footer -->
							<div class="drop-foot">
								<a href="#">View All</a>
							</div>

						</li>
					</ul></li>

				<!-- Sync to server link -->
				<li class="dropdown dropdown-big"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><span
						class="label label-danger"><i class="icon-refresh"></i></span>
						同步到服务器</a> <!-- Dropdown -->
					<ul class="dropdown-menu">
						<li>
							<!-- Using "icon-spin" class to rotate icon. -->
							<p>
								<span class="label label-info"><i class="icon-cloud"></i></span>
								Syncing Members Lists to Server
							</p>
							<hr />
							<p>
								<span class="label label-warning"><i class="icon-cloud"></i></span>
								Syncing Bookmarks Lists to Cloud
							</p>

							<hr /> <!-- Dropdown menu footer -->
							<div class="drop-foot">
								<a href="#">View All</a>
							</div>
						</li>
					</ul></li>
			</ul>

			<!-- Search form -->
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="搜索">
				</div>
			</form>
			<!-- Links -->
			<ul class="nav navbar-nav pull-right">
				<li class="dropdown pull-right"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#"> <i class="icon-user"></i> 管理员
						<b class="caret"></b>
				</a> <!-- Dropdown menu -->
					<ul class="dropdown-menu">
						<li><a href="#"><i class="icon-user"></i> 资料</a></li>
						<li><a href="#"><i class="icon-cogs"></i> 设置</a></li>
						<li><a href="<%=request.getContextPath()%>/login"><i class="icon-off"></i> 退出</a></li>
					</ul></li>
			</ul>
		</nav>

	</div>
</div>


<!-- Header starts -->
<header>
	<div class="container">
		<div class="row">

			<!-- Logo section -->
			<div class="col-md-4">
				<!-- Logo. -->
				<div class="logo">
					<h1>
						<a href="#">EJR<span class="bold"></span></a>
					</h1>
					<p class="meta">后台管理系统</p>
				</div>
				<!-- Logo ends -->
			</div>

			<!-- Data section -->

			<div class="col-md-8 mcol-right">
				<div class="header-data col-md-offset-5">

					<!-- Traffic data -->
					<div class="hdata">
						<div class="mcol-left">
							<!-- Icon with red background -->
							<i class="icon-signal bred"></i>
						</div>
						<div class="mcol-right">
							<!-- Number of visitors -->
							<p>
								<a href="#">7000</a> <em>访问</em>
							</p>
						</div>
						<div class="clearfix"></div>
					</div>

					<!-- Members data -->
					<div class="hdata">
						<div class="mcol-left">
							<i class="icon-user bblue"></i>
						</div>
						<div class="mcol-right">
							<p>
								<a href="#">${customer_count }</a> <em>用户</em>
							</p>
						</div>
						<div class="clearfix"></div>
					</div>

					<div class="hdata">
						<div class="mcol-left">
							<i class="icon-money bgreen"></i>
						</div>
						<div class="mcol-right">
							<p>
								<a href="#">5000</a><em>订单</em>
							</p>
						</div>
						<div class="clearfix"></div>
					</div>

				</div>
			</div>
		</div>
	</div>
</header>
<div class="content">
	<div class="sidebar">
		<div class="sidebar-dropdown">
			<a href="#">Navigation</a>
		</div>
		<ul id="nav">
			<li><a href="<%=request.getContextPath()%>/index" <%if (url.indexOf("index") > 0) {%>
				class="open" <%}%>><i class="icon-home"></i> 首页</a></li>
			<%-- <li><a href="customer_add"
				<%if (url.indexOf("customer_add") > 0) {%> class="open" <%}%>><i
					class="icon-bar-chart"></i> 客户管理</a>
			</li> --%>
			<li class="has_sub"><a href="#" <%if (url.indexOf("tables") > 0 || url.indexOf("customer_edit") > 0 || url.indexOf("customer_add") > 0) {%> class="open" <%}%> >
					<i class="icon-list-alt"></i>
					客户管理 <span class="pull-right">
					<i class="icon-chevron-right"></i>
					</span></a>
				<ul>
					<li><a href="<%=request.getContextPath()%>/tables">所有客户</a></li>
					<li><a href="<%=request.getContextPath()%>/customer_add">添加客户</a></li>
				</ul>
			</li>
			<!-- <li><a href="forms.html"><i class="icon-tasks"></i> 表单</a></li> -->
		</ul>
	</div>
</div>
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span>
