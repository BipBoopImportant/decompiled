package w3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import t3.C5950a;
import t3.N;

/* renamed from: w3.a  reason: case insensitive filesystem */
public final class C6217a extends C6218b {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f31407e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f31408f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f31409g;

    /* renamed from: h  reason: collision with root package name */
    private long f31410h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f31411i;

    /* renamed from: w3.a$a  reason: collision with other inner class name */
    public static final class C0485a extends h {
        public C0485a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C6217a(Context context) {
        super(false);
        this.f31407e = context.getAssets();
    }

    public long b(k kVar) {
        try {
            Uri uri = kVar.f31433a;
            this.f31408f = uri;
            String str = (String) C5950a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            r(kVar);
            InputStream open = this.f31407e.open(str, 1);
            this.f31409g = open;
            if (open.skip(kVar.f31439g) >= kVar.f31439g) {
                long j10 = kVar.f31440h;
                if (j10 != -1) {
                    this.f31410h = j10;
                } else {
                    long available = (long) this.f31409g.available();
                    this.f31410h = available;
                    if (available == 2147483647L) {
                        this.f31410h = -1;
                    }
                }
                this.f31411i = true;
                s(kVar);
                return this.f31410h;
            }
            throw new C0485a((Throwable) null, 2008);
        } catch (C0485a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C0485a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f31410h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new C0485a(e10, 2000);
            }
        }
        int read = ((InputStream) N.i(this.f31409g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f31410h;
        if (j11 != -1) {
            this.f31410h = j11 - ((long) read);
        }
        p(read);
        return read;
    }

    public void close() {
        this.f31408f = null;
        try {
            InputStream inputStream = this.f31409g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f31409g = null;
            if (this.f31411i) {
                this.f31411i = false;
                q();
            }
        } catch (IOException e10) {
            throw new C0485a(e10, 2000);
        } catch (Throwable th2) {
            this.f31409g = null;
            if (this.f31411i) {
                this.f31411i = false;
                q();
            }
            throw th2;
        }
    }

    public Uri n() {
        return this.f31408f;
    }
}
