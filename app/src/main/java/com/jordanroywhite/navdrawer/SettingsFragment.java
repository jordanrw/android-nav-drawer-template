package com.jordanroywhite.navdrawer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jordan on 4/22/17.
 */

public class SettingsFragment extends Fragment implements View.OnClickListener {
    TextView label;

    public void SettingsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        label = (TextView) view.findViewById(R.id.settingsTitle);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
