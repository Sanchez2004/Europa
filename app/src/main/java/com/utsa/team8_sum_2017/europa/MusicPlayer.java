package com.utsa.team8_sum_2017.europa;

import android.app.ProgressDialog;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anfang on 8/6/2017.
 */

public class MusicPlayer extends AppCompatActivity {

    private Button btn;
    private boolean isPlaying;
    private MediaPlayer mediaPlayer;
    private ProgressDialog progressDialog;
    private boolean initialStage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);

        btn = (Button) findViewById(R.id.audioStreamBtn);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        progressDialog = new ProgressDialog(this);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!isPlaying)
                {
                    btn.setText("Pause Streaming");

                    if(initialStage)
                    {
                        new Player().execute("http://34.211.163.10:8000/europaradio");
                    }
                    else
                    {
                        if(!mediaPlayer.isPlaying())
                        {
                            mediaPlayer.start();
                        }
                    }

                    isPlaying = true;
                }
                else
                {
                    btn.setText("Launch Streaming");

                    if(mediaPlayer.isPlaying())
                    {
                        mediaPlayer.pause();
                    }

                    isPlaying = false;
                }
            }
        });
    }

    @Override
    protected void onPause()
    {
        super.onPause();

        if(mediaPlayer != null)
        {
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    class Player extends AsyncTask<String, Void, Boolean>{

        @Override
        protected Boolean doInBackground(String... strings)
        {
            Boolean prepared = false;

            try
            {
                mediaPlayer.setDataSource(strings[0]);
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer)
                    {
                        initialStage = true;
                        isPlaying = false;
                        btn.setText("Launch Streaming");
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                    }
                });

                mediaPlayer.prepare();
                prepared = true;
            }
            catch(Exception e)
            {
                Log.e("EuropaRadioApp", e.getMessage());
                prepared = false;
            }
            return prepared;
        }

        @Override
        protected void onPostExecute(Boolean bool)
        {
            super.onPostExecute(bool);

            if(progressDialog.isShowing())
            {
                progressDialog.cancel();
            }

            mediaPlayer.start();
            initialStage = false;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog.setMessage("Buffering...");
            progressDialog.show();
        }
    }
}
