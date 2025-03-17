package Sb;

import Wb.g;
import com.google.ar.core.ImageMetadata;
import java.io.File;

public class f {

    /* renamed from: c  reason: collision with root package name */
    private static final b f63277c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final g f63278a;

    /* renamed from: b  reason: collision with root package name */
    private d f63279b;

    private static final class b implements d {
        private b() {
        }

        public void a() {
        }

        public String b() {
            return null;
        }

        public byte[] c() {
            return null;
        }

        public void d() {
        }

        public void e(long j10, String str) {
        }
    }

    public f(g gVar) {
        this.f63278a = gVar;
        this.f63279b = f63277c;
    }

    private File d(String str) {
        return this.f63278a.q(str, "userlog");
    }

    public void a() {
        this.f63279b.d();
    }

    public byte[] b() {
        return this.f63279b.c();
    }

    public String c() {
        return this.f63279b.b();
    }

    public final void e(String str) {
        this.f63279b.a();
        this.f63279b = f63277c;
        if (str != null) {
            f(d(str), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(File file, int i10) {
        this.f63279b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f63279b.e(j10, str);
    }

    public f(g gVar, String str) {
        this(gVar);
        e(str);
    }
}
