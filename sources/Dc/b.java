package Dc;

import Bc.g;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f59083a;

    /* renamed from: b  reason: collision with root package name */
    private final l f59084b;

    /* renamed from: c  reason: collision with root package name */
    g f59085c;

    /* renamed from: d  reason: collision with root package name */
    long f59086d = -1;

    public b(OutputStream outputStream, g gVar, l lVar) {
        this.f59083a = outputStream;
        this.f59085c = gVar;
        this.f59084b = lVar;
    }

    public void close() {
        long j10 = this.f59086d;
        if (j10 != -1) {
            this.f59085c.m(j10);
        }
        this.f59085c.q(this.f59084b.c());
        try {
            this.f59083a.close();
        } catch (IOException e10) {
            this.f59085c.r(this.f59084b.c());
            d.d(this.f59085c);
            throw e10;
        }
    }

    public void flush() {
        try {
            this.f59083a.flush();
        } catch (IOException e10) {
            this.f59085c.r(this.f59084b.c());
            d.d(this.f59085c);
            throw e10;
        }
    }

    public void write(int i10) {
        try {
            this.f59083a.write(i10);
            long j10 = this.f59086d + 1;
            this.f59086d = j10;
            this.f59085c.m(j10);
        } catch (IOException e10) {
            this.f59085c.r(this.f59084b.c());
            d.d(this.f59085c);
            throw e10;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.f59083a.write(bArr);
            long length = this.f59086d + ((long) bArr.length);
            this.f59086d = length;
            this.f59085c.m(length);
        } catch (IOException e10) {
            this.f59085c.r(this.f59084b.c());
            d.d(this.f59085c);
            throw e10;
        }
    }

    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.f59083a.write(bArr, i10, i11);
            long j10 = this.f59086d + ((long) i11);
            this.f59086d = j10;
            this.f59085c.m(j10);
        } catch (IOException e10) {
            this.f59085c.r(this.f59084b.c());
            d.d(this.f59085c);
            throw e10;
        }
    }
}
