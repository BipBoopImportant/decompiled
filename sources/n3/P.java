package N3;

import N3.O;
import t3.C5950a;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f38781a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f38782b;

    /* renamed from: c  reason: collision with root package name */
    private int f38783c;

    /* renamed from: d  reason: collision with root package name */
    private long f38784d;

    /* renamed from: e  reason: collision with root package name */
    private int f38785e;

    /* renamed from: f  reason: collision with root package name */
    private int f38786f;

    /* renamed from: g  reason: collision with root package name */
    private int f38787g;

    public void a(O o10, O.a aVar) {
        if (this.f38783c > 0) {
            o10.c(this.f38784d, this.f38785e, this.f38786f, this.f38787g, aVar);
            this.f38783c = 0;
        }
    }

    public void b() {
        this.f38782b = false;
        this.f38783c = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        C5950a.h(this.f38787g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f38782b) {
            int i13 = this.f38783c;
            int i14 = i13 + 1;
            this.f38783c = i14;
            if (i13 == 0) {
                this.f38784d = j10;
                this.f38785e = i10;
                this.f38786f = 0;
            }
            this.f38786f += i11;
            this.f38787g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(C6679q qVar) {
        if (!this.f38782b) {
            qVar.o(this.f38781a, 0, 10);
            qVar.f();
            if (C6664b.j(this.f38781a) != 0) {
                this.f38782b = true;
            }
        }
    }
}
