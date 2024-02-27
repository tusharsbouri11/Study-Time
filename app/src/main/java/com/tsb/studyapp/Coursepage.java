package com.tsb.studyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Coursepage extends AppCompatActivity {

    BottomNavigationView nav;
    static TextView instruct, rate, aboutdesc, crsname, pr;
    static ImageView crsImg;
    static Button cart, buy, gotocourse;

    public void dummy(View v)
    {
        Toast.makeText(this, "This Button Works!", Toast.LENGTH_SHORT).show();
    }

    static void setDetails(String instr, String rte, String about, String price)
    {
        instruct.setText(instr);
        rate.setText(rte);
        aboutdesc.setText(about);
        pr.setText(price);
    }

    static void switcher(String msg)
    {
        switch (msg) {
            case "Java Master Course":
                setDetails("James Gosling", "4.9/5", "This course has been exclusively brought to you by the legendary founder of Java, James Gosling.",
                        "\u20B9 999");
                break;
            case "C Zero to Hero":
                crsImg.setImageResource(R.drawable.letterc);
                setDetails("Dennis Ritchie", "4.9/5", "Improve your programming basics with the help of this course on C language. Requires no skill. Enroll Now!",
                        "\u20B9 999");
                break;
            case "Android Development":
                crsImg.setImageResource(R.drawable.android);
                setDetails("Andy Rubin", "4.5/5", "Learn Android App development from scratch using Java", "\u20B9 999");
                break;

            case "Angular" :
                crsImg.setImageResource(R.drawable.angular);
                setDetails("Google Inc.", "4.6/5", "Learn  Angular development from scratch ", "\u20B9 999");
                break;

            case "Complete JS Course" :
                crsImg.setImageResource(R.drawable.js);
                setDetails("Web Dev 3.0", "4.7/5", "Learn JavaScript from scratch", "\u20B9 999");
                break;

            case "Node.Js Course":
                crsImg.setImageResource(R.drawable.nodejs);
                setDetails("Web Devs 3.0", "4.7/5", "Learn Node.Js from scratch", "\u20B9 699");
                break;

            case "Python BootCamp":
                crsImg.setImageResource(R.drawable.python);
                setDetails("Snaky Devs", "4.7/5", "Learn Python from scratch", "\u20B9 899");
                break;

            case "ReactJs Master Course":
                crsImg.setImageResource(R.drawable.react);
                setDetails("Web Devs 3.0", "4.6/5", "Learn ReactJs from scratch", "\u20B9 799");
                break;

            case "Swift Full Course":
                crsImg.setImageResource(R.drawable.swift);
                setDetails("Apple Fans", "4.7/5", "Learn Swift Development from scratch", "\u20B9 99999");
                break;

            case "HTML Course":
                crsImg.setImageResource(R.drawable.html);
                setDetails("Web Devs 3.0", "4.7/5", "Learn HTML from scratch, first step towards Web Development", "\u20B9 599");
                break;

            case "Kotlin Master Course":
                crsImg.setImageResource(R.drawable.kotlin);
                setDetails("IntelliJ Labs", "4.9/5", "Learn Kotlin from scratch, the popular Java Alternative", "\u20B9 699");
                break;

            case "CSS Course":
                crsImg.setImageResource(R.drawable.css);
                setDetails("Web Devs 3.0", "4.7/5", "Learn CSS from scratch, second step towards Web Development", "\u20B9 499");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursepage);

        Intent intent=getIntent();
        String msg=intent.getStringExtra("PCKG");
        crsname=findViewById(R.id.crsName);
        crsname.setText(msg);
        crsImg=findViewById(R.id.crsImg);
        instruct=findViewById(R.id.instructors);
        rate=findViewById(R.id.rate);
        aboutdesc=findViewById(R.id.aboutdesc);
        pr=findViewById(R.id.price);
        cart=findViewById(R.id.cart);
        buy=findViewById(R.id.buy);
        gotocourse=findViewById(R.id.gotocourse);
        switcher(msg);

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
    }
    
}