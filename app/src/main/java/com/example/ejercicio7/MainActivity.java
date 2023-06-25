package com.example.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initListeners();
    }

    private void initListeners() {

    TextView text =findViewById(R.id.textView);
    EditText name= findViewById(R.id.editTextName);
    Button button = findViewById(R.id.floatingActionButton);


    //EditText name.setOnClickListener(new View.OnClickListener(){

    //Button floatingActionButton.setOnClickListener(new View.OnClickListener(){
      //  @Override
          //  public void onCLick(View v){
        }//


    private void showToast(){
        Toast.makeText(getBaseContext(), "Bienvenido Toast",Toast.LENGTH_LONG).show();


    }


}
