package com.example.oeloem.animals;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] nameArray = {"Ant", "Bat", "Bird", "Fish", "Horse", "Spider"};

        String[] infoArray = {
                "6 foot",
                "Have a wing",
                "Fly on the sky",
                "Life in the water",
                "Fast run",
                "Scary."
        };

        Integer[] imageArray = {R.drawable.icons8ant96,
                R.drawable.icons8bat96,
                R.drawable.icons8bird96,
                R.drawable.icons8fish96,
                R.drawable.icons8horse96,
                R.drawable.icons8spidermannew96};

        ListView listView;
        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ActivityDetail.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}




