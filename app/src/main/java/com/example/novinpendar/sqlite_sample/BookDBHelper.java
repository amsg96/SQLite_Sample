package com.example.novinpendar.sqlite_sample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by NovinPendar on 3/10/2018.
 */

public class BookDBHelper extends SQLiteOpenHelper {


    private static final String DBName = "Books";
    private static final int DBVersion = 1;

    private static final String tableName ="tblBook";



    private static final String cmdCreate = "CREATE  TABLE IF NOT EXISTS'"+ tableName +"' (" +
            "'"+BookModel.KEY_BookId+"' INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL," +
            "'"+BookModel.KEY_name+"' TEXT," +
            "'"+BookModel.KEY_price+"' NUMERIC" +
            ")";

    public BookDBHelper(Context context) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(cmdCreate);
        Log.i("database","Create!!!");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldversion, int newversion) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS"+tableName);
        Log.i("database","DELETE!!!");
        onCreate(sqLiteDatabase);


    }
}
