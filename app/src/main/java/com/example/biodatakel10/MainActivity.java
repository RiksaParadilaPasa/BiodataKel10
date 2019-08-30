package com.example.biodatakel10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRiksa = (Button)findViewById(R.id.btn_riksa);
        btnRiksa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RiksaActivity.class);
                startActivity(intent);
            }
        });

        Button btnHerlangga = (Button)findViewById(R.id.btn_herlangga);
        btnHerlangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HerlanggaActivity.class);
                startActivity(intent);
            }
        });

        Button btnRendra = (Button)findViewById(R.id.btn_rendra);
        btnRendra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RendraActivity.class);
                startActivity(intent);
            }
        });



    }
}
