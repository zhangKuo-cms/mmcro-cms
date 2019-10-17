package com.zk.mmcro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.MD5Utils;
import com.zk.mmcro.dao.userMapper;
import com.zk.mmcro.entity.User;
import com.zk.mmcro.service.userService;

/** 

* @author 作者 zk: 

* @version 创建时间：2019年10月17日 上午9:30:13 

*/
@Service
public class userServiceImpl implements userService {

	@Autowired
	userMapper mapper;
	
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		
		User existUser = mapper.findByName(user.getUsername());
		if (existUser!=null) {
			return -1;
		}
		
		user.setPassword(MD5Utils.md5(user.getPassword(),user.getUsername()));
		return mapper.add(user);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
