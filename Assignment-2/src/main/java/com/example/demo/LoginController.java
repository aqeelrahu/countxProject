package com.example.demo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.client.RestTemplate;
//
import com.example.demo.UserRepository;
//import com.countx.model.User;
//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.type.CollectionType;
//import com.fasterxml.jackson.databind.type.TypeFactory;
//
@RestController
public class LoginController {
//
	@Autowired
	private UserRepository userRepositry;
//	
//	@GetMapping("/signin")
//	public String SignUpMethod(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam String password) {
//		
//		System.out.println("Inside the method");
//		System.out.println(firstname);
//		
//		User user= new User();
//		user.setName(firstname);
//		
//		//userRepositry.save(user);
//		
//		
//		
//		return "welcome";
//	}
//	
	@RequestMapping(value = "/Login")
	public String loginMethod(@RequestBody User user) {
//		
		 user = userRepositry.findByEmailAndPassword(user.getEmail(),user.getPassword(), new PageRequest(0, 1));
		 //System.out.println(user.getEmail()+","+user.getPassword());
		 if (user!=null) {
			 return "User exist";
		 }else return "User Doesnot Exist";
	}
//		
//		System.out.println("======================");
//		
//		if(user!=null) {
//			System.out.println("User exists");
//			final String URL_SHOWS = "http://api.tvmaze.com/shows";
//			System.out.println("Inside Search method ");
//			HttpHeaders headers = new HttpHeaders();
//			 
//	        HttpEntity<String> entity = new HttpEntity<String>(headers);
//	        
//	        RestTemplate restTemplate = new RestTemplate();
//	 
//	        ResponseEntity<String> response = restTemplate.exchange(URL_SHOWS, //
//	                HttpMethod.GET, entity, String.class);
//	        String result =  response.getBody();;
//	 
//	        
//	        System.out.println("//Shows//Shows//Shows//Shows//Shows//Shows");
//	        System.out.println(result);
//	        ObjectMapper mapper = new ObjectMapper();
//	        
//	        
//	        List<Show> participantJsonList = mapper.readValue(result, new TypeReference<List<Show>>(){});
//	req.getSession().setAttribute("results", participantJsonList);
//			return "apicall";
//		}else {
//			System.out.println("User does not exists");
//			return "welcome";
//		}
//		
//		
//	}
//	
//	@GetMapping("/callApiMethod")
//	@ResponseBody
//	public String callApiMethod() {
//		
//		final String uri = "https://www.tvmaze.com/api";
//
//	    RestTemplate restTemplate = new RestTemplate();
//	    String result = restTemplate.getForObject(uri, String.class);
//
//	  //  System.out.println(result);
//	    return result;
//	}
//	@GetMapping("/search")
//	//@RequestMapping(method = RequestMethod.GET)
//	public String SearchMethod(@RequestParam String q, HttpServletRequest req, HttpServletResponse res) throws JsonParseException, JsonMappingException,  IOException {
//		
//		final String URL_SHOWS = "http://api.tvmaze.com/search/shows?q="+q;
//		System.out.println("Inside Search method "+q);
//		HttpHeaders headers = new HttpHeaders();
//		 
//        HttpEntity<String> entity = new HttpEntity<String>(headers);
//        
//        RestTemplate restTemplate = new RestTemplate();
// 
//        ResponseEntity<String> response = restTemplate.exchange(URL_SHOWS, //
//                HttpMethod.GET, entity, String.class);
//        String result =  response.getBody();;
// 
//        
//        System.out.println("//Shows//Shows//Shows//Shows//Shows//Shows");
//        System.out.println(result);
//       
//        ObjectMapper mapper = new ObjectMapper();
//        
//        
//        List<Result> participantJsonList = mapper.readValue(result, new TypeReference<List<Result>>(){});
//req.getSession().setAttribute("results", participantJsonList);
//		
//		return "SearchResultls";
//	}
////	
////	RestTemplate restTemplate=new RestTemplate();
////	@RequestMapping(value="/template",method=RequestMethod.GET)
////	public String getShowsByTemplate() {
////		HttpHeaders headers=new HttpHeaders();
////		HttpEntity<String> entity=new HttpEntity<>(headers);
////	return restTemplate.exchange("http://api.tvmaze.com", HttpMethod.GET,entity,String.class).getBody();	
////	} 
//	
}
