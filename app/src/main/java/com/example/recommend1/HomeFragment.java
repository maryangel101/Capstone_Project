package com.example.recommend1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/** @noinspection ALL*/
public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        TextView dashboardTextView = rootView.findViewById(R.id.textView);
        dashboardTextView.setText("Dashboard");

        rootView.findViewById(R.id.marketplace_card).setOnClickListener(this);
        rootView.findViewById(R.id.recommendations_card).setOnClickListener(this);
        rootView.findViewById(R.id.community_card).setOnClickListener(this);
        rootView.findViewById(R.id.weather_card).setOnClickListener(this);
        rootView.findViewById(R.id.feedback_card).setOnClickListener(this);
        rootView.findViewById(R.id.news_card).setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == R.id.marketplace_card) {
            intent = new Intent(getActivity(), MarketplaceActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.recommendations_card) {
            // Handle click for the Recommendations CardView
            // Implement your logic here
        } else if (view.getId() == R.id.community_card) {
            // Handle click for the Community CardView
            // Implement your logic here
        } else if (view.getId() == R.id.weather_card) {
            // Handle click for the Weather CardView
            // Implement your logic here
        } else if (view.getId() == R.id.feedback_card) {
            // Handle click for the Feedback CardView
            // Implement your logic here
        } else if (view.getId() == R.id.news_card) {
            // Handle click for the News CardView
            // Implement your logic here
        }
    }
}
