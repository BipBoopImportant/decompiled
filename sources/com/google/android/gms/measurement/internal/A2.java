package com.google.android.gms.measurement.internal;

import S9.b;
import S9.c;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7272d0;

public final class A2 {

    /* renamed from: a  reason: collision with root package name */
    final P2 f49520a;

    A2(C7728y5 y5Var) {
        this.f49520a = y5Var.D0();
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, C7272d0 d0Var) {
        this.f49520a.q().k();
        if (d0Var == null) {
            this.f49520a.f().J().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle o10 = d0Var.o(bundle);
            if (o10 != null) {
                return o10;
            }
            this.f49520a.f().E().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f49520a.f().E().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        try {
            b a10 = c.a(this.f49520a.zza());
            if (a10 != null) {
                return a10.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f49520a.f().I().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f49520a.f().I().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
