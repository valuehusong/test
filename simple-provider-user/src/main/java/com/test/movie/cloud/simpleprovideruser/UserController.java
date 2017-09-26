package com.test.movie.cloud.simpleprovideruser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private  UserDao userdao;
	@GetMapping("/simple/{id}")
	@RequestMapping()
	public User findById(Long  id){
		return  this.userdao.findOne(id);
	}
}
