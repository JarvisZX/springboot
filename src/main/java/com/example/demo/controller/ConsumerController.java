package com.example.demo.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Myuser;


@Controller
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	
	String serverUrl = "http://server-provide";
	
	@GetMapping("/")
	public String index() {
		ResponseEntity<String> entity = restTemplate.getForEntity(serverUrl+":8848/", String.class);
		//System.out.println(entity.getBody());
		return entity.getBody();
	}
	
	@GetMapping("/registerPage")
	public String registerPage() {
		ResponseEntity<String> entity = restTemplate.getForEntity(serverUrl+":8848/registerPage", String.class);
		return entity.getBody();
	}
	
	@GetMapping("/register")
	public String register(Myuser user) {
		ResponseEntity<String> entity = restTemplate.getForEntity(serverUrl+":8848/register?username={user}",
				String.class,user);
		return entity.getBody();
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/allUser")
	public String allUser(Model model) {
		ResponseEntity<List> entity = restTemplate.getForEntity(serverUrl+":8848/allUser", List.class);
		List<Myuser> list =entity.getBody();
		model.addAttribute("list", list);
		return "allUser";
	}
	
	@GetMapping("/checkLogin")
	public String checkLogin(Myuser user) {
		System.out.println("dasda");
		System.out.println(user.getUsername()+" "+user.getPassword());
		ResponseEntity<String> entity = restTemplate.getForEntity(serverUrl+":8848/checkLogin?username={username}&password={password}",
				String.class,user.getUsername(),user.getPassword());
		System.out.println(entity.getBody());
		return entity.getBody();
	}

}
