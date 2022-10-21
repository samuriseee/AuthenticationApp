package com.example.authenticationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListApdater extends ArrayAdapter<Transaction> {
    private Context mContext;
    private int mResource;

    public ListApdater(@NonNull Context context, int resource, @NonNull ArrayList<Transaction> objects) {
        super(context, resource,objects);
        this.mContext = context;
        this.mResource = resource;
    }
    @NonNull
    @Override
    public View getView(int postion, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        TextView tvName = convertView.findViewById(R.id.name);
        TextView tvAmount = convertView.findViewById(R.id.amount);
        TextView tvDate = convertView.findViewById(R.id.date);
        TextView tvType = convertView.findViewById(R.id.type);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        tvName.setText(getItem(postion).getName());
        tvAmount.setText(getItem(postion).getAmount());
        tvDate.setText(getItem(postion).getDate());
        tvType.setText(getItem(postion).getType());
        imageView.setImageResource(getItem(postion).getImage());

        return convertView;
    }
}

