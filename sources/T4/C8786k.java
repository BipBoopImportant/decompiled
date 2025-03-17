package t4;

import N3.C6677o;
import N3.O;
import N3.r;
import java.util.concurrent.atomic.AtomicInteger;
import nb.C10076f;
import q3.C5803n;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.N;
import t4.L;

/* renamed from: t4.k  reason: case insensitive filesystem */
public final class C8786k implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final B f56320a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f56321b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private final String f56322c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56323d;

    /* renamed from: e  reason: collision with root package name */
    private String f56324e;

    /* renamed from: f  reason: collision with root package name */
    private O f56325f;

    /* renamed from: g  reason: collision with root package name */
    private int f56326g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f56327h;

    /* renamed from: i  reason: collision with root package name */
    private int f56328i;

    /* renamed from: j  reason: collision with root package name */
    private long f56329j;

    /* renamed from: k  reason: collision with root package name */
    private C5807s f56330k;

    /* renamed from: l  reason: collision with root package name */
    private int f56331l;

    /* renamed from: m  reason: collision with root package name */
    private int f56332m;

    /* renamed from: n  reason: collision with root package name */
    private int f56333n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f56334o = -1;

    /* renamed from: p  reason: collision with root package name */
    private long f56335p = -9223372036854775807L;

    public C8786k(String str, int i10, int i11) {
        this.f56320a = new B(new byte[i11]);
        this.f56322c = str;
        this.f56323d = i10;
    }

    private boolean b(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f56327h);
        b10.l(bArr, this.f56327h, min);
        int i11 = this.f56327h + min;
        this.f56327h = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] e10 = this.f56320a.e();
        if (this.f56330k == null) {
            C5807s h10 = C6677o.h(e10, this.f56324e, this.f56322c, this.f56323d, (C5803n) null);
            this.f56330k = h10;
            this.f56325f.e(h10);
        }
        this.f56331l = C6677o.b(e10);
        this.f56329j = (long) C10076f.d(N.Y0((long) C6677o.g(e10), this.f56330k.f28220E));
    }

    private void h() {
        C6677o.b i10 = C6677o.i(this.f56320a.e());
        k(i10);
        this.f56331l = i10.f38932d;
        long j10 = i10.f38933e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f56329j = j10;
    }

    private void i() {
        C6677o.b k10 = C6677o.k(this.f56320a.e(), this.f56321b);
        if (this.f56332m == 3) {
            k(k10);
        }
        this.f56331l = k10.f38932d;
        long j10 = k10.f38933e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f56329j = j10;
    }

    private boolean j(B b10) {
        while (b10.a() > 0) {
            int i10 = this.f56328i << 8;
            this.f56328i = i10;
            int H10 = i10 | b10.H();
            this.f56328i = H10;
            int c10 = C6677o.c(H10);
            this.f56332m = c10;
            if (c10 != 0) {
                byte[] e10 = this.f56320a.e();
                int i11 = this.f56328i;
                e10[0] = (byte) ((i11 >> 24) & 255);
                e10[1] = (byte) ((i11 >> 16) & 255);
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                this.f56327h = 4;
                this.f56328i = 0;
                return true;
            }
        }
        return false;
    }

    private void k(C6677o.b bVar) {
        int i10;
        int i11 = bVar.f38930b;
        if (i11 != -2147483647 && (i10 = bVar.f38931c) != -1) {
            C5807s sVar = this.f56330k;
            if (sVar == null || i10 != sVar.f28219D || i11 != sVar.f28220E || !N.d(bVar.f38929a, sVar.f28244o)) {
                C5807s sVar2 = this.f56330k;
                C5807s M10 = (sVar2 == null ? new C5807s.b() : sVar2.b()).e0(this.f56324e).s0(bVar.f38929a).Q(bVar.f38931c).t0(bVar.f38930b).i0(this.f56322c).q0(this.f56323d).M();
                this.f56330k = M10;
                this.f56325f.e(M10);
            }
        }
    }

    public void a(B b10) {
        C5950a.i(this.f56325f);
        while (b10.a() > 0) {
            switch (this.f56326g) {
                case 0:
                    if (j(b10)) {
                        int i10 = this.f56332m;
                        if (i10 != 3 && i10 != 4) {
                            if (i10 != 1) {
                                this.f56326g = 2;
                                break;
                            } else {
                                this.f56326g = 1;
                                break;
                            }
                        } else {
                            this.f56326g = 4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 1:
                    if (!b(b10, this.f56320a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.f56320a.W(0);
                        this.f56325f.a(this.f56320a, 18);
                        this.f56326g = 6;
                        break;
                    }
                case 2:
                    if (!b(b10, this.f56320a.e(), 7)) {
                        break;
                    } else {
                        this.f56333n = C6677o.j(this.f56320a.e());
                        this.f56326g = 3;
                        break;
                    }
                case 3:
                    if (!b(b10, this.f56320a.e(), this.f56333n)) {
                        break;
                    } else {
                        h();
                        this.f56320a.W(0);
                        this.f56325f.a(this.f56320a, this.f56333n);
                        this.f56326g = 6;
                        break;
                    }
                case 4:
                    if (!b(b10, this.f56320a.e(), 6)) {
                        break;
                    } else {
                        int l10 = C6677o.l(this.f56320a.e());
                        this.f56334o = l10;
                        int i11 = this.f56327h;
                        if (i11 > l10) {
                            int i12 = i11 - l10;
                            this.f56327h = i11 - i12;
                            b10.W(b10.f() - i12);
                        }
                        this.f56326g = 5;
                        break;
                    }
                case 5:
                    if (!b(b10, this.f56320a.e(), this.f56334o)) {
                        break;
                    } else {
                        i();
                        this.f56320a.W(0);
                        this.f56325f.a(this.f56320a, this.f56334o);
                        this.f56326g = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(b10.a(), this.f56331l - this.f56327h);
                    this.f56325f.a(b10, min);
                    int i13 = this.f56327h + min;
                    this.f56327h = i13;
                    if (i13 == this.f56331l) {
                        C5950a.g(this.f56335p != -9223372036854775807L);
                        this.f56325f.c(this.f56335p, this.f56332m == 4 ? 0 : 1, this.f56331l, 0, (O.a) null);
                        this.f56335p += this.f56329j;
                        this.f56326g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public void c() {
        this.f56326g = 0;
        this.f56327h = 0;
        this.f56328i = 0;
        this.f56335p = -9223372036854775807L;
        this.f56321b.set(0);
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56324e = dVar.b();
        this.f56325f = rVar.t(dVar.c(), 1);
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56335p = j10;
    }
}
