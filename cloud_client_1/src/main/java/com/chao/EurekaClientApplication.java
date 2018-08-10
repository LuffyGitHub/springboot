/**
 * 功能描述：
 * @Package: com.chao 
 * @author: luffy 
 * @date: 2018年8月9日 下午5:32:47 
 */
package com.chao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName: EurekaClientApplication.java
* @Description: 客户端启动类
* @EnableEurekaClient表明是客户端
* @author: luffy
* @date: 2018年8月9日 下午5:32:47
*/
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	
	@Value("${server.port}")
    String port;
	
	
    @RequestMapping("/")
    public String home() {
        return "hello world from port " + port;  
        
    }
}
