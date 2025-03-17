package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.K;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j  reason: case insensitive filesystem */
final class C9527j implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final C9526i f68022a;

    /* renamed from: b  reason: collision with root package name */
    private int f68023b;

    /* renamed from: c  reason: collision with root package name */
    private int f68024c;

    /* renamed from: d  reason: collision with root package name */
    private int f68025d = 0;

    private C9527j(C9526i iVar) {
        C9526i iVar2 = (C9526i) A.b(iVar, "input");
        this.f68022a = iVar2;
        iVar2.f68003d = this;
    }

    public static C9527j Q(C9526i iVar) {
        C9527j jVar = iVar.f68003d;
        return jVar != null ? jVar : new C9527j(iVar);
    }

    private <T> void R(T t10, h0<T> h0Var, C9533p pVar) {
        int i10 = this.f68024c;
        this.f68024c = u0.c(u0.a(this.f68023b), 4);
        try {
            h0Var.i(t10, this, pVar);
            if (this.f68023b != this.f68024c) {
                throw B.h();
            }
        } finally {
            this.f68024c = i10;
        }
    }

    private <T> void S(T t10, h0<T> h0Var, C9533p pVar) {
        int C10 = this.f68022a.C();
        C9526i iVar = this.f68022a;
        if (iVar.f68000a < iVar.f68001b) {
            int l10 = iVar.l(C10);
            this.f68022a.f68000a++;
            h0Var.i(t10, this, pVar);
            this.f68022a.a(0);
            C9526i iVar2 = this.f68022a;
            iVar2.f68000a--;
            iVar2.k(l10);
            return;
        }
        throw B.i();
    }

    private <T> T T(h0<T> h0Var, C9533p pVar) {
        T e10 = h0Var.e();
        R(e10, h0Var, pVar);
        h0Var.f(e10);
        return e10;
    }

    private <T> T U(h0<T> h0Var, C9533p pVar) {
        T e10 = h0Var.e();
        S(e10, h0Var, pVar);
        h0Var.f(e10);
        return e10;
    }

    private void W(int i10) {
        if (this.f68022a.d() != i10) {
            throw B.m();
        }
    }

    private void X(int i10) {
        if (u0.b(this.f68023b) != i10) {
            throw B.e();
        }
    }

    private void Y(int i10) {
        if ((i10 & 3) != 0) {
            throw B.h();
        }
    }

    private void Z(int i10) {
        if ((i10 & 7) != 0) {
            throw B.h();
        }
    }

    public int A() {
        int i10 = this.f68025d;
        if (i10 != 0) {
            this.f68023b = i10;
            this.f68025d = 0;
        } else {
            this.f68023b = this.f68022a.B();
        }
        int i11 = this.f68023b;
        if (i11 == 0 || i11 == this.f68024c) {
            return Integer.MAX_VALUE;
        }
        return u0.a(i11);
    }

    public void B(List<String> list) {
        V(list, false);
    }

    public void C(List<Float> list) {
        int B10;
        int B11;
        if (list instanceof C9539w) {
            C9539w wVar = (C9539w) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 2) {
                int C10 = this.f68022a.C();
                Y(C10);
                int d10 = this.f68022a.d() + C10;
                do {
                    wVar.k(this.f68022a.s());
                } while (this.f68022a.d() < d10);
            } else if (b10 == 5) {
                do {
                    wVar.k(this.f68022a.s());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 2) {
                int C11 = this.f68022a.C();
                Y(C11);
                int d11 = this.f68022a.d() + C11;
                do {
                    list.add(Float.valueOf(this.f68022a.s()));
                } while (this.f68022a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f68022a.s()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else {
                throw B.e();
            }
        }
    }

    public boolean D() {
        int i10;
        if (this.f68022a.e() || (i10 = this.f68023b) == this.f68024c) {
            return false;
        }
        return this.f68022a.E(i10);
    }

    public int E() {
        X(5);
        return this.f68022a.v();
    }

    public void F(List<C9525h> list) {
        int B10;
        if (u0.b(this.f68023b) == 2) {
            do {
                list.add(o());
                if (!this.f68022a.e()) {
                    B10 = this.f68022a.B();
                } else {
                    return;
                }
            } while (B10 == this.f68023b);
            this.f68025d = B10;
            return;
        }
        throw B.e();
    }

    public void G(List<Double> list) {
        int B10;
        int B11;
        if (list instanceof C9530m) {
            C9530m mVar = (C9530m) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 1) {
                do {
                    mVar.k(this.f68022a.o());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int C10 = this.f68022a.C();
                Z(C10);
                int d10 = this.f68022a.d() + C10;
                do {
                    mVar.k(this.f68022a.o());
                } while (this.f68022a.d() < d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f68022a.o()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int C11 = this.f68022a.C();
                Z(C11);
                int d11 = this.f68022a.d() + C11;
                do {
                    list.add(Double.valueOf(this.f68022a.o()));
                } while (this.f68022a.d() < d11);
            } else {
                throw B.e();
            }
        }
    }

    public long H() {
        X(0);
        return this.f68022a.u();
    }

    public String I() {
        X(2);
        return this.f68022a.A();
    }

    public <T> void J(T t10, h0<T> h0Var, C9533p pVar) {
        X(3);
        R(t10, h0Var, pVar);
    }

    @Deprecated
    public <T> T K(Class<T> cls, C9533p pVar) {
        X(3);
        return T(d0.a().c(cls), pVar);
    }

    public <K, V> void L(Map<K, V> map, K.a<K, V> aVar, C9533p pVar) {
        X(2);
        this.f68022a.l(this.f68022a.C());
        throw null;
    }

    public <T> void M(T t10, h0<T> h0Var, C9533p pVar) {
        X(2);
        S(t10, h0Var, pVar);
    }

    public <T> void N(List<T> list, h0<T> h0Var, C9533p pVar) {
        int B10;
        if (u0.b(this.f68023b) == 2) {
            int i10 = this.f68023b;
            do {
                list.add(U(h0Var, pVar));
                if (!this.f68022a.e() && this.f68025d == 0) {
                    B10 = this.f68022a.B();
                } else {
                    return;
                }
            } while (B10 == i10);
            this.f68025d = B10;
            return;
        }
        throw B.e();
    }

    public <T> T O(Class<T> cls, C9533p pVar) {
        X(2);
        return U(d0.a().c(cls), pVar);
    }

    @Deprecated
    public <T> void P(List<T> list, h0<T> h0Var, C9533p pVar) {
        int B10;
        if (u0.b(this.f68023b) == 3) {
            int i10 = this.f68023b;
            do {
                list.add(T(h0Var, pVar));
                if (!this.f68022a.e() && this.f68025d == 0) {
                    B10 = this.f68022a.B();
                } else {
                    return;
                }
            } while (B10 == i10);
            this.f68025d = B10;
            return;
        }
        throw B.e();
    }

    public void V(List<String> list, boolean z10) {
        int B10;
        int B11;
        if (u0.b(this.f68023b) != 2) {
            throw B.e();
        } else if (!(list instanceof G) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (!this.f68022a.e()) {
                    B10 = this.f68022a.B();
                } else {
                    return;
                }
            } while (B10 == this.f68023b);
            this.f68025d = B10;
        } else {
            G g10 = (G) list;
            do {
                g10.O2(o());
                if (!this.f68022a.e()) {
                    B11 = this.f68022a.B();
                } else {
                    return;
                }
            } while (B11 == this.f68023b);
            this.f68025d = B11;
        }
    }

    public int a() {
        return this.f68023b;
    }

    public long b() {
        X(1);
        return this.f68022a.r();
    }

    public void c(List<Integer> list) {
        int B10;
        int B11;
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 2) {
                int C10 = this.f68022a.C();
                Y(C10);
                int d10 = this.f68022a.d() + C10;
                do {
                    zVar.P1(this.f68022a.v());
                } while (this.f68022a.d() < d10);
            } else if (b10 == 5) {
                do {
                    zVar.P1(this.f68022a.v());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 2) {
                int C11 = this.f68022a.C();
                Y(C11);
                int d11 = this.f68022a.d() + C11;
                do {
                    list.add(Integer.valueOf(this.f68022a.v()));
                } while (this.f68022a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f68022a.v()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else {
                throw B.e();
            }
        }
    }

    public void d(List<Long> list) {
        int B10;
        int B11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    i10.m(this.f68022a.y());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    i10.m(this.f68022a.y());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f68022a.y()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Long.valueOf(this.f68022a.y()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public boolean e() {
        X(0);
        return this.f68022a.m();
    }

    public long f() {
        X(1);
        return this.f68022a.w();
    }

    public void g(List<Long> list) {
        int B10;
        int B11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    i10.m(this.f68022a.D());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    i10.m(this.f68022a.D());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f68022a.D()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Long.valueOf(this.f68022a.D()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public int h() {
        X(0);
        return this.f68022a.C();
    }

    public void i(List<Long> list) {
        int B10;
        int B11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    i10.m(this.f68022a.u());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    i10.m(this.f68022a.u());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f68022a.u()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Long.valueOf(this.f68022a.u()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public void j(List<Integer> list) {
        int B10;
        int B11;
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    zVar.P1(this.f68022a.p());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    zVar.P1(this.f68022a.p());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68022a.p()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Integer.valueOf(this.f68022a.p()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public int k() {
        X(0);
        return this.f68022a.p();
    }

    public int l() {
        X(0);
        return this.f68022a.x();
    }

    public void m(List<Boolean> list) {
        int B10;
        int B11;
        if (list instanceof C9523f) {
            C9523f fVar = (C9523f) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    fVar.m(this.f68022a.m());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    fVar.m(this.f68022a.m());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f68022a.m()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Boolean.valueOf(this.f68022a.m()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public void n(List<String> list) {
        V(list, true);
    }

    public C9525h o() {
        X(2);
        return this.f68022a.n();
    }

    public int p() {
        X(0);
        return this.f68022a.t();
    }

    public void q(List<Long> list) {
        int B10;
        int B11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 1) {
                do {
                    i10.m(this.f68022a.r());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int C10 = this.f68022a.C();
                Z(C10);
                int d10 = this.f68022a.d() + C10;
                do {
                    i10.m(this.f68022a.r());
                } while (this.f68022a.d() < d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f68022a.r()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int C11 = this.f68022a.C();
                Z(C11);
                int d11 = this.f68022a.d() + C11;
                do {
                    list.add(Long.valueOf(this.f68022a.r()));
                } while (this.f68022a.d() < d11);
            } else {
                throw B.e();
            }
        }
    }

    public void r(List<Integer> list) {
        int B10;
        int B11;
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    zVar.P1(this.f68022a.x());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    zVar.P1(this.f68022a.x());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68022a.x()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Integer.valueOf(this.f68022a.x()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public double readDouble() {
        X(1);
        return this.f68022a.o();
    }

    public float readFloat() {
        X(5);
        return this.f68022a.s();
    }

    public long s() {
        X(0);
        return this.f68022a.D();
    }

    public void t(List<Integer> list) {
        int B10;
        int B11;
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    zVar.P1(this.f68022a.C());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    zVar.P1(this.f68022a.C());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68022a.C()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Integer.valueOf(this.f68022a.C()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public int u() {
        X(5);
        return this.f68022a.q();
    }

    public void v(List<Long> list) {
        int B10;
        int B11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 1) {
                do {
                    i10.m(this.f68022a.w());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int C10 = this.f68022a.C();
                Z(C10);
                int d10 = this.f68022a.d() + C10;
                do {
                    i10.m(this.f68022a.w());
                } while (this.f68022a.d() < d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f68022a.w()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int C11 = this.f68022a.C();
                Z(C11);
                int d11 = this.f68022a.d() + C11;
                do {
                    list.add(Long.valueOf(this.f68022a.w()));
                } while (this.f68022a.d() < d11);
            } else {
                throw B.e();
            }
        }
    }

    public void w(List<Integer> list) {
        int B10;
        int B11;
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 0) {
                do {
                    zVar.P1(this.f68022a.t());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else if (b10 == 2) {
                int d10 = this.f68022a.d() + this.f68022a.C();
                do {
                    zVar.P1(this.f68022a.t());
                } while (this.f68022a.d() < d10);
                W(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68022a.t()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else if (b11 == 2) {
                int d11 = this.f68022a.d() + this.f68022a.C();
                do {
                    list.add(Integer.valueOf(this.f68022a.t()));
                } while (this.f68022a.d() < d11);
                W(d11);
            } else {
                throw B.e();
            }
        }
    }

    public void x(List<Integer> list) {
        int B10;
        int B11;
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            int b10 = u0.b(this.f68023b);
            if (b10 == 2) {
                int C10 = this.f68022a.C();
                Y(C10);
                int d10 = this.f68022a.d() + C10;
                do {
                    zVar.P1(this.f68022a.q());
                } while (this.f68022a.d() < d10);
            } else if (b10 == 5) {
                do {
                    zVar.P1(this.f68022a.q());
                    if (!this.f68022a.e()) {
                        B11 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B11 == this.f68023b);
                this.f68025d = B11;
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f68023b);
            if (b11 == 2) {
                int C11 = this.f68022a.C();
                Y(C11);
                int d11 = this.f68022a.d() + C11;
                do {
                    list.add(Integer.valueOf(this.f68022a.q()));
                } while (this.f68022a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f68022a.q()));
                    if (!this.f68022a.e()) {
                        B10 = this.f68022a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f68023b);
                this.f68025d = B10;
            } else {
                throw B.e();
            }
        }
    }

    public long y() {
        X(0);
        return this.f68022a.y();
    }

    public String z() {
        X(2);
        return this.f68022a.z();
    }
}
