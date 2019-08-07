package com.pr.adminController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController 
{
	@RequestMapping("/getAdmin")
	public Map<String,Object> getAdmin()
	{
		System.out.println("Inside controller...");
		Map<String, Object> map=new HashMap<>();
		
		return map;
		
	}

}
