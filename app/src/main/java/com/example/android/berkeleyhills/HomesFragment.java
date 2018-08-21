package com.example.android.berkeleyhills;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomesFragment extends Fragment {


    public HomesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(getString(R.string.homes_site_name_one), getString(R.string.homes_site_description_one), R.drawable.white_lange_house_list, R.drawable.white_lange_house_detail));
        sites.add(new Site(getString(R.string.homes_site_name_two), getString(R.string.homes_site_description_two), R.drawable.rose_walk_cottage_list, R.drawable.rose_walk_cottage_detail));
        sites.add(new Site(getString(R.string.homes_site_name_three), getString(R.string.homes_site_description_three), R.drawable.pratt_thomas_list, R.drawable.pratt_thomas_detail));
        sites.add(new Site(getString(R.string.homes_site_name_four), getString(R.string.homes_site_description_four), R.drawable.hume_cloister_list, R.drawable.hume_cloister_detail));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_homes);

        ListView listView = (ListView) rootView.findViewById(R.id.site_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Site site = sites.get(position);
            }
        });

        return rootView;
    }
}
