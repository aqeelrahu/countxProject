package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@Autowired
	private UserRepository userRepositry;
	private static Map<Integer, User> productRepo = new HashMap<>();
//	static {
//	      User honey = new User();
//	      honey.setId(1);
//	      honey.setName("Honey");
//	      productRepo.put(honey.getId(), honey);
//	      
//	      User almond = new User();
//	      almond.setId(1);
//	      almond.setName("Almond");
//	      productRepo.put(almond.getId(), almond);
//	   } 
	@PostMapping(value = "/create")
	   public ResponseEntity<User> createProduct(@RequestBody User product) {
		System.out.println(product.getName()+","+product.getAddress());
		User us =new User(); 
		us.setId(product.getId());
		us.setName((product.getName()));
		userRepositry.save(product);
		
		productRepo.put(product.getId(), product);
	      
	      return new ResponseEntity<User>(product, HttpStatus.CREATED);
	   }
	@RequestMapping(value = "/users")
	   public List<User> getUsers() {
		//userRepositry.findAll().forEach(e -> productRepo.put(101, e));;
	    return (List<User>) userRepositry.findAll();  
		//return new ResponseEntity<User>(productRepo.values(), HttpStatus.OK);
	   }
//	@RequestMapping(value="data",method=RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
//	public @ResponseBody Object callService() {
//		final String URL_SHOWS = "http://api.tvmaze.com/search/shows?q=girl";
////		System.out.println("Inside Search method "+q);
//		HttpHeaders headers = new HttpHeaders();
//		 
//        //headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
//        HttpEntity<String> entity = new HttpEntity<String>(headers);
//        
//        RestTemplate restTemplate = new RestTemplate();
// 
//        ResponseEntity<String> response = restTemplate.exchange(URL_SHOWS, //
//                HttpMethod.GET, entity, String.class);
//        String result =  response.getBody();;
// 
//        //Shows[] list = restTemplate.getForObject(URL_SHOWS, Shows[].class);
//        
//        System.out.println("//Shows//Shows//Shows//Shows//Shows//Shows");
//        System.out.println(result);
//
//		
//		return result;
//	}
}
