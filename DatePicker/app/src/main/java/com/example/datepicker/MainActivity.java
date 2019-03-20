package com.example.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textview;
    private Button button;
    private DatePicker datepicker;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=(TextView)findViewById(R.id.textviewid);
        button=(Button)findViewById(R.id.datebuttonid);
        datepicker=(DatePicker) findViewById(R.id.datepickerid);
        button.setOnClickListener(this);
        textview.setText(currentdate());
    }
    String currentdate()
    {
        StringBuilder s=new StringBuilder();
        s.append("Date: "+datepicker.getDayOfMonth()+"/"+(datepicker.getMonth()+1)+"/"+datepicker.getYear());
        return s.toString();
    }

    @Override
    public void onClick(View v) {
        textview.setText(currentdate());
    }
}
