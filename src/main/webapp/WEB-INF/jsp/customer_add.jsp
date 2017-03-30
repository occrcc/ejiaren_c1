<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Title and other stuffs -->
<title>添加客户</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<jsp:include page="public_include.jsp" />

<script type="text/javascript">
	function add(obj) {
		if (validate_channel_info()) {
			addform.submit();
		}
	}

	function validate_channel_info() {
		if (addform.custname.value == "") {
			alert("请输入正确的名字");
			return false;
		} else if (!checkMobile(addform.customerphone.value)) {
			alert("请输入正确的手机号码");
			return false;
		} else if (addform.customerstate.value == "") {
			alert("请选择客户状态");
			return false;
		}
		return true;
	}

	function checkMobile(s) {
		var length = s.length;
		if (length == 11
				&& /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(14[0-9]{1})|)+\d{8})$/
						.test(s)) {
			return true;
		} else {
			return false;
		}
	}
</script>

</head>

<body>
	<jsp:include page="public_view.jsp" />
	<div class="mainbar">
		<div class="page-head">
			<h2 class="pull-left">
				<i class="icon-table"></i> 添加客户
			</h2>
			<div class="bread-crumb pull-right">
				<a href="<%=request.getContextPath()%>/index"><i class="icon-home"></i> 首页</a> <span
					class="divider">/</span> <a href="#" class="bread-current">控制台</a>
			</div>
			<div class="clearfix"></div>
		</div>

		<div class="matter">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="widget wgreen">
							<div class="widget-head">
								<div class="pull-left">表单</div>
								<div class="widget-icons pull-right">
									<!-- <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a>
									<a href="#" class="wclose"><i class="icon-remove"></i></a> -->
								</div>
								<div class="clearfix"></div>
							</div>

							<div class="widget-content">
								<div class="padd">
									<!-- Form starts.  -->
									<form class="form-horizontal" role="form" method="post"
										id="addform"
										action="<%=request.getContextPath()%>/add_customer_infos">
										<div class="form-group">
											<label class="col-lg-3 control-label"><span
												style="color: red">*</span>称呼</label>
											<div class="col-lg-3">
												<input name="custname" value="${custname}" type="text"
													class="form-control" placeholder="请输入称呼">
											</div>
											<label class="col-lg-3 control-label"><span
												style="color: red">*</span>手机号码</label>
											<div class="col-lg-3">
												<input name="customerphone" value="${customerphone}"
													type="text" class="form-control" placeholder="请输入手机号码">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-3"><span
												style="color: red">*</span>客户状态</label>
											<div class="col-lg-3">
												<select name="customerstate" class="form-control">
													<c:forEach items="${map}" var="m" varStatus="idx">
														<option value="${m.key }">${m.value }</option>
													</c:forEach>
												</select>
											</div>
											<label class="col-lg-3 control-label">座机电话</label>
											<div class="col-lg-3">
												<input name="telephone" type="text" class="form-control"
													placeholder="请输入座机电话">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">常住地</label>
											<div class="col-lg-3">
												<input name="customeraddress" type="text"
													class="form-control" placeholder="请输入常住地址">
											</div>
											<label class="col-lg-3 control-label">性别</label>
											<div class="col-lg-3">
												<div>
													<label class="checkbox-inline"> <input type="radio"
														name="contgender" id="optionsRadios3" value="1" checked>
														男
													</label> <label class="checkbox-inline"> <input
														type="radio" name="contgender" id="optionsRadios4"
														value="0"> 女
													</label>
												</div>
											</div>
											<!-- /input-group -->
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">QQ</label>
											<div class="col-lg-3">
												<input type="text" name="customerqq" class="form-control"
													placeholder="请输入QQ号">
											</div>
											<label class="col-lg-3 control-label">微信</label>
											<div class="col-lg-3">
												<input name="customerwechat" type="text"
													class="form-control" placeholder="请输入微信号">
											</div>
										</div>

										<div class="form-group">
											<label class="col-lg-3 control-label">户籍</label>
											<div class="col-lg-3">
												<input name="customergenius" type="text"
													class="form-control" placeholder="请输入户籍所在地">
											</div>

											<label class="col-lg-3 control-label">在读学校</label>
											<div class="col-lg-3">
												<input name="customerschool" type="text"
													class="form-control" placeholder="请输入在读学校">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">学历</label>
											<div class="col-lg-3">
												<select name="customerlevel" class="form-control">
													<c:forEach items="${customer_level}" var="m"
														varStatus="idx">
														<option value="${m}">
															${m}
														</option>
													</c:forEach>
												</select>
											</div>
											<label class="col-lg-3 control-label">国内均分</label>
											<div class="col-lg-3">
												<input name="customeraverageindoor" type="text"
													class="form-control" placeholder="请输入国内均分">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">国内专业</label>
											<div class="col-lg-3">
												<input name="customerskillindoor" type="text"
													class="form-control" placeholder="请输入国内在读专业">
											</div>
											<label class="col-lg-4 control-label">意向留学国家</label>
											<div class="col-lg-3">
												<input name="customerintentcountry" type="text"
													class="form-control" placeholder="请输入留学国家">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">意向出国时间</label>
											<div class="col-lg-3">
												<select name="customerintenttime" class="form-control">
													<c:forEach items="${intent_time_map}" var="m"
														varStatus="idx">
														<option value="${m}">${m}</option>
													</c:forEach>
												</select>
											</div>
											<label class="col-lg-3 control-label">意向申请学历</label>
											<div class="col-lg-3">
												<select name="customerintentdegree" class="form-control">
													<c:forEach items="${customer_intent_degree}" var="m"
														varStatus="idx">
														<option value="${m}">
															${m}
														</option>
													</c:forEach>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">意向留学专业</label>
											<div class="col-lg-3">
												<input name="customerintentskill" type="text"
													class="form-control" placeholder="请输入留学专业">
											</div>
											<label class="col-lg-3 control-label">电子邮箱</label>
											<div class="col-lg-3">
												<input name="customeremail" type="text" class="form-control"
													placeholder="请输入电子邮箱">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">语言成绩(语言种类)</label>
											<div class="col-lg-3">
												<select name="customerlanguage" class="form-control">
													<c:forEach items="${customer_language}" var="m"
														varStatus="idx">
														<option value="${m}">
															${m}
														</option>
													</c:forEach>
												</select>
											</div>
											<label class="col-lg-3 control-label">语言学科分数</label>
											<div class="col-lg-3">
												<input name="customerlanguagescore" type="text"
													class="form-control" placeholder="请输入语言学科分数">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">语言成绩(语言种类)</label>
											<div class="col-lg-3">
												<select name="customerlanguage1" class="form-control">
													<c:forEach items="${customer_language}" var="m"
														varStatus="idx">
														<option value="${m}">
															${m}
														</option>
													</c:forEach>
												</select>
											</div>
											<label class="col-lg-3 control-label">语言学科分数</label>
											<div class="col-lg-3">
												<input name="customerlanguagescore1" type="text"
													class="form-control" placeholder="请输入语言学科分数">
											</div>
										</div>
										<div class="form-group">
											<label class="col-lg-3 control-label">来源</label>
											<div class="col-lg-3">
												<input name="resources" type="text" class="form-control"
													placeholder="请输入来源">
											</div>
										</div>
										<div class="form-group ">
											<label class="col-lg-3 control-label">备注</label>
											<div class="text-area col-lg-5">
												<textarea name="ps" class="form-control"
													placeholder="有其它想说的就填在这里吧"></textarea>
											</div>
										</div>

										<hr />
										<div class="form-group">
											<div class="col-lg-offset-1 col-lg-9">
												<!-- <button type="button" class="btn btn-default">Default</button> -->
												<button type="button" class="btn btn-primary"
													onclick="add(this)">提交表单</button>
												<!-- <button type="button" class="btn btn-success">Success</button>
												<button type="button" class="btn btn-info">Info</button>
												<button type="button" class="btn btn-warning">Warning</button>
												<button type="button" class="btn btn-danger">Danger</button> -->
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="widget-foot">
								<!-- Footer goes here -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="clearfix"></div>
	<jsp:include page="public_footer.jsp" />
	<!-- Scroll to top -->
	<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span>
</body>
</html>
