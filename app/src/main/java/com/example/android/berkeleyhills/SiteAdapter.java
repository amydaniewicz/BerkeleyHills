package com.example.android.berkeleyhills;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends ArrayAdapter<Site> {
    public int mColorResourceId;

    public SiteAdapter(Activity context, ArrayList<Site> sites, int colorResourceId) {
        super(context,  0, sites);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Site currentSite = getItem(position);

        ImageView siteImageView = (ImageView) listItemView.findViewById(R.id.site_image_view);

        if(currentSite.hasImage()) {
            siteImageView.setImageResource(currentSite.getSiteImageResourceId());
            siteImageView.setVisibility(View.VISIBLE);
        } else {
            siteImageView.setVisibility(View.GONE);
        }

        View siteListVerticalLayout = (View) listItemView.findViewById(R.id.site_list_vertical_layout);
        final int color = ContextCompat.getColor(getContext(), mColorResourceId);
        siteListVerticalLayout.setBackgroundColor(color);

        TextView siteNameTextView = (TextView) listItemView.findViewById(R.id.site_name_text_view);
        siteNameTextView.setText(currentSite.getSiteName());

        siteListVerticalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailPageIntent = new Intent(getContext(), DetailPageActivity.class);

                detailPageIntent.putExtra("SITE_DETAIL_IMAGE_RESOURCE_ID", currentSite.getSiteDetailImageResourceId());
                detailPageIntent.putExtra("SITE_NAME", currentSite.getSiteName());
                detailPageIntent.putExtra("SITE_DESCRIPTION", currentSite.getSiteDescription());
                detailPageIntent.putExtra("SITE_COLOR", color);

                getContext().startActivity(detailPageIntent);
            }
        });

        return listItemView;
    }
}

