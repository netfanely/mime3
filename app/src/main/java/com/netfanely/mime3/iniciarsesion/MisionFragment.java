package com.netfanely.mime3.iniciarsesion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netfanely.mime3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MisionFragment extends Fragment {


    public MisionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mision, container, false);
    }

}
