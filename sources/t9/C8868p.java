package t9;

import android.database.sqlite.SQLiteDatabase;
import l9.p;
import t9.M;

/* renamed from: t9.p  reason: case insensitive filesystem */
public final /* synthetic */ class C8868p implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f56731a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f56732b;

    public /* synthetic */ C8868p(long j10, p pVar) {
        this.f56731a = j10;
        this.f56732b = pVar;
    }

    public final Object apply(Object obj) {
        return M.n2(this.f56731a, this.f56732b, (SQLiteDatabase) obj);
    }
}
