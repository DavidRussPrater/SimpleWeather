package com.example.weathermoji;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TenDayForecastFragment extends Fragment {

    public TenDayForecastFragment(){

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.ten_day_forecast_tab, container, false);


        return view;
    }

}
