package com.example.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   private RatingBar ratingbar;
   private TextView textview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingbar=(RatingBar)findViewById(R.id.ratingbarid);
        textview=(TextView)findViewById(R.id.textviewid);
        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textview.setText("value: "+rating);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
