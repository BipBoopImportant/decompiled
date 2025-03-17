package T3;

import N3.C6666d;
import N3.O;
import T3.C6695e;
import q3.C5807s;
import t3.B;
import u3.e;

/* renamed from: T3.f  reason: case insensitive filesystem */
final class C6696f extends C6695e {

    /* renamed from: b  reason: collision with root package name */
    private final B f40004b = new B(e.f30076a);

    /* renamed from: c  reason: collision with root package name */
    private final B f40005c = new B(4);

    /* renamed from: d  reason: collision with root package name */
    private int f40006d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40007e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40008f;

    /* renamed from: g  reason: collision with root package name */
    private int f40009g;

    public C6696f(O o10) {
        super(o10);
    }

    /* access modifiers changed from: protected */
    public boolean b(B b10) {
        int H10 = b10.H();
        int i10 = (H10 >> 4) & 15;
        int i11 = H10 & 15;
        if (i11 == 7) {
            this.f40009g = i10;
            return i10 != 5;
        }
        throw new C6695e.a("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public boolean c(B b10, long j10) {
        int H10 = b10.H();
        long r10 = j10 + (((long) b10.r()) * 1000);
        if (H10 == 0 && !this.f40007e) {
            B b11 = new B(new byte[b10.a()]);
            b10.l(b11.e(), 0, b10.a());
            C6666d b12 = C6666d.b(b11);
            this.f40006d = b12.f38840b;
            this.f40003a.e(new C5807s.b().s0("video/avc").R(b12.f38850l).x0(b12.f38841c).c0(b12.f38842d).o0(b12.f38849k).f0(b12.f38839a).M());
            this.f40007e = true;
            return false;
        } else if (H10 != 1 || !this.f40007e) {
            return false;
        } else {
            int i10 = this.f40009g == 1 ? 1 : 0;
            if (!this.f40008f && i10 == 0) {
                return false;
            }
            byte[] e10 = this.f40005c.e();
            e10[0] = 0;
            e10[1] = 0;
            e10[2] = 0;
            int i11 = 4 - this.f40006d;
            int i12 = 0;
            while (b10.a() > 0) {
                b10.l(this.f40005c.e(), i11, this.f40006d);
                this.f40005c.W(0);
                int L10 = this.f40005c.L();
                this.f40004b.W(0);
                this.f40003a.a(this.f40004b, 4);
                this.f40003a.a(b10, L10);
                i12 = i12 + 4 + L10;
            }
            this.f40003a.c(r10, i10, i12, 0, (O.a) null);
            this.f40008f = true;
            return true;
        }
    }
}
