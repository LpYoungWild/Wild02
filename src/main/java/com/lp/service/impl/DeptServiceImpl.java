package com.lp.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lp.mapper.DeptMapper;
import com.lp.po.Dept;
import com.lp.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public Integer insertDept(Dept dept) {
		//aop给数据访问层的mapper开启一个session
		return this.deptMapper.insert(dept);
		//成功session.commit()
		//失败session.rollback()
	}

	@Override
	public Integer updateDept(Dept dept) {
		//aop给数据访问层的mapper开启一个session
		return this.deptMapper.updateByPrimaryKey(dept);
		//成功session.commit()
		//失败session.rollback()
	}

	@Override
	public Integer updateAndInsert(Dept dept) {
		//aop给数据访问层的mapper开启一个session
		this.updateDept(dept);
		dept.setId(null);
		int num=1/0;
		this.insertDept(dept);
		//成功session.commit()
		 //失败session.rollback()
		return 1;
	}

}
