package com.fcodex.hostel.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.fcodex.hostel.Activities.HostelDetailedActivity;
import com.fcodex.hostel.R;

public class HostelFragment extends Fragment {

    private View view;
    private LinearLayout linearLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_hostel, container, false);

        id();
        onClick();

        return view;
    }

    private void onClick() {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HostelDetailedActivity.class);
                startActivity(intent);
            }
        });
    }

    private void id() {
        linearLayout = view.findViewById(R.id.layoutNoHostel);
    }
}