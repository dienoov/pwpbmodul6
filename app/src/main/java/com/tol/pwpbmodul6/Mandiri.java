package com.tol.pwpbmodul6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Mandiri extends AppCompatActivity {

    public static final int RC_KITA = 169;

    @BindView(R.id.frame_kita)
    FrameLayout frameKita;

    @BindView(R.id.nav_kita)
    BottomNavigationView navKita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandiri);
        ButterKnife.bind(this);

        navKita.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager director = getSupportFragmentManager();
                FragmentTransaction rekening = director.beginTransaction();

                switch (item.getItemId()) {

                    case R.id.ke_rumah:
                        rekening.replace(R.id.frame_kita, new HomeKita());
                        rekening.commit();
                        return true;

                    case R.id.profil_kita:
                        rekening.replace(R.id.frame_kita, new ProfileKita());
                        rekening.commit();
                        return true;
                }
                return false;
            }
        });

        FragmentManager director = getSupportFragmentManager();
        FragmentTransaction rekening = director.beginTransaction();

        rekening.add(R.id.frame_kita, new ProfileKita());
        rekening.add(R.id.frame_kita, new HomeKita());
        rekening.commit();
    }
}