package nts;

import nts.C4100;

/* renamed from: nts.ݘ  reason: contains not printable characters */
public class C3660 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C4205 f765 = new C4205();

    /* renamed from: ഇ  reason: contains not printable characters */
    public long f766 = 0;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f767 = null;

    /* renamed from: nts.ݘ$ഇ  reason: contains not printable characters */
    public class C3661 {

        /* renamed from: ગ  reason: contains not printable characters */
        public byte[] f768;

        /* renamed from: ഇ  reason: contains not printable characters */
        public long f769;

        public C3661(C3660 r12, long j10, byte[] bArr) {
            this.f769 = j10;
            this.f768 = bArr;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m711(long j10, byte[] bArr) {
        this.f767 = null;
        long length = (long) bArr.length;
        long j11 = this.f766;
        if (j10 + length <= j11) {
            return -1;
        }
        if (j10 < j11) {
            int i10 = (int) (j11 - j10);
            length -= (long) i10;
            bArr = C3823.m1630(bArr, i10, (int) length);
            j10 = this.f766;
        }
        if (j10 == this.f766) {
            if (!this.f765.m3763()) {
                long j12 = j10 + length;
                if (((C3661) this.f765.f4065.f3502.f3506).f769 <= j12) {
                    C3874 r12 = new C3874(256);
                    r12.m1920(bArr);
                    C4100.C4101 r122 = this.f765.f4065.f3502;
                    while (r122 != null) {
                        C3661 r22 = (C3661) r122.f3506;
                        long j13 = r22.f769;
                        int i11 = (j12 > j13 ? 1 : (j12 == j13 ? 0 : -1));
                        if (i11 < 0) {
                            break;
                        }
                        if (i11 >= 0) {
                            byte[] bArr2 = r22.f768;
                            if (j12 < ((long) (bArr2 == null ? 0 : bArr2.length)) + j13) {
                                r12.m1921(bArr2, (int) (j12 - j13), bArr2.length);
                                long j14 = r22.f769;
                                byte[] bArr3 = r22.f768;
                                j12 = j14 + ((long) (bArr3 == null ? 0 : bArr3.length));
                            }
                        }
                        r122 = r122.f3504;
                    }
                    if (r122 != null) {
                        C4100 r02 = this.f765.f4065;
                        while (true) {
                            C4100.C4101 r23 = r02.f3502;
                            if (r23 == null || r23 == r122) {
                                break;
                            }
                            r02.m3250(r23);
                        }
                    } else {
                        C4100 r123 = this.f765.f4065;
                        r123.f3502 = null;
                        r123.f3501 = null;
                    }
                    this.f766 = j12;
                    this.f767 = r12.m1923();
                    return 0;
                }
            }
            this.f766 += length;
            this.f767 = bArr;
            return 0;
        }
        this.f765.m3762(j10, new C3661(this, j10, bArr));
        return 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m712() {
        this.f766 = 0;
        C4100 r02 = this.f765.f4065;
        r02.f3502 = null;
        r02.f3501 = null;
        this.f767 = null;
    }
}
