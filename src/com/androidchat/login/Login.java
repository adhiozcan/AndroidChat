package com.androidchat.login;

import com.androidchat.MainActivity;

import sherlock.chat.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class Login extends Activity {
	@InjectView(R.id.name)
	TextView name;
	@InjectView(R.id.btnJoin)
	Button join;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ButterKnife.inject(this);
	}

	public void signIn(View view) {
		startActivity(new Intent(this, MainActivity.class));
	}
}
