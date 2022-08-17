package com.example.tambaku10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Macam extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    private Button startBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macam);

        drawerLayout = findViewById(R.id.drawer_layout);

        Button button1 = findViewById(R.id.batuk);
        Button button2 = findViewById(R.id.flu);
        Button button3 = findViewById(R.id.demam);
        Button button4 = findViewById(R.id.diare);
        Button button5 = findViewById(R.id.sembelit);
        Button button6 = findViewById(R.id.maag);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    public void openBatuk(){com.example.tambaku10.MainActivity.redirectActivity(this,batuk.class);}

    public void openFlu(){com.example.tambaku10.MainActivity.redirectActivity(this,flu.class);}

    public void openDemam(){com.example.tambaku10.MainActivity.redirectActivity(this,demam.class);}

    public void openDiare(){com.example.tambaku10.MainActivity.redirectActivity(this,diare.class);}

    public void openSembelit(){com.example.tambaku10.MainActivity.redirectActivity(this,sembelit.class);}

    public void openMaag(){com.example.tambaku10.MainActivity.redirectActivity(this,maag.class);}

    public void ClickMenu(View view){ com.example.tambaku10.MainActivity.openDrawer(drawerLayout); }

    public void ClickLogo(View view){
        com.example.tambaku10.MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){ com.example.tambaku10.MainActivity.redirectActivity(this,
            com.example.tambaku10.MainActivity.class); }

    public void ClickInformasi(View view){
        com.example.tambaku10.MainActivity.redirectActivity(this,Informasi.class);
    }
    public void ClickMacam(View view){ recreate(); }

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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.batuk:
                Intent categoryIntent = new Intent(Macam.this,batuk.class);
                startActivity(categoryIntent);
                finish();
                break;
            case R.id.flu:
                Intent categoryIntent1 = new Intent(Macam.this,flu.class);
                startActivity(categoryIntent1);
                finish();
                break;
            case R.id.demam:
                Intent categoryIntent2 = new Intent(Macam.this,demam.class);
                startActivity(categoryIntent2);
                finish();
                break;
            case R.id.diare:
                Intent categoryIntent3 = new Intent(Macam.this,diare.class);
                startActivity(categoryIntent3);
                finish();
                break;
            case R.id.sembelit:
                Intent categoryIntent4 = new Intent(Macam.this,sembelit.class);
                startActivity(categoryIntent4);
                finish();
                break;
            case R.id.maag:
                Intent categoryIntent5 = new Intent(Macam.this,maag.class);
                startActivity(categoryIntent5);
                finish();
                break;
        }
    }
}