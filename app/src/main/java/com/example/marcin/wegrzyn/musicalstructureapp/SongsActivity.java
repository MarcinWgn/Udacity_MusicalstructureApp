package com.example.marcin.wegrzyn.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener{

    private String song = "Song";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Button selectButton = (Button) findViewById(R.id.selectBTn);
        Button shareButton = (Button) findViewById(R.id.shareBtn);

        selectButton.setOnClickListener(this);
        shareButton.setOnClickListener(this);

    }

    private void startMainActivity() {
        Intent intent = new Intent(SongsActivity.this,MainActivity.class);
        startActivity(intent);
    }


    private void share (String txt){

        Intent implicitIntent = new Intent();
        implicitIntent.setAction(Intent.ACTION_SEND);
        implicitIntent.putExtra(Intent.EXTRA_TEXT,txt);
        implicitIntent.setType("text/plain");

        if (implicitIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntent);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id==R.id.selectBTn)
            startMainActivity();
        else if (id==R.id.shareBtn)
            share(song);
    }
}
