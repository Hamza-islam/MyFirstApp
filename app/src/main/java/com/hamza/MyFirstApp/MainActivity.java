package com.hamza.MyFirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //<!-- TODO Initialize the variable -->

     myText = (TextView) findViewById(R.id.txt_app);
//     Facts myFacts = new Facts();
     String[] allFacts = Facts.getFacts();      // because  function is static
        int counter = 1;

     for(String fact : allFacts) {
       myText.append(counter++ + " . " +  fact + "\n\n");

     }

        }

    }