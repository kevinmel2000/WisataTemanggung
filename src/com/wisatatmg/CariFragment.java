package com.wisatatmg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CariFragment extends Fragment{
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                             Bundle savedInstanceState) {
	        final View rootView = inflater.inflate(R.layout.fragment_cari, container, false);
	        return rootView;
	    }

}
