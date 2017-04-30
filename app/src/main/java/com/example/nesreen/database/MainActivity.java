package com.example.nesreen.database;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText ed1,ed2;
    public  static  final  String DEFAULT = "N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);


    }

    public void reg(View view) {

        Intent MyIntent = new Intent(this,Main2Activity.class);
        startActivity(MyIntent);
    }

    public void log(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("UserName",DEFAULT);
        String password = sharedPreferences.getString("PassWord",DEFAULT);
             if(name==DEFAULT||password==DEFAULT)
             {
                  Toast.makeText(this, "UserName or PassWord Is Wrong", Toast.LENGTH_SHORT).show();
             }
             else
             {
                 Toast.makeText(this, "Login succsesfully", Toast.LENGTH_SHORT).show();
                 Intent MyIntent2 = new Intent(this,LiistView.class);
                  startActivity(MyIntent2);
             }
           }
        }
