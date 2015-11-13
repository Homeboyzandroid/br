package com.faith.brooksidefinalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by faith on 11/13/15.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] web;
    private final int[] Imageid;


    public ImageAdapter(Context context, String[] web, int[] imageid){
        this.web = web;
       this.Imageid = imageid;
        Context mcontext = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_item, null);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
        }
        else {
            grid = (View) convertView;
        }

        return grid;
    }
}
