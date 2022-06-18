package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class CallFragment extends Fragment {

    Button btnMasuk;
    EditText email,password;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_call, container, false);

        btnMasuk=v.findViewById(R.id.btn_masuk);
        email=v.findViewById(R.id.et_mail);
        password=v.findViewById(R.id.et_pass);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
       });
            return v;
    }

}