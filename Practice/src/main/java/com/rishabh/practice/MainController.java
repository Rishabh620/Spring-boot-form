package com.rishabh.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
	public String Adddata() {
    	
    	return "index";
    	}
    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String handleForm(@RequestParam("id")int Userid,@RequestParam("email") String userEmail,@RequestParam("pwd") String UserPass,
    		Model model) {
    	model.addAttribute("id", Userid);
    	model.addAttribute("email", userEmail);
    	model.addAttribute("pwd", UserPass);
    	
    	System.out.println(userEmail);
    	System.out.println(UserPass);
    	System.out.println(Userid);
    	
    	return "success";
    }
	
}
