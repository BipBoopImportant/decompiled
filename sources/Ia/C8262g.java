package ia;

import java.io.OutputStream;

/* renamed from: ia.g  reason: case insensitive filesystem */
final class C8262g extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f53581a = 0;

    C8262g() {
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.f53581a;
    }

    public final void write(int i10) {
        this.f53581a++;
    }

    public final void write(byte[] bArr) {
        this.f53581a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f53581a += (long) i11;
    }
}
