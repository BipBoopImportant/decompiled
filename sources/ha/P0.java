package ha;

import java.io.OutputStream;

final class P0 extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f52124a = 0;

    P0() {
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.f52124a;
    }

    public final void write(int i10) {
        this.f52124a++;
    }

    public final void write(byte[] bArr) {
        this.f52124a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f52124a += (long) i11;
    }
}
