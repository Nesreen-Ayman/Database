package com.example.nesreen.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LiistView extends AppCompatActivity {
  ListView Lv1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        String [] Array = new String[10];
        ArrayAdapter<String>itemsAdapter =new ArrayAdapter<String>(this,R.layout.mynote,Array);
        Lv1 = (ListView)findViewById(R.id.listview1);
        Lv1.setAdapter(itemsAdapter);
        ArrayList<Note> user = new ArrayList<Note>();
        UserAdapter Adaptor = new UserAdapter(this,user);
        Lv1.setAdapter(Adaptor);
        for (int i = 0 ; i<Array.length;i++){
            Note  us = new Note("Note"+i,"Descrption");
            Adaptor.add(us);
        }
    }

    public void newNote(View view) {
        Intent I = new Intent(this,NewNote.class);
        startActivity(I);
    }
}
