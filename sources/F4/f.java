package f4;

import N3.C6679q;
import t3.B;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final B f51106a = new B(8);

    /* renamed from: b  reason: collision with root package name */
    private int f51107b;

    private long a(C6679q qVar) {
        int i10 = 0;
        qVar.o(this.f51106a.e(), 0, 1);
        byte b10 = this.f51106a.e()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        qVar.o(this.f51106a.e(), 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f51106a.e()[i10] & 255) + (i13 << 8);
        }
        this.f51107b += i12 + 1;
        return (long) i13;
    }

    public boolean b(C6679q qVar) {
        long a10;
        int i10;
        long length = qVar.getLength();
        int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && length <= 1024) {
            j10 = length;
        }
        int i12 = (int) j10;
        qVar.o(this.f51106a.e(), 0, 4);
        long J10 = this.f51106a.J();
        this.f51107b = 4;
        while (J10 != 440786851) {
            int i13 = this.f51107b + 1;
            this.f51107b = i13;
            if (i13 == i12) {
                return false;
            }
            qVar.o(this.f51106a.e(), 0, 1);
            J10 = ((J10 << 8) & -256) | ((long) (this.f51106a.e()[0] & 255));
        }
        long a11 = a(qVar);
        long j11 = (long) this.f51107b;
        if (a11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a11 >= length) {
            return false;
        }
        while (true) {
            int i14 = this.f51107b;
            long j12 = j11 + a11;
            if (((long) i14) >= j12) {
                return ((long) i14) == j12;
            }
            if (a(qVar) != Long.MIN_VALUE && a10 >= 0 && a10 <= 2147483647L) {
                if (i10 != 0) {
                    int a12 = (int) (a10 = a(qVar));
                    qVar.i(a12);
                    this.f51107b += a12;
                }
            }
        }
        return false;
    }
}
