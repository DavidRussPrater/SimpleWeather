package com.example.weathermoji;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class TodaysForecastFragment extends Fragment {

    public TodaysForecastFragment() {

    }

    Calendar calendar =Calendar.getInstance();
    DateFormat todays_date = new SimpleDateFormat("EEEE, MMMM d", Locale.getDefault());
    DateFormat todays_time = new SimpleDateFormat("hh:mm aaa", Locale.getDefault());
    String todaysDateString = todays_date.format(calendar.getTime());
    String todaysTiime = todays_time.format(calendar.getTime());




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.today_forecast_tab, container, false);


        TextView todaysDate = view.findViewById(R.id.date);
        TextView todaysTime = view.findViewById(R.id.current_time);
        todaysDate.setText(todaysDateString);
        todaysTime.setText(todaysTiime);

        return view;
    }

}
