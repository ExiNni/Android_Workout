package org.techtown.project7_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.security.acl.Group;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.Edit1);
        img = (ImageView) findViewById(R.id.imgView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rotate:
                img.setRotation(Integer.parseInt(edit1.getText().toString()));
                break;
            case R.id.jeju02:
                item.setChecked(true);
                img.setImageResource(R.drawable.jeju02);
                img.setVisibility(View.VISIBLE);
                break;
            case R.id.jeju06:
                item.setChecked(true);
                img.setImageResource(R.drawable.jeju06);
                img.setVisibility(View.VISIBLE);
                break;

            case R.id.jeju14:
                item.setChecked(true);
                img.setImageResource(R.drawable.jeju14);
                img.setVisibility(View.VISIBLE);
                break;

        }
        return true;
    }
}