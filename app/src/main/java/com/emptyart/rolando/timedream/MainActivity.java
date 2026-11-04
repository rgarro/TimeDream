package com.emptyart.rolando.timedream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = (Button) findViewById(R.id.my_button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                String spinnerValue = spinner.getSelectedItem().toString();
                Log.d("beach", spinnerValue);
                //Intent intent = new Intent(MainActivity.this, WaveCountActivity.class);
                //intent.putExtra("surf_spot", spinnerValue);
                //startActivity(intent);
            }
        });
    }
}
