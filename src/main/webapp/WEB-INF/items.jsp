<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/template/header.jsp"%>

<div class="maincol">
	<h2>Item Details</h2>
	<div class="item-box-detail">
		<img src="/image/${selectedItem.sellItemsImageFileName1}" alt="商品"
			class="item-img">
		<div class="detail-container">
			<table>
				<tr>
					<td>商品名</td>
					<td>:</td>
					<td>${selectedItem.sellItemsName}</td>
				</tr>
				<tr>
					<td>商品説明</td>
					<td>:</td>
					<td>${selectedItem.sellItemsDescription}</td>
				</tr>
				<tr>
					<td>価格</td>
					<td>:</td>
					<td>¥${selectedItem.sellItemsPrice}</td>
				</tr>
			</table>
			<button onclick="location.href='/cart/add/${selectedItem.sellItemsNum}'">カートに入れる</button>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/template/footer.jsp"%>