package com.example.android.berkeleyhills;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.detail_page_layout);

        Intent detailPageIntent = getIntent();

        ImageView siteImageView = (ImageView) findViewById(R.id.site_image_view);
        TextView siteNameTextView = (TextView) findViewById(R.id.site_name_text_view);
        TextView siteDescriptionTextView = (TextView) findViewById(R.id.site_description_text_view);

        siteImageView.setImageResource(detailPageIntent.getIntExtra("SITE_DETAIL_IMAGE_RESOURCE_ID", 0));
        siteNameTextView.setText(detailPageIntent.getStringExtra("SITE_NAME"));
        siteDescriptionTextView.setText(detailPageIntent.getStringExtra("SITE_DESCRIPTION"));
        siteNameTextView.setBackgroundColor(detailPageIntent.getIntExtra("SITE_COLOR", 0));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}
