package com.example.adaptivemenu.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptivemenu.R;

import java.util.ArrayList;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder> {

    private ArrayList<CoffeeItem> coffeeItems;

    public CoffeeAdapter(ArrayList<CoffeeItem> coffeeItems) {
        this.coffeeItems = coffeeItems;
    }

    @NonNull
    @Override
    public CoffeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coffee_item, parent, false);
        CoffeeViewHolder coffeeViewHolder = new CoffeeViewHolder(view);
        return coffeeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeViewHolder holder, int position) {
        CoffeeItem coffeeItem = coffeeItems.get(position);

        holder.coffeeImageView.setImageResource(coffeeItem.getImageResource());
        holder.textViewNameOfCoffee.setText(coffeeItem.getTitle());
        holder.textViewPriceOfCoffee.setText(String.valueOf(coffeeItem.getPrice()));
        holder.textViewWeightOfCoffee.setText(String.valueOf(coffeeItem.getWeight()));
    }

    @Override
    public int getItemCount() {
        return coffeeItems.size();
    }

    public static class CoffeeViewHolder extends RecyclerView.ViewHolder {

        public ImageView coffeeImageView;
        public TextView textViewNameOfCoffee;
        public TextView textViewPriceOfCoffee;
        public TextView textViewWeightOfCoffee;

        public CoffeeViewHolder(@NonNull View itemView) {
            super(itemView);

            coffeeImageView = itemView.findViewById(R.id.coffeeImageView);
            textViewNameOfCoffee = itemView.findViewById(R.id.textViewNameOfCoffee);
            textViewPriceOfCoffee = itemView.findViewById(R.id.textViewPriceOfCoffee);
            textViewWeightOfCoffee = itemView.findViewById(R.id.textViewWeightOfCoffee);
        }
    }

}
