package com.mk.tracrat.service;


import com.mk.tracrat.command.UserCommand;
import com.mk.tracrat.dto.UserDto;

public interface UserService {

	String userInsert(UserCommand cmd);

}
