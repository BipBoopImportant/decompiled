package C3;

import C3.t;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import y3.b;

/* renamed from: C3.m  reason: case insensitive filesystem */
public interface C6422m {

    /* renamed from: C3.m$a */
    public static class a extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f33662a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f33662a = i10;
        }
    }

    static void e(C6422m mVar, C6422m mVar2) {
        if (mVar != mVar2) {
            if (mVar2 != null) {
                mVar2.b((t.a) null);
            }
            if (mVar != null) {
                mVar.c((t.a) null);
            }
        }
    }

    UUID a();

    void b(t.a aVar);

    void c(t.a aVar);

    boolean d() {
        return false;
    }

    a f();

    b g();

    int getState();

    Map<String, String> h();

    boolean i(String str);
}
