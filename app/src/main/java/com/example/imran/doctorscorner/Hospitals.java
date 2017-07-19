package com.example.imran.doctorscorner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import android.widget.ListView;


import com.example.imran.doctorscorner.FirstAid.FirstAid;

import com.example.imran.doctorscorner.ambulance.Ambulance;
import com.example.imran.doctorscorner.bloodbank.BloodBank;
import com.example.imran.doctorscorner.bloodbank.BloofBankDetails;
import com.example.imran.doctorscorner.healthtips.HealthTips;
import com.example.imran.doctorscorner.medicinecabinet.MedicineCabinet;
import com.example.imran.doctorscorner.topdoc.TopDoc;
import com.example.imran.doctorscorner.tophos.TopHos;

import java.util.ArrayList;


public class Hospitals extends AppCompatActivity  implements  Chittagong.onitemclick, Dhaka.onitemclickdhaka,Sylet.onitemclicksylet
        ,Comilla.onitemclickcomilla ,Kulna.onitemclickkulna,Rajshahi.onitemclickrajshahi,
        TopDoc.onitemclicktopdoc,TopHos.onitemclicktophos,BloodBank.OnItemSelectedListener,Ambulance.onitemclickambulance{
    public DrawerLayout mdrawerlayput;
    public ActionBarDrawerToggle mtoogle;
//git remote add origin git@github.com:imrankashem/DoctorsCorener.git
//git push -u origin master
private  Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

      toolbar=(Toolbar) findViewById(R.id.nev_action);
        setSupportActionBar(toolbar);
        if (savedInstanceState!=null){
            return;
        }
        // use mtoogle in select section
        Chittagong chi=new Chittagong();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentcontainer,chi);
        fragmentTransaction.commit();




        //for the drawer layout
        mdrawerlayput = (DrawerLayout) findViewById(R.id.DrawerLayout);

        mtoogle = new ActionBarDrawerToggle(this, mdrawerlayput, R.string.open, R.string.close);
        mdrawerlayput.addDrawerListener(mtoogle);
        mtoogle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView mNavigationView=(NavigationView) findViewById(R.id.nev);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override //menu item click
            public boolean onNavigationItemSelected( MenuItem item) {
                int id=item.getItemId();
                switch (id){
                    //ids from nevigation menu
                    case  R.id.CHittagong:
                        Chittagong chi=new Chittagong();
                        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragmentcontainer,chi);
                        fragmentTransaction.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;

                    case R.id.Dhhaka:
                        Dhaka dha=new Dhaka();
                        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.fragmentcontainer,dha);
                        fragmentTransaction1.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.Rajshahi:
                        Rajshahi raj=new Rajshahi();
                        FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.fragmentcontainer,raj);
                        fragmentTransaction2.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.Sylett:
                        Sylet sy=new Sylet();
                        FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.fragmentcontainer,sy);
                        fragmentTransaction3.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;

                    case  R.id.Comilla:
                        Comilla com=new Comilla();
                        FragmentTransaction fragmentTransaction4=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.fragmentcontainer,com);
                        fragmentTransaction4.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.Kulna:
                        Kulna kul=new Kulna();
                        FragmentTransaction fragmentTransaction5=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction5.replace(R.id.fragmentcontainer,kul);
                        fragmentTransaction5.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.TRdoctors:
                        TopDoc topdoc=new TopDoc();
                        FragmentTransaction fragmentTransaction6=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction6.replace(R.id.fragmentcontainer,topdoc);
                        fragmentTransaction6.commit();
                        //to close drawer layput
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case  R.id.TRhospitals:
                        TopHos topHos=new TopHos();
                        FragmentTransaction fragmentTransaction7=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction7.replace(R.id.fragmentcontainer,topHos);
                        fragmentTransaction7.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.firstaid:
                        FirstAid firstAid=new FirstAid();
                        FragmentTransaction fragmentTransaction8=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction8.replace(R.id.fragmentcontainer,firstAid);
                        fragmentTransaction8.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.htips:
                        HealthTips healthTips=new HealthTips();
                        FragmentTransaction fragmentTransaction9=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction9.replace(R.id.fragmentcontainer,healthTips);
                        fragmentTransaction9.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;
                    case  R.id.cabinet:
                        MedicineCabinet medicineCabinet=new MedicineCabinet();
                        FragmentTransaction fragmentTransaction10=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction10.replace(R.id.fragmentcontainer,medicineCabinet);
                        fragmentTransaction10.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return  true;
                    case R.id.blood:
                        BloodBank bloodBank=new BloodBank();
                        FragmentTransaction fragmentTransaction11=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction11.replace(R.id.fragmentcontainer,bloodBank);
                        fragmentTransaction11.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                       return true;
                    case R.id.ambulance:
                        Ambulance ambulance=new Ambulance();
                        FragmentTransaction fragmentTransaction12=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction12.replace(R.id.fragmentcontainer,ambulance);
                        fragmentTransaction12.commit();
                        mdrawerlayput.closeDrawer(GravityCompat.START);
                        return true;

                }


                return true;

            }

        });


    }


//make the menu icon clickable
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mtoogle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     *     for chittagong
     * @param
     */
    @Override
    public void onclick(Intent c) {
        startActivity(c);
    }
//for dhaka
    @Override
    public void onclickdhaka(Intent d) {
        startActivity(d);
    }
    //for sylet
    @Override
    public void onclicksylet(Intent s) {
        startActivity(s);

    }

    @Override
    public void onclickcomilla(Intent co) {
        startActivity(co);
    }

    @Override
    public void onclickkulna(Intent k) {
      startActivity(k);
    }

    @Override
    public void onclickrajshahi(Intent r) {
        startActivity(r);
    }

    @Override
    public void onclicktopdoc(Intent td) {
        startActivity(td);
    }

    @Override
    public void onclicktophos(Intent th) {
        startActivity(th);
    }

//blood bank
    @Override
    public void Ons(Intent position) {
startActivity(position);

        }

//for ambulance
    @Override
    public void onClick(Intent ambu) {
        startActivity(ambu);
    }
}












