package com.example.nesreen.database;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nesreen on 4/30/2017.
 */

class UserAdapter extends ArrayAdapter<Note> {
    public UserAdapter(Context context, ArrayList<Note> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        Note note = getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.mynote,parent,true);
        }
        TextView Tvname = (TextView) convertView.findViewById(R.id.editText7);
        TextView Tvdes = (TextView) convertView.findViewById(R.id.editText8);
        Tvname.setText(Note.NoteName);
        Tvdes.setText(Note.Descrption);
        return convertView;
    }
}
