package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private CheckBox checkbox1, checkbox2, checkbox3,checkbox4;
    TextView text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.donebutton);
        checkbox1=(CheckBox)findViewById(R.id.t1id);
        checkbox2=(CheckBox)findViewById(R.id.t2id);
        checkbox3=(CheckBox)findViewById(R.id.t3id);
        checkbox4=(CheckBox)findViewById(R.id.t4id);
        text=(TextView)findViewById(R.id.textview1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       StringBuilder s=new StringBuilder();
       if(checkbox1.isChecked())
       {
           String value=checkbox1.getText().toString();
           s.append(value +"  "+"is listed\n" );
       }
        if(checkbox2.isChecked())
        {
            String value=checkbox2.getText().toString();
            s.append(value +"  "+"is listed\n" );
        }
        if(checkbox3.isChecked())
        {
            String value=checkbox3.getText().toString();
            s.append(value +"  "+"is listed\n" );
        }
        if(checkbox4.isChecked())
        {
            String value=checkbox4.getText().toString();
            s.append(value +"  "+"is listed\n" );
        }
        text.setText(s);
    }
}
