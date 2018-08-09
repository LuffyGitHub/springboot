/**
 * 功能描述：
 * @Package: com.chao.entity 
 * @author: luffy 
 * @date: 2018年8月8日 上午10:37:54 
 */
package com.chao.entity;

import java.util.Date;

/**
* @ClassName: User.java
* @Description: 用户实体类
*
* @author: luffy
* @date: 2018年8月8日 上午10:37:54
*/
public class User {
	
	private Integer id;
	private String userName;
	private String password;
	private Date create_time;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	
}
