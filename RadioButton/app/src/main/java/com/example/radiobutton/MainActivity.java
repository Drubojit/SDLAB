package com.example.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup radiogroup;
    private Button button;
    private TextView textview;
    private RadioButton rbutton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup=(RadioGroup)findViewById(R.id.radiogroupid);
        button=(Button)findViewById(R.id.donebutton);
        textview=findViewById(R.id.textviewid);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
              int select=radiogroup.getCheckedRadioButtonId();
              rbutton=(RadioButton) findViewById(select);
              textview.setText("Department: "+rbutton.getText().toString());
    }
}
