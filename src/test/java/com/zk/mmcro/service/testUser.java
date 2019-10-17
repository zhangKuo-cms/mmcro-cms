package com.zk.mmcro.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zk.mmcro.entity.User;

/** 

* @author 作者 zk: 

* @version 创建时间：2019年10月17日 下午1:17:37 

*/
public class testUser extends baseTest{
	
	@Autowired
	userService service;
	
	@Test
	public void testRegister() {
		User user = new User("ahu","0913",1);
		int register = service.register(user);
		assertTrue(register>0);
	}
}
