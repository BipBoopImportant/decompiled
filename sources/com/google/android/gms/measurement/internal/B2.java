package com.google.android.gms.measurement.internal;

import Q9.b;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.C7272d0;

final class B2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7272d0 f49535a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f49536b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7732z2 f49537c;

    B2(C7732z2 z2Var, C7272d0 d0Var, ServiceConnection serviceConnection) {
        this.f49535a = d0Var;
        this.f49536b = serviceConnection;
        this.f49537c = z2Var;
    }

    public final void run() {
        C7732z2 z2Var = this.f49537c;
        A2 a22 = z2Var.f50542b;
        String a10 = z2Var.f50541a;
        C7272d0 d0Var = this.f49535a;
        ServiceConnection serviceConnection = this.f49536b;
        Bundle a11 = a22.a(a10, d0Var);
        a22.f49520a.q().k();
        a22.f49520a.k();
        if (a11 != null) {
            long j10 = a11.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j10 == 0) {
                a22.f49520a.f().J().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a11.getString(Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    a22.f49520a.f().E().a("No referrer defined in Install Referrer response");
                } else {
                    a22.f49520a.f().I().b("InstallReferrer API result", string);
                    Q5 M10 = a22.f49520a.M();
                    Bundle A10 = M10.A(Uri.parse("?" + string));
                    if (A10 == null) {
                        a22.f49520a.f().E().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (A10.containsKey("gclid") || A10.containsKey("gbraid")) {
                            long j11 = a11.getLong("referrer_click_timestamp_server_seconds", 0) * 1000;
                            if (j11 > 0) {
                                A10.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == a22.f49520a.E().f50363h.a()) {
                            a22.f49520a.f().I().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (a22.f49520a.o()) {
                            a22.f49520a.E().f50363h.b(j10);
                            a22.f49520a.f().I().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            A10.putString("_cis", "referrer API v2");
                            a22.f49520a.G().j0("auto", "_cmp", A10, a10);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            b.b().c(a22.f49520a.zza(), serviceConnection);
        }
    }
}
