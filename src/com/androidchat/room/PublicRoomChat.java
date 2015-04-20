package com.androidchat.room;

import sherlock.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PublicRoomChat extends Fragment {

	public static PublicRoomChat newInstance() {
		PublicRoomChat mFragment = new PublicRoomChat();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// View view = inflater.inflate(R.layout.lst_public_room, container,
		// false);
		View view = inflater.inflate(R.layout.activity_chat, container, false);

		return view;
	}

}
