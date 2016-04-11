package com.example.marieanne.spot;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class SemiActivity extends Activity {
	 
    private String[] drawerItemsList;
    private ListView myDrawer;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semiactivity);
 
        drawerItemsList = getResources().getStringArray(R.array.items);
        myDrawer = (ListView) findViewById(R.id.my_drawer);
        myDrawer.setAdapter(new ArrayAdapter<String>(this,
                R.layout.draweritem, drawerItemsList));
    }
 
}
