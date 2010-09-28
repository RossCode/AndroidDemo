package com.Develomatic.AndroidDemo;
import com.Develomatic.AndroidDemo.Core.FakeUserRepository;
import com.Develomatic.AndroidDemo.Core.IUserRepository;

import roboguice.config.AbstractAndroidModule;

public class DemoModule extends AbstractAndroidModule {

	@Override
	protected void configure() {
		bind(IUserRepository.class).to(FakeUserRepository.class);
	}
}
