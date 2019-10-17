package com.zk.mmcro.service;
/** 

* @author 作者 zk: 

* @version 创建时间：2019年10月17日 上午9:27:28 

*/

import com.zk.mmcro.entity.User;

public interface userService {
	
	int register(User user);
	User login(User user);
}
