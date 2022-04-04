package com.example.lap06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lap06.adapter.ShoesAdapter;
import com.example.lap06.model.Shoes;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lvShoe;
    ShoesAdapter adt;
    ArrayList<Shoes> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvShoe = findViewById(R.id.ListViewLayout);

        arrayList = new ArrayList<>();
        arrayList.add(new Shoes(R.drawable.shoes_rm_preview_b,"Nike shoes-discount 50%"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_preview_a,"Adidas shoes-discount 80%"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_purple,"Nike Bicycle-discount 50%"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_preview_a,"Yonex shoes-discount 50%"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_yellow,"Victor shoes-discount 50%"));
        arrayList.add(new Shoes(R.drawable.white_shoe,"Lining shoes-discount 50%"));

        adt = new ShoesAdapter(this, R.layout.items_listview, arrayList);
        lvShoe.setAdapter(adt);
    }
}