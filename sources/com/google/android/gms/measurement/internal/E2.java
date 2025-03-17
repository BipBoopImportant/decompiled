package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class E2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C2 f49583a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f49584b;

    public /* synthetic */ E2(C2 c22, String str) {
        this.f49583a = c22;
        this.f49584b = str;
    }

    public final Object call() {
        C2 c22 = this.f49583a;
        String str = this.f49584b;
        C7676r2 S02 = c22.n().S0(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        hashMap.put("gmp_version", 114010L);
        if (S02 != null) {
            String o10 = S02.o();
            if (o10 != null) {
                hashMap.put("app_version", o10);
            }
            hashMap.put("app_version_int", Long.valueOf(S02.V()));
            hashMap.put("dynamite_version", Long.valueOf(S02.w0()));
        }
        return hashMap;
    }
}
