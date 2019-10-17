package com.zk.mmcro.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zk.mmcro.entity.User;

/** 

* @author 作者 zk: 

* @version 创建时间：2019年10月17日 下午1:11:09 

*/
public interface userMapper {

	@Insert("insert into cms_user(username,password,create_time)"
			+ "values(#{username},#{password},now())")
	int add(User user);

	@Select("select username from cms_user where username=#{username} limit 1")
	User findByName(String username);
	
}
