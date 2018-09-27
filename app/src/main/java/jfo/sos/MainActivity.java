package jfo.sos;

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

        // get your ToggleButton
        final ToggleButton b = (ToggleButton) findViewById(R.id.toggleSOS);
        //Switch myToggleButton = ((Switch) findViewById(R.id.toggleSOS));
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bip);
        // attach an OnClickListener
        b.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // your click actions go here
                if (b.isChecked()) {
                    mp.start();
                    
                }
            }
        });
    }
}
