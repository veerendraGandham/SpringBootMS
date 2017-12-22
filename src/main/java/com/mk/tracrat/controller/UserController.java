package com.mk.tracrat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mk.tracrat.command.UserCommand;
import com.mk.tracrat.service.UserService;

@RestController
public class UserController {
@Autowired
private UserService service;

//@PostMapping("/insert")
/*@RequestMapping(value="/insert", method=RequestMethod.POST)
@Produces("application/json")
@Consumes("application/text")
public ResponseEntity<UserDto> userInsert(UserDto dto) {

	System.out.println("controller     "+dto);
	return new ResponseEntity<UserDto>(HttpStatus.OK);
	
}*/
@GetMapping("/")
public ModelAndView user() {
	return new ModelAndView("user");
}
@PostMapping("/user_home")
public ModelAndView userInsert(@ModelAttribute UserCommand cmd) {
	String responce=service.userInsert(cmd);
	return new ModelAndView("welcome","res",responce);
}
}
