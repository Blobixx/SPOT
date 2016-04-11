package com.example.marieanne.spot;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Accueil0 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil0); 
        
        Resources res = getResources();
        StateListDrawable button = new StateListDrawable();
        button.addState(new int[] {}, res.getDrawable(R.drawable.button_rouge));
        button.addState(new int[] {android.R.attr.state_pressed}, res.getDrawable(R.drawable.button_rouge));
        button.addState(new int[] {android.R.attr.state_focused}, res.getDrawable(R.drawable.button_rouge));
        
        ((Button)findViewById(R.id.connexion)).setBackgroundDrawable(button);
        ((Button)findViewById(R.id.inscription)).setBackgroundDrawable(button);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accueil0, menu);
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
 
      
    public void goToAccueil1(View view) {
       Intent intentSeCo = new Intent(Accueil0.this, Accueil1.class);
    }


    public void goToInscription(View view) {
        Intent intentSeCo = new Intent(Accueil0.this, CreerCompte.class);
        startActivity(intentSeCo);
    }
    
    public void goToEvent(View view) {
        Intent intentSeCo = new Intent(Accueil0.this, Accueil1.class);
        startActivity(intentSeCo);
    }
}
