package com.squareup.picasso;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class n extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f122580a;

    /* renamed from: b  reason: collision with root package name */
    private long f122581b;

    /* renamed from: c  reason: collision with root package name */
    private long f122582c;

    /* renamed from: d  reason: collision with root package name */
    private long f122583d;

    /* renamed from: e  reason: collision with root package name */
    private long f122584e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f122585f;

    /* renamed from: g  reason: collision with root package name */
    private int f122586g;

    n(InputStream inputStream) {
        this(inputStream, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    private void f(long j10) {
        try {
            long j11 = this.f122582c;
            long j12 = this.f122581b;
            if (j11 >= j12 || j12 > this.f122583d) {
                this.f122582c = j12;
                this.f122580a.mark((int) (j10 - j12));
            } else {
                this.f122580a.reset();
                this.f122580a.mark((int) (j10 - this.f122582c));
                g(this.f122582c, this.f122581b);
            }
            this.f122583d = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    private void g(long j10, long j11) {
        while (j10 < j11) {
            long skip = this.f122580a.skip(j11 - j10);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j10 += skip;
        }
    }

    public int available() {
        return this.f122580a.available();
    }

    public void c(boolean z10) {
        this.f122585f = z10;
    }

    public void close() {
        this.f122580a.close();
    }

    public void d(long j10) {
        if (this.f122581b > this.f122583d || j10 < this.f122582c) {
            throw new IOException("Cannot reset");
        }
        this.f122580a.reset();
        g(this.f122582c, j10);
        this.f122581b = j10;
    }

    public long e(int i10) {
        long j10 = this.f122581b + ((long) i10);
        if (this.f122583d < j10) {
            f(j10);
        }
        return this.f122581b;
    }

    public void mark(int i10) {
        this.f122584e = e(i10);
    }

    public boolean markSupported() {
        return this.f122580a.markSupported();
    }

    public int read() {
        if (!this.f122585f) {
            long j10 = this.f122583d;
            if (this.f122581b + 1 > j10) {
                f(j10 + ((long) this.f122586g));
            }
        }
        int read = this.f122580a.read();
        if (read != -1) {
            this.f122581b++;
        }
        return read;
    }

    public void reset() {
        d(this.f122584e);
    }

    public long skip(long j10) {
        if (!this.f122585f) {
            long j11 = this.f122581b;
            if (j11 + j10 > this.f122583d) {
                f(j11 + j10 + ((long) this.f122586g));
            }
        }
        long skip = this.f122580a.skip(j10);
        this.f122581b += skip;
        return skip;
    }

    n(InputStream inputStream, int i10) {
        this(inputStream, i10, 1024);
    }

    private n(InputStream inputStream, int i10, int i11) {
        this.f122584e = -1;
        this.f122585f = true;
        this.f122586g = -1;
        this.f122580a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i10) : inputStream;
        this.f122586g = i11;
    }

    public int read(byte[] bArr) {
        if (!this.f122585f) {
            long j10 = this.f122581b;
            if (((long) bArr.length) + j10 > this.f122583d) {
                f(j10 + ((long) bArr.length) + ((long) this.f122586g));
            }
        }
        int read = this.f122580a.read(bArr);
        if (read != -1) {
            this.f122581b += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (!this.f122585f) {
            long j10 = this.f122581b;
            long j11 = (long) i11;
            if (j10 + j11 > this.f122583d) {
                f(j10 + j11 + ((long) this.f122586g));
            }
        }
        int read = this.f122580a.read(bArr, i10, i11);
        if (read != -1) {
            this.f122581b += (long) read;
        }
        return read;
    }
}
