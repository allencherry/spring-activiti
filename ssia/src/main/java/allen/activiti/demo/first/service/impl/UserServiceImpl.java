package allen.activiti.demo.first.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import allen.activiti.demo.first.dao.UserMapper;
import allen.activiti.demo.first.entity.User;
import allen.activiti.demo.first.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	public UserMapper getUserMapper() {
		return userMapper;
	}


	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	private UserMapper userMapper;

	public List<User> selectUser() {
		return this.userMapper.selectUser();
	}
	

public static void main(String[] args) {
     System.out.println("hello");
	}

}
