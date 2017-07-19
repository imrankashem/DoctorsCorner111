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

import com.example.imran.doctorscorner.alldetails.comillahos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Comilla extends Fragment {

    ArrayAdapter<String>  itemcom;

    public Comilla() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemcom=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, comillahos.hoscomilla);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comilla, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvc=(ListView) view.findViewById(R.id.listcomilla);
        listvc.setAdapter(itemcom);
                listvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(getContext(),comilladoc.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i);
                        break;
                    case 1:
                        Intent i1=new  Intent(getActivity(),nothingtoshow.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i1);
                        break;
                    case 2:
                        Intent i2=new  Intent(getActivity(),comilladoc2.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i2);
                        break;
                    case 3:
                        Intent i3=new  Intent(getActivity(),nothingtoshow.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i3);
                        break;
                    case 4:
                        Intent i4=new  Intent(getActivity(),comilladoc3.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i4);
                        break;
                    case 5:
                        Intent i5=new Intent(getActivity(),comilladoc4.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i5);
                        break;
                    case  6:
                        Intent i6=new Intent(getActivity(),comilladoc5.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i6);
                        break;
                    case 7:
                        Intent i7=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i7);
                        break;
                    case 8:
                        Intent i8=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i8);
                        break;
                    case 9:
                        Intent i9=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclickcomilla) getActivity()).onclickcomilla(i9);
                        break;

                }
            }
        });
    }
    public  interface onitemclickcomilla{
        void  onclickcomilla(Intent i);
    }
}
