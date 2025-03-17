package t9;

import android.database.sqlite.SQLiteDatabase;
import t9.M;

/* renamed from: t9.J  reason: case insensitive filesystem */
public final /* synthetic */ class C8850J implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f56675a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f56676b;

    public /* synthetic */ C8850J(M m10, long j10) {
        this.f56675a = m10;
        this.f56676b = j10;
    }

    public final Object apply(Object obj) {
        return this.f56675a.T0(this.f56676b, (SQLiteDatabase) obj);
    }
}
