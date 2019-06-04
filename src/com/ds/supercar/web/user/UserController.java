package com.ds.supercar.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ds.supercar.model.usermodel.User;

@Controller("/")

public class UserController {
	@ (" /signupUser")

	public ModelAndView createUser(@PathVariable("User") User user,@PathVariable("name") String name,@PathVariable("name") String email,....)  throws Exception;
	{
		
	}

}
