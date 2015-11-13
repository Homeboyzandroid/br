package com.faith.brooksidefinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    ImageAdapter lviewAdapter;
    ArrayList<HashMap<String, String>> oslist = new ArrayList<HashMap<String, String>>();

    private final static String web[] = {"About",
            "Challange",
            "Register",
            "News",
            "Fitness",
            "Calender",
            };
    private final static int []imageId =
            {R.drawable.about,
                    R.drawable.chalenge,
                    R.drawable.about,
                    R.drawable.graph,
                    R.drawable.reg,
                    R.drawable.route,
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageAdapter adapter = new ImageAdapter(getApplicationContext(), web, imageId);
        gridview = (GridView)findViewById(R.id.grid_view);
        gridview.setAdapter(adapter);
    }
}
