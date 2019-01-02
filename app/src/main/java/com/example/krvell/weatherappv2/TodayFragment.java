package com.example.krvell.weatherappv2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TodayFragment extends Fragment {

    static TodayFragment instance;

    public static TodayFragment getInstance() {
        if(instance == null)
        {
            instance = new TodayFragment();
        }
        return instance;
    }

    public TodayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_today, container, false);
    }

}
