package org.techtown.project8_4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("동물 선택 대화상자");

        imgPet = (ImageView) findViewById(R.id.ImgPet);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String[] versionArray = new String[]
                        {"강아지", "고양이", "말", "토끼"};
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("좋아하는 동물은?");
                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        switch (which)
                        {
                            case 0: getDrawable(R.drawable.dog);
                            imgPet.setVisibility(View.VISIBLE);
                            imgPet.setImageResource(R.drawable.dog);
                            break;
                            case 1:getDrawable(R.drawable.cat);
                                imgPet.setVisibility(View.VISIBLE);
                                imgPet.setImageResource(R.drawable.cat);
                            break;
                            case 2:getDrawable(R.drawable.horse);
                                imgPet.setVisibility(View.VISIBLE);
                                imgPet.setImageResource(R.drawable.horse);
                            break;
                            case 3:getDrawable(R.drawable.rabbit);
                                imgPet.setVisibility(View.VISIBLE);
                                imgPet.setImageResource(R.drawable.rabbit);
                            break;
                        }
                }
                        });

                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}
