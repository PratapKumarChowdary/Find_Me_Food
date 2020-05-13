package com.prathap.udacity.findmefood.Utils;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.prathap.udacity.findmefood.DB.RestaurantDatabase;

public class RestaurantViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private RestaurantDatabase restaurantDatabase;
    private String id;

    public RestaurantViewModelFactory(RestaurantDatabase restaurantDatabase, String id) {
        this.restaurantDatabase = restaurantDatabase;
        this.id = id;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new RestaurantViewModel(restaurantDatabase, id);
    }
}