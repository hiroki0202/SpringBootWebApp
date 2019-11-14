<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/template/header.jsp"%>

<div class="maincol">
	<h2>Shopping Cart</h2>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">商品名</th>
				<th scope="col">個数</th>
				<th scope="col">小計</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cart.cartItems}" var="item">
				<tr>
					<td>${item.value.getName()}</td>
					<td>${item.value.getQuantity()}</td>
					<td>¥${item.value.getQuantity() * item.value.getPrice()}</td>
					<td><button
							onclick="location.href='/cart/remove/${item.value.getId()}'">削除</button></td>
				</tr>
			</c:forEach>
			<tr>
				<td>合計</td>
				<td></td>
				<td>¥${cart.grandTotal}</td>
				<td></td>
			</tr>
		</tbody>
	</table>
	<button onclick="location.href='/'">買い物を続ける</button>
	<button onclick="location.href='/purchese'">購入画面へ進む</button>
</div>

<%@include file="/WEB-INF/template/footer.jsp"%>