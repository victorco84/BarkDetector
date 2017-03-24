package com.dynamicvision.victorcortez.barkdetector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button start, stop; //defining button variables
    boolean detection;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.buttonStart);
        stop  = (Button) findViewById(R.id.buttonStop);

        start.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                detection = true;
                System.out.println("Start Detection"+ detection);
            }
        });

        stop.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                detection = false;
                System.out.println("Stop Detection"+ detection);

            }
        });
    }
}
