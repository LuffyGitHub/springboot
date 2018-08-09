/**
 * 功能描述：
 * @Package: com.chao.dao 
 * @author: luffy 
 * @date: 2018年8月8日 上午10:49:38 
 */
package com.chao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chao.entity.User;

/**
* @ClassName: UserDao.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2018年8月8日 上午10:49:38
*/
@Repository
public class UserDao {

	@Autowired
    JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "insert into t_user(id,user_name, password,create_time) values(?,?,?,?)";
        jdbcTemplate.update(sql,user.getId(), user.getUserName(), user.getPassword(),user.getCreate_time());
    }
}
