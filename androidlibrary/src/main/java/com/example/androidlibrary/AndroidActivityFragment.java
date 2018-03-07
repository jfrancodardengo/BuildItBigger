package com.example.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AndroidActivityFragment extends Fragment {

    public AndroidActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_android_activity, container, false);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(AndroidActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) rootView.findViewById(R.id.joke_textview);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return rootView;
    }
}
