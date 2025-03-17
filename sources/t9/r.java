package t9;

import android.database.sqlite.SQLiteDatabase;
import o9.C8613c;
import t9.M;

public final /* synthetic */ class r implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f56734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8613c.b f56735b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f56736c;

    public /* synthetic */ r(String str, C8613c.b bVar, long j10) {
        this.f56734a = str;
        this.f56735b = bVar;
        this.f56736c = j10;
    }

    public final Object apply(Object obj) {
        return M.m2(this.f56734a, this.f56735b, this.f56736c, (SQLiteDatabase) obj);
    }
}
