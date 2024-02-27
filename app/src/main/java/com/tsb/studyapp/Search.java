package com.tsb.studyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Search extends AppCompatActivity {

    public void dummysearch(View v)
    {
        startActivity(new Intent(getApplicationContext(), Pageempty.class));
    }

    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        nav=findViewById(R.id.bottom_navigation);
        nav.setSelectedItemId(R.id.search);

        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case (R.id.home):
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case (R.id.search):
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
    }
}