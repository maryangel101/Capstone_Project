package com.example.recommend1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private TextView dashboardTextView;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize views
        dashboardTextView = rootView.findViewById(R.id.textView);

        // Set Dashboard text
        dashboardTextView.setText("Dashboard");

        // Set click listeners for CardViews
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
            // Handle click for the Marketplace CardView
            // For example, you can open a new activity or fragment to display marketplace content
            intent = new Intent(getActivity(), MarketplaceActivity.class);
            startActivity(intent);
        } else if (view.getId() != R.id.recommendations_card && view.getId() != R.id.community_card) {
            // Handle click for the News CardView
            // Implement your logic here
            // Handle click for the Weather CardView
            if (view.getId() != R.id.weather_card && view.getId() != R.id.feedback_card)
                view.getId();
// Implement your logic here
        } else {
            // Handle click for the Recommendations CardView
            // Implement your logic here
        }
    }

}
