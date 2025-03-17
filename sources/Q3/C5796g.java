package q3;

import java.util.List;
import kb.C9967v;
import q3.J;

/* renamed from: q3.g  reason: case insensitive filesystem */
public abstract class C5796g implements E {

    /* renamed from: a  reason: collision with root package name */
    protected final J.c f28128a = new J.c();

    protected C5796g() {
    }

    private int m0() {
        int b02 = b0();
        if (b02 == 1) {
            return 0;
        }
        return b02;
    }

    private void n0(int i10) {
        p0(-1, -9223372036854775807L, i10, false);
    }

    private void o0(int i10) {
        p0(Y(), -9223372036854775807L, i10, true);
    }

    private void q0(long j10, int i10) {
        p0(Y(), j10, i10, false);
    }

    private void r0(int i10, int i11) {
        p0(i10, -9223372036854775807L, i11, false);
    }

    private void s0(int i10) {
        int k02 = k0();
        if (k02 == -1) {
            n0(i10);
        } else if (k02 == Y()) {
            o0(i10);
        } else {
            r0(k02, i10);
        }
    }

    private void t0(long j10, int i10) {
        long h02 = h0() + j10;
        long a10 = a();
        if (a10 != -9223372036854775807L) {
            h02 = Math.min(h02, a10);
        }
        q0(Math.max(h02, 0), i10);
    }

    private void u0(int i10) {
        int l02 = l0();
        if (l02 == -1) {
            n0(i10);
        } else if (l02 == Y()) {
            o0(i10);
        } else {
            r0(l02, i10);
        }
    }

    public final void D() {
        if (z().q() || f()) {
            n0(9);
        } else if (s()) {
            s0(9);
        } else if (!j0() || !x()) {
            n0(9);
        } else {
            r0(Y(), 9);
        }
    }

    public final void F(int i10, long j10) {
        p0(i10, j10, 10, false);
    }

    public final long K() {
        J z10 = z();
        if (z10.q()) {
            return -9223372036854775807L;
        }
        return z10.n(Y(), this.f28128a).d();
    }

    public final void O(w wVar) {
        v0(C9967v.F(wVar));
    }

    public final boolean P() {
        return l0() != -1;
    }

    public final void R(long j10) {
        q0(j10, 5);
    }

    public final boolean U() {
        J z10 = z();
        return !z10.q() && z10.n(Y(), this.f28128a).f27932h;
    }

    public final boolean W() {
        return V() == 3 && H() && y() == 0;
    }

    public final void c() {
        q(false);
    }

    public final void e0() {
        t0(S(), 12);
    }

    public final void f0() {
        t0(-i0(), 11);
    }

    public final void i() {
        q(true);
    }

    public final void j(float f10) {
        g(e().b(f10));
    }

    public final boolean j0() {
        J z10 = z();
        return !z10.q() && z10.n(Y(), this.f28128a).f();
    }

    public final int k0() {
        J z10 = z();
        if (z10.q()) {
            return -1;
        }
        return z10.e(Y(), m0(), c0());
    }

    public final void l() {
        r0(Y(), 4);
    }

    public final int l0() {
        J z10 = z();
        if (z10.q()) {
            return -1;
        }
        return z10.l(Y(), m0(), c0());
    }

    public final void o() {
        if (z().q() || f()) {
            n0(7);
            return;
        }
        boolean P10 = P();
        if (!j0() || U()) {
            if (!P10 || h0() > J()) {
                q0(0, 7);
            } else {
                u0(7);
            }
        } else if (P10) {
            u0(7);
        } else {
            n0(7);
        }
    }

    public abstract void p0(int i10, long j10, int i11, boolean z10);

    public final boolean s() {
        return k0() != -1;
    }

    public final void v0(List<w> list) {
        m(list, true);
    }

    public final boolean w(int i10) {
        return G().b(i10);
    }

    public final boolean x() {
        J z10 = z();
        return !z10.q() && z10.n(Y(), this.f28128a).f27933i;
    }
}
