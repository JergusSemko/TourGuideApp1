package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChosenAdapter extends ArrayAdapter<Chosen> {

    private Context context = getContext();

    /**
     * A custom constructor.
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param place   A List of information to display in a list.
     */
    public ChosenAdapter(Activity context, ArrayList<Chosen> place) {
        super(context, 0, place);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Chosen currentChoice = getItem(position);
        TextView locationTextView = listItemView.findViewById(R.id.nameHere);

        assert currentChoice != null;
        locationTextView.setText(currentChoice.getCurrentName());

        TextView quoteTextView = listItemView.findViewById(R.id.quoteHere);

        quoteTextView.setText(currentChoice.getCurrentQuote());

        ImageView imagePlace = listItemView.findViewById(R.id.imageHere);

        if (currentChoice.hasImage()) {
            imagePlace.setImageResource(currentChoice.getImageResourceId());
            imagePlace.setVisibility(View.VISIBLE);
        } else {
            imagePlace.setVisibility(View.GONE);
        }

        String categoryPlaceDetail = currentChoice.getCurrentChoice();
        String namePlaceDetail = currentChoice.getCurrentName();
        String infoPlaceDetail = currentChoice.getCurrentInfo();
        String webPlaceDetail = currentChoice.getCurrentWeb();
        int imagePlaceDetail = currentChoice.getImageResourceId();

        final Intent itemIntent = new Intent(context, ChosenLayoutActivity.class);

        itemIntent.putExtra(context.getString(R.string.fragment), categoryPlaceDetail);
        itemIntent.putExtra(context.getString(R.string.place), namePlaceDetail);
        itemIntent.putExtra(context.getString(R.string.info), infoPlaceDetail);
        itemIntent.putExtra(context.getString(R.string.web), webPlaceDetail);
        itemIntent.putExtra(context.getString(R.string.picture), imagePlaceDetail);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }
}