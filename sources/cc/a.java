package Cc;

import Gc.c;

public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final Ac.a f58963b = Ac.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final c f58964a;

    a(c cVar) {
        this.f58964a = cVar;
    }

    private boolean g() {
        c cVar = this.f58964a;
        if (cVar == null) {
            f58963b.j("ApplicationInfo is null");
            return false;
        } else if (!cVar.u()) {
            f58963b.j("GoogleAppId is null");
            return false;
        } else if (!this.f58964a.s()) {
            f58963b.j("AppInstanceId is null");
            return false;
        } else if (!this.f58964a.t()) {
            f58963b.j("ApplicationProcessState is null");
            return false;
        } else if (!this.f58964a.r()) {
            return true;
        } else {
            if (!this.f58964a.n().m()) {
                f58963b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f58964a.n().n()) {
                return true;
            } else {
                f58963b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
    }

    public boolean c() {
        if (g()) {
            return true;
        }
        f58963b.j("ApplicationInfo is invalid");
        return false;
    }
}
