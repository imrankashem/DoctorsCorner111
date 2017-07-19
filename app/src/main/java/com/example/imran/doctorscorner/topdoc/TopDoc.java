package com.example.imran.doctorscorner.topdoc;

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

import com.example.imran.doctorscorner.Chittagong;
import com.example.imran.doctorscorner.R;
import com.example.imran.doctorscorner.alldetails.Chittagonghos;

/**
 * Created by imran on 7/6/2017.
 */

public class TopDoc extends Fragment{
    ArrayAdapter<String> itemtdoc;
    public  TopDoc(){

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //showing list item
        itemtdoc= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, listtopdoc.topdoc);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_topdoc, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ListView listvtdoc=(ListView) view.findViewById(R.id.listtopdoc);
        listvtdoc.setAdapter(itemtdoc);
       listvtdoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       Intent i=new Intent(getActivity(),topdoc0.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i);
                       break;
                   case 1:
                       Intent i1=new Intent(getActivity(),topdoc1.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i1);
                       break;
                   case 2:
                       Intent i2=new Intent(getActivity(),topdoc2.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i2);
                       break;
                   case 3:
                       Intent i3=new Intent(getActivity(),topdoc3.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i3);
                       break;
                   case 4:
                       Intent i4=new Intent(getActivity(),topdoc4.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i4);
                       break;
                   case 5:
                       Intent i5=new Intent(getActivity(),topdoc5.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i5);
                       break;
                   case 6:
                       Intent i6=new Intent(getActivity(),topdoc6.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i6);
                       break;
                   case 7:
                       Intent i7=new Intent(getActivity(),topdoc7.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i7);
                       break;
                   case 8:
                       Intent i8=new Intent(getActivity(),topdoc8.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i8);
                       break;
                   case 9:
                       Intent i9=new Intent(getActivity(),topdoc9.class);
                       (( onitemclicktopdoc)getActivity()). onclicktopdoc(i9);
                       break;



               }
           }
       });

    }
    public  interface  onitemclicktopdoc{
        void  onclicktopdoc(Intent i);
    }
}
