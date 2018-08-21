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

public class ParksFragment extends Fragment {


    public ParksFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        final ArrayList<Site> sites = new ArrayList<Site>();

        sites.add(new Site(getString(R.string.parks_site_name_one), getString(R.string.parks_site_description_one), R.drawable.indian_rock_park_list, R.drawable.indian_rock_park_detail));
        sites.add(new Site(getString(R.string.parks_site_name_two), getString(R.string.parks_site_description_two), R.drawable.great_stoneface_park_list, R.drawable.great_stoneface_park_detail));
        sites.add(new Site(getString(R.string.parks_site_name_three), getString(R.string.parks_site_description_three), R.drawable.remillard_park_list, R.drawable.remillard_park_detail));
        sites.add(new Site(getString(R.string.parks_site_name_four), getString(R.string.parks_site_description_four), R.drawable.cragmont_rock_park_list, R.drawable.cragmont_rock_park_detail));
        sites.add(new Site(getString(R.string.parks_site_name_five), getString(R.string.parks_site_description_five), R.drawable.grotto_rock_park_list, R.drawable.grotto_rock_park_detail));
        sites.add(new Site(getString(R.string.parks_site_name_six), getString(R.string.parks_site_description_six), R.drawable.mortar_rock_park_list, R.drawable.mortar_rock_park_detail));
        sites.add(new Site(getString(R.string.parks_site_name_seven), getString(R.string.parks_site_description_seven), R.drawable.contra_costa_rock_park_list, R.drawable.contra_costa_rock_park_detail));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_parks);

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
