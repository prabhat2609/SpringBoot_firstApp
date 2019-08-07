package com.pr.adminDAO;

import org.springframework.data.repository.CrudRepository;

import com.pr.pojo.AdminPOJO;

public interface AdminDAO  extends CrudRepository<AdminPOJO, Integer>
{

}
