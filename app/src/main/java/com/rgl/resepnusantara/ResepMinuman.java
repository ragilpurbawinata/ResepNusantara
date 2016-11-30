package com.rgl.resepnusantara;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ResepMinuman extends AppCompatActivity {
    GridView gridMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_minuman);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResepMinuman.this, ResepMasakan.class);
                startActivity(i);
            }
        });

        gridMinuman = (GridView) findViewById(R.id.gridMinuman);
        gridMinuman.setAdapter(new AdapterMinuman(this));

        gridMinuman.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ResepMinuman.this, DetailResepMinuman.class);
                intent.putExtra("posisi", position);
                startActivity(intent);
            }
        });
    }

}
