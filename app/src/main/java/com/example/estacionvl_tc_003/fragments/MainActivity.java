package com.example.estacionvl_tc_003.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.estacionvl_tc_003.fragments.adapters.ContenidoAdapter;
import com.example.estacionvl_tc_003.fragments.fragments.ContenidoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    List<Fragment> data;
    ContenidoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        initData();
        adapter = new ContenidoAdapter(getSupportFragmentManager(), data);
        pager.setAdapter(adapter);
    }

    public void initData(){
        data = new ArrayList<>();
        ContenidoFragment f1 = new ContenidoFragment();
        f1.setInfo("pagina 1");

        ContenidoFragment f2 = new ContenidoFragment();
        f1.setInfo("pagina 2");

        ContenidoFragment f3 = new ContenidoFragment();
        f1.setInfo("pagina 3");

        data.add(f1);
        data.add(f2);
        data.add(f3);



    }


}
