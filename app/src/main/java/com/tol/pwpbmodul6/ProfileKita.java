package com.tol.pwpbmodul6;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileKita#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileKita extends Fragment {

    @BindView(R.id.nama_kita)
    TextView namaKita;

    @BindView(R.id.nomer_kita)
    TextView nomerKita;

    @BindView(R.id.jenis_kita)
    TextView jenisKita;

    @BindView(R.id.tombol_kita)
    Button tombolKita;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileKita() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileKita.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileKita newInstance(String param1, String param2) {
        ProfileKita fragment = new ProfileKita();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_kita, container, false);

        ButterKnife.bind(this, view);

        if (getActivity().getIntent().hasExtra(EditProfileKita.EXTRA_KITA)) {
            Siswo kita = (Siswo) getActivity().getIntent().getExtras().getParcelable(EditProfileKita.EXTRA_KITA);
            namaKita.setText(kita.getJeneng());
        }

        return view;
    }

    @OnClick(R.id.tombol_kita)
    public void editProfileKita() {
        startActivityForResult(new Intent(getActivity(), EditProfileKita.class), Mandiri.RC_KITA);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == Mandiri.RC_KITA && resultCode == -1) {
            Siswo kita = (Siswo) data.getParcelableExtra(EditProfileKita.EXTRA_KITA);
            namaKita.setText(kita.getJeneng());
            nomerKita.setText(kita.getNik());
            jenisKita.setText(kita.getJenes());
        }
    }
}