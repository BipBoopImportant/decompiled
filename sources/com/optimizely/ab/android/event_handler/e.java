package com.optimizely.ab.android.event_handler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.slf4j.Logger;

class e extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final Logger f122295a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122296b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f122297c;

    e(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, Logger logger) {
        super(context, String.format("optly-events-%s", new Object[]{str}), cursorFactory, i10);
        this.f122295a = logger;
        this.f122296b = str;
        this.f122297c = context;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f122297c.deleteDatabase("optly-events");
            sQLiteDatabase.execSQL("CREATE TABLE event (_id INTEGER PRIMARY KEY, url TEXT NOT NULL,requestBody TEXT NOT NULL)");
            this.f122295a.info("Created event table with SQL: {}", (Object) "CREATE TABLE event (_id INTEGER PRIMARY KEY, url TEXT NOT NULL,requestBody TEXT NOT NULL)");
        } catch (Exception e10) {
            this.f122295a.error("Error creating optly-events table.", (Throwable) e10);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
