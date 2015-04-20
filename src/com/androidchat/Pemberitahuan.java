package com.androidchat;

import sherlock.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Pemberitahuan extends Fragment {

	public static Pemberitahuan newInstance() {
		Pemberitahuan mFragment = new Pemberitahuan();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_notifications,
				container, false);

		return view;
	}
}
