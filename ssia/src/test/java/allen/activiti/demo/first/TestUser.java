package allen.activiti.demo.first;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import allen.activiti.demo.first.entity.User;
import allen.activiti.demo.first.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestUser {
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	public void testGetUser() {
		List<User> users = userService.selectUser();

		for (User u : users) {
			System.out.println(u.getUserName());
		}
	}

	@Test
	public void testRun() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println("hello");
	}

}
