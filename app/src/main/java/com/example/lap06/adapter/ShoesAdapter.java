package com.example.lap06.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lap06.R;
import com.example.lap06.detail_shoes_item;
import com.example.lap06.model.Shoes;


import java.util.ArrayList;

public class ShoesAdapter extends BaseAdapter{

    Context context;
    int layoutItem;
    ArrayList<Shoes> arrayList;

    public ShoesAdapter(Context context, int layoutItem, ArrayList<Shoes> arrayList) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tvName);
        ImageView imgShoe = view.findViewById(R.id.imgShoe);

        imgShoe.setImageResource(arrayList.get(i).getId());
        tvName.setText(arrayList.get(i).getName());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, detail_shoes_item.class);
                Shoes s = arrayList.get(i);

                intent.putExtra("id", s.getId());
                intent.putExtra("name", s.getName());

                context.startActivity(intent);
            }
        });

        return view;
    }
}
