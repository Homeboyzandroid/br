package com.faith.brooksidefinalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
   // ImageAdapter lviewAdapter;
    ArrayList<HashMap<String, String>> oslist = new ArrayList<HashMap<String, String>>();

    private final static String web[] = {"Register",
            "Statistics",
            "About",
            "Route",
            "Calender",
            "Settings",
            };
    private final static int []imageId =
            {R.drawable.about,
                    R.drawable.graph,
                    R.drawable.info,
                    R.drawable.route,
                    R.drawable.events,
                    R.drawable.chalenge,
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageAdapter adapter = new ImageAdapter(getApplicationContext(), web, imageId);
        gridview = (GridView)findViewById(R.id.grid_view);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getActivity(),"welcome to"+web,Toast.LENGTH_SHORT).show();ra

                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), registration.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), statistics.class));
                        break;
                }
            }
        });
    }
}
