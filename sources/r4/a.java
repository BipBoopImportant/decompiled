package R4;

import Q4.j;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f39649a;

    public /* synthetic */ a(j jVar) {
        this.f39649a = jVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return c.g(this.f39649a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
