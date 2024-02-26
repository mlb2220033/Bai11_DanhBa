package com.example.bai11_danhba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.adapter.DanhBaAdapter;
import com.example.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhBa;
    ImageView imgbtn;
    ArrayList<DanhBa> dsDanhba;
    DanhBaAdapter danhBaAdapter;

    public void addControls(){
        lvDanhBa=findViewById(R.id.lvDanhBa);

        dsDanhba=new ArrayList<>(0);
        dsDanhba.add(new DanhBa("2","MBBank","Phạm Thị Xuân Diệu", "0976538161"));
        dsDanhba.add(new DanhBa("4","Hưng Gia","NGUYEN THI PHUONG OANH", "01638005675"));
        dsDanhba.add(new DanhBa("5","Hưng Gia","CTY TNHH PHAM LAM", "0977419359"));
        dsDanhba.add(new DanhBa("8","Hưng Gia","THAI ANH THU", "01668794012"));
        danhBaAdapter=new DanhBaAdapter(MainActivity.this,R.layout.activity_danhba,dsDanhba);
        lvDanhBa.setAdapter(danhBaAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Danh Bạ");
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }
}