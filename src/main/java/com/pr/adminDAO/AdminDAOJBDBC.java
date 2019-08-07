package com.pr.adminDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOJBDBC {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Get Admin List
	public Map<String,Object> GetAdmin()
	{
		Map<String,Object> map=new HashMap<String, Object>();
		List<Map<String,Object>> adminList=new ArrayList<Map<String,Object>>();
		
		adminList=jdbcTemplate.queryForList("select * from Admin_boot");
		if(adminList.equals(null)) {
			map.put("adminList", "No data found");
		}
		else
		map.put("AdminList", adminList);
		return map;
	}
	
	//Insert Admin List
	public Map<String,Object> insertAdmin(JSONObject obj)
	{
		Map<String,Object> map=new HashMap<>();
		Integer insert;
		String query="insert into Admin_boot (a_name,a_add) values(?,?)";
		
		insert=jdbcTemplate.update(query,obj.getString("a_name"),obj.getString("a_add") );
		
		if(insert>0)
		{
			map.put("status", "Value Inserted Successfully");
		}
		else
		{
			map.put("status", "Value Not Inserted Successfully");
		}
		
		return map;
	}
	
}
