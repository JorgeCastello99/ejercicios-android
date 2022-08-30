package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private static final String VIDEO="pointer";
    private static VideoView vid;
    private static MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vid=findViewById(R.id.videoView);
         mc= new MediaController(this);


    }
    private Uri getMedia(String nombreVideo){
        return Uri.parse("android.resource://"+getPackageName()+"/raw/"+nombreVideo);
    }


    //Hay una clase llamada MediaPlayer
    private void iniciarPlayer(){
        Uri videoUri=getMedia(VIDEO);

        vid.setVideoURI(videoUri);
        mc.setMediaPlayer(vid);
        vid.setMediaController(mc);


        vid.start();
    }
    private void releasePlayer(){
        vid.stopPlayback();
    }

    public void onClickVideo(View view) {
        if(vid.isPlaying()){

        }
        else{

        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        iniciarPlayer();

    }

    @Override
    protected void onStop() {
        super.onStop();
        releasePlayer();
    }

    @Override
    protected void onPause() {
        super.onPause();//Controlar las versiones anteriores
        if(Build.VERSION.SDK_INT<Build.VERSION_CODES.N){
            vid.pause();
        }
    }
}
