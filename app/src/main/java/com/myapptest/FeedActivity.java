package com.myapptest;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.multi_cardview.CardViewData_Layout3;
import com.multi_cardview.MultiLayout_Layout3_Adapter;
import com.multi_cardview.MultiLayout_RecyclerView;
import com.multi_cardview.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parkhoyoung on 2017. 6. 30..
 */

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);






        setToolbar();
        setTabHost();




    }

    void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        // Custom Actionbar를 사용하기 위해 CustomEnabled을 true 시키고 필요 없는 것은 false 시킨다
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);            //액션바 아이콘을 업 네비게이션 형태로 표시합니다.
        actionBar.setDisplayShowTitleEnabled(false);        //액션바에 표시되는 제목의 표시유무를 설정합니다.
        actionBar.setDisplayShowHomeEnabled(false);            //홈 아이콘을 숨김처리합니다.


        //layout을 가지고 와서 actionbar에 포팅을 시킵니다.
        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View actionbar = inflater.inflate(R.layout.custom_toolbar_layout1, null);
        actionBar.setCustomView(actionbar);

        //액션바 양쪽 공백 없애기
        Toolbar parent = (Toolbar)actionbar.getParent();
        parent.setContentInsetsAbsolute(0,0);


        ImageButton toolBar_Btn = (ImageButton)actionbar.findViewById(R.id.btnBack);
        toolBar_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Test", Toast.LENGTH_SHORT).show();
            }
        });
    }
    List<CardViewData_Layout3> list;
    void setTabHost(){
        TabHost tabHost = (TabHost)findViewById(R.id.tabHost1);

        tabHost.setup();

        TabHost.TabSpec ts1 = tabHost.newTabSpec("Tab1 Spec 1");
        ts1.setContent(R.id.Tab_Content1);
        ts1.setIndicator("TAB 1");

        tabHost.addTab(ts1);

        MultiLayout_RecyclerView multiLayout_recyclerView = (MultiLayout_RecyclerView)findViewById(R.id.Tab_Content1_RecyclerView);

        list = new ArrayList<>();
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_2) ,"놀라운 가격0","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.drawable.abc) ,"놀라운 가격1","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.drawable.abc) ,"놀라운 가격2","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.drawable.abc) ,"놀라운 가격3","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_2) ,"놀라운 가격4","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_2) ,"놀라운 가격5","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.drawable.abc) ,"놀라운 가격6","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_3) ,"놀라운 가격6","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_3) ,"놀라운 가격7","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.drawable.abc) ,"놀라운 가격8","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_2) ,"놀라운 가격9","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_3) ,"놀라운 가격10","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.drawable.abc) ,"놀라운 가격11","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));
        list.add(new CardViewData_Layout3(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_3) ,"놀라운 가격12","싼싼가격",ContextCompat.getDrawable(getApplicationContext(),R.mipmap.card_item_1),"쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!쾌변 잃은 고통일까?!!!"));

        MultiLayout_Layout3_Adapter adapter = new MultiLayout_Layout3_Adapter(getApplicationContext(),list);
        multiLayout_recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(),new RecyclerItemClickListener.OnItemClickListener(){
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "누른 번호 " + list.get(position).getCardView_Title_Text_Value(),Toast.LENGTH_SHORT).show();
            }
        }));
        multiLayout_recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        multiLayout_recyclerView.setLayoutManager(layoutManager);


        TabHost.TabSpec ts2 = tabHost.newTabSpec("Tab1 Spec 2");
        ts2.setContent(R.id.Tab_Content2);
        ts2.setIndicator("TAB 2");

        tabHost.addTab(ts2);

        //색변경하기
        TextView tv1 = (TextView)tabHost.getTabWidget().getChildAt(0).findViewById(android.R.id.title);
        tv1.setTextColor(Color.WHITE);

        TextView tv2 = (TextView)tabHost.getTabWidget().getChildAt(1).findViewById(android.R.id.title);
        tv2.setTextColor(Color.WHITE);

    }



}
