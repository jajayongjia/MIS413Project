package com.ualberta.mis413project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MenuPage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    CalendarFragment calendarFragment = new CalendarFragment();
    BlankFragment blankFragment = new BlankFragment();
    Platforms platforms = new Platforms();
    News news = new News();
    Setting setting = new Setting();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (savedInstanceState == null){
            this.setTitle("My Calendar");

            getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout_1, calendarFragment).commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
           Intent intent = new Intent(this, Inbox.class);
           startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.habit) {
            this.setTitle("My Calendar");
            getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout_1, calendarFragment).commit();
        } else if (id == R.id.habitEvent) {
            this.setTitle("Representatives");
            getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout_1, blankFragment).commit();
        }

        else if (id == R.id.friends) {
            this.setTitle("Party Platforms");
            getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout_1, platforms).commit();
        }

        else if (id == R.id.social) {
            this.setTitle("News");
            getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout_1, news).commit();
        }

        else if (id == R.id.setting) {
            this.setTitle("Setting");
            getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout_1, setting).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
