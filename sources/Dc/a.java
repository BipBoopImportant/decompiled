package Dc;

import Bc.g;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;

public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f59077a;

    /* renamed from: b  reason: collision with root package name */
    private final g f59078b;

    /* renamed from: c  reason: collision with root package name */
    private final l f59079c;

    /* renamed from: d  reason: collision with root package name */
    private long f59080d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f59081e;

    /* renamed from: f  reason: collision with root package name */
    private long f59082f = -1;

    public a(InputStream inputStream, g gVar, l lVar) {
        this.f59079c = lVar;
        this.f59077a = inputStream;
        this.f59078b = gVar;
        this.f59081e = gVar.e();
    }

    public int available() {
        try {
            return this.f59077a.available();
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }

    public void close() {
        long c10 = this.f59079c.c();
        if (this.f59082f == -1) {
            this.f59082f = c10;
        }
        try {
            this.f59077a.close();
            long j10 = this.f59080d;
            if (j10 != -1) {
                this.f59078b.p(j10);
            }
            long j11 = this.f59081e;
            if (j11 != -1) {
                this.f59078b.s(j11);
            }
            this.f59078b.r(this.f59082f);
            this.f59078b.b();
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }

    public void mark(int i10) {
        this.f59077a.mark(i10);
    }

    public boolean markSupported() {
        return this.f59077a.markSupported();
    }

    public int read() {
        try {
            int read = this.f59077a.read();
            long c10 = this.f59079c.c();
            if (this.f59081e == -1) {
                this.f59081e = c10;
            }
            if (read == -1 && this.f59082f == -1) {
                this.f59082f = c10;
                this.f59078b.r(c10);
                this.f59078b.b();
            } else {
                long j10 = this.f59080d + 1;
                this.f59080d = j10;
                this.f59078b.p(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }

    public void reset() {
        try {
            this.f59077a.reset();
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }

    public long skip(long j10) {
        try {
            long skip = this.f59077a.skip(j10);
            long c10 = this.f59079c.c();
            if (this.f59081e == -1) {
                this.f59081e = c10;
            }
            if (skip == -1 && this.f59082f == -1) {
                this.f59082f = c10;
                this.f59078b.r(c10);
            } else {
                long j11 = this.f59080d + skip;
                this.f59080d = j11;
                this.f59078b.p(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f59077a.read(bArr, i10, i11);
            long c10 = this.f59079c.c();
            if (this.f59081e == -1) {
                this.f59081e = c10;
            }
            if (read == -1 && this.f59082f == -1) {
                this.f59082f = c10;
                this.f59078b.r(c10);
                this.f59078b.b();
            } else {
                long j10 = this.f59080d + ((long) read);
                this.f59080d = j10;
                this.f59078b.p(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f59077a.read(bArr);
            long c10 = this.f59079c.c();
            if (this.f59081e == -1) {
                this.f59081e = c10;
            }
            if (read == -1 && this.f59082f == -1) {
                this.f59082f = c10;
                this.f59078b.r(c10);
                this.f59078b.b();
            } else {
                long j10 = this.f59080d + ((long) read);
                this.f59080d = j10;
                this.f59078b.p(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f59078b.r(this.f59079c.c());
            d.d(this.f59078b);
            throw e10;
        }
    }
}
