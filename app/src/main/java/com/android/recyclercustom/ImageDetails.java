package com.android.recyclercustom;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class ImageDetails extends AppCompatActivity {

    ImageView imageDetails;
    TextView tvImageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_details);
        imageDetails = (ImageView) findViewById(R.id.imageDetails);
        tvImageName = (TextView) findViewById(R.id.tvImageName);
        imageDetails.setImageResource(getIntent().getIntExtra("image", 00));
        tvImageName.setText(getIntent().getStringExtra("name"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

    /*    switch (item.getItemId()) {

            case android.R.id.share:
                // app icon in action bar clicked; goto parent activity.
                onBackPressed();
                this.finish();
                return true;
        }*/
        return super.onOptionsItemSelected(item);

    }


/*    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }*/
}