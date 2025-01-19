package edu.neu.madcourse.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button webButton;
    private View.OnClickListener webButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.v(TAG, "webButtonListener()");
            Toast.makeText(MainActivity.this, "Web Button Clicked", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener detailButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.v(TAG, "detailButtonListener()");
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            startActivity(intent);
        }
    };

    private Button detailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        webButton = findViewById(R.id.web_button_id);
        webButton.setOnClickListener(webButtonListener);

        detailButton = findViewById(R.id.detail_button);
        detailButton.setOnClickListener(detailButtonListener);

        TextView textView = findViewById(R.id.helloTVID);
        textView.setText("Hi, World");
    }



    @Override
    protected void onPause() {
        Log.v(TAG, "onPause()");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "onResume()");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.v(TAG, "onRestart()");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "onStop()");
        super.onStop();
    }
}