package ke.co.turbosoft.ttt.service;

import java.util.List;

import ke.co.turbosoft.ttt.entity.User;

public interface UserService {
	
	User findOne(String username);
	List<User> findAll();
	void delete(User user);
	User save(User user);
	

}
