package com.example.weathermoji;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TomorrowsForecastFragment extends Fragment{

    public TomorrowsForecastFragment() {

    }

    Calendar calendar = Calendar.getInstance();
    TextView tomorrowsDateTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tomorrow_forecast_tab, container, false);

        tomorrowsDateTv = view.findViewById(R.id.tomorrows_date);

        calendar.add(Calendar.DAY_OF_YEAR, 1);
        DateFormat tomorrowsDate = new SimpleDateFormat("EEEE, MMMM d", Locale.getDefault());
        String tomorrowsDateString = tomorrowsDate.format(calendar.getTime());

        tomorrowsDateTv.setText(tomorrowsDateString);

        return view;
    }

}
