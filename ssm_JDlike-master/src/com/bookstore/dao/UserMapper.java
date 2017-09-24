package com.bookstore.dao;

import com.bookstore.domain.RegistUserVo;
import com.bookstore.domain.User;



public interface UserMapper {
	
	public User selectUserByName(String username);
	public void updateUserById(User user);
	public User selectUserById(long userid);
	public void InserUser(RegistUserVo user);
	
}
