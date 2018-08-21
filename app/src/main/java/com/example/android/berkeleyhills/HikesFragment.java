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

public class HikesFragment extends Fragment {


    public HikesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(getString(R.string.hikes_site_name_one), getString(R.string.hikes_site_description_one), R.drawable.easter_way_list, R.drawable.easter_way_detail));
        sites.add(new Site(getString(R.string.hikes_site_name_two), getString(R.string.hikes_site_description_two), R.drawable.park_hills_list, R.drawable.park_hills_detail));
        sites.add(new Site(getString(R.string.hikes_site_name_three), getString(R.string.hikes_site_description_three), R.drawable.tamalpais_path_list, R.drawable.tamalpais_path_detail));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_hikes);

        ListView listView = (ListView) rootView.findViewById(R.id.site_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
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
