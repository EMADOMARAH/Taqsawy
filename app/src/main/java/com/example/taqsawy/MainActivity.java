package com.example.taqsawy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    EditText search;
    ImageView icon;
    FloatingActionButton fab;
    TextView temp,status,location,lastupdate,wind,winddir,humidity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.search_city);
        icon = findViewById(R.id.icon);
        temp = findViewById(R.id.temp);
        status = findViewById(R.id.status);
        location = findViewById(R.id.location);
        lastupdate = findViewById(R.id.last_update);
        wind = findViewById(R.id.wind);
        winddir = findViewById(R.id.wind_dir);
        humidity = findViewById(R.id.humidity);
        fab = findViewById(R.id.search_fab);


    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}
