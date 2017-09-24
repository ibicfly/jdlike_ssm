package com.bookstore.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookstore.dao.FeedBackMapper;
import com.bookstore.domain.FeedBack;
import com.bookstore.service.FeedBackService;

public class FeedBackServiceImpl implements FeedBackService{
		@Autowired
		private FeedBackMapper feedBackMapper;
		public List<FeedBack> SelectLeaveMessage()
		{
			return feedBackMapper.SelectLeaveMessage();
			
		}
		@Override
		public void saveFeedBack(FeedBack feedback) {
			 feedBackMapper.saveFeedBack(feedback);
			
		}
}
