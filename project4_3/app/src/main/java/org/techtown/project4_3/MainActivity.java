package org.techtown.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Edit1, Edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnExt;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");

        Edit1=(EditText) findViewById(R.id.Edit1);
        Edit2=(EditText) findViewById(R.id.Edit2);

        btnAdd=(Button) findViewById(R.id.BtnAdd);
        btnSub=(Button) findViewById(R.id.BtnSub);
        btnMul=(Button) findViewById(R.id.BtnMul);
        btnDiv=(Button) findViewById(R.id.BtnDiv);
        btnExt=(Button) findViewById(R.id.BtnExt);

        textResult=(TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if (num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력 값이 비었습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    result=Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력 값이 비었습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    result=Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if (num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력 값이 비었습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    result=Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                String zero="0";
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast=Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                } else if(num2.equals(zero)){
                    Toast myToast = Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    result=Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnExt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    result=Float.parseFloat(num1) % Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
    }
}
