<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.bookstore.domain.CartItem"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/content.css">
<link rel="stylesheet" href="css/footer.css">
<link rel="stylesheet" href="css/cart.css">
</head>
<body>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/cart.js"></script>
	<jsp:include page="head.jsp"></jsp:include>
	<div id="content">
		<div id="content-left">
			<div class="gray">
				<img src="images/bullet1.gif">我的购物车
			</div>
			<div id="cartcart">
				<table class="cart_table">
					<tbody>
						<tr class="cart_title">
							<td>图书封面</td>
							<td>书名</td>
							<td>单价</td>
							<td>数量</td>
							<td>总价</td>
							<td>操作</td>
						</tr>

						<c:if test="${cartItem!=null }">
							<c:forEach items="${cartItem }" var="GoodsItem">
								<tr id="${GoodsItem.goodsid}">
									<td><a href="ShowDetail.action?id=${GoodsItem.goodsid}"> <img
											src="images/banner/${GoodsItem.photo}" alt="" title=""
											border="0" class="cart_thumb"> </a></td>
									<td>${GoodsItem.goodsname }</td>
									<td>${GoodsItem.goodsprice }￥</td>
									<td><a href="javascript:void(0)"
										name="${GoodsItem.goodsid}" onclick="addGoods(this.name)">+</a>
										<span name="subtotal_num">${GoodsItem.subtotal_num }</span>
											<a href="javascript:void(0)"
											name="${GoodsItem.goodsid}" onclick="subGoods(this.name)">-</a></td>
									<td ><span id="subtotal_money${GoodsItem.goodsid}">${GoodsItem.subtotal_money }</span>￥</td>
									<td><a href="removeGoods.action?id=${GoodsItem.goodsid}">删除<a>
									</td>
								</tr>
							</c:forEach>
						</c:if>

						<tr>
							<td colspan="4" class="cart_total"><span class="red">总数量:</span>
							</td>
							<td ><span id="total_num">${shoppingcart2.total_Goods }</span> 本</td>
						</tr>
						<tr>
							<td colspan="4" class="cart_total"><span class="red">总共:</span>
							</td>
							<td ><span id="total_price">${shoppingcart2.total_Money }</span>￥</td>
						</tr>
					</tbody>
				</table>
				<a href="books.action" class="continue">&lt; 继续</a> <a href="#"
					class="checkout">结算&gt;</a>
			</div>
		</div>
		<jsp:include page="content-right.jsp"></jsp:include>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
