package org.techtown.project6_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("탭 호스트 예제");

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

    }
}