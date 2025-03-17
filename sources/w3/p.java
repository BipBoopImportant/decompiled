package w3;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import t3.C5950a;
import t3.N;
import w3.g;

public final class p extends C6218b {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f31494e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f31495f;

    /* renamed from: g  reason: collision with root package name */
    private long f31496g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f31497h;

    public static final class a implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private C f31498a;

        /* renamed from: b */
        public p a() {
            p pVar = new p();
            C c10 = this.f31498a;
            if (c10 != null) {
                pVar.l(c10);
            }
            return pVar;
        }
    }

    public static class b extends h {
        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public p() {
        super(false);
    }

    private static RandomAccessFile t(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) C5950a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10, 1004);
            }
            if (!(e10.getCause() instanceof ErrnoException) || ((ErrnoException) e10.getCause()).errno != OsConstants.EACCES) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    public long b(k kVar) {
        Uri uri = kVar.f31433a;
        this.f31495f = uri;
        r(kVar);
        RandomAccessFile t10 = t(uri);
        this.f31494e = t10;
        try {
            t10.seek(kVar.f31439g);
            long j10 = kVar.f31440h;
            if (j10 == -1) {
                j10 = this.f31494e.length() - kVar.f31439g;
            }
            this.f31496g = j10;
            if (j10 >= 0) {
                this.f31497h = true;
                s(kVar);
                return this.f31496g;
            }
            throw new b((String) null, (Throwable) null, 2008);
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f31496g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) N.i(this.f31494e)).read(bArr, i10, (int) Math.min(this.f31496g, (long) i11));
            if (read > 0) {
                this.f31496g -= (long) read;
                p(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    public void close() {
        this.f31495f = null;
        try {
            RandomAccessFile randomAccessFile = this.f31494e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f31494e = null;
            if (this.f31497h) {
                this.f31497h = false;
                q();
            }
        } catch (IOException e10) {
            throw new b(e10, 2000);
        } catch (Throwable th2) {
            this.f31494e = null;
            if (this.f31497h) {
                this.f31497h = false;
                q();
            }
            throw th2;
        }
    }

    public Uri n() {
        return this.f31495f;
    }
}
