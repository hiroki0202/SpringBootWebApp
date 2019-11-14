<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ショッピングサイト</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="<c:url value="/css/reset.css" />">
<link rel="stylesheet" href="<c:url value="/css/style.css" />">
</head>

<body>
	<header>
		<h1>My Shopping Site</h1>
		<nav>
			<ul>
				<li><a href="/">トップ</a></li>
				<li><a href="/cart">カート</a></li>
			</ul>
		</nav>
	</header>

	<main>
	<div class="sidebar">
		<h2>Category</h2>
		<ul>
			<li><a href="#">アエオニウム</a></li>
			<li><a href="#">エケベリア</a></li>
			<li><a href="#">クラッスラ</a></li>
			<li><a href="#">セダム</a></li>
			<li><a href="#">セネキオ</a></li>
			<li><a href="#">ハオルチア</a></li>
		</ul>
	</div>