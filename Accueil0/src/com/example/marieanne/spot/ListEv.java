package com.example.marieanne.spot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
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


public class ListEv extends Activity {

    private ListView list= null;
    private ImageView image =null;
    private TextView titreEM=null;
    private TextView descEM = null;
    private static List<Event> listEvent = new ArrayList<>();
    private static List<String> listTitleEvent = new ArrayList<>();


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ev);

        titreEM = (TextView) findViewById(R.id.titreEM);
        descEM = (TextView) findViewById(R.id.descEM);
        image = (ImageView) findViewById(R.id.imageDuMois);
        list = (ListView) findViewById(R.id.liste);

        listTitleEvent.clear();
        for ( int i=0; i<listEvent.size();i++){
            listTitleEvent.add(listEvent.get(i).getTitle());
        }

        ArrayAdapter<String> listAdapterTitle = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listTitleEvent);
        list.setAdapter(listAdapterTitle);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(ListEv.this, Evenement.class);
                startActivity(intent);
                Evenement.changeEvent(listEvent.get(position));
            }

        });

        image.setImageResource(listEvent.get(0).getPicture());
        titreEM.setText(listEvent.get(0).getTitle());
        descEM.setText(listEvent.get(0).getMotClé());

    }



   /* public void goToEvent ( View view) {
        int ind = list.getCheckedItemPosition();
        Evenement.changeEvent(listEvent.get(ind));
    }*/




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_ev, menu);
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

   public static void changeListEvent( List<Event> events ) {
        listEvent=events;
    }



}

