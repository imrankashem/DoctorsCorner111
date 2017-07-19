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

import com.example.imran.doctorscorner.alldetails.rajshahihos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Rajshahi extends Fragment {

    ArrayAdapter<String>  itemraj;


    public Rajshahi() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemraj=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, rajshahihos.hospitalraj);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rajshahi, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

            ListView listvc=(ListView) view.findViewById(R.id.listrajsahi);
            listvc.setAdapter(itemraj);

listvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent i1=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i1);
                break;
            case 1:
                Intent i2=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i2);
                break;
            case 2:
                Intent i3=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i3);
                break;
            case 3:
                Intent i4=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i4);
                break;
            case 4:
                Intent i5=new Intent(getActivity(),rajshahi_doc.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i5);
                break;
            case 5:
                Intent i6=new Intent(getActivity(),rajshahi_doc1.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i6);
                break;  case 6:
                Intent i7=new Intent(getActivity(),rajshahi_doc2.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i7);
                break;
            case 7:
                Intent i8=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i8);
                break; case 8:
                Intent i9=new Intent(getActivity(),nothingtoshow.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i9);
                break;
            case 9:
                Intent i10=new Intent(getActivity(),rajshahi_doc3.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i10);
                break;
            case  10:
                Intent i11=new Intent(getActivity(),rajshahi_doc4.class);
                ((onitemclickrajshahi) getActivity()).onclickrajshahi(i11);
                break;






        }
    }
});







    }
    public interface  onitemclickrajshahi{
        void  onclickrajshahi(Intent r);
    }
}
