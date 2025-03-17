package com.optimizely.ab.android.event_handler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class c {

    /* renamed from: a  reason: collision with root package name */
    final Logger f122288a;

    /* renamed from: b  reason: collision with root package name */
    private final e f122289b;

    private c(e eVar, Logger logger) {
        this.f122289b = eVar;
        this.f122288a = logger;
    }

    static c c(Context context, String str, Logger logger) {
        return new c(new e(context, str, (SQLiteDatabase.CursorFactory) null, 1, LoggerFactory.getLogger((Class<?>) e.class)), logger);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            this.f122289b.close();
        } catch (Exception e10) {
            this.f122288a.warn("Error closing db.", (Throwable) e10);
        }
    }

    /* access modifiers changed from: package-private */
    public List<Pair<Long, a>> b() {
        LinkedList linkedList = new LinkedList();
        Cursor cursor = null;
        try {
            cursor = this.f122289b.getReadableDatabase().query("event", new String[]{"_id", "url", "requestBody"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            this.f122288a.info("Opened database");
        } catch (Exception e10) {
            this.f122288a.error("Failed to open database.", (Throwable) e10);
        }
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    do {
                        long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("url"));
                        try {
                            linkedList.add(new Pair(Long.valueOf(j10), new a(new URL(string), cursor.getString(cursor.getColumnIndexOrThrow("requestBody")))));
                        } catch (MalformedURLException e11) {
                            this.f122288a.error("Retrieved a malformed event from storage", (Throwable) e11);
                        }
                    } while (cursor.moveToNext());
                    this.f122288a.info("Got events from SQLite");
                }
            } catch (Exception e12) {
                this.f122288a.error("Error reading events db cursor", (Throwable) e12);
                if (!cursor.isClosed()) {
                    try {
                        cursor.close();
                        this.f122288a.info("Closed database");
                    } catch (Exception e13) {
                        this.f122288a.error("Error closing db cursor", (Throwable) e13);
                    }
                }
            } catch (Throwable th2) {
                if (!cursor.isClosed()) {
                    try {
                        cursor.close();
                        this.f122288a.info("Closed database");
                    } catch (Exception e14) {
                        this.f122288a.error("Error closing db cursor", (Throwable) e14);
                    }
                }
                throw th2;
            }
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
            this.f122288a.info("Closed database");
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    public boolean d(long j10) {
        try {
            int delete = this.f122289b.getWritableDatabase().delete("event", "_id = ?", new String[]{String.valueOf(j10)});
            if (delete > 0) {
                this.f122288a.info("Removed event with id {} from db", (Object) Long.valueOf(j10));
                return true;
            }
            this.f122288a.error("Tried to remove an event id {} that does not exist", (Object) Long.valueOf(j10));
            return delete > 0;
        } catch (Exception e10) {
            this.f122288a.error("Could not open db.", (Throwable) e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(a aVar) {
        this.f122288a.info("Inserting {} into db", (Object) aVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", aVar.b().toString());
        contentValues.put("requestBody", aVar.a());
        try {
            long insert = this.f122289b.getWritableDatabase().insert("event", (String) null, contentValues);
            this.f122288a.info("Inserted {} into db", (Object) aVar);
            return insert != -1;
        } catch (Exception e10) {
            this.f122288a.error("Error inserting Optimizely event into db.", (Throwable) e10);
            return false;
        }
    }
}
