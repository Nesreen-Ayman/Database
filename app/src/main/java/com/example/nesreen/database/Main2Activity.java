package com.example.nesreen.database;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText Ed1,Ed2;
    String name ,pw ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Ed1= (EditText) findViewById(R.id.editText3);
        Ed2= (EditText) findViewById(R.id.editText4);

    }

    public void ok(View view) {
        name = Ed1.getText().toString();
        pw = Ed2.getText().toString();
        if(name ==null || pw==null){
            Toast.makeText(this, "Can't Save Data", Toast.LENGTH_SHORT).show();
             return;
        }
        SharedPreferences sh = getSharedPreferences("MyData",MODE_PRIVATE);
        SharedPreferences.Editor editor = sh.edit();
        editor.putString("UserName",Ed1.getText().toString());
        editor.putString("PassWord",Ed2.getText().toString());
        editor.commit();
        Toast.makeText(this, "Data is Saved", Toast.LENGTH_SHORT).show();
        Intent MyIntent1 = new Intent(this,MainActivity.class);
           startActivity(MyIntent1);

    }
}
