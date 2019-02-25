package com.example.kasumimaruta.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Permission;

public class MainActivity extends Activity {

    PermissionManager permissionManager;
    TextView txtDenied,txtGranted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleText = (TextView) findViewById(R.id.title_text);
        titleText.setText(getString(R.string.app_name));

        txtGranted=(TextView)findViewById(R.id.txtGranted);
        txtGranted=(TextView)findViewById(R.id.txtDenied);

        permissionManager = new PermissionManager(){};
        permissionManager.checkAndRequestPermission(this);
    }
}