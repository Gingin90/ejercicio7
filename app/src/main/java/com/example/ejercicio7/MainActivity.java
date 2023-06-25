package com.example.ejercicio7;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: inicio de la creacion ");

        initListeners();
    }

    private void initListeners() {

        TextView text = findViewById(R.id.textView);
        EditText name = findViewById(R.id.editTextName);
        FloatingActionButton flu = findViewById(R.id.floatingActionButton);
        CalendarView calendar= findViewById(R.id.calendarView);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        flu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });



        //CalendarView.OnDateChangeListener(){
           // onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth);

          //  public abstract void onDateChanged (DatePicker view,
            //int year, int monthOfYear, int dayOfMonth)//

        }
       // Toast.makeText(getBaseContext(), "Bienvenido Toast", Toast.LENGTH_LONG).show();
        }
    //});



// Projection array. Creating indices for this array instead of doing
// dynamic lookups improves performance.
//public static final String[] EVENT_PROJECTION = new String[] {
//        Calendars._ID,                           // 0
//        Calendars.ACCOUNT_NAME,                  // 1
 //       Calendars.CALENDAR_DISPLAY_NAME,         // 2
//        Calendars.OWNER_ACCOUNT                  // 3
 //       };)

// The indices for the projection array above.
//private static final int PROJECTION_ID_INDEX = 0;
//private static final int PROJECTION_ACCOUNT_NAME_INDEX = 1;
//private static final int PROJECTION_DISPLAY_NAME_INDEX = 2;
//private static final int PROJECTION_OWNER_ACCOUNT_INDEX = 3;