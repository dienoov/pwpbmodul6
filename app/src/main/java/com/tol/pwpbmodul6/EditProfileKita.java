package com.tol.pwpbmodul6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditProfileKita extends AppCompatActivity {

    public static final String EXTRA_KITA = "kita";

    @BindView(R.id.ganti_nama_kita)
    EditText gantiNamaKita;

    @BindView(R.id.ganti_nomer_kita)
    EditText gantiNomerKita;

    @BindView(R.id.ganti_jenis_kita)
    EditText gantiJenisKita;

    @BindView(R.id.ganti_tombol_kita)
    Button gantiTombolKita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_kita);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ganti_tombol_kita)
    public void gantiKita() {
        String nama = gantiNamaKita.getText().toString();
        String nomer = gantiNomerKita.getText().toString();
        String jenis = gantiJenisKita.getText().toString();

        Intent kita = new Intent();
        kita.putExtra(EXTRA_KITA, new Siswo(nomer, nama, jenis));
        setResult(RESULT_OK, kita);
        finish();
    }
}