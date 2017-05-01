package com.example.marcin.wegrzyn.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.marcin.wegrzyn.musicalstructureapp.R.string.next;
import static com.example.marcin.wegrzyn.musicalstructureapp.R.string.prev;

public class MainActivity extends AppCompatActivity {

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

//         changed the listening to an anonymous class
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),getResources().getText(prev),Toast.LENGTH_SHORT).show();
            }
        });
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.to_play,Toast.LENGTH_SHORT).show();
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),getResources().getText(next),Toast.LENGTH_SHORT).show();
            }
        });

        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSongsActivity();
            }
        });
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startArtistActivity();
            }
        });
        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGenreActivity();
            }
        });

    }

    private void startSongsActivity() {
        Intent songsIntent = new Intent(MainActivity.this,SongsActivity.class);
        startActivity(songsIntent);
    }

    private void startArtistActivity() {
        Intent artistIntent = new Intent(MainActivity.this,ArtistActivity.class);
        startActivity(artistIntent);
    }

    private void startGenreActivity() {
        Intent genreIntent = new Intent(MainActivity.this,GenreActivity.class);
        startActivity(genreIntent);
    }

}
