package com.example.barcodeqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class QrCodeGenerator2 extends AppCompatActivity {
    private EditText editText;
    private ImageView imageView;
    private Button btn_bar;
    String qrText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code_generator2);

        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);
        btn_bar = findViewById(R.id.button_qr_gn);

        btn_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qrText = editText.getText().toString();
                Glide.with(QrCodeGenerator2.this).
                        load("https://api.qrserver.com/v1/create-qr-code/?size=200x200&data="+qrText)
                        .into(imageView);
            }
        });


    }
}