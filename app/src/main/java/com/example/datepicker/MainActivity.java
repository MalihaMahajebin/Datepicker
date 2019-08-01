package com.example.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     DatePicker datee;
     EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datee=findViewById(R.id.getdate);
        editText=findViewById(R.id.output);
    }

    public void date(View view) {
        String date=String.valueOf(datee.getDayOfMonth());
        String month=("/"+datee.getMonth());
        String year=("/"+datee.getYear());
        String s=date;
        s=s+month;
        s=s+year;
        editText.setText(s);
    }
}
