package i4;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.O;
import N3.r;
import N3.u;
import t3.B;
import t3.C5950a;

public class d implements C6678p {

    /* renamed from: d  reason: collision with root package name */
    public static final u f53092d = new c();

    /* renamed from: a  reason: collision with root package name */
    private r f53093a;

    /* renamed from: b  reason: collision with root package name */
    private i f53094b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53095c;

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] e() {
        return new C6678p[]{new d()};
    }

    private static B f(B b10) {
        b10.W(0);
        return b10;
    }

    private boolean g(C6679q qVar) {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.f53102b & 2) == 2) {
            int min = Math.min(fVar.f53109i, 8);
            B b10 = new B(min);
            qVar.o(b10.e(), 0, min);
            if (C8208b.p(f(b10))) {
                this.f53094b = new C8208b();
            } else if (j.r(f(b10))) {
                this.f53094b = new j();
            } else if (h.o(f(b10))) {
                this.f53094b = new h();
            }
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        i iVar = this.f53094b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    public void b(r rVar) {
        this.f53093a = rVar;
    }

    public boolean h(C6679q qVar) {
        try {
            return g(qVar);
        } catch (q3.B unused) {
            return false;
        }
    }

    public int j(C6679q qVar, I i10) {
        C5950a.i(this.f53093a);
        if (this.f53094b == null) {
            if (g(qVar)) {
                qVar.f();
            } else {
                throw q3.B.a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f53095c) {
            O t10 = this.f53093a.t(0, 1);
            this.f53093a.r();
            this.f53094b.d(this.f53093a, t10);
            this.f53095c = true;
        }
        return this.f53094b.g(qVar, i10);
    }

    public void release() {
    }
}
