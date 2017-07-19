package com.example.imran.doctorscorner.bloodbank;


import android.content.Context;
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
import android.widget.TextView;

import com.example.imran.doctorscorner.R;
import com.example.imran.doctorscorner.alldetails.rajshahihos;

/**
 * A simple {@link Fragment} subclass.
 */
public class BloodBank extends Fragment {

    ArrayAdapter<String>  itemrab;

    public BloodBank() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create an array adapter for the list view, using the Ipsum headlines array

        itemrab=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, listblood.bloodlist);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blood_bank, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
         ListView IvItems = (ListView) view.findViewById(R.id.lvItems);
        IvItems.setAdapter(itemrab);
        IvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    switch (position){
        case 0:
            Intent i=new Intent(getActivity(),BloofBankDetails.class);
            ((OnItemSelectedListener)getActivity()).Ons(i);
            break;
        case  1:
            Intent i1=new Intent(getActivity(),bloodbank1.class);
            ((OnItemSelectedListener)getActivity()).Ons(i1);
            break;
        case  2:
            Intent i2=new Intent(getActivity(),bloodbank2.class);
            ((OnItemSelectedListener)getActivity()).Ons(i2);
            break;
        case  3:
            Intent i3=new Intent(getActivity(),bloodbank3.class);
            ((OnItemSelectedListener)getActivity()).Ons(i3);
            break;
        case  4:
            Intent i4=new Intent(getActivity(),bloodbank4.class);
            ((OnItemSelectedListener)getActivity()).Ons(i4);
            break;
        case  5:
            Intent i5=new Intent(getActivity(),bloodbank5.class);
            ((OnItemSelectedListener)getActivity()).Ons(i5);
            break;

    }

            }
            });
        }



    // Define the events that the fragment will use to communicate
    public interface OnItemSelectedListener {
        /** Called by HeadlinesFragment when a list item is selected */

        void Ons(Intent Position);
    }
}
