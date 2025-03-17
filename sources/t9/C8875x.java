package t9;

import android.database.Cursor;
import java.util.List;
import l9.p;
import t9.M;

/* renamed from: t9.x  reason: case insensitive filesystem */
public final /* synthetic */ class C8875x implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f56743a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f56744b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f56745c;

    public /* synthetic */ C8875x(M m10, List list, p pVar) {
        this.f56743a = m10;
        this.f56744b = list;
        this.f56745c = pVar;
    }

    public final Object apply(Object obj) {
        return this.f56743a.N1(this.f56744b, this.f56745c, (Cursor) obj);
    }
}
