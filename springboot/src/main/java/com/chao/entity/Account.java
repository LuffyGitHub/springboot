/**
 * 功能描述：
 * @Package: com.chao.entity 
 * @author: luffy 
 * @date: 2018年8月8日 下午2:57:12 
 */
package com.chao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @ClassName: Account.java
* @Description: 账户实体类
*
* @author: luffy
* @date: 2018年8月8日 下午2:57:12
*/
@Entity
@Table(name="t_account")
public class Account {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String userName;
	private String password;
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
}
