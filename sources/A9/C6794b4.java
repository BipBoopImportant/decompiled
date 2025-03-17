package a9;

import d9.C7761g;
import d9.C7775v;
import d9.F;
import d9.U;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.b4  reason: case insensitive filesystem */
public final class C6794b4 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final long f42469b;

    public C6794b4(long j10, long j11) {
        this.f42469b = j11;
        b(j10);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7775v.a aVar = C7775v.f50826b;
        U.a k10 = U.k();
        C17542s.i(k10, "newBuilder()");
        C7775v a11 = aVar.a(k10);
        a11.b(a());
        a11.c(this.f42469b);
        a10.n(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
