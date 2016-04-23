package com.example.marieanne.spot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.marieanne.spot.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;


public class ListAmis extends Activity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_amis);
    }*/
    
    private ListView listAmis;

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

        listAmis = (ListView) findViewById(R.id.listAmis);
        List<String> listNoms = new ArrayList<>();
        listNoms.add("Lena");
        listNoms.add("Marie-Anne");
        listNoms.add("Maud");
        listNoms.add("Shane");

        ArrayAdapter<String> listAdapterTitle = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listNoms);
        listAmis.setAdapter(listAdapterTitle);




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
