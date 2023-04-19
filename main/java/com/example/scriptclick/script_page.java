package com.example.scriptclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class script_page extends AppCompatActivity {
    String troupeName = "School Troupe";
    int troupeId = 04521;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script_page);
        Toolbar toolbar = findViewById(R.id.toolbarScriptPage);
        TextView toolbarTitle = findViewById(R.id.titleTroupe);
        toolbarTitle.setText(troupeName);

        ImageView imageTS = (ImageView) findViewById(R.id.imageTS);
        imageTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View script_page) {
                Intent intent2 = new Intent(script_page.this, troupe_settings.class);
                startActivity(intent2);
            }
        });
    }


}