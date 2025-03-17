package R4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import nI.r;

public final /* synthetic */ class b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f39650a;

    public /* synthetic */ b(r rVar) {
        this.f39650a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return c.f(this.f39650a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
