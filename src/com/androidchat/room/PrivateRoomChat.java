package com.androidchat.room;

import sherlock.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PrivateRoomChat extends Fragment {

	public static PrivateRoomChat newInstance() {
		PrivateRoomChat mFragment = new PrivateRoomChat();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.lst_private_room, container,
				false);
		return view;
	}
}
