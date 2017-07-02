package com.myapptest;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Hoyoung on 2017-07-02.
 */

public class IntroActivity extends AppCompatActivity {
        ImageView pager1_slide_image;
        ImageView pager2_slide_image;
        ImageView pager3_slide_image;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                Window w = getWindow();
                w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            }

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_intro);



            PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
            ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);

            viewPager.setAdapter(adapter);

            pager1_slide_image = (ImageView)findViewById(R.id.pager1_Slide_Image);
            pager2_slide_image = (ImageView)findViewById(R.id.pager2_Slide_Image);
            pager3_slide_image = (ImageView)findViewById(R.id.pager3_Slide_Image);
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    Toast.makeText(getApplicationContext(),"현재 포지션 : " + position, Toast.LENGTH_SHORT).show();
                    switch (position){
                        case 0 :
                            pager1_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.selected_slide_icon));
                            pager2_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.nonslideicon));
                            pager3_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.nonslideicon));
                            break;
                        case 1 :
                            pager1_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.nonslideicon));
                            pager2_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.selected_slide_icon));
                            pager3_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.nonslideicon));
                            break;
                        case 2 :
                            pager1_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.nonslideicon));
                            pager2_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.nonslideicon));
                            pager3_slide_image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.selected_slide_icon));
                            break;
                    }
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
}