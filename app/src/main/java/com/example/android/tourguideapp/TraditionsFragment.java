package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TraditionsFragment extends Fragment {
    public TraditionsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Chosen> place = new ArrayList<>();

        place.add(new Chosen(getString(R.string.fragment_traditions), getString(R.string.nameWineRoute), getString(R.string.infoWineRoute),
                getString(R.string.webWineRoute), getString(R.string.quoteWineRoute), R.drawable.wine_route));

        place.add(new Chosen(getString(R.string.fragment_traditions), getString(R.string.nameChristmas), getString(R.string.infoChristmas),
                getString(R.string.webChristmas), getString(R.string.quoteChristmas), R.drawable.christmas_market));

        place.add(new Chosen(getString(R.string.fragment_traditions), getString(R.string.nameCoronation), getString(R.string.infoCoronation),
                getString(R.string.webCoronation), getString(R.string.quoteCoronation), R.drawable.coronation));

        place.add(new Chosen(getString(R.string.fragment_traditions), getString(R.string.nameEkotop), getString(R.string.infoEkotop),
                getString(R.string.webEkotop), getString(R.string.quoteEkotop), R.drawable.ekotop));

        ChosenAdapter placeAdapter = new ChosenAdapter(getActivity(), place);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}