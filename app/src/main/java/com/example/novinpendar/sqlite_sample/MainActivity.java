package com.example.novinpendar.sqlite_sample;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    BookDBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new BookDBHelper(this);

        SQLiteDatabase database = dbHelper.getWritableDatabase();
        Log.i("database", "Open!!!");

        if (database.isOpen()) {
            database.close();
            Log.i("database", "Close!!!");

        }


    }
}
