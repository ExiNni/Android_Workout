package org.techtown.lotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private Button btnStart;
    private Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.startButton);
        btnReset = findViewById(R.id.stopButton);

        btnStart.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    private void generateLottoNumbers() {
        for (int i = 0; i < 5; i++) {
            int[] numbers = new int[6];
            for (int j = 0; j < 6; j++) {
                numbers[j] = (int) (Math.random() * 45 + 1);
                for (int k = 0; k < j; k++) {
                    if (numbers[j] == numbers[k]) {
                        j--;
                        break;
                    }
                }
            }
            Arrays.sort(numbers);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 6; j++) {
                sb.append(numbers[j]).append(" ");
            }
            String result = sb.toString().trim();
            Log.d(TAG, "generateLottoNumbers: " + result);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startButton:
                generateLottoNumbers();
                break;
            case R.id.stopButton:
                // reset code here
                break;
            default:
                break;
        }
    }
}