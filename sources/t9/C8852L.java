package t9;

import android.database.sqlite.SQLiteDatabase;
import t9.M;

/* renamed from: t9.L  reason: case insensitive filesystem */
public final /* synthetic */ class C8852L implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f56677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f56678b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f56679c;

    public /* synthetic */ C8852L(M m10, String str, String str2) {
        this.f56677a = m10;
        this.f56678b = str;
        this.f56679c = str2;
    }

    public final Object apply(Object obj) {
        return this.f56677a.e2(this.f56678b, this.f56679c, (SQLiteDatabase) obj);
    }
}
