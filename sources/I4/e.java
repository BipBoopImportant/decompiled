package i4;

import N3.C6679q;
import N3.C6680s;
import java.util.Arrays;
import t3.B;
import t3.C5950a;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f53096a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final B f53097b = new B(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f53098c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f53099d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f53100e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f53099d = 0;
        do {
            int i13 = this.f53099d;
            int i14 = i10 + i13;
            f fVar = this.f53096a;
            if (i14 >= fVar.f53107g) {
                break;
            }
            int[] iArr = fVar.f53110j;
            this.f53099d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f53096a;
    }

    public B c() {
        return this.f53097b;
    }

    public boolean d(C6679q qVar) {
        int i10;
        C5950a.g(qVar != null);
        if (this.f53100e) {
            this.f53100e = false;
            this.f53097b.S(0);
        }
        while (!this.f53100e) {
            if (this.f53098c < 0) {
                if (!this.f53096a.c(qVar) || !this.f53096a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.f53096a;
                int i11 = fVar.f53108h;
                if ((fVar.f53102b & 1) == 1 && this.f53097b.g() == 0) {
                    i11 += a(0);
                    i10 = this.f53099d;
                } else {
                    i10 = 0;
                }
                if (!C6680s.e(qVar, i11)) {
                    return false;
                }
                this.f53098c = i10;
            }
            int a10 = a(this.f53098c);
            int i12 = this.f53098c + this.f53099d;
            if (a10 > 0) {
                B b10 = this.f53097b;
                b10.c(b10.g() + a10);
                if (!C6680s.d(qVar, this.f53097b.e(), this.f53097b.g(), a10)) {
                    return false;
                }
                B b11 = this.f53097b;
                b11.V(b11.g() + a10);
                this.f53100e = this.f53096a.f53110j[i12 + -1] != 255;
            }
            if (i12 == this.f53096a.f53107g) {
                i12 = -1;
            }
            this.f53098c = i12;
        }
        return true;
    }

    public void e() {
        this.f53096a.b();
        this.f53097b.S(0);
        this.f53098c = -1;
        this.f53100e = false;
    }

    public void f() {
        if (this.f53097b.e().length != 65025) {
            B b10 = this.f53097b;
            b10.U(Arrays.copyOf(b10.e(), Math.max(65025, this.f53097b.g())), this.f53097b.g());
        }
    }
}
