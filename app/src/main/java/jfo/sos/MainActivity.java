package jfo.sos;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout L = (ConstraintLayout) findViewById(R.id.background);
        L.setBackgroundColor(getResources().getColor(R.color.BGCOLOR));
        // get your ToggleButton
        final ToggleButton b = (ToggleButton) findViewById(R.id.toggleSOS);
        //Switch myToggleButton = ((Switch) findViewById(R.id.toggleSOS));
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sos);
        mp.setLooping(true);
        // attach an OnClickListener
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // your click actions go here
                if (b.isChecked()) {
                    mp.setLooping(true);
                    mp.start();
                    L.setBackgroundColor(getResources().getColor(R.color.FULLWHITE));
                } else {
                    mp.stop();
                    mp.setLooping(false);
                    L.setBackgroundColor(getResources().getColor(R.color.BGCOLOR));
                }
            }
        });
    }
}
