package com.rgl.resepnusantara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepMinuman extends AppCompatActivity {
    ImageView imMinumann;
    TextView resepMinuman;
    int teksResep1, posisi1;
    String judulMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep_minuman);

        imMinumann = (ImageView) findViewById(R.id.imageView1);
        resepMinuman = (TextView) findViewById(R.id.textView1);
        AdapterMinuman adapterMinuman = new AdapterMinuman(this);

        Intent i = getIntent();
        posisi1 = i.getIntExtra("posisi", 0);

        switch (posisi1){
            case  0: judulMinuman = "Wedang Bajigur";teksResep1 = R.string.bajigur;break;
            case  1: judulMinuman = "Wedang Ronde";teksResep1 = R.string.ronde;break;
            case  2: judulMinuman = "Sekoteng";teksResep1 = R.string.sekoteng;break;
            case  3: judulMinuman = "Wedang Rempah";teksResep1 = R.string.rempah;break;
            case  4: judulMinuman = "Wedang Jahe";teksResep1 = R.string.jahe;break;
            case  5: judulMinuman = "Es Dawet";teksResep1 = R.string.dawet;break;
        }

        getSupportActionBar().setTitle(judulMinuman);
        imMinumann.setImageResource(adapterMinuman.minuman[posisi1]);
        resepMinuman.setText(teksResep1);
    }
}
