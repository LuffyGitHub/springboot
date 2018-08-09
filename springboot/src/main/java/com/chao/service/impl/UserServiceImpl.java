/**
 * 功能描述：
 * @Package: com.chao.service.impl 
 * @author: luffy 
 * @date: 2018年8月8日 上午10:54:47 
 */
package com.chao.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chao.dao.UserDao;
import com.chao.entity.User;
import com.chao.service.UserService;

/**
* @ClassName: UserServiceImpl.java
* @Description: 用户业务处理层
*
* @author: luffy
* @date: 2018年8月8日 上午10:54:47
*/
@Service
public class UserServiceImpl implements UserService {

	 Random ra =new Random();
	 
	 @Autowired
	 UserDao userDao;
	    
	/** 
	* @Function: UserServiceImpl.java
	* @Description: 保存用户信息
	*
	* @param:参数一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @author: luffy
	 * @date: 2018年8月8日 上午10:54:47 
	*/
	@Override
	public void save(User user) {
		
		int id = ra.nextInt();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			Date parse = format.parse(format.format(new Date()));
			user.setId(id);
			user.setUserName("luffy");
			user.setPassword("123456");
			user.setCreate_time(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userDao.save(user);
	}

}
