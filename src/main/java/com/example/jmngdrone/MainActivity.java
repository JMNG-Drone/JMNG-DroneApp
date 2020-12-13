package com.example.jmngdrone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
    }

    public void sensors(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://cayenne.mydevices.com/cayenne/dashboard/lora/dd6dace0-1701-11ea-b301-fd142d6c1e6c"));
        startActivity(browserIntent);
    }

    public void website(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://miguelhertap82.wixsite.com/jmng"));
        startActivity(browserIntent);
    }


}