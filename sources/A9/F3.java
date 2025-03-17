package a9;

import d9.C7761g;
import d9.C7776w;
import d9.F;
import d9.V;
import kotlin.jvm.internal.C17542s;

public final class F3 extends C6921r4 {
    public F3(long j10) {
        b(j10);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7776w.a aVar = C7776w.f50828b;
        V.a j10 = V.j();
        C17542s.i(j10, "newBuilder()");
        C7776w a11 = aVar.a(j10);
        a11.b(a());
        a10.o(a11.a());
        return a10.a();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
