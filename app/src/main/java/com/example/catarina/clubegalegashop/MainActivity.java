package com.example.catarina.clubegalegashop;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Use an intent to launch google maps at shop location.
    public void location (View view) {
        Uri gmmIntentUri = Uri.parse("geo:38.206465,-7.798962?z=20");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    // Use an intent to launch the call.
    public void call (View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+351284437070"));
        startActivity(callIntent);

    }

    // Use an intent to launch an web page.
    public void website (View view) {
        String site = "http://www.cavidigueira.com/clubegalega/index.php/pt/";
        Uri web = Uri.parse(site);
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
