package com.example.recyclercards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    //step 6.2
    private ArrayList<ExampleItem> mExampleList;

    //Step 1
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        //Step 4.1
        public ImageView imageView;
        public TextView textView;

        //Step 2
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            //Step 4.2
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    //Step 6.1
    public ExampleAdapter(ArrayList<ExampleItem> exampleList) { mExampleList = exampleList;  }

    //Step 3
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Step 5
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        //Step 7
        ExampleItem currentItem = mExampleList.get(position);
        holder.imageView.setImageResource(currentItem.getmImageResource());
        holder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        //Step 8
        return mExampleList.size();
    }
}
