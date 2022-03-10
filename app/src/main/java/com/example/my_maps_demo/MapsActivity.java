package com.example.my_maps_demo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.my_maps_demo.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        LatLng attock = new LatLng(33.82532028952223, 72.42672082437403);
        mMap.addMarker(new MarkerOptions().position(attock).title("Marker in Kamra"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(attock));
//
//        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//
//        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        btn1    =(Button)findViewById(R.id.omer) ;
        btn2    =(Button)findViewById(R.id.omer2) ;
        btn3    =(Button)findViewById(R.id.omer3) ;
        btn4    =(Button)findViewById(R.id.omer4) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(attock, 17));
                mMap.animateCamera(CameraUpdateFactory.zoomIn());
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setCompassEnabled(true);

            }
        });
  btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
          mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(attock, 17));
          mMap.animateCamera(CameraUpdateFactory.zoomIn());
          mMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);
          mMap.getUiSettings().setZoomControlsEnabled(true);
          mMap.getUiSettings().setCompassEnabled(true);
      }
  });
  btn3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
          mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(attock, 17));
          mMap.animateCamera(CameraUpdateFactory.zoomIn());
          mMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);
          mMap.getUiSettings().setZoomControlsEnabled(true);
          mMap.getUiSettings().setCompassEnabled(true);
      }
  });
  btn4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
          mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(attock, 17));
          mMap.animateCamera(CameraUpdateFactory.zoomIn());
          mMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);
          mMap.getUiSettings().setZoomControlsEnabled(true);
          mMap.getUiSettings().setCompassEnabled(true);
      }
  });

    }
}