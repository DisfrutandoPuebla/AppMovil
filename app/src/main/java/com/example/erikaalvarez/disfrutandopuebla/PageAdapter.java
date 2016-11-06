package com.example.erikaalvarez.disfrutandopuebla;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Erika Alvarez on 05/11/2016.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;

    public PageAdapter(FragmentManager fm, List<Fragment> fragments){
        super(fm);

        this.fragments = fragments;
    }
    @Override
    public Fragment getItem(int i){
        return fragments.get(i);
    }
    @Override
    public int getCount(){
        return fragments.size();
    }
}
