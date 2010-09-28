package com.Develomatic.AndroidDemo;
import java.util.List;

import com.google.inject.Module;

import roboguice.application.GuiceApplication;


public class Application extends GuiceApplication {
	@Override
	protected void addApplicationModules(List<Module> modules) {
		modules.add(new DemoModule());
	}
}
