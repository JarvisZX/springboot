package com.example.demo.controller;

import com.example.demo.entity.Myuser;
import com.example.demo.mapper.MyuserMapper;

//import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class UserController {
	
	@Autowired
	MyuserMapper myuserMapper;

	@RequestMapping("/")
	public String index() {
	    return "index";
    }

	@RequestMapping("/allUser")
	public List hello(Model model) {
		List<Myuser> list = myuserMapper.findAll();
		//model.addAttribute("list",list);
		return list;
	}

    @RequestMapping("/register")
    public String register(Myuser myuser){
    	System.out.println(myuser.getUsername());
        int result = myuserMapper.register(myuser.getUsername(),myuser.getPassword(),myuser.getSex(),myuser.getAddress());
        if(result == 1)
            return "success";
        else
            return "fail";
    }
    
    @RequestMapping("/registerPage")
    public String page() {
    	return "register";
    }

    //表单提交过来的路径
    @GetMapping("/checkLogin")
    public String checkLogin(Myuser user, Model model){
        //调用service方法
    	System.out.println(user.getUsername());
        user = myuserMapper.login(user.getUsername(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }



}
