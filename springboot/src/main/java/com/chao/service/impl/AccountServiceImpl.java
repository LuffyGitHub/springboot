/**
 * 功能描述：
 * @Package: com.chao.service.impl 
 * @author: luffy 
 * @date: 2018年8月8日 下午3:12:50 
 */
package com.chao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chao.entity.Account;
import com.chao.repository.AccountRepository;
import com.chao.service.AccountService;

/**
* @ClassName: Account.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2018年8月8日 下午3:12:50
*/
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
    AccountRepository repository;
	
	/** 
	* @Function: Account.java
	* @Description: 该函数的功能描述
	*
	* @param:参数一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @author: luffy
	* @date: 2018年8月8日 下午3:12:50 
	*/
	@Override
	public Account getAccount(Integer id) {
		  //有两种方式：
        //1.调用crudRepository的接口
//        return repository.findOne(id);
        //2.调用我们自己写的接口
		return repository.getUser(id);
	}

}
