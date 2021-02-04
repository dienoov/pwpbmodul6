package com.tol.pwpbmodul6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

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

        rekening.add(R.id.frame_kita, new HomeKita());
        rekening.commit();
    }
}