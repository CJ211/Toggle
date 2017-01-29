package com.example.toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView sampleImage;
    Button show,hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleImage = (ImageView)findViewById(R.id.imageView);
        show = (Button)findViewById(R.id.button5);
        hide = (Button)findViewById(R.id.button4);

        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sampleImage.setVisibility(View.INVISIBLE);
                hide.setVisibility(View.INVISIBLE);
                show.setVisibility(View.VISIBLE);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sampleImage.setVisibility(View.VISIBLE);
                show.setVisibility(View.INVISIBLE);
                hide.setVisibility(View.VISIBLE);
            }
        });

    }
}


