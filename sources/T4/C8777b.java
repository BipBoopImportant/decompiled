package t4;

import N3.C6664b;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.r;
import N3.u;
import t3.B;
import t4.L;

/* renamed from: t4.b  reason: case insensitive filesystem */
public final class C8777b implements C6678p {

    /* renamed from: d  reason: collision with root package name */
    public static final u f56247d = new C8776a();

    /* renamed from: a  reason: collision with root package name */
    private final C8778c f56248a = new C8778c();

    /* renamed from: b  reason: collision with root package name */
    private final B f56249b = new B(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f56250c;

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] e() {
        return new C6678p[]{new C8777b()};
    }

    public void a(long j10, long j11) {
        this.f56250c = false;
        this.f56248a.c();
    }

    public void b(r rVar) {
        this.f56248a.d(rVar, new L.d(0, 1));
        rVar.r();
        rVar.n(new J.b(-9223372036854775807L));
    }

    public boolean h(C6679q qVar) {
        B b10 = new B(10);
        int i10 = 0;
        while (true) {
            qVar.o(b10.e(), 0, 10);
            b10.W(0);
            if (b10.K() != 4801587) {
                break;
            }
            b10.X(3);
            int G10 = b10.G();
            i10 += G10 + 10;
            qVar.i(G10);
        }
        qVar.f();
        qVar.i(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.o(b10.e(), 0, 6);
            b10.W(0);
            if (b10.P() != 2935) {
                qVar.f();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.i(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int g10 = C6664b.g(b10.e());
                if (g10 == -1) {
                    return false;
                }
                qVar.i(g10 - 6);
            }
        }
    }

    public int j(C6679q qVar, I i10) {
        int c10 = qVar.c(this.f56249b.e(), 0, 2786);
        if (c10 == -1) {
            return -1;
        }
        this.f56249b.W(0);
        this.f56249b.V(c10);
        if (!this.f56250c) {
            this.f56248a.f(0, 4);
            this.f56250c = true;
        }
        this.f56248a.a(this.f56249b);
        return 0;
    }

    public void release() {
    }
}
