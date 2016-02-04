package com.example.estacionvl_tc_003.fragments.adapters;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by EstacionVL-TC-003 on 4/02/16.
 */
public class ContenidoAdapter extends FragmentStatePagerAdapter {

    List<Fragment> data;


    public ContenidoAdapter(FragmentManager fm, List<Fragment>data ) {
        super(fm);
        this.data=data;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
