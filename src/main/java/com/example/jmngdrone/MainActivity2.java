package com.example.jmngdrone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {

    PDFView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        user = (PDFView) findViewById(R.id.usermanual2);
        user.fromAsset("usermanual.pdf").load();
    }
}