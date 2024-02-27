package com.tsb.studyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    BottomNavigationView nav;
    LinearLayout coursePckg1, coursePckg2, coursePckg3, coursePckg4, coursePckg5;
    LinearLayout newcoursePckg1, newcoursePckg2, newcoursePckg3, newcoursePckg4, newcoursePckg5;
    LinearLayout popularcoursePckg1, popularcoursePckg2, popularcoursePckg3, popularcoursePckg4, popularcoursePckg5;
    TextView t;

    public void dummymain(View v)
    {
        startActivity(new Intent(getApplicationContext(), Pageempty.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        nav=findViewById(R.id.bottom_navigation);
        nav.setSelectedItemId(R.id.home);

        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case (R.id.home):
                        return true;

                    case (R.id.search):
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case (R.id.profile):
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case (R.id.wishlist):
                        startActivity(new Intent(getApplicationContext(), Wishlist.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case (R.id.account):
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        coursePckg1 = findViewById(R.id.coursePckg1);
        coursePckg2 = findViewById(R.id.coursePckg2);
        coursePckg3 = findViewById(R.id.coursePckg3);
        coursePckg4 = findViewById(R.id.coursePckg4);
        coursePckg5 = findViewById(R.id.coursePckg5);
        newcoursePckg1 = findViewById(R.id.newcoursePckg1);
        newcoursePckg2 = findViewById(R.id.newcoursePckg2);
        newcoursePckg3 = findViewById(R.id.newcoursePckg3);
        newcoursePckg4 = findViewById(R.id.newcoursePckg4);
        newcoursePckg5 = findViewById(R.id.newcoursePckg5);
        popularcoursePckg1 = findViewById(R.id.popularcoursePckg1);
        popularcoursePckg2 = findViewById(R.id.popularcoursePckg2);
        popularcoursePckg3 = findViewById(R.id.popularcoursePckg3);
        popularcoursePckg4 = findViewById(R.id.popularcoursePckg4);
        popularcoursePckg5 = findViewById(R.id.popularcoursePckg5);

        coursePckg1.setOnClickListener(this);
        coursePckg2.setOnClickListener(this);
        coursePckg3.setOnClickListener(this);
        coursePckg4.setOnClickListener(this);
        coursePckg5.setOnClickListener(this);
        newcoursePckg1.setOnClickListener(this);
        newcoursePckg2.setOnClickListener(this);
        newcoursePckg3.setOnClickListener(this);
        newcoursePckg4.setOnClickListener(this);
        newcoursePckg5.setOnClickListener(this);
        popularcoursePckg1.setOnClickListener(this);
        popularcoursePckg2.setOnClickListener(this);
        popularcoursePckg3.setOnClickListener(this);
        popularcoursePckg4.setOnClickListener(this);
        popularcoursePckg5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        String msg;

        switch(v.getId())
        {
            case R.id.coursePckg1:
                t = findViewById(R.id.courseName1);
                break;
            case R.id.coursePckg2:
                t = findViewById(R.id.courseName2);
                break;
            case R.id.coursePckg3:
                t = findViewById(R.id.courseName3);
                break;
            case R.id.coursePckg4:
                t = findViewById(R.id.courseName4);
                break;
            case R.id.coursePckg5:
                t = findViewById(R.id.courseName5);
                break;

            case R.id.newcoursePckg1:
                t = findViewById(R.id.newcourseName1);
                break;

            case R.id.newcoursePckg2:
                t=findViewById(R.id.newcourseName2);
                break;

            case R.id.newcoursePckg3:
                t=findViewById(R.id.newcourseName3);
                break;

            case R.id.newcoursePckg4:
                t=findViewById(R.id.newcourseName4);
                break;

            case R.id.newcoursePckg5:
                t=findViewById(R.id.newcourseName5);
                break;

            case R.id.popularcoursePckg1:
                t = findViewById(R.id.popularcourseName1);
                break;
            case R.id.popularcoursePckg2:
                t = findViewById(R.id.popularcourseName2);
                break;
            case R.id.popularcoursePckg3:
                t = findViewById(R.id.popularcourseName3);
                break;
            case R.id.popularcoursePckg4:
                t = findViewById(R.id.popularcourseName4);
                break;
            case R.id.popularcoursePckg5:
                t = findViewById(R.id.popularcourseName5);
                break;
        }
        msg=t.getText().toString();
        startActivity(new Intent(getApplicationContext(), Coursepage.class).putExtra("PCKG", msg));
    }
}