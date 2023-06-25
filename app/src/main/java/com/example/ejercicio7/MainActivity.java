package com.example.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    TextView text =findViewById(R.id.textView);
    EditText name= findViewById(R.id.editTextName);

    private void showToast(){
        Toast.makeText(getBaseContext(), "Hello Toast",Toast.LENGTH_LONG).show();


    }
}