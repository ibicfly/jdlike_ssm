package com.bookstore.dao;

import java.util.List;

import com.bookstore.domain.FeedBack;

public interface FeedBackMapper {

	List<FeedBack> SelectLeaveMessage();

	void saveFeedBack(FeedBack feedback);

}
