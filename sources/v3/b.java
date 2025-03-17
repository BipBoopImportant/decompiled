package v3;

import android.database.sqlite.SQLiteDatabase;

public interface b {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
