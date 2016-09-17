package com.geekhaven.iiitanewsfeed;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geekhaven.iiitanewsfeed.Adapters.SocietiesViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.htab_viewpager);

        SocietiesViewPager fp = new SocietiesViewPager(getSupportFragmentManager());
        fp.addFrag(NewsfeedFragment.newInstance(0),"Geekhaven");
        fp.addFrag(NewsfeedFragment.newInstance(1),"Spirit");
        fp.addFrag(NewsfeedFragment.newInstance(2),"Test");

        vp.setAdapter(fp);
    }
}