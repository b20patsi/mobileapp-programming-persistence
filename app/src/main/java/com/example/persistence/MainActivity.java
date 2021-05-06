package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;

    private Button readBtn;
    private Button writeBtn;
    private TextView textView;
    private EditText textName;
    private EditText textAge;
    private EditText textCity;

    private long addPeople() {
        ContentValues values = new ContentValues();
        values.put(DatabaseTable.People.COLUMN_NAME_NAME, String.valueOf(textName.getText()));
        values.put(DatabaseTable.People.COLUMN_NAME_AGE, String.valueOf(textAge.getText()));
        values.put(DatabaseTable.People.COLUMN_NAME_CITY, String.valueOf(textCity.getText()));
        Log.d("MainActivityAdd ==>", String.valueOf(textName.getText()) + ", " + String.valueOf(textAge.getText()) + ", " + String.valueOf(textCity.getText()));
        return database.insert(DatabaseTable.People.TABLE_NAME, null, values);
    }

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

        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            addPeople();
            Log.d("MainAcitivtyWrite ==>","Name: " + textName.getText() + ", Age: " + textAge.getText() + ", City: " + textCity.getText());
            textName.setText("");
            textAge.setText("");
            textCity.setText("");
            }
        });



    }
}
