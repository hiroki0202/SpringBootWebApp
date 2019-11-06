<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="net.code.TrSellItemsEntity"%>
<%@page import="net.code.TrSellItemsService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>ショッピングサイト</title>
  <link rel ="stylesheet" href="css/reset.css">
  <link rel ="stylesheet" href="css/style.css">
</head>

<body>
  <header>
    <h1>My Shopping Site</h1>
    <nav>
      <ul>
        <li><a href="#">トップ</a></li>
        <li><a href="#">カート</a></li>
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

    <div class="maincol">
      <h2>Items</h2>
<!--
      <div class="item-box">
        <img src="image/item.jpg" alt="商品" class="item-img">
        <div class="item-name">サボテン</div>
        <div class="item-price">¥35,000</div>
        <button>くわしく見る</button>
      </div>
      <div class="item-box">
        <img src="image/item.jpg" alt="商品" class="item-img">
        <div class="item-name">サボテン</div>
        <div class="item-price">¥35,000</div>
        <button>くわしく見る</button>
      </div>
      <div class="item-box">
        <img src="image/item.jpg" alt="商品" class="item-img">
        <div class="item-name">サボテン</div>
        <div class="item-price">¥35,000</div>
        <button>くわしく見る</button>
      </div>
 -->
      <% // jspでセッションスコープを利用する
         List<TrSellItemsEntity> sellItemsList = (List<TrSellItemsEntity>) session.getAttribute("sellItemsList");
         for (int i=0; i<sellItemsList.size(); i++) {
           TrSellItemsEntity entity = sellItemsList.get(i); %>
           <div class="item-box">
             <img src="image/<%= entity.getSellItemsImageFileName1() %>" alt="商品" class="item-img">
             <div class="item-name"><%= entity.getSellItemsName() %></div>
             <div class="item-price">¥<%= entity.getSellItemsPrice() %></div>
             <button>くわしく見る</button>
           </div>
      <% } %>

     </div>
  </main>

  <footer>
    <ul>
      <li><a href="#">お問い合わせ</a></li>
      <li><a href="#">サイトマップ</a></li>
      <li><a href="#">プライバシーポリシー</a></li>
    </ul>
    <p>Copylight©sample</p>
  </footer>
</body>

</html>