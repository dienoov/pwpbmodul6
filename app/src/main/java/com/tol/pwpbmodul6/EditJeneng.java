package com.tol.pwpbmodul6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditJeneng extends AppCompatActivity {

    public static final String EXTRA_SAMBEL = "jenang";

    @BindView(R.id.jenengmu)
    EditText jenengMu;

    @BindView(R.id.safe)
    Button safe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_jeneng);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.safe)
    public void safeJeneng() {
        String jenang = jenengMu.getText().toString();
        Intent intan = new Intent();
        intan.putExtra(EXTRA_SAMBEL, jenang);
        setResult(RESULT_OK, intan);
        finish();
    }
}