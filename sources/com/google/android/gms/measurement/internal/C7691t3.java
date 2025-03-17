package com.google.android.gms.measurement.internal;

import J4.a;
import K9.C6620s;
import XH.C16807N;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.p;
import com.google.android.gms.internal.measurement.C7297f7;
import com.google.android.gms.internal.measurement.V0;
import j0.C5445a;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10099c;
import ob.C10101e;
import sa.C8750c;
import sa.C8768v;
import sa.D;
import sa.E;
import sa.H;
import sa.I;
import sa.J;
import sa.K;
import sa.M;
import sa.N;
import sa.O;
import sa.P;
import sa.Q;
import sa.S;
import sa.T;
import sa.U;
import sa.V;
import sa.Y;

/* renamed from: com.google.android.gms.measurement.internal.t3  reason: case insensitive filesystem */
public final class C7691t3 extends B1 {

    /* renamed from: c  reason: collision with root package name */
    private C7574c4 f50405c;

    /* renamed from: d  reason: collision with root package name */
    private I f50406d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<K> f50407e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f50408f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f50409g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private final Object f50410h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f50411i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f50412j = 1;

    /* renamed from: k  reason: collision with root package name */
    private A f50413k;

    /* renamed from: l  reason: collision with root package name */
    private A f50414l;

    /* renamed from: m  reason: collision with root package name */
    private PriorityQueue<C7645m5> f50415m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f50416n;

    /* renamed from: o  reason: collision with root package name */
    private C7671q3 f50417o = C7671q3.f50297c;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicLong f50418p = new AtomicLong(0);

    /* renamed from: q  reason: collision with root package name */
    private long f50419q = -1;

    /* renamed from: r  reason: collision with root package name */
    final W5 f50420r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f50421s = true;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public A f50422t;

    /* renamed from: u  reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f50423u;

    /* renamed from: v  reason: collision with root package name */
    private A f50424v;

    /* renamed from: w  reason: collision with root package name */
    private final S5 f50425w = new V3(this);

    protected C7691t3(P2 p22) {
        super(p22);
        this.f50420r = new W5(p22);
    }

