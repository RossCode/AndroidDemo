package com.Develomatic.AndroidDemo.Core;

public class FakeUserRepository implements IUserRepository {

	@Override
	public User get() {
		User user = new User();
		user.setName("Joel Ross");
		return user;
	}

}
