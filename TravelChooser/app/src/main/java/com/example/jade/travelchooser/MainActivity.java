package com.example.jade.travelchooser;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity{

    String[] destinationname ={
            "Nassau",
            "Tokyo",
            "Hawaii",
            "Grand Canyon"
    };

    Integer[] imgid={
            R.drawable.nassau,
            R.drawable.tokyo,
            R.drawable.hawaii,
            R.drawable.grandcanyon,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomListAdapter adapter=new CustomListAdapter(this, destinationname, imgid);
        setListAdapter(adapter);
    }
    public void onListItemClick(ListView lv ,View view,int position,int imgid) {

        String Selecteditem= (String)getListAdapter().getItem(position);
        Toast.makeText(this, Selecteditem, Toast.LENGTH_SHORT).show();
    }

}