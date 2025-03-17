package ic;

import java.io.OutputStream;

/* renamed from: ic.b  reason: case insensitive filesystem */
final class C9834b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f74240a = 0;

    C9834b() {
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f74240a;
    }

    public void write(int i10) {
        this.f74240a++;
    }

    public void write(byte[] bArr) {
        this.f74240a += (long) bArr.length;
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f74240a += (long) i11;
    }
}
