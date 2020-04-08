package com.sud.e_healthify;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_GREEN;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GoogleMap mMap1;
    LocationManager locationManager;

    LocationListener locationListener;


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 1) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                    {

                        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

                    }

                }

            }

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        /*LatLng red = new LatLng(-17.6853904, 74.0092798);
        mMap1.addMarker(new MarkerOptions().position(red).title("High risk user")).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));;
        mMap1.moveCamera(CameraUpdateFactory.newLatLng(red));

        LatLng green = new LatLng(-17.6851754, 74.0092308);
        mMap1.addMarker(new MarkerOptions().position(green).title("Low risk user")).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));;
        mMap1.moveCamera(CameraUpdateFactory.newLatLng(green));*/

        //Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(17.6745341,73.9831558);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Your location|Low risk user")).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng pune = new LatLng(18.5245646,73.7225363);
        mMap.addMarker(new MarkerOptions().position(pune).title("Moderate risk user")).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pune));

        LatLng bhuinj = new LatLng(17.8766168,73.9642879);
        mMap.addMarker(new MarkerOptions().position(bhuinj).title("High risk user")).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bhuinj));

        LatLng mum = new LatLng( 19.0852945,72.6305058);
        mMap.addMarker(new MarkerOptions().position(mum).title("High risk user")).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mum));

    }
}
