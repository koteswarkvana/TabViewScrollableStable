package com.koti.apple.tabviewscrollablestable;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "DashboardActivity";
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.transparent_color));
        tabLayout.setSelectedTabIndicatorHeight(0);
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_m));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_n));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_o));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_p));
        /*tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        disableSwiping(viewPager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

//      viewPager.setCurrentItem(tab.getPosition());
        ////
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(
                new TabLayout.ViewPagerOnTabSelectedListener(viewPager) {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        super.onTabSelected(tab);
                        tab.getPosition();
//                        tab.setIcon(R.drawable.android_p);
                    }
                });
        ////
        /*tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/
    }

    ////
    private void setupTabs() {
//        tabLayout.getTabAt(0).setIcon(mTabIcons[0]);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_m));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_n));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_o));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.android_p));
    }
    ////

    private void disableSwiping(ViewPager viewPager) {
        viewPager.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg0, MotionEvent arg1) {
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}

