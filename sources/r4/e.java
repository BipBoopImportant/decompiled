package R4;

import Q4.h;
import R4.d;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class e implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f39677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.b f39678b;

    public /* synthetic */ e(h.a aVar, d.b bVar) {
        this.f39677a = aVar;
        this.f39678b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        d.c.d(this.f39677a, this.f39678b, sQLiteDatabase);
    }
}
