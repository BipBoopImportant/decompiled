package a9;

import G8.g;
import com.google.protobuf.C9575h;
import d9.C7761g;
import d9.F;
import d9.W;
import d9.b0;
import d9.g0;
import d9.j0;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

/* renamed from: a9.g4  reason: case insensitive filesystem */
public final class C6834g4 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final long f42578b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f42579c;

    public C6834g4(long j10, long j11, C9036b bVar) {
        C17542s.j(bVar, "updateViewLight");
        this.f42578b = j11;
        b(j10);
        C17542s.j(bVar, "viewLight");
        j0.a aVar = j0.f50799b;
        b0.a t10 = b0.t();
        C17542s.i(t10, "newBuilder()");
        j0 a10 = aVar.a(t10);
        a10.j(bVar.p());
        a10.k(bVar.q());
        a10.i(bVar.w());
        a10.g(bVar.l());
        String u10 = bVar.u();
        if (u10 != null) {
            a10.e(u10);
            byte[] k10 = bVar.k();
            if (k10 != null) {
                C9575h m10 = C9575h.m(k10);
                C17542s.i(m10, "copyFrom(encodeBitmap)");
                a10.d(m10);
            }
        } else {
            a10.c(g.o(bVar.g()));
        }
        a10.b(bVar.t());
        a10.h(bVar.E());
        a10.f(bVar.A());
        this.f42579c = a10.a();
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        g0.a aVar = g0.f50786b;
        W.a l10 = W.l();
        C17542s.i(l10, "newBuilder()");
        g0 a11 = aVar.a(l10);
        a11.c(a());
        a11.d(this.f42578b);
        a11.b(this.f42579c);
        a10.p(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
