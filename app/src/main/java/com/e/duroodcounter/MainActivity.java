package com.e.duroodcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView s;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s = (TextView) findViewById(R.id.t1);
    }

    public void plus(View view)
    {
        c++;
        s.setText(Integer.toString(c));
    }

    public void minus(View view)
    {
        c--;
        s.setText(Integer.toString(c));
    }

    public void reset(View view)
    {
        c=0;
        s.setText(Integer.toString(c));
    }

}
