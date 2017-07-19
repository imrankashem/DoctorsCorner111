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

import com.example.imran.doctorscorner.alldetails.Sylethos;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sylet extends Fragment {
    ArrayAdapter<String>  items;


    public Sylet() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, Sylethos.hospitasyl);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sylet, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvc=(ListView) view.findViewById(R.id.listsylet);
        listvc.setAdapter(items);
        listvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(getContext(),nothingtoshow.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i);
                        break;
                    case 1:
                        Intent i1=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i2);
                        break;
                    case 3:
                        Intent i3=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i4);
                        break;
                    case 5:
                        Intent i5=new Intent(getActivity(),nothingtoshow.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i5);
                        break;
                    case 6:
                        Intent i6=new Intent(getActivity(),syletdoc.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i6);
                        break;
                    case 7:
                        Intent i7=new Intent(getActivity(),syletdoc2.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i7);
                        break;
                    case 8:
                        Intent i8=new Intent(getActivity(),syletdoc3.class);
                        ((onitemclicksylet) getActivity()).onclicksylet(i8);
                        break;




                }

            }
        });






    }
    public  interface onitemclicksylet{
        void onclicksylet(Intent i);
    }
}
