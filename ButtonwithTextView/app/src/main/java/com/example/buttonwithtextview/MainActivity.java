package com.example.buttonwithtextview;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button enterButton;
    private TextView textview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterButton=(Button)findViewById(R.id.button1);
        textview=(TextView)findViewById(R.id.textview1);
        enterButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        textview.setText("Welcome Drubojit Saha");
    }
}
