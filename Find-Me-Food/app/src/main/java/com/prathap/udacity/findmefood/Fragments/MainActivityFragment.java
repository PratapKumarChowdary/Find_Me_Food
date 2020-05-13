package com.prathap.udacity.findmefood.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.prathap.udacity.findmefood.Adapters.RestaurantAdapter;
import com.prathap.udacity.findmefood.Objects.Restaurant;
import com.prathap.udacity.findmefood.R;

public class MainActivityFragment extends Fragment {

    @BindView(R.id.recyclerView)
    RecyclerView restaurantsList;

    RestaurantAdapter restaurantAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        restaurantAdapter = new RestaurantAdapter(this.getContext());
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        restaurantsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantsList.setHasFixedSize(true);
        restaurantsList.setAdapter(restaurantAdapter);
        return view;
    }

    public void setRestaurantArrayList(ArrayList<Restaurant> restaurantArrayList) {
        restaurantAdapter.setRestaurantList(restaurantArrayList);
    }
}
