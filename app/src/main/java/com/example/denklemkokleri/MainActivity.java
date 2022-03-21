package com.example.denklemkokleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_a, et_b, et_c;
    Button btn_Hesapla;
    TextView tv_Sonuc;

    Double delta,a,b,c, kok1, kok2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_a= (EditText) findViewById(R.id.et_a);
        et_b= (EditText) findViewById(R.id.et_b);
        et_c= (EditText) findViewById(R.id.et_c);

        btn_Hesapla = (Button) findViewById(R.id.btn_Hesapla);

        tv_Sonuc = (TextView) findViewById(R.id.tv_sonuc);

        btn_Hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a= Double.parseDouble(et_a.getText().toString());
                b = Double.parseDouble(et_b.getText().toString());
                c=Double.parseDouble(et_c.getText().toString());

                delta= Math.pow(b,2) - (4*a*c);

                if(delta<0)
                {
                    tv_Sonuc.setText("Reel kök yok");
                }
                else if(delta.equals(0))
                {
                   kok1 =-b/ (2*a);
                   tv_Sonuc.setText("Tek Kök Vardır. " + kok1 );
                }
                else
                {
                    kok1= (-b + Math.sqrt(delta)) / (2*a);
                    kok2= (-b - Math.sqrt(delta)) / (2*a);

                    tv_Sonuc.setText("İki Kök Vardır. " + kok1 + " - " + kok2);
                }

            }
        });




    }
}