package com.example.barcodeqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_gn_qr,btn_gn_qr2,btn_gn_bar,btn_sn_qr_bar_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_gn_bar = findViewById(R.id.btn_gn_bar);
        btn_gn_qr = findViewById(R.id.btn_gn_qr);
        btn_gn_qr2 = findViewById(R.id.btn_gn_qr_2);
        btn_sn_qr_bar_code = findViewById(R.id.btn_sn_qr_bar_code);

        btn_gn_qr.setOnClickListener(this);
        btn_gn_qr2.setOnClickListener(this);
        btn_gn_bar.setOnClickListener(this);
        btn_sn_qr_bar_code.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_gn_qr :
                startActivity(new Intent(MainActivity.this,QrCodeGenerator.class));
                break;
            case R.id.btn_gn_bar :
                startActivity(new Intent(MainActivity.this,BarCodeGenerator.class));
                break;
            case R.id.btn_sn_qr_bar_code :
                startActivity(new Intent(MainActivity.this, QrCodeBarCodeScanner.class));
                break;
            case R.id.btn_gn_qr_2 :
                startActivity(new Intent(MainActivity.this, QrCodeGenerator2.class));
                break;
        }
    }
}