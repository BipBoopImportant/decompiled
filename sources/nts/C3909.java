package nts;

/* renamed from: nts.ᕝ  reason: contains not printable characters */
public class C3909 {

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1846 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3893[] f1847;

    public C3909(short[] sArr, int i10) {
        this.f1847 = new C3893[i10];
        this.f1846 = 0;
        for (int i11 = 0; i11 < sArr.length; i11++) {
            short s10 = sArr[i11];
            if (s10 != 0) {
                C3893[] r22 = this.f1847;
                int i12 = this.f1846;
                this.f1846 = i12 + 1;
                r22[i12] = new C3893((int) s10, i11);
            }
        }
        int i13 = this.f1846;
        if (i13 >= 2) {
            for (int i14 = (i13 / 2) - 1; i14 >= 0; i14--) {
                m2022(i14);
            }
            return;
        }
        throw new C3625(132, C4081.m3209(0, 23, 81));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2022(int i10) {
        int i11 = i10 * 2;
        int i12 = i11 + 1;
        int i13 = this.f1846;
        int i14 = 50000000;
        int i15 = i12 < i13 ? this.f1847[i12].f1792 : 50000000;
        int i16 = i11 + 2;
        if (i16 < i13) {
            i14 = this.f1847[i16].f1792;
        }
        C3893[] r22 = this.f1847;
        C3893 r52 = r22[i10];
        if (i15 >= r52.f1792) {
            i12 = i10;
        }
        if (i14 >= r22[i12].f1792) {
            i16 = i12;
        }
        if (i16 != i10) {
            r22[i10] = r22[i16];
            r22[i16] = r52;
            m2022(i16);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3893 m2021() {
        int i10 = this.f1846;
        if (i10 >= 1) {
            C3893[] r22 = this.f1847;
            C3893 r42 = r22[0];
            int i11 = i10 - 1;
            r22[0] = r22[i11];
            this.f1846 = i11;
            m2022(0);
            return r42;
        }
        throw new C3625((Throwable) null, 199, C3727.m1052("\u00125-3+\",a&*-=j.0*3' <==~\f\u0010\u001f\u0018\f\u000f\u001bN\u0000\u0014\u0017\u0007\b\u0014\u0013\u0003\u001dX\u0014\u001c]\u0019\u0012\u000e\u0005\tS\u001a\u0010\u0015\u0007\u001d\u0011\u0016\u0006Q\u0004\u001c\u001d]\u0010\u001e\f\u001e\u001d1\u000b\u0003\u001f\u0010\u0004\u0001\u0017\t\tN\u001b\u001a\u0000\u001c\u0002\u0015\u0019V\u001f\u0015\u0010\u0002]Tnft`j'imylacx Zwn<{q1~|f5usr)}{", 23, 31, 97));
    }
}
