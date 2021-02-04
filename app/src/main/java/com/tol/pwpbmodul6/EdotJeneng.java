package com.tol.pwpbmodul6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EdotJeneng extends AppCompatActivity {

    private static final int RC_EDOT_JENENG = 112;

    @BindView(R.id.teks_viuw)
    TextView teksViuw;

    @BindView(R.id.btn_edot)
    Button btnEdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edot_jeneng);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_edot)
    public void onClock() {
        startActivityForResult(new Intent(this, EditJeneng.class), RC_EDOT_JENENG);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == RC_EDOT_JENENG && resultCode == RESULT_OK) {
            String strong = data.getExtras().getString(EditJeneng.EXTRA_SAMBEL);
            teksViuw.setText(strong);
        }
    }
}