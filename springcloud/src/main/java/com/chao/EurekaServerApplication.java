/**
 * 功能描述：
 * @Package: com.chao 
 * @author: luffy 
 * @date: 2018年8月9日 下午4:54:07 
 */
package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @ClassName: EurekaServerApplication.java
* @Description: 该类的功能描述
* @EnableEurekaServer表明是服务端
* @author: luffy
* @date: 2018年8月9日 下午4:54:07
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