    static /* synthetic */ int B(C7691t3 t3Var, Throwable th2) {
        String message = th2.getMessage();
        t3Var.f50416n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            t3Var.f50416n = true;
        }
        return 1;
    }

    public static int D(String str) {
        C6620s.f(str);
        return 25;
    }

    private final void K(Bundle bundle, int i10, long j10) {
        w();
        String h10 = C7671q3.h(bundle);
        if (h10 != null) {
            f().K().b("Ignoring invalid consent setting", h10);
            f().K().a("Valid consent values are 'granted', 'denied'");
        }
        boolean I10 = q().I();
        C7671q3 c10 = C7671q3.c(bundle, i10);
        if (c10.y()) {
            P(c10, I10);
        }
        C b10 = C.b(bundle, i10);
        if (b10.k()) {
            N(b10, I10);
        }
        Boolean e10 = C.e(bundle);
        if (e10 != null) {
            String str = i10 == -30 ? "tcf" : "app";
            if (I10) {
                l0(str, "allow_personalized_ads", e10.toString(), j10);
            } else {
                n0(str, "allow_personalized_ads", e10.toString(), false, j10);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void N0() {
        k();
        String a10 = e().f50370o.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                l0("app", "_npa", (Object) null, zzb().a());
            } else {
                l0("app", "_npa", Long.valueOf("true".equals(a10) ? 1 : 0), zzb().a());
            }
        }
        if (!this.f50228a.o() || !this.f50421s) {
            f().D().a("Updating Scion state (FE)");
            s().h0();
            return;
        }
        f().D().a("Recording app launch after enabling measurement for the first time (FE)");
        E0();
        t().f50096e.a();
        q().B(new H3(this));
    }

    public static /* synthetic */ void R(C7691t3 t3Var, SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            t3Var.f().I().a("IABTCF_TCString change picked up in listener.");
            ((A) C6620s.l(t3Var.f50424v)).b(500);
        }
    }

    public static /* synthetic */ void S(C7691t3 t3Var, Bundle bundle) {
        Bundle bundle2;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle(t3Var.e().f50357A.a());
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    t3Var.h();
                    if (Q5.f0(obj)) {
                        t3Var.h();
                        Q5.W(t3Var.f50425w, 27, (String) null, (String) null, 0);
                    }
                    t3Var.f().K().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (Q5.E0(next)) {
                    t3Var.f().K().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (t3Var.h().j0("param", next, t3Var.a().o((String) null, false), obj)) {
                    t3Var.h().M(bundle2, next, obj);
                }
            }
            t3Var.h();
            if (Q5.e0(bundle2, t3Var.a().y())) {
                t3Var.h();
                Q5.W(t3Var.f50425w, 26, (String) null, (String) null, 0);
                t3Var.f().K().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        t3Var.e().f50357A.b(bundle2);
        if (!bundle.isEmpty() || t3Var.a().r(K.f49741Z0)) {
            t3Var.s().B(bundle2);
        }
    }

    static /* synthetic */ void S0(C7691t3 t3Var, int i10) {
        if (t3Var.f50413k == null) {
            t3Var.f50413k = new F3(t3Var, t3Var.f50228a);
        }
        t3Var.f50413k.b(((long) i10) * 1000);
    }

    public static /* synthetic */ void T(C7691t3 t3Var, Bundle bundle, long j10) {
        if (TextUtils.isEmpty(t3Var.m().G())) {
            t3Var.K(bundle, 0, j10);
        } else {
            t3Var.f().K().a("Using developer consent only; google app id found");
        }
    }

    static /* synthetic */ void T0(C7691t3 t3Var, Bundle bundle) {
        Bundle bundle2 = bundle;
        t3Var.k();
        t3Var.w();
        C6620s.l(bundle);
        String f10 = C6620s.f(bundle2.getString("name"));
        if (!t3Var.f50228a.o()) {
            t3Var.f().I().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        P5 p52 = new P5(f10, 0, (Object) null, "");
        try {
            J F10 = t3Var.h().F(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true, true);
            String string = bundle2.getString("app_id");
            long j10 = bundle2.getLong("creation_timestamp");
            boolean z10 = bundle2.getBoolean("active");
            C7597g gVar = r4;
            C7597g gVar2 = new C7597g(string, "", p52, j10, z10, bundle2.getString("trigger_event_name"), (J) null, bundle2.getLong("trigger_timeout"), (J) null, bundle2.getLong("time_to_live"), F10);
            t3Var.s().H(gVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void U(C7691t3 t3Var, C7671q3 q3Var, long j10, boolean z10, boolean z11) {
        t3Var.k();
        t3Var.w();
        C7671q3 K10 = t3Var.e().K();
        if (j10 <= t3Var.f50419q && C7671q3.l(K10.b(), q3Var.b())) {
            t3Var.f().H().b("Dropped out-of-date consent setting, proposed settings", q3Var);
        } else if (t3Var.e().y(q3Var)) {
            t3Var.f().I().b("Setting storage consent(FE)", q3Var);
            t3Var.f50419q = j10;
            if (t3Var.s().l0()) {
                t3Var.s().q0(z10);
            } else {
                t3Var.s().Y(z10);
            }
            if (z11) {
                t3Var.s().R(new AtomicReference());
            }
        } else {
            t3Var.f().H().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(q3Var.b()));
        }
    }

    public static /* synthetic */ void W(C7691t3 t3Var, String str) {
        if (t3Var.m().K(str)) {
            t3Var.m().I();
        }
    }

    private final void W0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        q().B(new I3(this, str, str2, j10, Q5.B(bundle), z10, z11, z12, str3));
    }

    public static /* synthetic */ void X(C7691t3 t3Var, List list) {
        t3Var.k();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> I10 = t3Var.e().I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7645m5 m5Var = (C7645m5) it.next();
                if (!I10.contains(m5Var.f50241c) || I10.get(m5Var.f50241c).longValue() < m5Var.f50240b) {
                    t3Var.C0().add(m5Var);
                }
            }
            t3Var.K0();
        }
    }

    public static /* synthetic */ void Y(C7691t3 t3Var, AtomicReference atomicReference) {
        Bundle a10 = t3Var.e().f50371p.a();
        C7685s4 s10 = t3Var.s();
        if (a10 == null) {
            a10 = new Bundle();
        }
        s10.S(atomicReference, a10);
    }

    public static /* synthetic */ void Z(C7691t3 t3Var, AtomicReference atomicReference, C7693t5 t5Var, String str, int i10, Throwable th2, byte[] bArr, Map map) {
        t3Var.k();
        boolean z10 = (i10 == 200 || i10 == 204 || i10 == 304) && th2 == null;
        if (z10) {
            t3Var.f().I().b("[sgtm] Upload succeeded for row_id", Long.valueOf(t5Var.f50427a));
        } else {
            t3Var.f().J().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(t5Var.f50427a), Integer.valueOf(i10), th2);
        }
        t3Var.s().G(new C7583e(t5Var.f50427a, z10 ? Y.SUCCESS.zza() : Y.FAILURE.zza(), t5Var.f50432f));
        t3Var.f().I().c("[sgtm] Updated status for row_id", Long.valueOf(t5Var.f50427a), z10 ? "SUCCESS" : "FAILURE");
        synchronized (atomicReference) {
            atomicReference.set(Boolean.valueOf(z10));
            atomicReference.notifyAll();
        }
    }

    /* access modifiers changed from: private */
    public final void c0(Boolean bool, boolean z10) {
        k();
        w();
        f().D().b("Setting app measurement enabled (FE)", bool);
        e().t(bool);
        if (z10) {
            e().C(bool);
        }
        if (this.f50228a.p() || (bool != null && !bool.booleanValue())) {
            N0();
        }
    }

    static /* synthetic */ void d1(C7691t3 t3Var, Bundle bundle) {
        Bundle bundle2 = bundle;
        t3Var.k();
        t3Var.w();
        C6620s.l(bundle);
        String string = bundle2.getString("name");
        String string2 = bundle2.getString("origin");
        C6620s.f(string);
        C6620s.f(string2);
        C6620s.l(bundle2.get("value"));
        if (!t3Var.f50228a.o()) {
            t3Var.f().I().a("Conditional property not set since app measurement is disabled");
            return;
        }
        P5 p52 = new P5(string, bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string2);
        try {
            J F10 = t3Var.h().F(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0, true, true);
            J F11 = t3Var.h().F(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0, true, true);
            J F12 = t3Var.h().F(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0, true, true);
            t3Var.s().H(new C7597g(bundle2.getString("app_id"), string2, p52, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), F11, bundle2.getLong("trigger_timeout"), F10, bundle2.getLong("time_to_live"), F12));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void h0(String str, String str2, long j10, Object obj) {
        q().B(new L3(this, str, str2, obj, j10));
    }

    private final boolean q0(C7693t5 t5Var) {
        try {
            URL url = new URI(t5Var.f50429c).toURL();
            AtomicReference atomicReference = new AtomicReference();
            String F10 = m().F();
            f().I().d("[sgtm] Uploading data from app. row_id, url, uncompressed size", Long.valueOf(t5Var.f50427a), t5Var.f50429c, Integer.valueOf(t5Var.f50428b.length));
            if (!TextUtils.isEmpty(t5Var.f50433g)) {
                f().I().c("[sgtm] Uploading data from app. row_id", Long.valueOf(t5Var.f50427a), t5Var.f50433g);
            }
            HashMap hashMap = new HashMap();
            for (String next : t5Var.f50430d.keySet()) {
                String string = t5Var.f50430d.getString(next);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                }
            }
            C7595f4 g10 = g();
            byte[] bArr = t5Var.f50428b;
            C7726y3 y3Var = new C7726y3(this, atomicReference, t5Var);
            g10.m();
            C6620s.l(url);
            C6620s.l(bArr);
            C6620s.l(y3Var);
            g10.q().x(new C7609h4(g10, F10, url, bArr, hashMap, y3Var));
            try {
                Q5 h10 = h();
                long j10 = 60000;
                long a10 = h10.zzb().a() + 60000;
                synchronized (atomicReference) {
                    while (atomicReference.get() == null && j10 > 0) {
                        atomicReference.wait(j10);
                        j10 = a10 - h10.zzb().a();
                    }
                }
            } catch (InterruptedException unused) {
                f().J().a("[sgtm] Interrupted waiting for uploading batch");
            } catch (Throwable th2) {
                throw th2;
            }
            return atomicReference.get() == Boolean.TRUE;
        } catch (MalformedURLException | URISyntaxException e10) {
            f().E().d("[sgtm] Bad upload url for row_id", t5Var.f50429c, Long.valueOf(t5Var.f50427a), e10);
            return false;
        }
    }

    public final String A0() {
        if (this.f50228a.N() != null) {
            return this.f50228a.N();
        }
        try {
            return new C8768v(zza(), this.f50228a.Q()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f50228a.f().E().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final String B0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) q().t(atomicReference, 15000, "String test flag value", new K3(this, atomicReference));
    }

    /* access modifiers changed from: package-private */
    @TargetApi(30)
    public final PriorityQueue<C7645m5> C0() {
        if (this.f50415m == null) {
            this.f50415m = new PriorityQueue<>(Comparator.comparing(new C7712w3(), new C7705v3()));
        }
        return this.f50415m;
    }

    public final void D0() {
        k();
        w();
        C7685s4 s10 = s();
        s10.k();
        s10.w();
        if (!s10.m0() || s10.h().F0() >= 242600) {
            s().b0();
        }
    }

    public final void E0() {
        k();
        w();
        if (this.f50228a.s()) {
            Boolean E10 = a().E("google_analytics_deferred_deep_link_enabled");
            if (E10 != null && E10.booleanValue()) {
                f().D().a("Deferred Deep Link feature enabled.");
                q().B(new S(this));
            }
            s().c0();
            this.f50421s = false;
            String O10 = e().O();
            if (!TextUtils.isEmpty(O10)) {
                b().m();
                if (!O10.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", O10);
                    e1("auto", "_ou", bundle);
                }
            }
        }
    }

    public final ArrayList<Bundle> F(String str, String str2) {
        if (q().I()) {
            f().E().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C7590f.a()) {
            f().E().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f50228a.q().t(atomicReference, 5000, "get conditional user properties", new P3(this, atomicReference, (String) null, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return Q5.r0(list);
            }
            f().E().b("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    public final void F0() {
        k();
        A a10 = this.f50414l;
        if (a10 != null) {
            a10.a();
        }
    }

    public final Map<String, Object> G(String str, String str2, boolean z10) {
        if (q().I()) {
            f().E().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C7590f.a()) {
            f().E().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f50228a.q().t(atomicReference, 5000, "get user properties", new T3(this, atomicReference, (String) null, str, str2, z10));
            List<P5> list = (List) atomicReference.get();
            if (list == null) {
                f().E().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                return Collections.emptyMap();
            }
            C5445a aVar = new C5445a(list.size());
            for (P5 p52 : list) {
                Object x10 = p52.x();
                if (x10 != null) {
                    aVar.put(p52.f49912b, x10);
                }
            }
            return aVar;
        }
    }

    public final void G0() {
        if ((zza().getApplicationContext() instanceof Application) && this.f50405c != null) {
            ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f50405c);
        }
    }

    public final void H(long j10) {
        V0((String) null);
        q().B(new O3(this, j10));
    }

    /* access modifiers changed from: package-private */
    public final void H0() {
        if (C7297f7.a() && a().r(K.f49725R0)) {
            if (q().I()) {
                f().E().a("Cannot get trigger URIs from analytics worker thread");
            } else if (C7590f.a()) {
                f().E().a("Cannot get trigger URIs from main thread");
            } else {
                w();
                f().I().a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                q().t(atomicReference, 10000, "get trigger URIs", new M(this, atomicReference));
                List list = (List) atomicReference.get();
                if (list == null) {
                    f().E().a("Timed out waiting for get trigger URIs");
                } else {
                    q().B(new P(this, list));
                }
            }
        }
    }

    public final void I(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            f().H().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            f().H().a("Preview Mode was not enabled.");
            a().L((String) null);
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (!TextUtils.isEmpty(queryParameter2)) {
            f().H().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            a().L(queryParameter2);
        }
    }

    public final void I0() {
        k();
        if (e().f50377v.b()) {
            f().D().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = e().f50378w.a();
        e().f50378w.b(1 + a10);
        if (a10 >= 5) {
            f().J().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f50377v.a(true);
            return;
        }
        if (this.f50422t == null) {
            this.f50422t = new M3(this, this.f50228a);
        }
        this.f50422t.b(0);
    }

    public final void J(Bundle bundle) {
        L(bundle, zzb().a());
    }

    public final void J0() {
        k();
        f().D().a("Handle tcf update.");
        C7631k5 c10 = C7631k5.c(e().F());
        f().I().b("Tcf preferences read", c10);
        if (e().z(c10)) {
            Bundle b10 = c10.b();
            f().I().b("Consent generated from Tcf", b10);
            if (b10 != Bundle.EMPTY) {
                K(b10, -30, zzb().a());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c10.e());
            e1("auto", "_tcf", bundle);
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(30)
    public final void K0() {
        C7645m5 poll;
        a O02;
        k();
        this.f50416n = false;
        if (!C0().isEmpty() && !this.f50411i && (poll = C0().poll()) != null && (O02 = h().O0()) != null) {
            this.f50411i = true;
            f().I().b("Registering trigger URI", poll.f50239a);
            C10101e<C16807N> c10 = O02.c(Uri.parse(poll.f50239a));
            if (c10 == null) {
                this.f50411i = false;
                C0().add(poll);
                return;
            }
            C10099c.a(c10, new C3(this, poll), new D3(this));
        }
    }

    public final void L(Bundle bundle, long j10) {
        C6620s.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            f().J().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C6620s.l(bundle2);
        Class<String> cls = String.class;
        D.a(bundle2, "app_id", cls, null);
        D.a(bundle2, "origin", cls, null);
        D.a(bundle2, "name", cls, null);
        D.a(bundle2, "value", Object.class, null);
        D.a(bundle2, "trigger_event_name", cls, null);
        Class<Long> cls2 = Long.class;
        D.a(bundle2, "trigger_timeout", cls2, 0L);
        D.a(bundle2, "timed_out_event_name", cls, null);
        Class<Bundle> cls3 = Bundle.class;
        D.a(bundle2, "timed_out_event_params", cls3, null);
        D.a(bundle2, "triggered_event_name", cls, null);
        D.a(bundle2, "triggered_event_params", cls3, null);
        D.a(bundle2, "time_to_live", cls2, 0L);
        D.a(bundle2, "expired_event_name", cls, null);
        D.a(bundle2, "expired_event_params", cls3, null);
        C6620s.f(bundle2.getString("name"));
        C6620s.f(bundle2.getString("origin"));
        C6620s.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (h().p0(string) != 0) {
            f().E().b("Invalid conditional user property name", d().g(string));
        } else if (h().u(string, obj) != 0) {
            f().E().c("Invalid conditional user property value", d().g(string), obj);
        } else {
            Object y02 = h().y0(string, obj);
            if (y02 == null) {
                f().E().c("Unable to normalize conditional user property value", d().g(string), obj);
                return;
            }
            D.b(bundle2, y02);
            long j11 = bundle2.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j11 <= 15552000000L && j11 >= 1)) {
                long j12 = bundle2.getLong("time_to_live");
                if (j12 > 15552000000L || j12 < 1) {
                    f().E().c("Invalid conditional user property time to live", d().g(string), Long.valueOf(j12));
                } else {
                    q().B(new N3(this, bundle2));
                }
            } else {
                f().E().c("Invalid conditional user property timeout", d().g(string), Long.valueOf(j11));
            }
        }
    }

    public final void L0() {
        k();
        f().D().a("Register tcfPrefChangeListener.");
        if (this.f50423u == null) {
            this.f50424v = new J3(this, this.f50228a);
            this.f50423u = new U(this);
        }
        e().F().registerOnSharedPreferenceChangeListener(this.f50423u);
    }

    public final void M(V0 v02) {
        q().B(new S3(this, v02));
    }

    /* access modifiers changed from: package-private */
    public final boolean M0() {
        return this.f50416n;
    }

    /* access modifiers changed from: package-private */
    public final void N(C c10, boolean z10) {
        Y3 y32 = new Y3(this, c10);
        if (z10) {
            k();
            y32.run();
            return;
        }
        q().B(y32);
    }

    /* access modifiers changed from: package-private */
    public final void O(C7671q3 q3Var) {
        k();
        boolean z10 = (q3Var.x() && q3Var.w()) || s().k0();
        if (z10 != this.f50228a.p()) {
            this.f50228a.v(z10);
            Boolean M10 = e().M();
            if (!z10 || M10 == null || M10.booleanValue()) {
                c0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void P(C7671q3 q3Var, boolean z10) {
        boolean z11;
        boolean z12;
        C7671q3 q3Var2;
        boolean z13;
        E e10;
        w();
        int b10 = q3Var.b();
        if (b10 != -10 && q3Var.r() == (e10 = E.UNINITIALIZED) && q3Var.t() == e10) {
            f().K().a("Ignoring empty consent settings");
            return;
        }
        synchronized (this.f50410h) {
            try {
                z11 = false;
                if (C7671q3.l(b10, this.f50417o.b())) {
                    z13 = q3Var.s(this.f50417o);
                    if (q3Var.x() && !this.f50417o.x()) {
                        z11 = true;
                    }
                    C7671q3 o10 = q3Var.o(this.f50417o);
                    this.f50417o = o10;
                    q3Var2 = o10;
                    z12 = z11;
                    z11 = true;
                } else {
                    q3Var2 = q3Var;
                    z13 = false;
                    z12 = false;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (!z11) {
            f().H().b("Ignoring lower-priority consent settings, proposed settings", q3Var2);
            return;
        }
        long andIncrement = this.f50418p.getAndIncrement();
        if (z13) {
            V0((String) null);
            C7567b4 b4Var = new C7567b4(this, q3Var2, andIncrement, z12);
            if (z10) {
                k();
                b4Var.run();
                return;
            }
            q().E(b4Var);
            return;
        }
        C7560a4 a4Var = new C7560a4(this, q3Var2, andIncrement, z12);
        if (z10) {
            k();
            a4Var.run();
        } else if (b10 == 30 || b10 == -10) {
            q().E(a4Var);
        } else {
            q().B(a4Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void P0(long j10) {
        k();
        w();
        f().D().a("Resetting analytics data (FE)");
        C7575c5 t10 = t();
        t10.k();
        t10.f50097f.b();
        m().I();
        boolean o10 = this.f50228a.o();
        C7683s2 e10 = e();
        e10.f50362g.b(j10);
        if (!TextUtils.isEmpty(e10.e().f50379x.a())) {
            e10.f50379x.b((String) null);
        }
        e10.f50373r.b(0);
        e10.f50374s.b(0);
        if (!e10.a().W()) {
            e10.E(!o10);
        }
        e10.f50380y.b((String) null);
        e10.f50381z.b(0);
        e10.f50357A.b((Bundle) null);
        s().f0();
        t().f50096e.a();
        this.f50421s = !o10;
    }

    public final void Q0(Bundle bundle) {
        q().B(new O(this, bundle == null ? new Bundle() : new Bundle(bundle)));
    }

    public final void R0(Bundle bundle, long j10) {
        q().E(new T(this, bundle, j10));
    }

    /* access modifiers changed from: package-private */
    public final void V0(String str) {
        this.f50409g.set(str);
    }

    public final void X0(String str, String str2, Bundle bundle) {
        k0(str, str2, bundle, true, true, zzb().a());
    }

    public final void Y0(K k10) {
        w();
        C6620s.l(k10);
        if (!this.f50407e.remove(k10)) {
            f().J().a("OnEventListener had not been registered");
        }
    }

    public final void Z0(boolean z10) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.f50405c == null) {
                this.f50405c = new C7574c4(this);
            }
            if (z10) {
                application.unregisterActivityLifecycleCallbacks(this.f50405c);
                application.registerActivityLifecycleCallbacks(this.f50405c);
                f().I().a("Registered activity lifecycle callback");
            }
        }
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final void a1(long j10) {
        k();
        if (this.f50414l == null) {
            this.f50414l = new B3(this, this.f50228a);
        }
        this.f50414l.b(j10);
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final void b0(Boolean bool) {
        w();
        q().B(new Z3(this, bool));
    }

    public final void b1(Bundle bundle, long j10) {
        K(bundle, -20, j10);
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final void d0(Runnable runnable) {
        if (a().r(K.f49715M0)) {
            w();
            if (q().I()) {
                f().E().a("Cannot retrieve and upload batches from analytics worker thread");
            } else if (q().H()) {
                f().E().a("Cannot retrieve and upload batches from analytics network thread");
            } else if (C7590f.a()) {
                f().E().a("Cannot retrieve and upload batches from main thread");
            } else {
                f().I().a("[sgtm] Started client-side batch upload work.");
                boolean z10 = false;
                int i10 = 0;
                int i11 = 0;
                while (!z10) {
                    f().I().a("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    q().t(atomicReference, 10000, "[sgtm] Getting upload batches", new Q(this, atomicReference));
                    C7707v5 v5Var = (C7707v5) atomicReference.get();
                    if (v5Var == null || v5Var.f50454a.isEmpty()) {
                        break;
                    }
                    f().I().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(v5Var.f50454a.size()));
                    i10 += v5Var.f50454a.size();
                    Iterator<C7693t5> it = v5Var.f50454a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!q0(it.next())) {
                                z10 = true;
                                break;
                            }
                            i11++;
                        } else {
                            break;
                        }
                    }
                }
                f().I().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i10), Integer.valueOf(i11));
                runnable.run();
            }
        }
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final void e0(String str, long j10) {
        if (str == null || !TextUtils.isEmpty(str)) {
            q().B(new N(this, str));
            n0((String) null, "_id", str, true, j10);
            return;
        }
        this.f50228a.f().J().a("User ID must be non-empty or null");
    }

    /* access modifiers changed from: package-private */
    public final void e1(String str, String str2, Bundle bundle) {
        k();
        f0(str, str2, zzb().a(), bundle);
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final void f0(String str, String str2, long j10, Bundle bundle) {
        k();
        g0(str, str2, j10, bundle, true, this.f50406d == null || Q5.E0(str2), true, (String) null);
    }

    public final void f1(boolean z10) {
        w();
        q().B(new E3(this, z10));
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    /* access modifiers changed from: protected */
    public final void g0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        ArrayList arrayList;
        String str4;
        long j11;
        int i10;
        Object obj;
        String str5 = str;
        String str6 = str2;
        long j12 = j10;
        Bundle bundle2 = bundle;
        C6620s.f(str);
        C6620s.l(bundle);
        k();
        w();
        if (!this.f50228a.o()) {
            f().D().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> H10 = m().H();
        if (H10 == null || H10.contains(str6)) {
            if (!this.f50408f) {
                this.f50408f = true;
                try {
                    try {
                        (!this.f50228a.t() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    } catch (Exception e10) {
                        f().J().b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    f().H().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str6) && bundle2.containsKey("gclid")) {
                l0("auto", "_lgclid", bundle2.getString("gclid"), zzb().a());
            }
            if (z10 && Q5.H0(str2)) {
                h().L(bundle2, e().f50357A.a());
            }
            int i11 = 0;
            if (!z12 && !"_iap".equals(str6)) {
                Q5 M10 = this.f50228a.M();
                int i12 = 2;
                if (M10.A0("event", str6)) {
                    if (!M10.n0("event", H.f56085a, H.f56086b, str6)) {
                        i12 = 13;
                    } else if (M10.h0("event", 40, str6)) {
                        i12 = 0;
                    }
                }
                if (i12 != 0) {
                    f().F().b("Invalid public event name. Event will not be logged (FE)", d().c(str6));
                    this.f50228a.M();
                    String H11 = Q5.H(str6, 40, true);
                    if (str6 != null) {
                        i11 = str2.length();
                    }
                    this.f50228a.M();
                    Q5.W(this.f50425w, i12, "_ev", H11, i11);
                    return;
                }
            }
            C7630k4 B10 = r().B(false);
            if (B10 != null && !bundle2.containsKey("_sc")) {
                B10.f50213d = true;
            }
            Q5.V(B10, bundle2, z10 && !z12);
            boolean equals = "am".equals(str5);
            boolean E02 = Q5.E0(str2);
            if (z10 && this.f50406d != null && !E02 && !equals) {
                f().D().c("Passing event to registered event handler (FE)", d().c(str6), d().a(bundle2));
                C6620s.l(this.f50406d);
                this.f50406d.a(str, str2, bundle, j10);
            } else if (this.f50228a.s()) {
                int t10 = h().t(str6);
                if (t10 != 0) {
                    f().F().b("Invalid event name. Event will not be logged (FE)", d().c(str6));
                    h();
                    String H12 = Q5.H(str6, 40, true);
                    if (str6 != null) {
                        i11 = str2.length();
                    }
                    this.f50228a.M();
                    Q5.X(this.f50425w, str3, t10, "_ev", H12, i11);
                    return;
                }
                String str7 = "_o";
                Bundle D10 = h().D(str3, str2, bundle, f.b("_o", "_sn", "_sc", "_si"), z12);
                C6620s.l(D10);
                if (r().B(false) != null && "_ae".equals(str6)) {
                    C7624j5 j5Var = t().f50097f;
                    long c10 = j5Var.f50202d.zzb().c();
                    long j13 = c10 - j5Var.f50200b;
                    j5Var.f50200b = c10;
                    if (j13 > 0) {
                        h().K(D10, j13);
                    }
                }
                if (!"auto".equals(str5) && "_ssr".equals(str6)) {
                    Q5 h10 = h();
                    String string = D10.getString("_ffr");
                    if (p.a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (Objects.equals(string, h10.e().f50379x.a())) {
                        h10.f().D().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    h10.e().f50379x.b(string);
                } else if ("_ae".equals(str6)) {
                    String a10 = h().e().f50379x.a();
                    if (!TextUtils.isEmpty(a10)) {
                        D10.putString("_ffr", a10);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(D10);
                boolean E10 = a().r(K.f49735W0) ? t().E() : e().f50376u.b();
                if (e().f50373r.a() <= 0 || !e().w(j12) || !E10) {
                    str4 = "_ae";
                    arrayList = arrayList2;
                    j11 = 0;
                } else {
                    f().I().a("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList = arrayList2;
                    j11 = 0;
                    str4 = "_ae";
                    l0("auto", "_sid", (Object) null, zzb().a());
                    l0("auto", "_sno", (Object) null, zzb().a());
                    l0("auto", "_se", (Object) null, zzb().a());
                    e().f50374s.b(0);
                }
                if (D10.getLong("extend_session", j11) == 1) {
                    f().I().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    i10 = 1;
                    this.f50228a.L().f50096e.b(j12, true);
                } else {
                    i10 = 1;
                }
                ArrayList arrayList3 = new ArrayList(D10.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13 += i10;
                    String str8 = (String) obj2;
                    if (str8 != null) {
                        h();
                        Bundle[] v02 = Q5.v0(D10.get(str8));
                        if (v02 != null) {
                            D10.putParcelableArray(str8, v02);
                        }
                    }
                    i10 = 1;
                }
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    ArrayList arrayList4 = arrayList;
                    Bundle bundle3 = (Bundle) arrayList4.get(i14);
                    String str9 = i14 != 0 ? "_ep" : str6;
                    bundle3.putString(str7, str5);
                    if (z11) {
                        obj = null;
                        bundle3 = h().C(bundle3, (String) null);
                    } else {
                        obj = null;
                    }
                    Bundle bundle4 = bundle3;
                    J j14 = r1;
                    String str10 = str7;
                    Object obj3 = obj;
                    Bundle bundle5 = bundle4;
                    J j15 = new J(str9, new F(bundle4), str, j10);
                    s().I(j14, str3);
                    if (!equals) {
                        for (K a11 : this.f50407e) {
                            a11.a(str, str2, new Bundle(bundle5), j10);
                            String str11 = str3;
                        }
                    }
                    i14++;
                    arrayList = arrayList4;
                    str7 = str10;
                }
                if (r().B(false) != null && str4.equals(str6)) {
                    t().D(true, true, zzb().c());
                }
            }
        } else {
            f().D().c("Dropping non-safelisted event. event name, origin", str6, str5);
        }
    }

    public final void g1(long j10) {
        q().B(new G3(this, j10));
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final void i0(String str, String str2, Bundle bundle) {
        long a10 = zzb().a();
        C6620s.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        q().B(new Q3(this, bundle2));
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final void j0(String str, String str2, Bundle bundle, String str3) {
        j();
        W0(str, str2, zzb().a(), bundle, false, true, true, str3);
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final void k0(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String str4 = str2;
        if (Objects.equals(str2, "screen_view")) {
            r().C(bundle2, j10);
            return;
        }
        long j11 = j10;
        W0(str3, str2, j10, bundle2, z11, !z11 || this.f50406d == null || Q5.E0(str2), z10, (String) null);
    }

    public final /* bridge */ /* synthetic */ C7555a l() {
        return super.l();
    }

    /* access modifiers changed from: package-private */
    public final void l0(String str, String str2, Object obj, long j10) {
        C6620s.f(str);
        C6620s.f(str2);
        k();
        w();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    Long valueOf = Long.valueOf(str4.equals(str3.toLowerCase(Locale.ENGLISH)) ? 1 : 0);
                    C7725y2 y2Var = e().f50370o;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    y2Var.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                    f().I().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                e().f50370o.b("unset");
                str2 = "_npa";
            }
            f().I().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!this.f50228a.o()) {
            f().I().a("User property not set since app measurement is disabled");
        } else if (this.f50228a.s()) {
            s().P(new P5(str5, j10, obj2, str));
        }
    }

    public final /* bridge */ /* synthetic */ C7565b2 m() {
        return super.m();
    }

    public final void m0(String str, String str2, Object obj, boolean z10) {
        n0(str, str2, obj, z10, zzb().a());
    }

    public final /* bridge */ /* synthetic */ C7579d2 n() {
        return super.n();
    }

    public final void n0(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i11 = 0;
        if (z10) {
            i10 = h().p0(str2);
        } else {
            Q5 h10 = h();
            if (h10.A0("user property", str2)) {
                if (!h10.m0("user property", J.f56089a, str2)) {
                    i10 = 15;
                } else if (h10.h0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            h();
            String H10 = Q5.H(str2, 24, true);
            if (str2 != null) {
                i11 = str2.length();
            }
            this.f50228a.M();
            Q5.W(this.f50425w, i10, "_ev", H10, i11);
        } else if (obj != null) {
            int u10 = h().u(str2, obj);
            if (u10 != 0) {
                h();
                String H11 = Q5.H(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i11 = String.valueOf(obj).length();
                }
                this.f50228a.M();
                Q5.W(this.f50425w, u10, "_ev", H11, i11);
                return;
            }
            Object y02 = h().y0(str2, obj);
            if (y02 != null) {
                h0(str3, str2, j10, y02);
            }
        } else {
            h0(str3, str2, j10, (Object) null);
        }
    }

    public final /* bridge */ /* synthetic */ C7691t3 o() {
        return super.o();
    }

    public final void o0(I i10) {
        I i11;
        k();
        w();
        if (!(i10 == null || i10 == (i11 = this.f50406d))) {
            C6620s.q(i11 == null, "EventInterceptor already set.");
        }
        this.f50406d = i10;
    }

    public final /* bridge */ /* synthetic */ C7616i4 p() {
        return super.p();
    }

    public final void p0(K k10) {
        w();
        C6620s.l(k10);
        if (!this.f50407e.add(k10)) {
            f().J().a("OnEventListener already registered");
        }
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7644m4 r() {
        return super.r();
    }

    public final C8750c r0() {
        k();
        return s().Z();
    }

    public final /* bridge */ /* synthetic */ C7685s4 s() {
        return super.s();
    }

    public final V s0() {
        return this.f50405c;
    }

    public final /* bridge */ /* synthetic */ C7575c5 t() {
        return super.t();
    }

    public final Boolean t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) q().t(atomicReference, 15000, "boolean test flag value", new C7733z3(this, atomicReference));
    }

    public final Double u0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) q().t(atomicReference, 15000, "double test flag value", new W3(this, atomicReference));
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final Integer v0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) q().t(atomicReference, 15000, "int test flag value", new X3(this, atomicReference));
    }

    public final Long w0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) q().t(atomicReference, 15000, "long test flag value", new U3(this, atomicReference));
    }

    public final String x0() {
        return this.f50409g.get();
    }

    public final String y0() {
        C7630k4 N10 = this.f50228a.J().N();
        if (N10 != null) {
            return N10.f50211b;
        }
        return null;
    }

    public final String z0() {
        C7630k4 N10 = this.f50228a.J().N();
        if (N10 != null) {
            return N10.f50210a;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
