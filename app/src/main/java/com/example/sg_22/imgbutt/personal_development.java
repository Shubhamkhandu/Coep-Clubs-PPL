package com.example.sg_22.imgbutt;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class personal_development extends AppCompatActivity {

    int MY_PERMISSION_REQUEST_CALL_PHONE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_development);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Personality Development");

        Button tv = (Button) findViewById(R.id.boatcontact);
        tv.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:9999999999"));

                        if (ActivityCompat.checkSelfPermission(personal_development.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(callIntent);
                    }
                }
        );
    }

    protected void gotoyoutube(View view) {
        goToUrl("https://www.youtube.com/watch?v=x1L8udJ3qWs");
    }

    protected void gotoweb(View view) {
        goToUrl("http://www.coep.org.in/clubs/personality_development_club");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
