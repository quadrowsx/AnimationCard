package ru.gulov.animationcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

public class FragmentMain extends Fragment {

    public FragmentMain() {
        // Required empty public constructor
    }

    LinearLayout num1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_main, container, false);;

        num1 = v.findViewById(R.id.num11);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).ShowNum();
            }
        });


        return v;
    }
}