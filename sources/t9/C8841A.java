package t9;

import android.database.Cursor;
import java.util.Map;
import o9.C8611a;
import t9.M;

/* renamed from: t9.A  reason: case insensitive filesystem */
public final /* synthetic */ class C8841A implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f56666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f56667b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8611a.C0887a f56668c;

    public /* synthetic */ C8841A(M m10, Map map, C8611a.C0887a aVar) {
        this.f56666a = m10;
        this.f56667b = map;
        this.f56668c = aVar;
    }

    public final Object apply(Object obj) {
        return this.f56666a.I1(this.f56667b, this.f56668c, (Cursor) obj);
    }
}
