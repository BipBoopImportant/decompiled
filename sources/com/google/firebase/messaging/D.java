package com.google.firebase.messaging;

import F9.C6469a;
import F9.C6471c;
import Fb.f;
import Hc.i;
import K4.m;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import kc.j;
import mc.C10036b;
import nc.e;
import org.slf4j.Marker;
import xa.C8971l;
import xa.C8974o;

class D {

    /* renamed from: a  reason: collision with root package name */
    private final f f68304a;

    /* renamed from: b  reason: collision with root package name */
    private final I f68305b;

    /* renamed from: c  reason: collision with root package name */
    private final C6471c f68306c;

    /* renamed from: d  reason: collision with root package name */
    private final C10036b<i> f68307d;

    /* renamed from: e  reason: collision with root package name */
    private final C10036b<j> f68308e;

    /* renamed from: f  reason: collision with root package name */
    private final e f68309f;

    D(f fVar, I i10, C10036b<i> bVar, C10036b<j> bVar2, e eVar) {
        this(fVar, i10, new C6471c(fVar.k()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private C8971l<String> d(C8971l<Bundle> lVar) {
        return lVar.h(new m(), new C(this));
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f68304a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(UiComponentContainer.RESULT_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String j(C8971l lVar) {
        return h((Bundle) lVar.n(IOException.class));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            Fb.f r3 = r2.f68304a
            Fb.n r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f68305b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f68305b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f68305b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.e()
            r5.putString(r3, r4)
            nc.e r3 = r2.f68309f     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            r4 = 0
            xa.l r3 = r3.a(r4)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            java.lang.Object r3 = xa.C8974o.a(r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            com.google.firebase.installations.g r3 = (com.google.firebase.installations.g) r3     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            java.lang.String r3 = r3.b()     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            if (r4 != 0) goto L_0x007a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0076:
            r3 = move-exception
            goto L_0x0080
        L_0x0078:
            r3 = move-exception
            goto L_0x0080
        L_0x007a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0080:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L_0x0085:
            nc.e r3 = r2.f68309f
            xa.l r3 = r3.getId()
            java.lang.Object r3 = xa.C8974o.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.1.0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            mc.b<kc.j> r3 = r2.f68308e
            java.lang.Object r3 = r3.get()
            kc.j r3 = (kc.j) r3
            mc.b<Hc.i> r4 = r2.f68307d
            java.lang.Object r4 = r4.get()
            Hc.i r4 = (Hc.i) r4
            if (r3 == 0) goto L_0x00e2
            if (r4 == 0) goto L_0x00e2
            java.lang.String r0 = "fire-iid"
            kc.j$a r3 = r3.b(r0)
            kc.j$a r0 = kc.j.a.NONE
            if (r3 == r0) goto L_0x00e2
            int r3 = r3.b()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.D.k(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private C8971l<Bundle> m(String str, String str2, Bundle bundle) {
        try {
            k(str, str2, bundle);
            return this.f68306c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return C8974o.e(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public C8971l<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(m(I.c(this.f68304a), Marker.ANY_MARKER, bundle));
    }

    /* access modifiers changed from: package-private */
    public C8971l<C6469a> f() {
        return this.f68306c.a();
    }

    /* access modifiers changed from: package-private */
    public C8971l<String> g() {
        return d(m(I.c(this.f68304a), Marker.ANY_MARKER, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public C8971l<Void> l(boolean z10) {
        return this.f68306c.d(z10);
    }

    /* access modifiers changed from: package-private */
    public C8971l<?> n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(m(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    public C8971l<?> o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(m(str, "/topics/" + str2, bundle));
    }

    D(f fVar, I i10, C6471c cVar, C10036b<i> bVar, C10036b<j> bVar2, e eVar) {
        this.f68304a = fVar;
        this.f68305b = i10;
        this.f68306c = cVar;
        this.f68307d = bVar;
        this.f68308e = bVar2;
        this.f68309f = eVar;
    }
}
