package com.natania.uas_01.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.natania.uas_01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeaFoodFragment extends Fragment {


    public SeaFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sea_food, container, false);
    }

}
