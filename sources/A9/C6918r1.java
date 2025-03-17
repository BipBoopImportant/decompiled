package a9;

import d9.C7761g;
import d9.F;
import d9.d0;
import d9.k0;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.r1  reason: case insensitive filesystem */
public final class C6918r1 extends N {

    /* renamed from: b  reason: collision with root package name */
    public final long f42825b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42826c;

    public C6918r1(String str, long j10) {
        C17542s.j(str, "event");
        this.f42825b = j10;
        this.f42826c = str;
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        k0.a aVar = k0.f50803b;
        d0.a k10 = d0.k();
        C17542s.i(k10, "newBuilder()");
        k0 a11 = aVar.a(k10);
        a11.b(this.f42826c);
        a11.c(this.f42825b);
        a10.r(a11.a());
        return a10.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6918r1) {
            C6918r1 r1Var = (C6918r1) obj;
            return this.f42825b == r1Var.f42825b && C17542s.e(this.f42826c, r1Var.f42826c);
        }
    }

    public final int hashCode() {
        return Long.hashCode(this.f42825b) + ((this.f42826c.hashCode() + 31) * 31);
    }
}
