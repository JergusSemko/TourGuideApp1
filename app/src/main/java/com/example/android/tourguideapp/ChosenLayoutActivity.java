package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ChosenLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_details_layout);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;

        String placeName = bundle.getString(getString(R.string.place));
        final String fragmentHere = bundle.getString(getString(R.string.fragment));
        final String infoHere = bundle.getString(getString(R.string.info));
        final String webHere = bundle.getString(getString(R.string.web));
        final int imageHere = bundle.getInt(getString(R.string.picture));

        this.setTitle(fragmentHere);

        TextView namePlaceView = findViewById(R.id.namePlaceDetail);
        namePlaceView.setText(placeName);

        TextView infoPlaceView = findViewById(R.id.infoPlaceDetail);
        infoPlaceView.setText(infoHere);

        ImageView imagePlaceView = findViewById(R.id.imagePlaceDetail);
        imagePlaceView.setImageResource(imageHere);

        ImageButton webPlaceView = findViewById(R.id.webPlaceDetail);

        webPlaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse(webHere));
                if (web.resolveActivity(getPackageManager()) != null) {
                    startActivity(web);
                }
            }
        });
    }
}