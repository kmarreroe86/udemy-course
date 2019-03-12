package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component // @Repository is good, but we aren't access real DB so @Component from Spring is OK
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();

	private static int usersCount = 3;

	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		return users.stream().filter(u -> u.getId().intValue() == id).findFirst().orElse(null);
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User deleteById(int id) {
		Iterator<User> iter = users.iterator();
		
		while(iter.hasNext()) {
			User u = iter.next();
			if(u.getId() == id) {
				iter.remove();
				return u;
			}
		}
		return null;
	}
	
	public boolean deleteById2(int id) {
		return users.removeIf(u -> u.getId() == id);		
	}

}
