package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bai11_danhba.R;
import com.example.model.DanhBa;
import java.util.List;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context;
    int resource;
    @NonNull List<DanhBa> objects;

    public DanhBaAdapter(@NonNull Activity context, int resource, @NonNull List<DanhBa> objects) {
        super(context, resource, objects);
        this.objects=objects;
        this.context=context;
        this.resource=resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=this.context.getLayoutInflater();
        row=layoutInflater.inflate(this.resource,null);
        TextView _id=row.findViewById(R.id.txtId);
        TextView _Phone=row.findViewById(R.id.txtnumberPhone);

        DanhBa danhBa=this.objects.get(position);
        String combinedText = danhBa.getId() + " - " + danhBa.getNamecty() + " - " + danhBa.getName();
        _id.setText(combinedText);
        _Phone.setText(danhBa.getNumberPhone());

        return row;
    }
}
