package com.example.mohit.sharedrefrencedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ename,epass;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename = findViewById(R.id.editText);
        epass = findViewById(R.id.editText2);
    }

    public void save(View view) {
        sp = getSharedPreferences("my_values", MODE_PRIVATE);

        String name = ename.getText().toString().trim();
        String pass = epass.getText().toString().trim();

        editor = sp.edit();
        editor.putString("name_key", name);
        editor.putString("pass_key", pass);
        editor.commit();


    }

    public void next(View view) {
        Intent intent =new Intent(MainActivity.this , Main2Activity.class);
        startActivity(intent);
    }
}
