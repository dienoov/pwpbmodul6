package com.tol.pwpbmodul6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HalamanRumah extends AppCompatActivity {

    @BindView(R.id.buffon_latihan_1)
    Button btnOne;

    @BindView(R.id.buffon_latihan_2)
    Button btnTwo;

    @BindView(R.id.buffon_mandiri)
    Button btnMandiri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_rumah);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buffon_latihan_1)
    public void latihanSuta() {
        startActivity(new Intent(this, EdotJeneng.class));
    }

    @OnClick(R.id.buffon_latihan_2)
    public void latihanDua() {
        startActivity(new Intent(this, Fragsi.class));
    }

    @OnClick(R.id.buffon_mandiri)
    public void jalurMandiri() {
        startActivity(new Intent(this, Mandiri.class));
    }
}