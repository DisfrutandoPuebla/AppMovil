package com.example.erikaalvarez.disfrutandopuebla;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Erika Alvarez on 05/11/2016.
 */

public class Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        if(container == null){
            return null;
        }
        return inflater.inflate(R.layout.fragment1_layout, container, false);
    }
}
