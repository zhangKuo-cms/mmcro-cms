package com.zk.mmcro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zk.mmcro.entity.User;

/** 
* @author 作者 zk: 
* @version 创建时间：2019年10月17日 上午9:06:56 
*/
@Controller
@RequestMapping("user")
public class userController {
	
	@GetMapping("registr")
	public String registr() {
		return "user/registr";
	}
	
	@PostMapping("registr")
	public String registr(HttpServletRequest request,@Validated User user, BindingResult errorResult) {
		if (errorResult.hasErrors()) {
			return "user/registr";
		}
		return "redirect:login";
	}
	
	@GetMapping("login")
	public String login() {
		return "registr";
	}
	
	@PostMapping("login")
	public String login(HttpServletRequest request,@Validated User user, BindingResult errorResult) {
		if (errorResult.hasErrors()) {
			return "user/registr";
		}
		
		return "redirect:login";
	}
}
