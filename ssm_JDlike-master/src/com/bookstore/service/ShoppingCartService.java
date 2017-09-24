package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.Goods;
import com.bookstore.domain.ShoppingCart;

public interface ShoppingCartService {
	public String addShoppingCart(Cookie cookie,String id);
	public Cookie cookieSearch(Cookie[] cookie);
	public ArrayList<Goods> getGoods(Map<String, Integer> hsm);
	public String subShoppingCart(Cookie cookie, String id);
	public String subShoppingCartById(Cookie cookie, String id);
	public List<CartItem> generateCartItem(ShoppingCart shopcart);
	
}
