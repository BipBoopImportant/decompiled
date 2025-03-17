package a9;

import d9.C7761g;
import d9.C7768n;
import d9.F;
import d9.J;
import d9.Y;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

public final class S3 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final long f42276b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42277c;

    /* renamed from: d  reason: collision with root package name */
    public final Y f42278d;

    public S3(long j10, long j11, int i10, C9036b bVar) {
        C17542s.j(bVar, "insertionView");
        this.f42276b = j11;
        this.f42277c = i10;
        b(j10);
        this.f42278d = C6930s5.a(bVar);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7768n.a aVar = C7768n.f50809b;
        J.a m10 = J.m();
        C17542s.i(m10, "newBuilder()");
        C7768n a11 = aVar.a(m10);
        long j10 = this.f42276b;
        if (j10 != -1) {
            a11.c(j10);
        }
        int i10 = this.f42277c;
        if (i10 != -1) {
            a11.b(i10);
        }
        a11.d(a());
        a11.e(this.f42278d);
        a10.h(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
