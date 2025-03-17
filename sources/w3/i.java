package w3;

import java.io.InputStream;
import t3.C5950a;

public final class i extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final g f31427a;

    /* renamed from: b  reason: collision with root package name */
    private final k f31428b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f31429c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31430d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31431e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f31432f;

    public i(g gVar, k kVar) {
        this.f31427a = gVar;
        this.f31428b = kVar;
        this.f31429c = new byte[1];
    }

    private void c() {
        if (!this.f31430d) {
            this.f31427a.b(this.f31428b);
            this.f31430d = true;
        }
    }

    public void close() {
        if (!this.f31431e) {
            this.f31427a.close();
            this.f31431e = true;
        }
    }

    public int read() {
        if (read(this.f31429c) == -1) {
            return -1;
        }
        return this.f31429c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        C5950a.g(!this.f31431e);
        c();
        int c10 = this.f31427a.c(bArr, i10, i11);
        if (c10 == -1) {
            return -1;
        }
        this.f31432f += (long) c10;
        return c10;
    }
}
