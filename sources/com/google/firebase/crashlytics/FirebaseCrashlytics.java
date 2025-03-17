package com.google.firebase.crashlytics;

import Fb.f;
import Mb.h;
import Nb.a;
import Nb.d;
import Nb.g;
import Nb.l;
import Qb.C9243a;
import Qb.C9248f;
import Qb.C9251i;
import Qb.C9255m;
import Qb.C9267z;
import Qb.F;
import Qb.K;
import Vb.b;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import mc.C10035a;
import nc.e;
import xa.C8971l;

public class FirebaseCrashlytics {

    /* renamed from: a  reason: collision with root package name */
    final C9267z f68229a;

    private FirebaseCrashlytics(C9267z zVar) {
        this.f68229a = zVar;
    }

    static FirebaseCrashlytics b(f fVar, e eVar, C10035a<a> aVar, C10035a<Ib.a> aVar2, C10035a<Kc.a> aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context k10 = fVar.k();
        String packageName = k10.getPackageName();
        g f10 = g.f();
        f10.g("Initializing Firebase Crashlytics " + C9267z.q() + " for " + packageName);
        Rb.f fVar2 = new Rb.f(executorService, executorService2);
        Wb.g gVar = new Wb.g(k10);
        F f11 = new F(fVar);
        K k11 = new K(k10, packageName, eVar, f11);
        d dVar = new d(aVar);
        Mb.d dVar2 = new Mb.d(aVar2);
        C9255m mVar = new C9255m(f11, gVar);
        Nc.a.e(mVar);
        l lVar = new l(aVar3);
        C9267z zVar = r4;
        K k12 = k11;
        C9267z zVar2 = new C9267z(fVar, k11, dVar, f11, dVar2.e(), dVar2.d(), gVar, mVar, lVar, fVar2);
        String c10 = fVar.n().c();
        String m10 = C9251i.m(k10);
        List<C9248f> j10 = C9251i.j(k10);
        g f12 = g.f();
        f12.b("Mapping file ID is: " + m10);
        for (C9248f next : j10) {
            g.f().b(String.format("Build id for %s on %s: %s", new Object[]{next.c(), next.a(), next.b()}));
        }
        try {
            C9243a a10 = C9243a.a(k10, k12, c10, m10, j10, new Nb.f(k10));
            g f13 = g.f();
            f13.i("Installer package name is: " + a10.f62953d);
            F f14 = f11;
            String str = c10;
            Wb.g gVar2 = gVar;
            Yb.g l10 = Yb.g.l(k10, str, k12, new b(), a10.f62955f, a10.f62956g, gVar2, f14);
            l10.o(fVar2).d(executorService3, new h());
            C9267z zVar3 = zVar;
            if (zVar3.F(a10, l10)) {
                zVar3.o(l10);
            }
            return new FirebaseCrashlytics(zVar3);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) f.l().j(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public C8971l<Boolean> checkForUnsentReports() {
        return this.f68229a.j();
    }

    public void deleteUnsentReports() {
        this.f68229a.k();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f68229a.l();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f68229a.s();
    }

    public void log(String str) {
        this.f68229a.B(str);
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f68229a.C(th2, Collections.emptyMap());
        }
    }

    public void sendUnsentReports() {
        this.f68229a.G();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f68229a.H(Boolean.valueOf(z10));
    }

    public void setCustomKey(String str, boolean z10) {
        this.f68229a.I(str, Boolean.toString(z10));
    }

    public void setCustomKeys(Mb.g gVar) {
        throw null;
    }

    public void setUserId(String str) {
        this.f68229a.J(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f68229a.H(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.f68229a.I(str, Double.toString(d10));
    }

    public void setCustomKey(String str, float f10) {
        this.f68229a.I(str, Float.toString(f10));
    }

    public void setCustomKey(String str, int i10) {
        this.f68229a.I(str, Integer.toString(i10));
    }

    public void recordException(Throwable th2, Mb.g gVar) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        throw null;
    }

    public void setCustomKey(String str, long j10) {
        this.f68229a.I(str, Long.toString(j10));
    }

    public void setCustomKey(String str, String str2) {
        this.f68229a.I(str, str2);
    }
}
