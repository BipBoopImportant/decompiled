package a9;

import d9.C7760f;
import d9.C7761g;
import d9.D;
import d9.F;
import kotlin.jvm.internal.C17542s;

public final class M4 extends C6921r4 {
    public M4(long j10) {
        b(j10);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7760f.a aVar = C7760f.f50782b;
        D.a j10 = D.j();
        C17542s.i(j10, "newBuilder()");
        C7760f a11 = aVar.a(j10);
        a11.b(a());
        a10.f(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
