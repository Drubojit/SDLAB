package com.example.imagewithimagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   ImageView view1,view2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1=findViewById(R.id.imageview1id);
        view2=findViewById(R.id.imageview2id);
        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      if(v.getId()==R.id.imageview1id)
      {
          Toast.makeText(MainActivity.this,"BMW",Toast.LENGTH_SHORT).show();
      }
        if(v.getId()==R.id.imageview2id)
        {
            Toast.makeText(MainActivity.this,"Lamborghini",Toast.LENGTH_SHORT).show();
        }
    }
}
