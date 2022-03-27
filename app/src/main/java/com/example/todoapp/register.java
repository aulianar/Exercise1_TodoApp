package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class register extends AppCompatActivity {

    //Deklarasi variabel untuk EditText
    EditText ednama, edemail, edrepass, edpassword;

    //Deklarasi variabel untuk button
    Button btnregister;

    //Deklarasi variabel untuk menyimpan nama email password repass fn
    String nama, email, password, repass, fn;

    //Deklarasi variabel untuk TextView
    TextView nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ednama = findViewById(R.id.ednama);

        edemail = findViewById(R.id.editTextEmail);
        edrepass = findViewById(R.id.editTextRePass);
        edpassword = findViewById(R.id.edpassword);
        btnregister = findViewById(R.id.btSignin);

        nm = findViewById(R.id.ednama);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = ednama.getText().toString();
                email = edemail.getText().toString();
                password = edpassword.getText().toString();
                repass = edrepass.getText().toString();

                if (nama.isEmpty() || email.isEmpty() || password.isEmpty() || repass.isEmpty()) {
                    Snackbar.make(view, "Isi Semua Data!", Snackbar.LENGTH_LONG).show();
                }
                if (ednama.getText().toString().length() == 0) {
                    ednama.setError("Masukkan Nama");
                }
                if (edemail.getText().toString().length() == 0) {
                    edemail.setError("Masukkan Email");
                }
                if (edpassword.getText().toString().length() == 0) {
                    edpassword.setError("Masukkan Password");
                }
                if (edrepass.getText().toString().length() == 0) {
                    edrepass.setError("Masukkan Password Kembali");
                }
                else {
                    if (edpassword.getText().toString().equals(edrepass.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil!",
                                Toast.LENGTH_LONG).show();

                        Bundle bn = new Bundle();
                        bn.putString("a",nama.trim());

                        Intent i = new Intent(getApplicationContext(), home.class);
                        i.putExtras(bn);
                        startActivity(i);
                    }
                    else {
                        Snackbar.make(view, "Password dan re-Password harus sama!!!", Snackbar.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
}