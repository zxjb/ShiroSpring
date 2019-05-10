package com.shiro_spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shiro_spring.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//用户登录
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
    	System.out.println("method:login");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try{
            subject.login(token);//会跳到我们自定义的realm中
            request.getSession().setAttribute("user", user);
        	System.out.println("return:success");
            return "success";
        }catch(Exception e){
            e.printStackTrace();
            request.getSession().setAttribute("user", user);
            request.setAttribute("error", "用户名或密码错误！");
        	System.out.println("return:login");
            return "login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
    	System.out.println("method:logout");
        return "index";
    }   

    @RequestMapping("/admin")
    public String admin(HttpServletRequest request) {
    	System.out.println("method:admin");
        return "success";
    }

    @RequestMapping("/student")
    public String student(HttpServletRequest request) {
    	System.out.println("method:student");
        return "success";
    }   

    @RequestMapping("/teacher")
    public String teacher(HttpServletRequest request) {
    	System.out.println("method:teacher");
        return "success";
    }   
}
