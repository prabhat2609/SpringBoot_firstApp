package com.pr.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Admin_boot")
public class AdminPOJO
{
	@Id
	private int aId;
	private String aName;
	private String aAdd;
	
	
	public AdminPOJO(int aId, String aName, String aAdd) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aAdd = aAdd;
	}
	
	public AdminPOJO() {
	
	}
	
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaAdd() {
		return aAdd;
	}
	public void setaAdd(String aAdd) {
		this.aAdd = aAdd;
	}

	@Override
	public String toString() {
		return "AdminPOJO [aId=" + aId + ", aName=" + aName + ", aAdd=" + aAdd + "]";
	}

	
}
