package G7;

import C7.f;
import G7.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import z7.C9032a;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final j f36236a;

    /* renamed from: b  reason: collision with root package name */
    private final File f36237b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36238c;

    /* renamed from: d  reason: collision with root package name */
    private final c f36239d = new c();

    /* renamed from: e  reason: collision with root package name */
    private C9032a f36240e;

    @Deprecated
    protected e(File file, long j10) {
        this.f36237b = file;
        this.f36238c = j10;
        this.f36236a = new j();
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized C9032a d() {
        try {
            if (this.f36240e == null) {
                this.f36240e = C9032a.B(this.f36237b, 1, 1, this.f36238c);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f36240e;
    }

    public File a(f fVar) {
        String b10 = this.f36236a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + fVar);
        }
        try {
            C9032a.e x10 = d().x(b10);
            if (x10 != null) {
                return x10.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public void b(f fVar, a.b bVar) {
        C9032a.c u10;
        String b10 = this.f36236a.b(fVar);
        this.f36239d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + fVar);
            }
            try {
                C9032a d10 = d();
                if (d10.x(b10) == null) {
                    u10 = d10.u(b10);
                    if (u10 != null) {
                        if (bVar.a(u10.f(0))) {
                            u10.e();
                        }
                        u10.b();
                        this.f36239d.b(b10);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b10);
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            } catch (Throwable th2) {
                u10.b();
                throw th2;
            }
        } finally {
            this.f36239d.b(b10);
        }
    }
}
