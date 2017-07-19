package com.example.imran.doctorscorner.tophos;


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
import com.example.imran.doctorscorner.topdoc.TopDoc;
import com.example.imran.doctorscorner.topdoc.listtopdoc;
import com.example.imran.doctorscorner.topdoc.topdoc0;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopHos extends Fragment {
    ArrayAdapter<String> itemthos;


    public TopHos() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemthos= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, listtophos.tophos);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_hos, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvthos=(ListView) view.findViewById(R.id.listtophos);
        listvthos.setAdapter(itemthos);
        listvthos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(getActivity(),tophos0.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i);
                        break;
                    case 1:
                        Intent i1=new Intent(getActivity(),tophos1.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(getActivity(),tophos2.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i2);
                        break;
                    case 3:
                        Intent i3=new Intent(getActivity(),tophos3.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(getActivity(),tophos4.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i4);
                        break;
                    case 5:
                        Intent i5=new Intent(getActivity(),tophos5.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i5);
                        break;
                    case 6:
                        Intent i6=new Intent(getActivity(),tophos6.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i6);
                        break;
                    case 7:
                        Intent i7 =new Intent(getActivity(),tophos7.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i7);
                        break;
                    case 8:
                        Intent i8 =new Intent(getActivity(),tophos8.class);
                        ((onitemclicktophos)getActivity()). onclicktophos(i8);
                        break;




                }
            }
        });
    }

    public  interface  onitemclicktophos{
        void  onclicktophos(Intent i);
    }
}
