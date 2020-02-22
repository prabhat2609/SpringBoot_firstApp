package com.pr.adminController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pr.adminDAO.AdminDAO;
import com.pr.adminDAO.AdminDAOJBDBC;
import com.pr.pojo.AdminPOJO;

@RestController
public class AdminController 
{
	@Autowired
	AdminDAO dao;
	
	@Autowired
	AdminDAOJBDBC daoJDBC;
	
	@RequestMapping("/getAdmin")
	public List<AdminPOJO> getAdmin()
	{
		System.out.println("Inside controller...");
		List<AdminPOJO> list=new ArrayList<>();
		
		String data;
		
		list=(List<AdminPOJO>) dao.findAll();
		for(AdminPOJO l:list)
		{
			
			
			
			System.out.println(l);
		}
		return list;
		
	}
	
	@PostMapping("/insertAdmin")
	public String insertAdmin(@RequestBody List<AdminPOJO> obj)
	{
		if(dao.saveAll(obj)!=null)
		return "Data inserted Successfully";
		else 
			return "Data not Inserted";
		
	}
	
	@RequestMapping("/getAdminJdbc")
	public Map<String,Object> getAdminController()
	{
		Map<String,Object> map=new HashMap<>();
		map=daoJDBC.GetAdmin();
		return map;
	}
	
	@PostMapping("/insertAdminJDBC")
	public Map<String,Object> InsertAdminJDBC(@RequestBody String param)
	{
		System.out.println("controller obj--- "+param);
		Map<String, Object> map=new HashMap<>();
		
		JSONObject obj=new JSONObject(param);
		map=daoJDBC.insertAdmin(obj);
		return map;
		
	}

}
