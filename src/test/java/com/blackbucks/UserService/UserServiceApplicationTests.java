package com.blackbucks.UserService;

import com.blackbucks.UserService.models.Session;
import com.blackbucks.UserService.models.User;
import com.blackbucks.UserService.repositories.SessionRepository;
import com.blackbucks.UserService.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	SessionRepository sessionRepository;

	@Test
	void testCreateUser() {
		User user=new User();
		user.setEmail("smitthakur@gmail.com");
		user.setEncryptedPassword("enc_pass");
		userRepository.save(user);
	}

	@Test
	void testCreateSessions() {
		Session session=new Session();
		session.setToken("12345");
		session.setEncryptedPassword("enc_pass");
		sessionRepository.save(session);
	}

}
