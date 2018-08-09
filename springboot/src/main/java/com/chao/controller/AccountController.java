/**
 * 功能描述：
 * @Package: com.chao.controller 
 * @author: luffy 
 * @date: 2018年8月8日 下午3:18:11 
 */
package com.chao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chao.entity.Account;
import com.chao.service.AccountService;

/**
* @ClassName: AccountController.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2018年8月8日 下午3:18:11
*/
@RestController
public class AccountController {
	 	
	@Autowired
	AccountService service;
	    
	@RequestMapping("/getUser/{id}")
	public Account getUser(@PathVariable("id") Integer id){
	    return service.getAccount(id);
	}
}
