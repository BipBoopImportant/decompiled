package x3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import t3.C5950a;
import v3.a;
import v3.b;
import v3.d;

final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f31906c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a  reason: collision with root package name */
    private final b f31907a;

    /* renamed from: b  reason: collision with root package name */
    private String f31908b;

    public f(b bVar) {
        this.f31907a = bVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor c() {
        C5950a.e(this.f31908b);
        return this.f31907a.getReadableDatabase().query(this.f31908b, f31906c, (String) null, (String[]) null, (String) null, (String) null, (String) null);
    }

    private static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map<String, e> b() {
        Cursor c10;
        try {
            c10 = c();
            HashMap hashMap = new HashMap(c10.getCount());
            while (c10.moveToNext()) {
                hashMap.put((String) C5950a.e(c10.getString(0)), new e(c10.getLong(1), c10.getLong(2)));
            }
            c10.close();
            return hashMap;
        } catch (SQLException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void e(long j10) {
        SQLiteDatabase writableDatabase;
        try {
            String hexString = Long.toHexString(j10);
            this.f31908b = d(hexString);
            if (d.b(this.f31907a.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = this.f31907a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                d.d(writableDatabase, 2, hexString, 1);
                a(writableDatabase, this.f31908b);
                writableDatabase.execSQL("CREATE TABLE " + this.f31908b + " " + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public void f(String str) {
        C5950a.e(this.f31908b);
        try {
            this.f31907a.getWritableDatabase().delete(this.f31908b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public void g(Set<String> set) {
        SQLiteDatabase writableDatabase;
        C5950a.e(this.f31908b);
        try {
            writableDatabase = this.f31907a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (String str : set) {
                writableDatabase.delete(this.f31908b, "name = ?", new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public void h(String str, long j10, long j11) {
        C5950a.e(this.f31908b);
        try {
            SQLiteDatabase writableDatabase = this.f31907a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f31908b, (String) null, contentValues);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }
}
