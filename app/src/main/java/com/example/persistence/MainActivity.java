package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;

    private Button readBtn;
    private Button writeBtn;
    private TextView textView;
    private EditText textName;
    private EditText textAge;
    private EditText textCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();

        readBtn=findViewById(R.id.read);
        writeBtn=findViewById(R.id.write);
        textView=findViewById(R.id.read_text);
        textName=findViewById(R.id.name);
        textAge=findViewById(R.id.age);
        textCity=findViewById(R.id.city);
    }
}
