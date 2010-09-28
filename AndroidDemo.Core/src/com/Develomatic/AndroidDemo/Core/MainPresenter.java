package com.Develomatic.AndroidDemo.Core;

import com.google.inject.Inject;

public class MainPresenter {
	private final IUserRepository userRepository;
	
	@Inject
	public MainPresenter(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void InitializeWith(IMainActivity activity) {
		User user = userRepository.get();
		activity.setUserNameTo(user.getName());
	}
}
