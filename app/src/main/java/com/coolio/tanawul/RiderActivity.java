package com.coolio.tanawul;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class RiderActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
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

        // Add a marker in Sydney and move the camera
        LatLng e11 = new LatLng(33.6, 72.98888);
        Marker locationMarker = mMap.addMarker(new MarkerOptions().position(e11).title("Food Available"));
        locationMarker.showInfoWindow();
        LatLng e12 = new LatLng(33.699230, 72.974279);
        Marker locationMarker1 = mMap.addMarker(new MarkerOptions().position(e12).title("Food Available"));
        locationMarker1.showInfoWindow();
        LatLng e13 = new LatLng(33.6988596, 72.973056);
        Marker locationMarker2 = mMap.addMarker(new MarkerOptions().position(e13).title("Food Available"));
        locationMarker2.showInfoWindow();
        LatLng e14 = new LatLng(33.700319, 72.973496);
        Marker locationMarker3 = mMap.addMarker(new MarkerOptions().position(e14).title("Food Available"));
        locationMarker3.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLng(e11));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(11.0f));

    }
}
