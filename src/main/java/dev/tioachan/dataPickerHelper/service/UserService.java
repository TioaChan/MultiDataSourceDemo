package dev.tioachan.dataPickerHelper.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import dev.tioachan.dataPickerHelper.dao.UserDao;
import dev.tioachan.dataPickerHelper.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("mysqlDb")
public class UserService {
	@Autowired
	UserDao userDao;

	public List<User> getAll(){
		List<User> userList = userDao.selectList(null);
		return userList;
	}
}
