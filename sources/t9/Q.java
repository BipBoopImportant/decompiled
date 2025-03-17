package t9;

import android.database.sqlite.SQLiteDatabase;
import t9.W;

public final /* synthetic */ class Q implements W.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
