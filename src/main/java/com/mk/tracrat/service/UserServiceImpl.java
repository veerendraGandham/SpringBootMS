package com.mk.tracrat.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.mk.tracrat.command.UserCommand;
import com.mk.tracrat.dao.UserDao;
import com.mk.tracrat.dto.UserDto;

public class UserServiceImpl implements UserService{
@Autowired
private UserDao dao;
	
	@Override
	public String userInsert(UserCommand cmd) {
System.out.println("service    "+cmd);
		UserDto dto=new UserDto();
		BeanUtils.copyProperties(cmd, dto);
		int	ubo=dao.userInsert(dto);
		if(ubo==0)
		return "insertion failes please try again";
		else
			return "insertion is success";
		
	}

}
