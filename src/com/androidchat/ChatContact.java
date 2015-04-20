package com.androidchat;

import java.util.ArrayList;

import com.androidchat.adapter.ContactList_Adapter;
import com.androidchat.model.ContactItem;

import sherlock.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ChatContact extends Fragment {

	ViewPager mViewPager;

	ListView listView;

	public static ChatContact newInstance() {
		ChatContact mFragment = new ChatContact();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_list, container, false);

		listView = (ListView) view.findViewById(R.id.listView);

		ArrayList<ContactItem> data_object = new ArrayList<ContactItem>();
		data_object.add(new ContactItem("Joni", "087612322132",
				"romanov@USSR.com", true));
		data_object.add(new ContactItem("Vladimir", "1321232",
				"President@USSR.com", false));
		data_object.add(new ContactItem("Hitler", "7773342",
				"Kanselir@Germany.com", true));
		data_object.add(new ContactItem("Stallin", "5500168464",
				"Tsar@USSR.com", true));
		data_object.add(new ContactItem("Henry Truman", "80025845",
				"President@USA.com", false));
		data_object.add(new ContactItem("Joseph Goebbels", "77758818",
				"Reichtag2@Germany.com", true));
		data_object.add(new ContactItem("Stauffenberg", "77785540",
				"Reichtag3@Germany.com", false));

		ContactList_Adapter adapter = new ContactList_Adapter(getActivity()
				.getBaseContext(), data_object);
		listView.setAdapter(adapter);

		mViewPager = (ViewPager) view.findViewById(R.id.pager);
		return view;
	}

}
