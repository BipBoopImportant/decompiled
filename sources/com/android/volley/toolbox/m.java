package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;

public class m extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final c f46280a;

    public m(c cVar, int i10) {
        this.f46280a = cVar;
        this.buf = cVar.a(Math.max(i10, 256));
    }

    private void c(int i10) {
        int i11 = this.count;
        if (i11 + i10 > this.buf.length) {
            byte[] a10 = this.f46280a.a((i11 + i10) * 2);
            System.arraycopy(this.buf, 0, a10, 0, this.count);
            this.f46280a.b(this.buf);
            this.buf = a10;
        }
    }

    public void close() {
        this.f46280a.b(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f46280a.b(this.buf);
    }

    public synchronized void write(byte[] bArr, int i10, int i11) {
        c(i11);
        super.write(bArr, i10, i11);
    }

    public synchronized void write(int i10) {
        c(1);
        super.write(i10);
    }
}
