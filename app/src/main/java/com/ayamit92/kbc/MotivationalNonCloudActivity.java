package com.ayamit92.kbc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MotivationalNonCloudActivity extends AppCompatActivity {

    MediaPlayer mp;

    public void playmusic(View view) {
        switch (view.getId()) {

            case R.id.buttonTuChal:
                stopPlaying();
                mp = MediaPlayer.create(MotivationalNonCloudActivity.this, R.raw.tuchal);
                mp.start();
                break;

            case R.id.buttonKoshish:
                stopPlaying();
                mp = MediaPlayer.create(MotivationalNonCloudActivity.this, R.raw.koshish);
                mp.start();
                break;

            case R.id.buttonBelieve:
                stopPlaying();
                mp = MediaPlayer.create(MotivationalNonCloudActivity.this, R.raw.believe);
                mp.start();
                break;

            default:
                break;

        }
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational_non_cloud);
    }

    @Override
    public void onBackPressed() {
        stopPlaying();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        return;
    }
}
