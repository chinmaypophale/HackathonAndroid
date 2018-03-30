package com.chinmay.hackathon;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void goGoogle( ) {
        Log.i("Check ","In loop");
        Intent intent = new Intent(this, webview.class);
        intent.putExtra("url", "https://google.com");

        startActivity(intent);
    }

    public void goFlipkart() {
        Intent intent = new Intent(this, webview.class);
        intent.putExtra("url", "https://flipkart.com");

        this.startActivity(intent);
    }


}
