package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.FeedBack;

public interface FeedBackService {
	public List<FeedBack> SelectLeaveMessage();

	public void saveFeedBack(FeedBack feedback);
}
