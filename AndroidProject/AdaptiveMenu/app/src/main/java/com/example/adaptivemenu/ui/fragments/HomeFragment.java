package com.example.adaptivemenu.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adaptivemenu.R;
import com.example.adaptivemenu.drinks.PriceList;
import com.example.adaptivemenu.ui.items.CoffeeAdapter;
import com.example.adaptivemenu.ui.items.CoffeeItem;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private View view;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<CoffeeItem> coffeeItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        findAllViews();

        coffeeItems = new ArrayList<>();
        coffeeItems.add(new CoffeeItem(R.drawable.espresso, "Espresso", 250, PriceList.MEDIUM_ESPRESSO_PRICE));
        coffeeItems.add(new CoffeeItem(R.drawable.espresso, "Espresso", 250, PriceList.MEDIUM_ESPRESSO_PRICE));
        coffeeItems.add(new CoffeeItem(R.drawable.espresso, "Espresso", 250, PriceList.MEDIUM_ESPRESSO_PRICE));
        coffeeItems.add(new CoffeeItem(R.drawable.espresso, "Espresso", 250, PriceList.MEDIUM_ESPRESSO_PRICE));
        coffeeItems.add(new CoffeeItem(R.drawable.espresso, "Espresso", 250, PriceList.MEDIUM_ESPRESSO_PRICE));

        // створюємо перелік напоїв
        recyclerView.setHasFixedSize(true);
        adapter = new CoffeeAdapter(coffeeItems);
        layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void findAllViews() {
        recyclerView = view.findViewById(R.id.coffeesRecyclerView);
    }
}