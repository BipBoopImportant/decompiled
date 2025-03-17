package androidx.camera.core.impl;

import C.B;
import C.C;
import C.C4402k;
import C.U;
import E.C4428k;
import I.n;
import android.graphics.Rect;
import androidx.camera.core.impl.X0;
import java.util.Collections;
import java.util.List;
import ob.C10101e;

public interface F extends C4402k {

    /* renamed from: a  reason: collision with root package name */
    public static final F f16734a = new b();

    class a implements C4428k {
        a() {
        }

        public C10101e<Void> a() {
            return n.p(null);
        }

        public C10101e<Void> b() {
            return n.p(null);
        }
    }

    class b implements F {
        b() {
        }

        public void b(X0.b bVar) {
        }

        public C10101e<Void> d(float f10) {
            return n.p(null);
        }

        public C10101e<List<Void>> e(List<V> list, int i10, int i11) {
            return n.p(Collections.emptyList());
        }

        public C10101e<Void> f(float f10) {
            return n.p(null);
        }

        public Rect g() {
            return new Rect();
        }

        public void h(int i10) {
        }

        public C10101e<Void> i(boolean z10) {
            return n.p(null);
        }

        public X j() {
            return null;
        }

        public C10101e<C> k(B b10) {
            return n.p(C.b());
        }

        public void n(X x10) {
        }

        public void p() {
        }
    }

    public static final class c extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private r f16736a;

        public c(r rVar) {
            this.f16736a = rVar;
        }
    }

    public interface d {
        void a();

        void b(List<V> list);
    }

    F a() {
        return this;
    }

    void b(X0.b bVar);

    void c() {
    }

    C10101e<List<Void>> e(List<V> list, int i10, int i11);

    Rect g();

    void h(int i10);

    X j();

    void l() {
    }

    void m(U.i iVar) {
    }

    void n(X x10);

    C10101e<C4428k> o(int i10, int i11) {
        return n.p(new a());
    }

    void p();
}
