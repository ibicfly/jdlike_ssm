package com.bookstore.dao;

import java.util.List;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.Goods;


public interface GoodsMapper {

	Goods selectGoodsByID(String id);
	int selectCountGoods();
	List<Goods> selectNewGoods();
	List<Goods> selectPromotionGoods();
	List<Goods> selectSpecialGoods();
	List<Goods> selectGoodsByPageNumber(int pageNumber);
	
}
