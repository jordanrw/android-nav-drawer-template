package com.jordanroywhite.navdrawer.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jordanroywhite.navdrawer.R;

/**
 * Created by Jordan on 4/22/17.
 */

public class HistoryFragment extends Fragment implements View.OnClickListener {
    TextView label;

    public void HistoryFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        label = (TextView) view.findViewById(R.id.historyTitle);
        return view;
    }

    @Override
    public void onClick(View v) {
    }

}
