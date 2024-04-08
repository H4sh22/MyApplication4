package com.example.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button nextButton = findViewById(R.id.button3);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendOK(v);
            }
        });
    }

    public void sendOK(View view) {
        Intent intent = new Intent(this, NewActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.text);
        EditText editText3 = (EditText) findViewById(R.id.Text);
        String message = "Day: " + editText1.getText().toString() + ", Time: " + editText2.getText().toString() + ", Comments: " + editText3.getText().toString();
        intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
