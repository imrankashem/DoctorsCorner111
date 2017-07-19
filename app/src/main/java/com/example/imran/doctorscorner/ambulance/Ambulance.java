package com.example.imran.doctorscorner.ambulance;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.imran.doctorscorner.R;
import com.example.imran.doctorscorner.bloodbank.listblood;

/**
 * A simple {@link Fragment} subclass.
 */
public class Ambulance extends Fragment {

    ArrayAdapter<String> itemraamb;

    public Ambulance() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemraamb=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, listambulance.amblist);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ambulance2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView IvItems = (ListView) view.findViewById(R.id.lvItems);
        IvItems.setAdapter(itemraamb);
        IvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i0=new Intent(getActivity(),ambulance0.class);
                        ((onitemclickambulance)getActivity()).onClick(i0);
                        break;
                    case 1:
                        Intent i1=new Intent(getActivity(),ambulance1.class);
                        ((onitemclickambulance)getActivity()).onClick(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(getActivity(),ambulance2.class);
                        ((onitemclickambulance)getActivity()).onClick(i2);
                        break;
                    case 3:
                        Intent i3=new Intent(getActivity(),ambulance3.class);
                        ((onitemclickambulance)getActivity()).onClick(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(getActivity(),ambulance4.class);
                        ((onitemclickambulance)getActivity()).onClick(i4);
                        break;
                    case 5:
                        Intent i5=new Intent(getActivity(),ambulance5.class);
                        ((onitemclickambulance)getActivity()).onClick(i5);
                        break;

                }
            }
        });
    }
    public   interface onitemclickambulance{
        void  onClick(Intent i);
    }
}
