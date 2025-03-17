package androidx.media3.exoplayer;

import A3.v1;
import G3.C6479C;
import G3.a0;
import androidx.media3.exoplayer.s0;
import q3.C5807s;
import q3.J;
import t3.C5953d;
import z3.F;
import z3.H;

public interface u0 extends s0.b {

    public interface a {
        void a();

        void b();
    }

    void A(int i10, v1 v1Var, C5953d dVar);

    boolean D();

    void E(H h10, C5807s[] sVarArr, a0 a0Var, long j10, boolean z10, boolean z11, long j11, long j12, C6479C.b bVar);

    long H(long j10, long j11) {
        return 10000;
    }

    v0 J();

    void M(float f10, float f11) {
    }

    long P();

    void Q(long j10);

    F R();

    void a();

    void c();

    boolean d();

    boolean f();

    String getName();

    int getState();

    void h() {
    }

    int i();

    a0 j();

    void k(long j10, long j11);

    void m(J j10);

    boolean n();

    void q();

    void release() {
    }

    void start();

    void stop();

    void y(C5807s[] sVarArr, a0 a0Var, long j10, long j11, C6479C.b bVar);

    void z();
}
