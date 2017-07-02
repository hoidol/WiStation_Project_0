package com.myapptest;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;

import com.multi_cardview.CardViewData_Layout0;
import com.multi_cardview.CardViewData_Layout1;
import com.multi_cardview.CardViewData_Layout6;
import com.multi_cardview.MultiLayout_Layout0_Adapter;
import com.multi_cardview.MultiLayout_Layout1_Adapter;
import com.multi_cardview.MultiLayout_Layout6_Adapter;
import com.multi_cardview.MultiLayout_RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =(Button)findViewById(R.id.Go_Loging_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });


        Button button1 = (Button)findViewById(R.id.Go_Feed_btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FeedActivity.class);
                startActivity(intent);
            }
        });


        Button button2 = (Button)findViewById(R.id.Go_Intro_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IntroActivity.class);
                startActivity(intent);
            }
        });


    }
}
