package t4;

import N3.r;
import t3.B;
import t3.H;
import t3.N;
import t4.L;

public final class E implements L {

    /* renamed from: a  reason: collision with root package name */
    private final D f56180a;

    /* renamed from: b  reason: collision with root package name */
    private final B f56181b = new B(32);

    /* renamed from: c  reason: collision with root package name */
    private int f56182c;

    /* renamed from: d  reason: collision with root package name */
    private int f56183d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56184e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f56185f;

    public E(D d10) {
        this.f56180a = d10;
    }

    public void a(B b10, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int f10 = z10 ? b10.f() + b10.H() : -1;
        if (this.f56185f) {
            if (z10) {
                this.f56185f = false;
                b10.W(f10);
                this.f56183d = 0;
            } else {
                return;
            }
        }
        while (b10.a() > 0) {
            int i11 = this.f56183d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int H10 = b10.H();
                    b10.W(b10.f() - 1);
                    if (H10 == 255) {
                        this.f56185f = true;
                        return;
                    }
                }
                int min = Math.min(b10.a(), 3 - this.f56183d);
                b10.l(this.f56181b.e(), this.f56183d, min);
                int i12 = this.f56183d + min;
                this.f56183d = i12;
                if (i12 == 3) {
                    this.f56181b.W(0);
                    this.f56181b.V(3);
                    this.f56181b.X(1);
                    int H11 = this.f56181b.H();
                    int H12 = this.f56181b.H();
                    this.f56184e = (H11 & 128) != 0;
                    this.f56182c = (((H11 & 15) << 8) | H12) + 3;
                    int b11 = this.f56181b.b();
                    int i13 = this.f56182c;
                    if (b11 < i13) {
                        this.f56181b.c(Math.min(4098, Math.max(i13, this.f56181b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(b10.a(), this.f56182c - this.f56183d);
                b10.l(this.f56181b.e(), this.f56183d, min2);
                int i14 = this.f56183d + min2;
                this.f56183d = i14;
                int i15 = this.f56182c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f56184e) {
                        this.f56181b.V(i15);
                    } else if (N.x(this.f56181b.e(), 0, this.f56182c, -1) != 0) {
                        this.f56185f = true;
                        return;
                    } else {
                        this.f56181b.V(this.f56182c - 4);
                    }
                    this.f56181b.W(0);
                    this.f56180a.a(this.f56181b);
                    this.f56183d = 0;
                }
            }
        }
    }

    public void b(H h10, r rVar, L.d dVar) {
        this.f56180a.b(h10, rVar, dVar);
        this.f56185f = true;
    }

    public void c() {
        this.f56185f = true;
    }
}
