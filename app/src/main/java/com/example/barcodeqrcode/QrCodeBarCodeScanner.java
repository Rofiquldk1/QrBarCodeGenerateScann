package com.example.barcodeqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QrCodeBarCodeScanner extends AppCompatActivity {
    private Button btn_scanner;
    public static TextView result_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code_bar_code_scanner);

        btn_scanner = findViewById(R.id.btn_scanner);
        result_textview = findViewById(R.id.result_text);

        btn_scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ScannCodeActivity.class));
            }
        });

    }
}