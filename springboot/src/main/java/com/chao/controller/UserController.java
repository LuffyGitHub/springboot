/**
 * 功能描述：
 * @Package: com.chao.controller 
 * @author: luffy 
 * @date: 2018年8月8日 上午11:04:22 
 */
package com.chao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chao.entity.User;
import com.chao.service.UserService;

/**
* @ClassName: UserController.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2018年8月8日 上午11:04:22
*/
@RestController
public class UserController {
	
	@Autowired
    UserService service;

    @RequestMapping("/saveUser")
    public String saveUser() {
    	
    	User user = new User();
    	
        service.save(user);
        
        return "save user successful";
    }
}
