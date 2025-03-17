package V;

import V.C4919d;
import V.i0;
import android.annotation.SuppressLint;

/* renamed from: V.k  reason: case insensitive filesystem */
public abstract class C4926k {

    /* renamed from: V.k$a */
    public static abstract class a {
        a() {
        }

        public abstract C4926k a();

        public a b(H2.a<i0.a> aVar) {
            i0.a f10 = c().f();
            aVar.accept(f10);
            f(f10.a());
            return this;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"KotlinPropertyAccess"})
        public abstract i0 c();

        public abstract a d(C4916a aVar);

        public abstract a e(int i10);

        public abstract a f(i0 i0Var);
    }

    C4926k() {
    }

    public static a a() {
        return new C4919d.b().e(-1).d(C4916a.a().a()).f(i0.a().a());
    }

    static int e(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    public static String f(int i10) {
        return i10 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    public abstract C4916a b();

    public abstract int c();

    public abstract i0 d();

    public abstract a g();
}
