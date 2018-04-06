package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {
        //required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Chosen> place = new ArrayList<>();

        place.add(new Chosen(getString(R.string.fragment_sights), getString(R.string.nameMuseum), getString(R.string.infoMuseum),
                getString(R.string.webMuseum), getString(R.string.quoteMuseum), R.drawable.waterworks_museum));

        place.add(new Chosen(getString(R.string.fragment_sights), getString(R.string.nameSlavin), getString(R.string.infoSlavin),
                getString(R.string.webSlavin), getString(R.string.quoteSlavin), R.drawable.slavin));

        place.add(new Chosen(getString(R.string.fragment_sights), getString(R.string.nameChatam), getString(R.string.infoChatam),
                getString(R.string.webChatam), getString(R.string.quoteChatam), R.drawable.chatam));

        place.add(new Chosen(getString(R.string.fragment_sights), getString(R.string.nameCastle), getString(R.string.infoCastle),
                getString(R.string.webCastle), getString(R.string.quoteCastle), R.drawable.bratislava_castle));

        ChosenAdapter placeAdapter = new ChosenAdapter(getActivity(), place);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}