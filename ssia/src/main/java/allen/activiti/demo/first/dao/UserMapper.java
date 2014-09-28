package allen.activiti.demo.first.dao;

import java.util.List;

import allen.activiti.demo.first.entity.User;

public interface UserMapper {
	/**
	 * * @param user
	 * 
	 * @return
	 */
	public List<User> selectUser();
}
