/**
 * 功能描述：
 * @Package: com.chao.controller 
 * @author: luffy 
 * @date: 2018年8月3日 下午5:42:59 
 */
package com.chao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName: HelloController.java
* @Description: 该类的功能描述
* * 这里@RestController = @ Controller + @ ResponseBody，
* @author: luffy
* @date: 2018年8月3日 下午5:42:59
*/
@RestController
public class HelloController {
   @RequestMapping("/hello")
    public String sayHello() {
        return "hello ,spring boot";
    }
}
