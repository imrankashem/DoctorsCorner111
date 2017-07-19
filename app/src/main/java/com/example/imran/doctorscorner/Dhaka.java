package com.example.imran.doctorscorner;


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

import com.example.imran.doctorscorner.alldetails.Dhakahos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dhaka extends Fragment {

    ArrayAdapter<String> itemd;

    public Dhaka() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemd = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Dhakahos.hospitaldhaka);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dhaka, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvd = (ListView) view.findViewById(R.id.listemDhaka);
        listvd.setAdapter(itemd);
        listvd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Intent i1 = new Intent(getActivity(), dhakadoc1.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i1);
                        break;
                    case 1:
                        Intent i2 = new Intent(getActivity(), dhakadoc2.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i2);
                        break;
                    case 2:
                        Intent i3=new Intent(getActivity(),dhakadoc3.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i3);
                        break;
                    case 3:
                        Intent i4=new Intent(getActivity(),dhakadoc4.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i4);
                        break;
                    case 4:
                        Intent i5=new Intent(getActivity(),dhakadoc5.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i5);
                        break;
                    case 5:
                        Intent i6=new Intent(getActivity(),dhakadoc6.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i6);
                        break;
                    case 6:
                        Intent i7=new Intent(getActivity(),dhakadoc7.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i7);
                        break;
                    case 7:
                        Intent i8=new Intent(getActivity(),dhakadoc8.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i8);
                        break;
                    case 8:
                        Intent i9=new Intent(getActivity(),dhakadoc9.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i9);
                        break;
                    case 9:
                        Intent i10=new Intent(getActivity(),dhakadoc10.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i10);
                        break;
                    case 10:
                        Intent i11=new Intent(getActivity(),dhakadoc11.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i11);
                        break;



                    case 11:
                        Intent i12 = new Intent(getActivity(), dhakadoc.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i12);
                        break;
                    case 12:
                        Intent i13=new Intent(getActivity(),dhakadoc12.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i13);
                        break;
                    case 13:
                        Intent i14=new Intent(getActivity(),dhakadoc13.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i14);
                        break;
                    case 14:
                        Intent i15=new Intent(getActivity(),dhakadoc14.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i15);
                        break;
                    case 15:
                        Intent i16=new Intent(getActivity(),dhakadoc15.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i16);
                        break;
                    case 16:
                        Intent i17=new Intent(getActivity(),dhakadoc16.class);
                        ((onitemclickdhaka) getActivity()).onclickdhaka(i17);
                        break;
                }
            }
        });
    }

    public interface onitemclickdhaka {
        void onclickdhaka(Intent i);
    }
}
