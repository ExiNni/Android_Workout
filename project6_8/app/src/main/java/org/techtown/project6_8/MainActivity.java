package org.techtown.project6_8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("탭호스트 과제");

    RadioButton rdoRed;
    RadioButton rdoGreen;
    RadioButton rdoBlue;

    Button btnSmall;
    Button btnMedium;
    Button btnLarge;

    LinearLayout colorLayout;
    TextView textSize, textColor;


        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabSpecColor = tabHost.newTabSpec("COLOR").setIndicator("색상");
        tabSpecColor.setContent(R.id.colorLayout);
        tabHost.addTab(tabSpecColor);

        TabHost.TabSpec tabSpecSize = tabHost.newTabSpec("SIZE").setIndicator("크기");
        tabSpecSize.setContent(R.id.sizeLayout);
        tabHost.addTab(tabSpecSize);

        tabHost.setCurrentTab(0);

        rdoRed          = (RadioButton) findViewById(R.id.rdoRed);
        rdoGreen        = (RadioButton) findViewById(R.id.rdoGreen);
        rdoBlue         = (RadioButton) findViewById(R.id.rdoBlue);

        btnSmall        = (Button) findViewById(R.id.btnSmall);
        btnMedium       = (Button) findViewById(R.id.btnMedium);
        btnLarge        = (Button) findViewById(R.id.btnLarge);

        textSize        = (TextView) findViewById(R.id.textSize);
        textColor       = (TextView) findViewById(R.id.textColor);

        rdoRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textColor.setTextColor(Color.parseColor("RED"));
            }
        });

        rdoGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textColor.setTextColor(Color.parseColor("GREEN"));
            }
        });

        rdoBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textColor.setTextColor(Color.parseColor("BLUE"));
            }
        });

        btnSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize.setTextSize(40);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize.setTextSize(60);
            }
        });
        btnLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize.setTextSize(80);
            }
        });
    }
}