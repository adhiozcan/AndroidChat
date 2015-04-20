package com.androidchat.adapter;

import java.util.ArrayList;

import com.androidchat.model.GroupItem;

import sherlock.chat.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GroupList_Adapter extends BaseAdapter {
	ArrayList<GroupItem> lst_model;
	Context context;

	public GroupList_Adapter(Context context,
			ArrayList<GroupItem> lst_model) {
		this.context = context;
		this.lst_model = new ArrayList<GroupItem>(lst_model);
	}

	@Override
	public int getCount() {
		return lst_model.size();
	}

	@Override
	public Object getItem(int position) {
		return lst_model.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.fragment_lst_group, parent,
				false);

		TextView nama_group = (TextView) rowView.findViewById(R.id.nama_group);
		TextView admin = (TextView) rowView.findViewById(R.id.admin);
		TextView size = (TextView) rowView.findViewById(R.id.size);

		nama_group.setText(lst_model.get(position).getNama_group());
		admin.setText("Admin : " + lst_model.get(position).getAdmin() + " | "
				+ lst_model.get(position).getTime_created());
		size.setText("Jumlah User : " + lst_model.get(position).getSize());

		return rowView;
	}

}
