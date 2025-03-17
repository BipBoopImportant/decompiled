package a9;

import XH.t;
import d9.C7755a;
import d9.C7761g;
import d9.C7778y;
import d9.F;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.i4  reason: case insensitive filesystem */
public final class C6850i4 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final U3 f42610b;

    public C6850i4(long j10, U3 u32) {
        C17542s.j(u32, "srAppState");
        this.f42610b = u32;
        b(j10);
    }

    public final F c() {
        C7778y.b bVar;
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7755a.C0829a aVar = C7755a.f50772b;
        C7778y.a k10 = C7778y.k();
        C17542s.i(k10, "newBuilder()");
        C7755a a11 = aVar.a(k10);
        a11.c(a());
        int ordinal = this.f42610b.ordinal();
        if (ordinal == 0) {
            bVar = C7778y.b.TRANSITION_BACKGROUND;
        } else if (ordinal == 1) {
            bVar = C7778y.b.TRANSITION_FOREGROUND;
        } else {
            throw new t();
        }
        a11.b(bVar);
        a10.b(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
