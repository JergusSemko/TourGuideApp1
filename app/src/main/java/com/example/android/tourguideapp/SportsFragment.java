package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsFragment extends Fragment {

    public SportsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Chosen> place = new ArrayList<>();

        place.add(new Chosen(getString(R.string.fragment_sports), getString(R.string.nameGolfBA), getString(R.string.infoGolfBA),
                getString(R.string.webGolfBA), getString(R.string.quoteGolfBA), R.drawable.golf_ba));

        place.add(new Chosen(getString(R.string.fragment_sports), getString(R.string.nameGolfWelten), getString(R.string.infoGolfWelten),
                getString(R.string.webGolfWelten), getString(R.string.quoteGolfWelten), R.drawable.golf_welten));

        place.add(new Chosen(getString(R.string.fragment_sports), getString(R.string.nameGolfTT), getString(R.string.infoGolfTT),
                getString(R.string.webGolfTT), getString(R.string.quoteGolfTT), R.drawable.golf_tt));

        place.add(new Chosen(getString(R.string.fragment_sports), getString(R.string.nameGolfHB), getString(R.string.infoGolfHB),
                getString(R.string.webGolfHB), getString(R.string.quoteGolfHB), R.drawable.golf_hb));

        ChosenAdapter placeAdapter = new ChosenAdapter(getActivity(), place);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}