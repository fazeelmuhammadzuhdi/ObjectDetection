package org.tensorflow.lite.examples.detection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button BtnLogin, BtnLogout;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        BtnLogin = findViewById(R.id.btn_login);
        BtnLogout = findViewById(R.id.btn_logout);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetectorActivity.class);
                startActivity(intent);
            }
        });

    BtnLogout.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this, DetectorActivity1.class);
            startActivity(intent);
        }
    });
    }
}


