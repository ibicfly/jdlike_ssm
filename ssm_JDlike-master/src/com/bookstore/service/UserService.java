package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.RegistUserVo;
import com.bookstore.domain.User;

public interface UserService {
	public User userLogin(User user);

	public void updateUser(User user);
	public User selectUserByid(long userid);

	public boolean existUser(RegistUserVo user);

	public void regist(RegistUserVo user);
	
}
