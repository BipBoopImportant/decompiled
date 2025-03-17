package v3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import q3.x;
import t3.N;

public final class d {
    static {
        x.a("media3.database");
    }

    private static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        Cursor query;
        try {
            if (!N.l1(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", a(i10, str), (String) null, (String) null, (String) null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i11 = query.getInt(0);
            query.close();
            return i11;
        } catch (SQLException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        try {
            if (N.l1(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i10, str));
            }
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", (String) null, contentValues);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }
}
