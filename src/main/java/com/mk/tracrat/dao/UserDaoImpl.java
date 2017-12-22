package com.mk.tracrat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mk.tracrat.dto.UserDto;

public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate template;
	private static final String USER_INSERT = "INSERT INTO USER2 VALUES(?,?,?,?,?,?,?)";
	@Override
	public int userInsert(UserDto dto) {
		System.out.println("dao   "+dto);
		int count = template.update(USER_INSERT,dto.getUser_id(),dto.getOrg_id(),dto.getFirst_name(),dto.getLast_name(),dto.getAge(),dto.getGender(),dto.getMobile_number());
		
		return count;
	}
}

	