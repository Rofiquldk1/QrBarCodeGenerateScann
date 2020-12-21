package com.example.barcodeqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BarCodeGenerator extends AppCompatActivity {
    private EditText editText;
    private ImageView imageView;
    private Button btn_bar;
    String barText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_code_generator);

        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);
        btn_bar = findViewById(R.id.button_bar);

        btn_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barText = editText.getText().toString();
                Glide.with(BarCodeGenerator.this).
                        load("https://bwipjs-api.metafloor.com/?bcid=code128&text="+barText)
                        .into(imageView);
            }
        });


    }
}