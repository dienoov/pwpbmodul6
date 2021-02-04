package com.tol.pwpbmodul6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Mandiri extends AppCompatActivity {

    @BindView(R.id.frame_kita)
    FrameLayout frameKita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandiri);
        ButterKnife.bind(this);

        FragmentManager director = getSupportFragmentManager();
        FragmentTransaction rekening = director.beginTransaction();

        rekening.add(R.id.frame_kita, new ProfileKita());
        rekening.add(R.id.frame_kita, new HomeKita());
        rekening.commit();
    }

    @OnClick(R.id.ke_rumah)
    public void keRumah() {
        FragmentManager director = getSupportFragmentManager();
        FragmentTransaction rekening = director.beginTransaction();

        rekening.replace(R.id.frame_kita, new HomeKita());
        rekening.commit();
    }

    @OnClick(R.id.profil_kita)
    public void keProfil() {
        FragmentManager director = getSupportFragmentManager();
        FragmentTransaction rekening = director.beginTransaction();

        rekening.replace(R.id.frame_kita, new ProfileKita());
        rekening.commit();
    }
}