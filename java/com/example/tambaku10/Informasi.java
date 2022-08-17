package com.example.tambaku10;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Informasi extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){ com.example.tambaku10.MainActivity.openDrawer(drawerLayout); }

    public void ClickLogo(View view){
        com.example.tambaku10.MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){ com.example.tambaku10.MainActivity.redirectActivity(this,
            com.example.tambaku10.MainActivity.class); }

    public void ClickInformasi(View view){ recreate(); }

    public void ClickMacam(View view){
        com.example.tambaku10.MainActivity.redirectActivity(this,Macam.class);
    }

    public void ClickAboutUs(View view){
        com.example.tambaku10.MainActivity.redirectActivity(this,AboutUs.class);
    }

    public void ClickLogout(View view){
        com.example.tambaku10.MainActivity.Logout(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        com.example.tambaku10.MainActivity.closeDrawer(drawerLayout);
    }
}