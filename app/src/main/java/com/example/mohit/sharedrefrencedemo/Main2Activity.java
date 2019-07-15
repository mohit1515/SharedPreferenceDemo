package com.example.mohit.sharedrefrencedemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    SharedPreferences sp;
    EditText edtname , edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtname = findViewById(R.id.editText3);
        edtpass = findViewById(R.id.editText4);


        sp = getSharedPreferences("my_shaed", MODE_PRIVATE);
        name = sp.getString("name_key", null);
        password = sp.getString("password_key", null);
        txtname.setText(name);
        txtpassword.setText(password);

    }
}
