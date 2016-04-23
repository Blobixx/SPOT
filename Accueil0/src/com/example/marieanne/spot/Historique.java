package com.example.marieanne.spot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.marieanne.spot.Data.Event;

import java.util.ArrayList;
import java.util.List;


public class Historique extends Activity {

    ListView list;
    private static List<Event> listEventHisto = new ArrayList<>();
    private static List<String> listTitleEventHisto = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historique);


        list = (ListView) findViewById(R.id.histo);

        listTitleEventHisto.clear();
        for ( int i=0; i<listEventHisto.size();i++){
            listTitleEventHisto.add(listEventHisto.get(i).getTitle());
        }

        ArrayAdapter<String> listAdapterTitle = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listTitleEventHisto);
        list.setAdapter(listAdapterTitle);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(Historique.this, Evenement.class);
                startActivity(intent);
                Evenement.changeEvent(listEventHisto.get(position));
            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historique, menu);
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

    public static void changeListEventHisto( List<Event> events ) {
        listEventHisto=events;
    }
}
