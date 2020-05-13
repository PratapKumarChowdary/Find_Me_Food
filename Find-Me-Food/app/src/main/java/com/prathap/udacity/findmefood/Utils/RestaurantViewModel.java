package com.prathap.udacity.findmefood.Utils;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.prathap.udacity.findmefood.DB.RestaurantDatabase;
import com.prathap.udacity.findmefood.Objects.Restaurant_;

public class RestaurantViewModel extends ViewModel {

    private LiveData<Restaurant_> restaurantLiveData;

    public LiveData<Restaurant_> getRestaurantLiveData() {
        return restaurantLiveData;
    }

    public RestaurantViewModel(RestaurantDatabase restaurantDatabase, String id) {
        restaurantLiveData = restaurantDatabase.restaurantDao().loadSingleRestaurant(id);
    }
}