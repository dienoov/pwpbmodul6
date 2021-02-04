package com.tol.pwpbmodul6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Fragsi extends AppCompatActivity {

    @BindView(R.id.frame_kacamata)
    FrameLayout kacaMata;

    @BindView(R.id.btpn_satu)
    Button btpnSatu;

    @BindView(R.id.btpn_dua)
    Button btpnDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragsi);
        ButterKnife.bind(this);

        FragmentManager manajer = getSupportFragmentManager();
        FragmentTransaction transaksion = manajer.beginTransaction();

        transaksion.add(R.id.frame_kacamata, new FragsiPertama());
        transaksion.add(R.id.frame_kacamata, new FragsiKedua());
        transaksion.commit();
    }

    @OnClick(R.id.btpn_satu)
    public void fragsiSatu() {
        FragmentManager manajer = getSupportFragmentManager();
        FragmentTransaction transaksion = manajer.beginTransaction();
        transaksion.replace(R.id.frame_kacamata, new FragsiPertama());
        transaksion.commit();
    }

    @OnClick(R.id.btpn_dua)
    public void fragsiDua() {
        FragmentManager manajer = getSupportFragmentManager();
        FragmentTransaction transaksion = manajer.beginTransaction();
        transaksion.replace(R.id.frame_kacamata, new FragsiKedua());
        transaksion.commit();
    }
}