package com.rgl.resepnusantara;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Mars on 11/26/2016.
 */
public class AdapterMasakan extends BaseAdapter {
    Context context;

    public AdapterMasakan(Context c){
        context = c;
    }

    public int[] masakan = {
            R.drawable.bakso, R.drawable.miejawa, R.drawable.sop,
            R.drawable.selat, R.drawable.opor, R.drawable.sotobtw
    };

    @Override
    public int getCount() {
        return masakan.length;
    }

    @Override
    public Object getItem(int position) {
        return masakan[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView im = new ImageView(context);
        im.setImageResource(masakan[position]);
        im.setScaleType(ImageView.ScaleType.CENTER_CROP);
        im.setLayoutParams(new GridView.LayoutParams(250, 250));
        return im;
    }
}
