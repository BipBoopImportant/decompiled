package x3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import t3.C5950a;
import t3.N;
import t3.q;
import w3.f;
import w3.k;
import x3.a;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f31862a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31863b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31864c;

    /* renamed from: d  reason: collision with root package name */
    private k f31865d;

    /* renamed from: e  reason: collision with root package name */
    private long f31866e;

    /* renamed from: f  reason: collision with root package name */
    private File f31867f;

    /* renamed from: g  reason: collision with root package name */
    private OutputStream f31868g;

    /* renamed from: h  reason: collision with root package name */
    private long f31869h;

    /* renamed from: i  reason: collision with root package name */
    private long f31870i;

    /* renamed from: j  reason: collision with root package name */
    private q f31871j;

    public static final class a extends a.C0493a {
        public a(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    /* renamed from: x3.b$b  reason: collision with other inner class name */
    public static final class C0494b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private a f31872a;

        /* renamed from: b  reason: collision with root package name */
        private long f31873b = 5242880;

        /* renamed from: c  reason: collision with root package name */
        private int f31874c = 20480;

        public f a() {
            return new b((a) C5950a.e(this.f31872a), this.f31873b, this.f31874c);
        }

        public C0494b b(a aVar) {
            this.f31872a = aVar;
            return this;
        }
    }

    public b(a aVar, long j10, int i10) {
        C5950a.h(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i11 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
        if (i11 != 0 && j10 < 2097152) {
            q.h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f31862a = (a) C5950a.e(aVar);
        this.f31863b = i11 == 0 ? Long.MAX_VALUE : j10;
        this.f31864c = i10;
    }

    private void a() {
        OutputStream outputStream = this.f31868g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                N.m(this.f31868g);
                this.f31868g = null;
                this.f31867f = null;
                this.f31862a.h((File) N.i(this.f31867f), this.f31869h);
            } catch (Throwable th2) {
                N.m(this.f31868g);
                this.f31868g = null;
                this.f31867f = null;
                ((File) N.i(this.f31867f)).delete();
                throw th2;
            }
        }
    }

    private void c(k kVar) {
        long j10 = kVar.f31440h;
        long j11 = -1;
        if (j10 != -1) {
            j11 = Math.min(j10 - this.f31870i, this.f31866e);
        }
        this.f31867f = this.f31862a.a((String) N.i(kVar.f31441i), kVar.f31439g + this.f31870i, j11);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f31867f);
        if (this.f31864c > 0) {
            q qVar = this.f31871j;
            if (qVar == null) {
                this.f31871j = new q(fileOutputStream, this.f31864c);
            } else {
                qVar.c(fileOutputStream);
            }
            this.f31868g = this.f31871j;
        } else {
            this.f31868g = fileOutputStream;
        }
        this.f31869h = 0;
    }

    public void L(byte[] bArr, int i10, int i11) {
        k kVar = this.f31865d;
        if (kVar != null) {
            int i12 = 0;
            while (i12 < i11) {
                try {
                    if (this.f31869h == this.f31866e) {
                        a();
                        c(kVar);
                    }
                    int min = (int) Math.min((long) (i11 - i12), this.f31866e - this.f31869h);
                    ((OutputStream) N.i(this.f31868g)).write(bArr, i10 + i12, min);
                    i12 += min;
                    long j10 = (long) min;
                    this.f31869h += j10;
                    this.f31870i += j10;
                } catch (IOException e10) {
                    throw new a(e10);
                }
            }
        }
    }

    public void b(k kVar) {
        C5950a.e(kVar.f31441i);
        if (kVar.f31440h != -1 || !kVar.d(2)) {
            this.f31865d = kVar;
            this.f31866e = kVar.d(4) ? this.f31863b : Long.MAX_VALUE;
            this.f31870i = 0;
            try {
                c(kVar);
            } catch (IOException e10) {
                throw new a(e10);
            }
        } else {
            this.f31865d = null;
        }
    }

    public void close() {
        if (this.f31865d != null) {
            try {
                a();
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }
}
