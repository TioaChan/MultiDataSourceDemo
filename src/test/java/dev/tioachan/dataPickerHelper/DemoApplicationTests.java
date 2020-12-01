package dev.tioachan.dataPickerHelper;

import dev.tioachan.dataPickerHelper.domain.User;
import dev.tioachan.dataPickerHelper.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserService userService;


	@Test
	public void testSelect() {
		List<User> userList = userService.getAll();
		userList.forEach(System.out::println);
	}

}
