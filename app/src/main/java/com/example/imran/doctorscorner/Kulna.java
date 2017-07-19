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

import com.example.imran.doctorscorner.alldetails.Chittagonghos;
import com.example.imran.doctorscorner.alldetails.kulnahos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Kulna extends Fragment {
    ArrayAdapter<String> itemku;


    public Kulna() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemku= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, kulnahos.hospitalkulna);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kulna, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvc=(ListView) view.findViewById(R.id.listkulna);
        listvc.setAdapter(itemku);
listvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent i=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i);
                 break;
            case 1:

                Intent i1=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i1);
               break;
            case 2:

                Intent i2=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i2);
               break;case 3:

                Intent i3=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i3);
               break;
            case 4:

                Intent i4=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i4);
               break;
            case 5:

                Intent i5=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i5);
               break;
            case 6:
                Intent i6=new Intent(getActivity(),kulnadoc.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i6);
                break;
            case 7:
                Intent i7
                        =new Intent(getActivity(),kulnadoc1.class);

                ((onitemclickkulna) getActivity()).onclickkulna(i7);

                break;
            case 8:

                Intent i8=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i8);
                break;
            case 9:

                Intent i9=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickkulna) getActivity()).onclickkulna(i9);
                break;






        }
    }
});






    }

 public  interface onitemclickkulna{
     void  onclickkulna(Intent k);
 }
}
