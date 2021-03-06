package com.example.marcin.wegrzyn.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GenreActivity extends AppCompatActivity{

    private String genre = "Genre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        Button selectButton = (Button) findViewById(R.id.selectBTn);
        Button shareButton = (Button) findViewById(R.id.shareBtn);


//      changed the listening to an anonymous class
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSongActivity();
            }
        });
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share(genre);
            }
        });
    }

    private void startSongActivity() {
        Intent intent = new Intent(GenreActivity.this,SongsActivity.class);
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

}
