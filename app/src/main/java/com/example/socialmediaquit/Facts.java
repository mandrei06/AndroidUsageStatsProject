package com.example.socialmediaquit;

import static android.app.AppOpsManager.MODE_ALLOWED;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.Manifest;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class Facts extends AppCompatActivity {

    ViewPager2 imageContainer;
    SliderAdapter adapter;
    int list[];
    String[] list1=new String[10];

    TextView[] dots;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        imageContainer = findViewById(R.id.image_container);
        layout = findViewById(R.id.dots_container);

        dots = new TextView[10];

        list = new int[10];
        list[0] = getResources().getColor(R.color.green);
        list[1] = getResources().getColor(R.color.red);
        list[2] = getResources().getColor(R.color.color4);
        list[3] = getResources().getColor(R.color.yellow);
        list[4] = getResources().getColor(R.color.orange);
        list[5] = getResources().getColor(R.color.color5);
        list[6] = getResources().getColor(R.color.color6);
        list[7] = getResources().getColor(R.color.color7);
        list[8] = getResources().getColor(R.color.color8);
        list[9] = getResources().getColor(R.color.color9);
        list1[0]=getResources().getString(R.string.string0);
        list1[1]=getResources().getString(R.string.string1);
        list1[2]=getResources().getString(R.string.string2);
        list1[3]=getResources().getString(R.string.string3);
        list1[4]=getResources().getString(R.string.string4);
        list1[5]=getResources().getString(R.string.string5);
        list1[6]=getResources().getString(R.string.string6);
        list1[7]=getResources().getString(R.string.string7);
        list1[8]=getResources().getString(R.string.string8);
        list1[9]=getResources().getString(R.string.string9);


        adapter = new SliderAdapter(list,list1);
        imageContainer.setAdapter(adapter);

        setIndicators();

        imageContainer.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                selectedDots(position);
                super.onPageSelected(position);
            }
        });

    }

    private void selectedDots(int position) {
        for (int i = 0; i < dots.length; i++) {
            if (i == position) {
                dots[i].setTextColor(list[position]);
            } else {
                dots[i].setTextColor(getResources().getColor(R.color.grey));
            }
        }
    }

    private void setIndicators() {
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#9679;"));
            dots[i].setTextSize(18);
            layout.addView(dots[i]);
        }

    }
}