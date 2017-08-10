package com.lp.service;

import com.lp.po.Dept;

public interface DeptService {
	public Integer insertDept(Dept dept);
	
	public Integer updateDept(Dept dept); 
	
	public Integer updateAndInsert(Dept dept);
}
