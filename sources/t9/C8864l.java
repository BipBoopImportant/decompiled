package t9;

import android.database.sqlite.SQLiteDatabase;
import t9.M;

/* renamed from: t9.l  reason: case insensitive filesystem */
public final /* synthetic */ class C8864l implements M.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f56726a;

    public /* synthetic */ C8864l(SQLiteDatabase sQLiteDatabase) {
        this.f56726a = sQLiteDatabase;
    }

    public final Object a() {
        return this.f56726a.beginTransaction();
    }
}
