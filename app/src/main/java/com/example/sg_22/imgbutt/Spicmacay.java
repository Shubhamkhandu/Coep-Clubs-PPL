package com.example.sg_22.imgbutt;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Spicmacay extends AppCompatActivity {

    int MY_PERMISSION_REQUEST_CALL_PHONE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spicmacay);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Spic Macay Club");
        collapsingToolbar.setCollapsedTitleTextColor(R.color.colorPrimary);
        collapsingToolbar.setExpandedTitleColor(R.color.colorPrimary);

        Button tv = (Button) findViewById(R.id.boatcontact);
        tv.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (ActivityCompat.checkSelfPermission(Spicmacay.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(Spicmacay.this, new String[]{Manifest.permission.CALL_PHONE},
                                    MY_PERMISSION_REQUEST_CALL_PHONE);
                        }
                        else {
                            Intent callIntent = new Intent(Intent.ACTION_DIAL);
                            callIntent.setData(Uri.parse("tel:9999999999"));
                            startActivity(callIntent);
                        }
                    }
                }
        );
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case  1: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:9999999999"));
                    startActivity(callIntent);
                }
                return;
            }
        }
    }

    protected void gotofb(View view) {

        goToUrl("https://m.facebook.com/spicmacaypune");
    }
    protected void gotoweb(View view) {

        goToUrl("http://spicmacay.com");
    }
    protected void gototw(View view) {

        goToUrl("http://mobile.twitter.com/spicmacaypune?lang=en");
    }
    protected void gotoinsta(View view) {

        goToUrl("http://imgrum.org/tag/spicmacay");
    }
    protected void gotoyt(View view) {
        goToUrl("http://m.youtube.com/user/spicmacay");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}