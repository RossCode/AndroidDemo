package com.Develomatic.AndroidDemo;

import com.Develomatic.AndroidDemo.Core.IMainActivity;
import com.Develomatic.AndroidDemo.Core.MainPresenter;
import com.google.inject.Inject;

import roboguice.activity.GuiceActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.widget.TextView;

public class main extends GuiceActivity implements IMainActivity {
    @Inject protected MainPresenter presenter;
    @InjectView(R.id.welcomeMessage) protected TextView welcomeMessage;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        presenter.InitializeWith(this);
    }
    
    public void setUserNameTo(String name){
    	welcomeMessage.setText("Welcome Back, " + name);
    }
}