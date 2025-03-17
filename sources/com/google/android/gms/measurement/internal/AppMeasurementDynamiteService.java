package com.google.android.gms.measurement.internal;

import K9.C6620s;
import T9.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C7255b1;
import com.google.android.gms.internal.measurement.C7264c1;
import com.google.android.gms.internal.measurement.C7282e1;
import com.google.android.gms.internal.measurement.C7309h1;
import com.google.android.gms.internal.measurement.T0;
import com.google.android.gms.internal.measurement.V0;
import com.google.android.gms.internal.measurement.W0;
import j0.C5445a;
import java.util.Map;
import sa.C;
import sa.I;
import sa.K;
import sa.V;

@DynamiteApi
public class AppMeasurementDynamiteService extends T0 {

    /* renamed from: a  reason: collision with root package name */
    P2 f49527a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, K> f49528b = new C5445a();

    class a implements I {

        /* renamed from: a  reason: collision with root package name */
        private C7255b1 f49529a;

        a(C7255b1 b1Var) {
            this.f49529a = b1Var;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f49529a.P2(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                P2 p22 = AppMeasurementDynamiteService.this.f49527a;
                if (p22 != null) {
                    p22.f().J().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    class b implements K {

        /* renamed from: a  reason: collision with root package name */
        private C7255b1 f49531a;

        b(C7255b1 b1Var) {
            this.f49531a = b1Var;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f49531a.P2(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                P2 p22 = AppMeasurementDynamiteService.this.f49527a;
                if (p22 != null) {
                    p22.f().J().b("Event listener threw exception", e10);
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, W0 w02) {
        try {
            w02.U0();
        } catch (RemoteException e10) {
            ((P2) C6620s.l(appMeasurementDynamiteService.f49527a)).f().J().b("Failed to call IDynamiteUploadBatchesCallback", e10);
        }
    }

    private final void J3(V0 v02, String str) {
        zza();
        this.f49527a.M().Q(v02, str);
    }

    private final void zza() {
        if (this.f49527a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j10) {
        zza();
        this.f49527a.x().y(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza();
        this.f49527a.G().i0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        zza();
        this.f49527a.G().b0((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) {
        zza();
        this.f49527a.x().C(str, j10);
    }

    public void generateEventId(V0 v02) {
        zza();
        long N02 = this.f49527a.M().N0();
        zza();
        this.f49527a.M().O(v02, N02);
    }

    public void getAppInstanceId(V0 v02) {
        zza();
        this.f49527a.q().B(new M2(this, v02));
    }

    public void getCachedAppInstanceId(V0 v02) {
        zza();
        J3(v02, this.f49527a.G().x0());
    }

    public void getConditionalUserProperties(String str, String str2, V0 v02) {
        zza();
        this.f49527a.q().B(new C7651n4(this, v02, str, str2));
    }

    public void getCurrentScreenClass(V0 v02) {
        zza();
        J3(v02, this.f49527a.G().y0());
    }

    public void getCurrentScreenName(V0 v02) {
        zza();
        J3(v02, this.f49527a.G().z0());
    }

    public void getGmpAppId(V0 v02) {
        zza();
        J3(v02, this.f49527a.G().A0());
    }

    public void getMaxUserProperties(String str, V0 v02) {
        zza();
        this.f49527a.G();
        C7691t3.D(str);
        zza();
        this.f49527a.M().N(v02, 25);
    }

    public void getSessionId(V0 v02) {
        zza();
        this.f49527a.G().M(v02);
    }

    public void getTestFlag(V0 v02, int i10) {
        zza();
        if (i10 == 0) {
            this.f49527a.M().Q(v02, this.f49527a.G().B0());
        } else if (i10 == 1) {
            this.f49527a.M().O(v02, this.f49527a.G().w0().longValue());
        } else if (i10 == 2) {
            Q5 M10 = this.f49527a.M();
            double doubleValue = this.f49527a.G().u0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                v02.o(bundle);
            } catch (RemoteException e10) {
                M10.f50228a.f().J().b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            this.f49527a.M().N(v02, this.f49527a.G().v0().intValue());
        } else if (i10 == 4) {
            this.f49527a.M().S(v02, this.f49527a.G().t0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, V0 v02) {
        zza();
        this.f49527a.q().B(new C7719x3(this, v02, str, str2, z10));
    }

    public void initForTests(Map map) {
        zza();
    }

    public void initialize(T9.b bVar, C7282e1 e1Var, long j10) {
        P2 p22 = this.f49527a;
        if (p22 == null) {
            this.f49527a = P2.a((Context) C6620s.l((Context) d.K3(bVar)), e1Var, Long.valueOf(j10));
        } else {
            p22.f().J().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(V0 v02) {
        zza();
        this.f49527a.q().B(new C7596f5(this, v02));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zza();
        this.f49527a.G().k0(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, V0 v02, long j10) {
        Bundle bundle2;
        zza();
        C6620s.f(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f49527a.q().B(new R3(this, v02, new J(str2, new F(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, T9.b bVar, T9.b bVar2, T9.b bVar3) {
        zza();
        Object obj = null;
        Object K32 = bVar == null ? null : d.K3(bVar);
        Object K33 = bVar2 == null ? null : d.K3(bVar2);
        if (bVar3 != null) {
            obj = d.K3(bVar3);
        }
        this.f49527a.f().x(i10, true, false, str, K32, K33, obj);
    }

    public void onActivityCreated(T9.b bVar, Bundle bundle, long j10) {
        zza();
        onActivityCreatedByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), bundle, j10);
    }

    public void onActivityCreatedByScionActivityInfo(C7309h1 h1Var, Bundle bundle, long j10) {
        zza();
        V s02 = this.f49527a.G().s0();
        if (s02 != null) {
            this.f49527a.G().G0();
            s02.a(h1Var, bundle);
        }
    }

    public void onActivityDestroyed(T9.b bVar, long j10) {
        zza();
        onActivityDestroyedByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), j10);
    }

    public void onActivityDestroyedByScionActivityInfo(C7309h1 h1Var, long j10) {
        zza();
        V s02 = this.f49527a.G().s0();
        if (s02 != null) {
            this.f49527a.G().G0();
            s02.c(h1Var);
        }
    }

    public void onActivityPaused(T9.b bVar, long j10) {
        zza();
        onActivityPausedByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), j10);
    }

    public void onActivityPausedByScionActivityInfo(C7309h1 h1Var, long j10) {
        zza();
        V s02 = this.f49527a.G().s0();
        if (s02 != null) {
            this.f49527a.G().G0();
            s02.e(h1Var);
        }
    }

    public void onActivityResumed(T9.b bVar, long j10) {
        zza();
        onActivityResumedByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), j10);
    }

    public void onActivityResumedByScionActivityInfo(C7309h1 h1Var, long j10) {
        zza();
        V s02 = this.f49527a.G().s0();
        if (s02 != null) {
            this.f49527a.G().G0();
            s02.d(h1Var);
        }
    }

    public void onActivitySaveInstanceState(T9.b bVar, V0 v02, long j10) {
        zza();
        onActivitySaveInstanceStateByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), v02, j10);
    }

    public void onActivitySaveInstanceStateByScionActivityInfo(C7309h1 h1Var, V0 v02, long j10) {
        zza();
        V s02 = this.f49527a.G().s0();
        Bundle bundle = new Bundle();
        if (s02 != null) {
            this.f49527a.G().G0();
            s02.b(h1Var, bundle);
        }
        try {
            v02.o(bundle);
        } catch (RemoteException e10) {
            this.f49527a.f().J().b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(T9.b bVar, long j10) {
        zza();
        onActivityStartedByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), j10);
    }

    public void onActivityStartedByScionActivityInfo(C7309h1 h1Var, long j10) {
        zza();
        if (this.f49527a.G().s0() != null) {
            this.f49527a.G().G0();
        }
    }

    public void onActivityStopped(T9.b bVar, long j10) {
        zza();
        onActivityStoppedByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), j10);
    }

    public void onActivityStoppedByScionActivityInfo(C7309h1 h1Var, long j10) {
        zza();
        if (this.f49527a.G().s0() != null) {
            this.f49527a.G().G0();
        }
    }

    public void performAction(Bundle bundle, V0 v02, long j10) {
        zza();
        v02.o((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C7255b1 b1Var) {
        K k10;
        zza();
        synchronized (this.f49528b) {
            try {
                k10 = this.f49528b.get(Integer.valueOf(b1Var.zza()));
                if (k10 == null) {
                    k10 = new b(b1Var);
                    this.f49528b.put(Integer.valueOf(b1Var.zza()), k10);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f49527a.G().p0(k10);
    }

    public void resetAnalyticsData(long j10) {
        zza();
        this.f49527a.G().H(j10);
    }

    public void retrieveAndUploadBatches(W0 w02) {
        zza();
        if (this.f49527a.y().H((String) null, K.f49715M0)) {
            this.f49527a.G().d0(new C(this, w02));
        }
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zza();
        if (bundle == null) {
            this.f49527a.f().E().a("Conditional user property must not be null");
        } else {
            this.f49527a.G().L(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) {
        zza();
        this.f49527a.G().R0(bundle, j10);
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        zza();
        this.f49527a.G().b1(bundle, j10);
    }

    public void setCurrentScreen(T9.b bVar, String str, String str2, long j10) {
        zza();
        setCurrentScreenByScionActivityInfo(C7309h1.x((Activity) C6620s.l((Activity) d.K3(bVar))), str, str2, j10);
    }

    public void setCurrentScreenByScionActivityInfo(C7309h1 h1Var, String str, String str2, long j10) {
        zza();
        this.f49527a.J().F(h1Var, str, str2);
    }

    public void setDataCollectionEnabled(boolean z10) {
        zza();
        this.f49527a.G().f1(z10);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        zza();
        this.f49527a.G().Q0(bundle);
    }

    public void setEventInterceptor(C7255b1 b1Var) {
        zza();
        a aVar = new a(b1Var);
        if (this.f49527a.q().I()) {
            this.f49527a.G().o0(aVar);
        } else {
            this.f49527a.q().B(new I4(this, aVar));
        }
    }

    public void setInstanceIdProvider(C7264c1 c1Var) {
        zza();
    }

    public void setMeasurementEnabled(boolean z10, long j10) {
        zza();
        this.f49527a.G().b0(Boolean.valueOf(z10));
    }

    public void setMinimumSessionDuration(long j10) {
        zza();
    }

    public void setSessionTimeoutDuration(long j10) {
        zza();
        this.f49527a.G().g1(j10);
    }

    public void setSgtmDebugInfo(Intent intent) {
        zza();
        this.f49527a.G().I(intent);
    }

    public void setUserId(String str, long j10) {
        zza();
        this.f49527a.G().e0(str, j10);
    }

    public void setUserProperty(String str, String str2, T9.b bVar, boolean z10, long j10) {
        zza();
        this.f49527a.G().n0(str, str2, d.K3(bVar), z10, j10);
    }

    public void unregisterOnMeasurementEventListener(C7255b1 b1Var) {
        K remove;
        zza();
        synchronized (this.f49528b) {
            remove = this.f49528b.remove(Integer.valueOf(b1Var.zza()));
        }
        if (remove == null) {
            remove = new b(b1Var);
        }
        this.f49527a.G().Y0(remove);
    }
}
