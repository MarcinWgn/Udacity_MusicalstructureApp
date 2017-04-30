package com.example.marcin.wegrzyn.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.marcin.wegrzyn.musicalstructureapp.R.string.next;
import static com.example.marcin.wegrzyn.musicalstructureapp.R.string.play;
import static com.example.marcin.wegrzyn.musicalstructureapp.R.string.prev;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button prevButton = (Button) findViewById(R.id.prevBtn);
        Button playButton = (Button) findViewById(R.id.playBtn);
        Button nextButton = (Button) findViewById(R.id.nextBtn);

        Button songsButton = (Button) findViewById(R.id.songsBtn);
        Button artistButton = (Button) findViewById(R.id.artistBtn);
        Button genreButton = (Button) findViewById(R.id.genreBtn);


        prevButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

        songsButton.setOnClickListener(this);
        artistButton.setOnClickListener(this);
        genreButton.setOnClickListener(this);


    }

    private void startSongsActivity() {
        Intent songsIntent = new Intent(MainActivity.this,SongsActivity.class);
        startActivity(songsIntent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id==R.id.prevBtn)
            Toast.makeText(getBaseContext(),getResources().getText(prev),Toast.LENGTH_SHORT).show();
        else if(id==R.id.playBtn)
            Toast.makeText(getBaseContext(),getResources().getText(play),Toast.LENGTH_SHORT).show();
        else if(id==R.id.nextBtn)
            Toast.makeText(getBaseContext(),getResources().getText(next),Toast.LENGTH_SHORT).show();
        else if (id==R.id.songsBtn)
            startSongsActivity();

    }
}
