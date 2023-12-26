package com.example.ltudddapplication.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ltudddapplication.R;

import java.util.ArrayList;

public class Tuan3Adapter extends BaseAdapter {
    private ArrayList<Tuan3_Contact> ls;
    private Context context;

    public Tuan3Adapter(ArrayList<Tuan3_Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;
        if (convertView == null)
        {
            vax = new ViewAX();

            convertView= LayoutInflater.from(context).inflate(R.layout.tuan3_listview_item, null);
            vax.img_hnh = convertView.findViewById(R.id.tuan3_itemHinh);
            vax.tv_ten = convertView.findViewById(R.id.tuan3_itemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.tuan3_itemTuoi);
            convertView.setTag(vax);
        }
        else {
            vax = (ViewAX) convertView.getTag();
            // lay view cu
        }

        vax.img_hnh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());

        return convertView;
        // return null;
    }

    class ViewAX
    {
        ImageView img_hnh;
        TextView tv_ten, tv_tuoi;
    }

}
