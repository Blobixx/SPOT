package com.example.marieanne.spot;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.marieanne.spot.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;


public class ListAmis extends Activity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_amis);
    }*/
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_amis, menu);
        return true;
    }
    private ListView maListViewPerso;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_amis);
 
        //Récupération de la listview créée dans le fichier main.xml
        maListViewPerso = (ListView) findViewById(R.id.listviewamis);
 
        //Création de la ArrayList qui nous permettra de remplir la listView
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> map;
 
        /*//Création d'une HashMap pour insérer les informations du premier item de notre listView
        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("pseudo", "Word");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("nombre amis", "Editeur de texte");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("photo", String.valueOf(R.drawable.maphoto));
        //enfin on ajoute cette hashMap dans la arrayList
        listItem.add(map);*/
 
        //On refait la manip plusieurs fois avec des données différentes pour former les items de notre ListView
 
        map = new HashMap<String, String>();
        map.put("pseudo", "Shane");
        map.put("nombre amis", "nombre amis");
        map.put("photo", String.valueOf(drawable.shodoshane));
        listItem.add(map);
        
        map = new HashMap<String, String>();
        map.put("pseudo", "Modo");
        map.put("nombre amis", "nombre amis");
        map.put("photo", String.valueOf(drawable.shodomodo));
        listItem.add(map);
 

 
        //Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.affiche_amis,
               new String[] {"pseudo", "nombre amis", "photo"}, new int[] {R.id.pseudo, R.id.nombreamis, R.id.maphoto});
 
        //On attribue à notre listView l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(mSchedule);
 
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
}
