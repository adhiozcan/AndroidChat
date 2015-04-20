package com.androidchat.adapter;

import java.util.ArrayList;

import com.androidchat.model.ContactItem;

import sherlock.chat.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactList_Adapter extends BaseAdapter {
	ArrayList<ContactItem> lst_kontak;
	Context context;

	public ContactList_Adapter(Context context,
			ArrayList<ContactItem> lst_kontak) {

		this.context = context;
		this.lst_kontak = new ArrayList<ContactItem>(lst_kontak);

	}

	@Override
	public int getCount() {
		return lst_kontak.size();
	}

	@Override
	public Object getItem(int position) {
		return lst_kontak.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.fragment_detail_kontak, parent,
				false);

		TextView nama = (TextView) rowView.findViewById(R.id.nama);
		TextView nomor = (TextView) rowView.findViewById(R.id.nomor);
		TextView email = (TextView) rowView.findViewById(R.id.email);
		ImageView status = (ImageView) rowView.findViewById(R.id.status);

		nama.setText(lst_kontak.get(position).getNama());
		nomor.setText(lst_kontak.get(position).getNomor());
		email.setText(lst_kontak.get(position).getEmail());

		if (lst_kontak.get(position).isActive()) {
			status.setVisibility(View.VISIBLE);
		} else {
			status.setImageDrawable(this.context.getResources().getDrawable(
					R.drawable.offline));
		}

		return rowView;
	}
}
