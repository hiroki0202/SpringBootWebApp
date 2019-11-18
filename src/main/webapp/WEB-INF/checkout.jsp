<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/template/header.jsp"%>

<div class="maincol">
	<h2>Shopping Cart</h2>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">商品名</th>
				<th scope="col">個数</th>
				<th scope="col">小計</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cart.cartItems}" var="item">
				<tr>
					<td>${item.value.getName()}</td>
					<td>${item.value.getQuantity()}</td>
					<td>¥${item.value.getQuantity() * item.value.getPrice()}</td>
				</tr>
			</c:forEach>
			<tr>
				<td>合計</td>
				<td></td>
				<td>¥${cart.grandTotal}</td>
			</tr>
		</tbody>
	</table>
	<form:form action="purchase" modelAttribute="checkout">
		<h2>Address</h2>
		<p>(*)入力必須です</p><br><br>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>姓(*)</label>
				<form:input path="firstName" type="text" class="form-control" />
				<form:errors path="firstName" class="error" />
			</div>
			<div class="form-group col-md-6">
				<label>名(*)</label>
				<form:input path="lastName" type="text" class="form-control" />
				<form:errors path="lastName" class="error" />
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>郵便番号(-なしで入力してください)(*)</label>
				<form:input path="zipcode" type="text" class="form-control" />
				<form:errors path="zipcode" class="error" />
			</div>
		</div>
		<div class="form-group">
			<label>住所(*)</label>
			<form:input path="mainAddress" type="text" class="form-control" />
			<form:errors path="mainAddress" class="error" />
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>アパート名、号室など</label>
				<form:input path="buildingAddress" type="text" class="form-control" />
				<form:errors path="buildingAddress" class="error" />
			</div>
		</div>
		<div class="form-group">
			<label>電話番号(-なしで入力してください)(*)</label>
			<form:input path="tell" type="text" class="form-control" />
			<form:errors path="tell" class="error" />
		</div>
		<div class="form-group">
			<label>メールアドレス(*)</label>
			<form:input path="email" type="email" class="form-control" />
			<form:errors path="email" class="error" />
		</div>
		<h2>Credit Card Information</h2>
		<p>(*)入力必須です</p><br><br>
		<div class="form-group">
			<label>カード番号(-なしで入力してください)(*)</label>
			<form:input path="creditCardNum" type="text" class="form-control" />
			<form:errors path="creditCardNum" class="error" />
		</div>
		<div class="form-group">
			<label>カード名義(*)</label>
			<form:input path="creditCardName" type="text" class="form-control" />
			<form:errors path="creditCardName" class="error" />
		</div>
		<div class="form-row">
			<div class="form-group col-md-4">
				<label>有効年月(*)</label>
				<form:input path="creditCardMonth" type="text" class="form-control"
					placeholder="月" />
				<form:errors path="creditCardMonth" class="error" />
			</div>
			<div class="form-group col-md-4">
				<label></label>
				<form:input path="creditCardYear" type="text" class="form-control"
					placeholder="年" />
				<form:errors path="creditCardYear" class="error" />
			</div>
			<div class="form-group col-md-4">
				<label>セキュリティコード(CVS)(*)</label>
				<form:input path="creditCardCvs" type="text" class="form-control" />
				<form:errors path="creditCardCvs" class="error" />
			</div>
		</div>
		<input class="btn btn-primary" type="submit" value="購入" />
	</form:form>
</div>

<%@include file="/WEB-INF/template/footer.jsp"%>