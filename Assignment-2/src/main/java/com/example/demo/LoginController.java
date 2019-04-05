package com.example.demo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import com.example.demo.UserRepository;
@RestController
public class LoginController {

	@Autowired
	private UserRepository userRepositry;
	@RequestMapping(value = "/Login")
	public String loginMethod(@RequestBody Accounts account) {
		account = userRepositry.findByEmailAndPassword(account.getEmail(),account.getPassword(), new PageRequest(0, 1));
		 //System.out.println(user.getEmail()+","+user.getPassword());
		 if (account!=null) {
			 return "User exist";
		 }else return "User Doesnot Exist";
	}
}
