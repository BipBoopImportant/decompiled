package CL;

class h {
    h() {
    }

    private long b(int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (Math.abs(i10 - i11) > 1) {
            return 255;
        }
        if (i10 > i11) {
            return 5;
        }
        if (i10 < i11) {
            return 255;
        }
        return ((i10 == 1 ? 1 : 6) << 8) + 2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i10, int i11, int i12) {
        long b10 = b(i11, i12);
        long j10 = (long) i10;
        if (j10 == b10) {
            return false;
        }
        while (b10 != 0) {
            if (j10 == (255 & b10)) {
                return false;
            }
            b10 >>= 8;
        }
        return true;
    }
}
