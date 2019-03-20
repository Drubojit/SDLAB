package com.example.edittextwithtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2;
    private EditText text1,text2;
    private TextView text3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.addbutton);
        button2=(Button)findViewById(R.id.substractbutton);
        text1=(EditText)findViewById(R.id.edittext1);
        text2=(EditText)findViewById(R.id.edittext2);
        text3=(TextView)findViewById(R.id.resultText);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       try {
           String s1=  text1.getText().toString();
           String s2=text2.getText().toString();
           double number1=Double.parseDouble(s1);
           double number2=Double.parseDouble(s2);
           if(v.getId()==R.id.addbutton)
           {
               double result=number1+number2;
               text3.setText("Result is: "+result);

           }
           if(v.getId()==R.id.substractbutton)
           {
               double result=number1-number2;
               text3.setText("Result is: "+result);

           }

       }catch(Exception e)
       {
           Toast.makeText(MainActivity.this,"First Enter input",Toast.LENGTH_SHORT).show();
       }
    }
}
