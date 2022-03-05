package com.example.activity2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username="nourin alam";
        String password="alam123";

        //Mengubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((edemail.getText().toString().trim().equals(username)) && (edpassword.getText().toString().trim().equals(password))) {
                    Toast.makeText(getApplicationContext(), "Login Berhasil!", Toast.LENGTH_LONG).show();
                } else if ((edemail.getText().toString().trim().equals(username))) {
                    Toast.makeText(getApplicationContext(), "Password Salah!", Toast.LENGTH_LONG).show();
                } else if ((edpassword.getText().toString().trim().equals(password))) {
                    Toast.makeText(getApplicationContext(), "Email Salah!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Email Dan Password Salah!", Toast.LENGTH_LONG).show();
                }
            }
                                    }
        );
    }
}