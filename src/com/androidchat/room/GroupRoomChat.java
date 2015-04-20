package com.androidchat.room;

import java.util.ArrayList;

import com.androidchat.adapter.GroupList_Adapter;
import com.androidchat.model.GroupItem;

import sherlock.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class GroupRoomChat extends Fragment {
	ListView listView;

	public static GroupRoomChat newInstance() {
		GroupRoomChat mFragment = new GroupRoomChat();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_group, container, false);

		listView = (ListView) view.findViewById(R.id.list_group);

		ArrayList<GroupItem> data_object = new ArrayList<GroupItem>();
		data_object.add(new GroupItem("Hallo Pemirsa", "Hitler", "23-07-2015",
				18));
		data_object.add(new GroupItem("Asal Bunyi", "Stallin", "23-07-2015",
				100));
		data_object
				.add(new GroupItem("Jalan Lurus", "Joni", "23-07-2015", 1800));

		GroupList_Adapter adapter = new GroupList_Adapter(getActivity()
				.getBaseContext(), data_object);
		listView.setAdapter(adapter);

		return view;
	}

}
