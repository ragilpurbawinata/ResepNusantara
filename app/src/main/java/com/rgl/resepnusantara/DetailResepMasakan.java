package com.rgl.resepnusantara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepMasakan extends AppCompatActivity {
    ImageView imMakanan;
    TextView resepMakanan;
    int teksResep, posisi;
    String judulMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep_masakan);

        imMakanan = (ImageView) findViewById(R.id.imageView);
        resepMakanan = (TextView) findViewById(R.id.textView);
        AdapterMasakan adapterMasakan = new AdapterMasakan(this);

        Intent i = getIntent();
        posisi = i.getIntExtra("posisi", 0);

        switch (posisi){
            case  0: judulMakanan = "Bakso Solo";teksResep = R.string.bakso;break;
            case  1: judulMakanan = "Mie Goreng Jawa";teksResep = R.string.mie;break;
            case  2: judulMakanan = "Sop Buntut Surabaya";teksResep = R.string.sop;break;
            case  3: judulMakanan = "Selat Solo";teksResep = R.string.selat;break;
            case  4: judulMakanan = "Opor Ayam Kecombrang";teksResep = R.string.opor;break;
            case  5: judulMakanan = "Soto Betawi";teksResep = R.string.soto;break;
        }

        getSupportActionBar().setTitle(judulMakanan);
        imMakanan.setImageResource(adapterMasakan.masakan[posisi]);
        resepMakanan.setText(teksResep);
    }
}
