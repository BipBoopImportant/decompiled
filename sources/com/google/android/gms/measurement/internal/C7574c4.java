package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.C7309h1;
import sa.V;

/* renamed from: com.google.android.gms.measurement.internal.c4  reason: case insensitive filesystem */
final class C7574c4 implements Application.ActivityLifecycleCallbacks, V {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f50093a;

    C7574c4(C7691t3 t3Var) {
        this.f50093a = t3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A[SYNTHETIC, Splitter:B:33:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4 A[Catch:{ RuntimeException -> 0x006c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5 A[Catch:{ RuntimeException -> 0x006c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void f(com.google.android.gms.measurement.internal.C7574c4 r10, boolean r11, android.net.Uri r12, java.lang.String r13, java.lang.String r14) {
        /*
            com.google.android.gms.measurement.internal.t3 r0 = r10.f50093a
            r0.k()
            com.google.android.gms.measurement.internal.t3 r0 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.Q5 r0 = r0.h()     // Catch:{ RuntimeException -> 0x006c }
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r2 = "_cis"
            java.lang.String r3 = "Activity created with data 'referrer' without required params"
            java.lang.String r4 = "utm_medium"
            java.lang.String r5 = "utm_source"
            java.lang.String r6 = "utm_campaign"
            r7 = 0
            java.lang.String r8 = "gclid"
            if (r1 == 0) goto L_0x0020
        L_0x001e:
            r0 = r7
            goto L_0x008c
        L_0x0020:
            boolean r1 = r14.contains(r8)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "gbraid"
            boolean r1 = r14.contains(r1)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            boolean r1 = r14.contains(r6)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            boolean r1 = r14.contains(r5)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            boolean r1 = r14.contains(r4)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "utm_id"
            boolean r1 = r14.contains(r1)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "dclid"
            boolean r1 = r14.contains(r1)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "srsltid"
            boolean r1 = r14.contains(r1)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "sfmc_id"
            boolean r1 = r14.contains(r1)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.i2 r0 = r0.D()     // Catch:{ RuntimeException -> 0x006c }
            r0.a(r3)     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x001e
        L_0x006c:
            r11 = move-exception
            goto L_0x015d
        L_0x006f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r9 = "https://google.com/search?"
            r1.<init>(r9)     // Catch:{ RuntimeException -> 0x006c }
            r1.append(r14)     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x006c }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x006c }
            android.os.Bundle r0 = r0.A(r1)     // Catch:{ RuntimeException -> 0x006c }
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = "referrer"
            r0.putString(r2, r1)     // Catch:{ RuntimeException -> 0x006c }
        L_0x008c:
            java.lang.String r1 = "_cmp"
            if (r11 == 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.Q5 r11 = r11.h()     // Catch:{ RuntimeException -> 0x006c }
            android.os.Bundle r11 = r11.A(r12)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 == 0) goto L_0x00ce
            java.lang.String r12 = "intent"
            r11.putString(r2, r12)     // Catch:{ RuntimeException -> 0x006c }
            boolean r12 = r11.containsKey(r8)     // Catch:{ RuntimeException -> 0x006c }
            if (r12 != 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00c2
            boolean r12 = r0.containsKey(r8)     // Catch:{ RuntimeException -> 0x006c }
            if (r12 == 0) goto L_0x00c2
            java.lang.String r12 = "_cer"
            java.lang.String r2 = "gclid=%s"
            java.lang.String r9 = r0.getString(r8)     // Catch:{ RuntimeException -> 0x006c }
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r2 = java.lang.String.format(r2, r9)     // Catch:{ RuntimeException -> 0x006c }
            r11.putString(r12, r2)     // Catch:{ RuntimeException -> 0x006c }
        L_0x00c2:
            com.google.android.gms.measurement.internal.t3 r12 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            r12.e1(r13, r1, r11)     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.t3 r12 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.W5 r12 = r12.f50420r     // Catch:{ RuntimeException -> 0x006c }
            r12.b(r13, r11)     // Catch:{ RuntimeException -> 0x006c }
        L_0x00ce:
            boolean r11 = android.text.TextUtils.isEmpty(r14)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 == 0) goto L_0x00d5
            return
        L_0x00d5:
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.h2 r11 = r11.f()     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.i2 r11 = r11.D()     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r12 = "Activity created with referrer"
            r11.b(r12, r14)     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.i r11 = r11.a()     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.K.f49693B0     // Catch:{ RuntimeException -> 0x006c }
            boolean r11 = r11.r(r12)     // Catch:{ RuntimeException -> 0x006c }
            r12 = 1
            java.lang.String r2 = "_ldl"
            java.lang.String r9 = "auto"
            if (r11 == 0) goto L_0x011b
            if (r0 == 0) goto L_0x0106
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            r11.e1(r13, r1, r0)     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.W5 r11 = r11.f50420r     // Catch:{ RuntimeException -> 0x006c }
            r11.b(r13, r0)     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x0115
        L_0x0106:
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.h2 r11 = r11.f()     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.i2 r11 = r11.D()     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r13 = "Referrer does not contain valid parameters"
            r11.b(r13, r14)     // Catch:{ RuntimeException -> 0x006c }
        L_0x0115:
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            r11.m0(r9, r2, r7, r12)     // Catch:{ RuntimeException -> 0x006c }
            return
        L_0x011b:
            boolean r11 = r14.contains(r8)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 == 0) goto L_0x014f
            boolean r11 = r14.contains(r6)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 != 0) goto L_0x0143
            boolean r11 = r14.contains(r5)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 != 0) goto L_0x0143
            boolean r11 = r14.contains(r4)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 != 0) goto L_0x0143
            java.lang.String r11 = "utm_term"
            boolean r11 = r14.contains(r11)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 != 0) goto L_0x0143
            java.lang.String r11 = "utm_content"
            boolean r11 = r14.contains(r11)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 == 0) goto L_0x014f
        L_0x0143:
            boolean r11 = android.text.TextUtils.isEmpty(r14)     // Catch:{ RuntimeException -> 0x006c }
            if (r11 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            r11.m0(r9, r2, r14, r12)     // Catch:{ RuntimeException -> 0x006c }
        L_0x014e:
            return
        L_0x014f:
            com.google.android.gms.measurement.internal.t3 r11 = r10.f50093a     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.h2 r11 = r11.f()     // Catch:{ RuntimeException -> 0x006c }
            com.google.android.gms.measurement.internal.i2 r11 = r11.D()     // Catch:{ RuntimeException -> 0x006c }
            r11.a(r3)     // Catch:{ RuntimeException -> 0x006c }
            return
        L_0x015d:
            com.google.android.gms.measurement.internal.t3 r10 = r10.f50093a
            com.google.android.gms.measurement.internal.h2 r10 = r10.f()
            com.google.android.gms.measurement.internal.i2 r10 = r10.E()
            java.lang.String r12 = "Throwable caught in handleReferrerForOnActivityCreated"
            r10.b(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7574c4.f(com.google.android.gms.measurement.internal.c4, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void a(C7309h1 h1Var, Bundle bundle) {
        try {
            this.f50093a.f().I().a("onActivityCreated");
            Intent intent = h1Var.f48935c;
            if (intent == null) {
                this.f50093a.r().E(h1Var, bundle);
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null) {
                if (uri.isHierarchical()) {
                    this.f50093a.h();
                    this.f50093a.q().B(new C7581d4(this, bundle == null, uri, Q5.d0(intent) ? "gs" : "auto", uri.getQueryParameter(Constants.REFERRER)));
                    this.f50093a.r().E(h1Var, bundle);
                    return;
                }
            }
            this.f50093a.r().E(h1Var, bundle);
        } catch (RuntimeException e10) {
            this.f50093a.f().E().b("Throwable caught in onActivityCreated", e10);
            this.f50093a.r().E(h1Var, bundle);
        } catch (Throwable th2) {
            this.f50093a.r().E(h1Var, bundle);
            throw th2;
        }
    }

    public final void b(C7309h1 h1Var, Bundle bundle) {
        this.f50093a.r().P(h1Var, bundle);
    }

    public final void c(C7309h1 h1Var) {
        this.f50093a.r().D(h1Var);
    }

    public final void d(C7309h1 h1Var) {
        C7575c5 t10 = this.f50093a.t();
        t10.q().B(new C7568b5(t10, t10.zzb().c()));
        this.f50093a.r().Q(h1Var);
    }

    public final void e(C7309h1 h1Var) {
        this.f50093a.r().O(h1Var);
        C7575c5 t10 = this.f50093a.t();
        t10.q().B(new C7589e5(t10, t10.zzb().c()));
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(C7309h1.x(activity), bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        c(C7309h1.x(activity));
    }

    public final void onActivityPaused(Activity activity) {
        e(C7309h1.x(activity));
    }

    public final void onActivityResumed(Activity activity) {
        d(C7309h1.x(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b(C7309h1.x(activity), bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
