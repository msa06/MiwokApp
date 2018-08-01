package com.example.msa.mowakapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {

    private int colorResourceId;
    WordAdaptor(Activity context, ArrayList<Word> word,int colorResourceId){
        super(context,0,word);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        View listItemview = convertView;
        if(listItemview==null){
            listItemview= LayoutInflater.from(getContext()).inflate(R.layout.listview,parent,false);
        }
        Word word = getItem(position);
        View textLayout = listItemview.findViewById(R.id.textcontainer);
        int color = ContextCompat.getColor(getContext(),colorResourceId);
        textLayout.setBackgroundColor(color);
        TextView miwokText = (TextView) listItemview.findViewById(R.id.miwok_translation);
        miwokText.setText(word.getMiwokTranslation());
        TextView englishText = (TextView) listItemview.findViewById(R.id.english_translation);
        englishText.setText(word.getDefaultTranslation());
        ImageView imageView = (ImageView) listItemview.findViewById(R.id.imageview);
        if(word.getImamgeResourceId()!=0){
            imageView.setImageResource(word.getImamgeResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemview;
    }
}
