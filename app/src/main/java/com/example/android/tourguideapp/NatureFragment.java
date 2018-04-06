package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        //Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Chosen> place = new ArrayList<>();

        place.add(new Chosen(getString(R.string.fragment_nature),getString(R.string.nameGarden),getString(R.string.infoGarden),
                getString(R.string.webGarden), getString(R.string.quoteGarden),R.drawable.botanical_garden));

        place.add(new Chosen(getString(R.string.fragment_nature),getString(R.string.nameZOO),getString(R.string.infoZOO),
                getString(R.string.webZOO), getString(R.string.quoteZOO), R.drawable.zoo));

        place.add(new Chosen(getString(R.string.fragment_nature),getString(R.string.nameKobyla),getString(R.string.infoKobyla),
                getString(R.string.webKobyla), getString(R.string.quoteKobyla),R.drawable.devinska_kobyla));

        place.add(new Chosen(getString(R.string.fragment_nature),getString(R.string.nameKarpaty),getString(R.string.infoKarpaty),
                getString(R.string.webKarpaty), getString(R.string.quoteKarpaty),R.drawable.male_karpaty));

        ChosenAdapter placeAdapter = new ChosenAdapter(getActivity(), place);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}