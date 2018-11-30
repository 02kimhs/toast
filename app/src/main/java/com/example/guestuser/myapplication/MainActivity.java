package com.example.guestuser.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Toast toast;
    Button button2;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button1.setOnClickListener(this);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        count = 0;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            if(toast != null){
                toast.cancel();
            }
            toast=Toast.makeText(getApplicationContext(), "hello^^"+count, Toast.LENGTH_SHORT);
            count += 1;
            toast.show();
        }
        if (v.getId() == R.id.button2) {
            toast.cancel();
            count = 0;
        }
    }
}

