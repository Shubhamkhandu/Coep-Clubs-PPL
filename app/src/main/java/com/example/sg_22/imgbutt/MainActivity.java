package com.example.sg_22.imgbutt;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent i ;
                switch(position) {
                    case 0:
                        i = new Intent(getBaseContext(), AaryaRaas.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(getBaseContext(), AeroZealous.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(getBaseContext(), ANC.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(getBaseContext(), acm.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(getBaseContext(), Astronomy.class);
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(getBaseContext(), BoatClub.class);
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(getBaseContext(), BCquiz.class);
                        startActivity(i);
                        break;
                    case 7:
                        i = new Intent(getBaseContext(), i2i.class);
                        startActivity(i);
                        break;
                    case 8:
                        i = new Intent(getBaseContext(), cofsug.class);
                        startActivity(i);
                        break;
                    case 9:
                        i = new Intent(getBaseContext(), CSAT.class);
                        startActivity(i);
                        break;
                    case 10:
                        i = new Intent(getBaseContext(), DanceClub.class);
                        startActivity(i);
                        break;
                    case 11:
                        i = new Intent(getBaseContext(), debate1.class);
                        startActivity(i);
                        break;
                    case 12:
                        i = new Intent(getBaseContext(), e_cell.class);
                        startActivity(i);
                        break;
                    case 13:
                        i = new Intent(getBaseContext(), google.class);
                        startActivity(i);
                        break;
                    case 14:
                        i = new Intent(getBaseContext(), ham.class);
                        startActivity(i);
                        break;
                    case 15:
                        i = new Intent(getBaseContext(), history.class);
                        startActivity(i);
                        break;
                    case 16:
                        i = new Intent(getBaseContext(), janeev.class);
                        startActivity(i);
                        break;
                    case 17:
                        i = new Intent(getBaseContext(), TeamNemesis.class);
                        startActivity(i);
                        break;
                    case 18:
                        i = new Intent(getBaseContext(), NSS.class);
                        startActivity(i);
                        break;
                    case 19:
                        i = new Intent(getBaseContext(), OctaneRacing.class);
                        startActivity(i);
                        break;
                    case 20:
                        i = new Intent(getBaseContext(), personal_development.class);
                        startActivity(i);
                        break;
                    case 21:
                        i = new Intent(getBaseContext(), phylo.class);
                        startActivity(i);
                        break;
                    case 22:
                        i = new Intent(getBaseContext(), PhotographyCLub.class);
                        startActivity(i);
                        break;
                    case 23:
                        i = new Intent(getBaseContext(), Rsc.class);
                        startActivity(i);
                        break;
                    case 24:
                        i = new Intent(getBaseContext(), ScienceClub.class);
                        startActivity(i);
                        break;
                    case 25:
                        i = new Intent(getBaseContext(), SpandanClub.class);
                        startActivity(i);
                        break;
                    case 26:
                        i = new Intent(getBaseContext(), Spicmacay.class);
                        startActivity(i);
                        break;
                    case 27:
                        i = new Intent(getBaseContext(), Sunrisers.class);
                        startActivity(i);
                        break;
                    case 28:
                        i = new Intent(getBaseContext(), student_welfare_forum.class);
                        startActivity(i);
                        break;
                    case 29:
                        i = new Intent(getBaseContext(), TedxCoepClub.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }

}

