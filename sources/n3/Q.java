package N3;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f38788a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38789b;

    /* renamed from: c  reason: collision with root package name */
    private int f38790c;

    /* renamed from: d  reason: collision with root package name */
    private int f38791d;

    public Q(byte[] bArr) {
        this.f38788a = bArr;
        this.f38789b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f38789b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f38790c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f38789b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f38791d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            t3.C5950a.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.Q.a():void");
    }

    public int b() {
        return (this.f38790c * 8) + this.f38791d;
    }

    public boolean c() {
        boolean z10 = (((this.f38788a[this.f38790c] & 255) >> this.f38791d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f38790c;
        int min = Math.min(i10, 8 - this.f38791d);
        int i12 = i11 + 1;
        int i13 = ((this.f38788a[i11] & 255) >> this.f38791d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f38788a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f38790c + i11;
        this.f38790c = i12;
        int i13 = this.f38791d + (i10 - (i11 * 8));
        this.f38791d = i13;
        if (i13 > 7) {
            this.f38790c = i12 + 1;
            this.f38791d = i13 - 8;
        }
        a();
    }
}
