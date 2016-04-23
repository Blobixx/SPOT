package com.example.marieanne.spot;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

import com.example.marieanne.spot.Data.Event;
import com.example.marieanne.spot.Data.Profil;

import java.util.ArrayList;
import java.util.List;


public class Accueil1 extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accueil1, menu);
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

    public void goToListMuseum(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListEv.class);
        ListEv.changeListEvent(Accueil0.listMuseum);
        startActivity(intentSeCo);
    }

    public void goToListBalade(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListEv.class);
        ListEv.changeListEvent(Accueil0.listBalade);
        startActivity(intentSeCo);
    }

    public void goToListResto(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListEv.class);
        ListEv.changeListEvent(Accueil0.listResto);
        startActivity(intentSeCo);
    }

    public void goToListBar(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListEv.class);
        ListEv.changeListEvent(Accueil0.listBar);
        startActivity(intentSeCo);
    }

    public void goToListConcert(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListEv.class);
        ListEv.changeListEvent(Accueil0.listConcert);
        startActivity(intentSeCo);
    }

    public void goToListShopping(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListEv.class);
        ListEv.changeListEvent(Accueil0.listShopping);
        startActivity(intentSeCo);
    }

    public void goToHistorique(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, Historique.class);
        Historique.changeListEventHisto(Accueil0.profil.getEvents());
        startActivity(intentSeCo);
    }

    public void goToListAmis(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, ListAmis.class);

        startActivity(intentSeCo);
    }




    public void goToAddEvent(View view) {
        Intent intentSeCo = new Intent(Accueil1.this, AjoutEv.class);
        startActivity(intentSeCo);
    }
}
