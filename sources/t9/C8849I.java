package t9;

import android.database.sqlite.SQLiteDatabase;
import l9.i;
import l9.p;
import t9.M;

/* renamed from: t9.I  reason: case insensitive filesystem */
public final /* synthetic */ class C8849I implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f56672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f56673b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f56674c;

    public /* synthetic */ C8849I(M m10, i iVar, p pVar) {
        this.f56672a = m10;
        this.f56673b = iVar;
        this.f56674c = pVar;
    }

    public final Object apply(Object obj) {
        return this.f56672a.U1(this.f56673b, this.f56674c, (SQLiteDatabase) obj);
    }
}
