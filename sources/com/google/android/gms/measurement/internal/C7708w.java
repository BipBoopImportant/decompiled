package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C7335k0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.w  reason: case insensitive filesystem */
public final class C7708w {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    static void b(C7607h2 h2Var, SQLiteDatabase sQLiteDatabase) {
        if (h2Var != null) {
            File file = new File(C7335k0.a().zza(sQLiteDatabase.getPath()));
            if (!file.setReadable(false, false)) {
                h2Var.J().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                h2Var.J().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                h2Var.J().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                h2Var.J().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    static void c(C7607h2 h2Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (h2Var != null) {
            if (!d(h2Var, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> a10 = a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                int length = split.length;
                int i10 = 0;
                while (i10 < length) {
                    String str4 = split[i10];
                    if (a10.remove(str4)) {
                        i10++;
                    } else {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                        if (!a10.remove(strArr[i11])) {
                            sQLiteDatabase.execSQL(strArr[i11 + 1]);
                        }
                    }
                }
                if (!a10.isEmpty()) {
                    h2Var.J().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a10));
                }
            } catch (SQLiteException e10) {
                h2Var.E().b("Failed to verify columns on table that was just created", str);
                throw e10;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    private static boolean d(C7607h2 h2Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (h2Var != null) {
            Cursor cursor = null;
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                query.close();
                return moveToFirst;
            } catch (SQLiteException e10) {
                h2Var.J().c("Error querying for table", str, e10);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }
}
