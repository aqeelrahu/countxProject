package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AccountsController {

	@Autowired
	private UserRepository userRepositry;
	private static Map<Integer, Accounts> productRepo = new HashMap<>();

	@PostMapping(value = "/create")
	   public ResponseEntity<Accounts> createAccount(@RequestBody Accounts account) {
		System.out.println(account.getName()+","+account.getAddress());
		Accounts us =new Accounts(); 
		userRepositry.save(account);
	      return new ResponseEntity<Accounts>(account, HttpStatus.CREATED);
	   }

	@RequestMapping(value = "/users")
	   public List<Accounts> getUsers() {
	    return (List<Accounts>) userRepositry.findAll();  
		//return new ResponseEntity<User>(productRepo.values(), HttpStatus.OK);
	   }

}
