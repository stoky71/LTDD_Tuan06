package com.example.lap06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class detail_shoes_item extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_items);

        Intent intent = new Intent();

        TextView tvName = findViewById(R.id.tvName);
        ImageView img = findViewById(R.id.imgShoe);

        img.setImageResource(Integer.valueOf(getIntent().getExtras().getInt("id")));
        tvName.setText(String.valueOf(getIntent().getExtras().getString("name")));
    }
}
