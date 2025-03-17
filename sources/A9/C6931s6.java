package a9;

import XH.t;
import d9.C7761g;
import d9.C7774u;
import d9.F;
import d9.S;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.s6  reason: case insensitive filesystem */
public final class C6931s6 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final C6987z6 f42855b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42856c;

    public C6931s6(long j10, C6987z6 z6Var, boolean z10) {
        C17542s.j(z6Var, "reason");
        this.f42855b = z6Var;
        this.f42856c = z10;
        b(j10);
    }

    public final F c() {
        S.b bVar;
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7774u.a aVar = C7774u.f50824b;
        S.a l10 = S.l();
        C17542s.i(l10, "newBuilder()");
        C7774u a11 = aVar.a(l10);
        a11.d(a());
        int ordinal = this.f42855b.ordinal();
        if (ordinal == 0) {
            bVar = S.b.START_REASON_REGULAR;
        } else if (ordinal == 1) {
            bVar = S.b.START_REASON_FORCED;
        } else {
            throw new t();
        }
        a11.c(bVar);
        a11.b(this.f42856c);
        a10.m(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
