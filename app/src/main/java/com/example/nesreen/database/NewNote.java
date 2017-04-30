package com.example.nesreen.database;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewNote extends AppCompatActivity {
EditText E1,E2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        E1=(EditText)findViewById(R.id.editText5);
        E2=(EditText)findViewById(R.id.editText6);

    }

    public void save(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NoteName",E1.getText().toString());
        editor.putString("Descrption",E2.getText().toString());
        editor.commit();
        Intent I= new Intent(this,LiistView.class);

        I.putExtra("NoteName",E1.getText().toString());
        I.putExtra("Descrption",E2.getText().toString());
 startActivity(I);

    }
}
