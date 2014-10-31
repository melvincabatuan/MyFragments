package com.cabatuan.myfragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cabatuan.myfragments.data.Flower;
import com.cabatuan.myfragments.data.FlowerData;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MyFragment extends ListFragment {

    List<Flower> flowers = new FlowerData().getFlowers();

    public MyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity(), R.layout.flower_listitem, flowers);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }
}