<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/template/header.jsp"%>

<div class="maincol">
	<h2>Items</h2>
	<c:forEach items="${sellItemsList}" var="item">
		<div class="item-box">
			<img src="<c:url value="/image/${item.sellItemsImageFileName1}" />" alt="商品"
				class="item-img">
			<div class="item-name">${item.sellItemsName}</div>
			<div class="item-price">¥${item.sellItemsPrice}</div>
			<button onclick="location.href='/items/${item.sellItemsNum}'">くわしく見る</button>
		</div>
	</c:forEach>
</div>

<%@include file="/WEB-INF/template/footer.jsp"%>
