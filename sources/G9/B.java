package G9;

import android.util.Log;

class B {

    /* renamed from: e  reason: collision with root package name */
    private static final B f36304e = new B(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f36305a;

    /* renamed from: b  reason: collision with root package name */
    final String f36306b;

    /* renamed from: c  reason: collision with root package name */
    final Throwable f36307c;

    /* renamed from: d  reason: collision with root package name */
    final int f36308d;

    private B(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f36305a = z10;
        this.f36308d = i10;
        this.f36306b = str;
        this.f36307c = th2;
    }

    @Deprecated
    static B b() {
        return f36304e;
    }

    static B c(String str) {
        return new B(false, 1, 5, str, (Throwable) null);
    }

    static B d(String str, Throwable th2) {
        return new B(false, 1, 5, str, th2);
    }

    static B f(int i10) {
        return new B(true, i10, 1, (String) null, (Throwable) null);
    }

    static B g(int i10, int i11, String str, Throwable th2) {
        return new B(false, i10, i11, str, th2);
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f36306b;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (!this.f36305a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f36307c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f36307c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }

    /* synthetic */ B(boolean z10, int i10, int i11, String str, Throwable th2, A a10) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }
}
