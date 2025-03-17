package a8;

/* renamed from: a8.c  reason: case insensitive filesystem */
class C6753c {

    /* renamed from: a  reason: collision with root package name */
    private int f41579a;

    /* renamed from: b  reason: collision with root package name */
    private long f41580b;

    C6753c(long j10, int i10) {
        this.f41580b = j10;
        this.f41579a = i10;
    }

    static C6753c b(String str, int i10, int i11) {
        long j10;
        int i12;
        if (i10 >= i11) {
            return null;
        }
        long j11 = 0;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt < '0' || charAt > '9') {
                if (charAt < 'A' || charAt > 'F') {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j10 = j11 * 16;
                    i12 = charAt - 'a';
                } else {
                    j10 = j11 * 16;
                    i12 = charAt - 'A';
                }
                j11 = j10 + ((long) i12) + 10;
            } else {
                j11 = (j11 * 16) + ((long) (charAt - '0'));
            }
            if (j11 > 4294967295L) {
                return null;
            }
            i13++;
        }
        if (i13 == i10) {
            return null;
        }
        return new C6753c(j11, i13);
    }

    static C6753c c(String str, int i10, int i11, boolean z10) {
        if (i10 >= i11) {
            return null;
        }
        boolean z11 = false;
        if (z10) {
            char charAt = str.charAt(i10);
            if (charAt != '+') {
                if (charAt == '-') {
                    z11 = true;
                }
            }
            i10++;
        }
        long j10 = 0;
        int i12 = i10;
        while (i12 < i11) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (z11) {
                j10 = (j10 * 10) - ((long) (charAt2 - '0'));
                if (j10 < -2147483648L) {
                    return null;
                }
            } else {
                j10 = (j10 * 10) + ((long) (charAt2 - '0'));
                if (j10 > 2147483647L) {
                    return null;
                }
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new C6753c(j10, i12);
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f41579a;
    }

    public int d() {
        return (int) this.f41580b;
    }
}
