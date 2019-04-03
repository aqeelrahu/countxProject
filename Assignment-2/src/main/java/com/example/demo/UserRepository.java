package com.example.demo;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Integer> {

	
	@Query("select u from User u where u.email=?1 and u.password=?2")
	public User findByEmailAndPassword(String email, String password, PageRequest pageable);
}
