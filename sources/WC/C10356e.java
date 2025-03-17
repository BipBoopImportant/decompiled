package wc;

import Ac.a;
import Ac.b;
import Fc.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.f;
import com.google.firebase.remoteconfig.c;
import j9.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mc.C10036b;
import nc.e;

/* renamed from: wc.e  reason: case insensitive filesystem */
public class C10356e {

    /* renamed from: i  reason: collision with root package name */
    private static final a f77593i = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f77594a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f77595b;

    /* renamed from: c  reason: collision with root package name */
    private final f f77596c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f77597d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Fb.f f77598e;

    /* renamed from: f  reason: collision with root package name */
    private final C10036b<c> f77599f;

    /* renamed from: g  reason: collision with root package name */
    private final e f77600g;

    /* renamed from: h  reason: collision with root package name */
    private final C10036b<j> f77601h;

    C10356e(Fb.f fVar, C10036b<c> bVar, e eVar, C10036b<j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f77598e = fVar;
        this.f77599f = bVar;
        this.f77600g = eVar;
        this.f77601h = bVar2;
        if (fVar == null) {
            this.f77597d = Boolean.FALSE;
            this.f77595b = aVar;
            this.f77596c = new f(new Bundle());
            return;
        }
        k.k().r(fVar, eVar, bVar2);
        Context k10 = fVar.k();
        f a10 = a(k10);
        this.f77596c = a10;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f77595b = aVar;
        aVar.Q(a10);
        aVar.O(k10);
        sessionManager.setApplicationContext(k10);
        this.f77597d = aVar.j();
        a aVar2 = f77593i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{b.b(fVar.n().e(), k10.getPackageName())}));
        }
    }

    private static f a(Context context) {
        Bundle bundle;
        f fVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            fVar = new f();
        }
        return fVar;
    }

    public static C10356e c() {
        return (C10356e) Fb.f.l().j(C10356e.class);
    }

    public Map<String, String> b() {
        return new HashMap(this.f77594a);
    }

    public boolean d() {
        Boolean bool = this.f77597d;
        return bool != null ? bool.booleanValue() : Fb.f.l().t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void e(java.lang.Boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            Fb.f.l()     // Catch:{ IllegalStateException -> 0x0054 }
            com.google.firebase.perf.config.a r0 = r1.f77595b     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r0 = r0.i()     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x001b
            Ac.a r2 = f77593i     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "Firebase Performance is permanently disabled"
            r2.f(r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            goto L_0x0052
        L_0x001b:
            com.google.firebase.perf.config.a r0 = r1.f77595b     // Catch:{ all -> 0x0019 }
            r0.P(r2)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0025
            r1.f77597d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x002d
        L_0x0025:
            com.google.firebase.perf.config.a r2 = r1.f77595b     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r2 = r2.j()     // Catch:{ all -> 0x0019 }
            r1.f77597d = r2     // Catch:{ all -> 0x0019 }
        L_0x002d:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r0 = r1.f77597d     // Catch:{ all -> 0x0019 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x003f
            Ac.a r2 = f77593i     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "Firebase Performance is Enabled"
            r2.f(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x0050
        L_0x003f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r0 = r1.f77597d     // Catch:{ all -> 0x0019 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0050
            Ac.a r2 = f77593i     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "Firebase Performance is Disabled"
            r2.f(r0)     // Catch:{ all -> 0x0019 }
        L_0x0050:
            monitor-exit(r1)
            return
        L_0x0052:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x0054:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C10356e.e(java.lang.Boolean):void");
    }

    public void f(boolean z10) {
        e(Boolean.valueOf(z10));
    }
}
