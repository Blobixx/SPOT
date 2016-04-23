package com.example.marieanne.spot;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marieanne.spot.Data.Event;


public class Evenement extends Activity {

    private static Event event;
    private TextView titre;
    private ImageView image;
    private TextView description;
    private TextView motCle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenement);


        titre = (TextView) findViewById(R.id.titreEvenement);
        titre.setText(event.getTitle());
        image = (ImageView) findViewById(R.id.imageEvent);
        image.setImageResource(event.getPicture());
        description = (TextView) findViewById(R.id.description);
        description.setText(event.getDescription());
        motCle = (TextView) findViewById(R.id.motCle);
        motCle.setText(event.getMotClé());



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_evenement, menu);
        
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void changeEvent ( Event nEvent) {
        event = nEvent;
    }
}
