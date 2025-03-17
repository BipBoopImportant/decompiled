package com.bumptech.glide.load.data;

import F7.b;
import com.google.ar.core.ImageMetadata;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f46576a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46577b;

    /* renamed from: c  reason: collision with root package name */
    private b f46578c;

    /* renamed from: d  reason: collision with root package name */
    private int f46579d;

    public c(OutputStream outputStream, b bVar) {
        this(outputStream, bVar, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    private void c() {
        int i10 = this.f46579d;
        if (i10 > 0) {
            this.f46576a.write(this.f46577b, 0, i10);
            this.f46579d = 0;
        }
    }

    private void d() {
        if (this.f46579d == this.f46577b.length) {
            c();
        }
    }

    private void e() {
        byte[] bArr = this.f46577b;
        if (bArr != null) {
            this.f46578c.e(bArr);
            this.f46577b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f46576a.close();
            e();
        } catch (Throwable th2) {
            this.f46576a.close();
            throw th2;
        }
    }

    public void flush() {
        c();
        this.f46576a.flush();
    }

    public void write(int i10) {
        byte[] bArr = this.f46577b;
        int i11 = this.f46579d;
        this.f46579d = i11 + 1;
        bArr[i11] = (byte) i10;
        d();
    }

    c(OutputStream outputStream, b bVar, int i10) {
        this.f46576a = outputStream;
        this.f46578c = bVar;
        this.f46577b = (byte[]) bVar.c(i10, byte[].class);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f46579d;
            if (i15 != 0 || i13 < this.f46577b.length) {
                int min = Math.min(i13, this.f46577b.length - i15);
                System.arraycopy(bArr, i14, this.f46577b, this.f46579d, min);
                this.f46579d += min;
                i12 += min;
                d();
            } else {
                this.f46576a.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}
