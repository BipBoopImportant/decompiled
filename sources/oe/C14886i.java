package oE;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import oE.C14878a;
import oE.C14890m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pE.C14918c;

/* renamed from: oE.i  reason: case insensitive filesystem */
public class C14886i {

    /* renamed from: m  reason: collision with root package name */
    private static final Map<String, Map<Context, C14886i>> f130074m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private static final C14890m f130075n = new C14890m();

    /* renamed from: o  reason: collision with root package name */
    private static Future<SharedPreferences> f130076o;

    /* renamed from: a  reason: collision with root package name */
    private final Context f130077a;

    /* renamed from: b  reason: collision with root package name */
    private final C14878a f130078b;

    /* renamed from: c  reason: collision with root package name */
    private final C14883f f130079c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f130080d;

    /* renamed from: e  reason: collision with root package name */
    private final e f130081e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f130082f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C14888k f130083g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C14881d f130084h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f130085i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Long> f130086j;

    /* renamed from: k  reason: collision with root package name */
    private C14887j f130087k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final C14889l f130088l;

    /* renamed from: oE.i$a */
    class a implements C14890m.b {
        a() {
        }

        public void a(SharedPreferences sharedPreferences) {
            String q10 = C14888k.q(sharedPreferences);
            if (q10 != null) {
                C14886i.this.F(q10);
            }
        }
    }

    /* renamed from: oE.i$b */
    class b extends BroadcastReceiver {
        b() {
        }

        public void onReceive(Context context, Intent intent) {
            JSONObject jSONObject = new JSONObject();
            Bundle bundleExtra = intent.getBundleExtra("event_args");
            if (bundleExtra != null) {
                for (String next : bundleExtra.keySet()) {
                    try {
                        jSONObject.put(next, bundleExtra.get(next));
                    } catch (JSONException e10) {
                        C14918c.d("MixpanelAPI.AL", "failed to add key \"" + next + "\" to properties for tracking bolts event", e10);
                    }
                }
            }
            C14886i iVar = C14886i.this;
            iVar.O("$" + intent.getStringExtra("event_name"), jSONObject);
        }
    }

    /* renamed from: oE.i$c */
    interface c {
        void a(C14886i iVar);
    }

    /* renamed from: oE.i$d */
    public interface d {
        boolean a();

        void b();

        void c(Map<String, Object> map);

        void d(String str, double d10);

        void e();
    }

    /* renamed from: oE.i$e */
    private class e implements d {
        private e() {
        }

        /* access modifiers changed from: private */
        public void h(String str) {
            synchronized (C14886i.this.f130083g) {
                C14886i.this.f130083g.X(str);
                C14886i.this.f130084h.e(str);
            }
            C14886i.this.F(str);
        }

        private JSONObject k(String str, Object obj) {
            JSONObject jSONObject = new JSONObject();
            String g10 = g();
            String o10 = C14886i.this.o();
            jSONObject.put(str, obj);
            jSONObject.put("$token", C14886i.this.f130080d);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$had_persisted_distinct_id", C14886i.this.f130083g.m());
            if (o10 != null) {
                jSONObject.put("$device_id", o10);
            }
            if (g10 != null) {
                jSONObject.put("$distinct_id", g10);
                jSONObject.put("$user_id", g10);
            }
            jSONObject.put("$mp_metadata", C14886i.this.f130088l.b());
            if ((C14886i.this.p().getApplicationInfo().flags & 2) != 0 && (obj instanceof JSONObject)) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.keys().hasNext() && !jSONObject2.keys().next().startsWith("$ae_")) {
                    C14886i.this.f130083g.T(C14886i.this.f130080d);
                }
            }
            return jSONObject;
        }

        public boolean a() {
            return g() != null;
        }

        public void b() {
            l("$transactions");
        }

        public void c(Map<String, Object> map) {
            if (!C14886i.this.x()) {
                if (map == null) {
                    C14918c.c("MixpanelAPI.API", "setMap does not accept null properties");
                    return;
                }
                try {
                    j(new JSONObject(map));
                } catch (NullPointerException unused) {
                    C14918c.k("MixpanelAPI.API", "Can't have null keys in the properties of setMap!");
                }
            }
        }

        public void d(String str, double d10) {
            if (!C14886i.this.x()) {
                HashMap hashMap = new HashMap();
                hashMap.put(str, Double.valueOf(d10));
                i(hashMap);
            }
        }

        public void e() {
            try {
                C14886i.this.G(k("$delete", JSONObject.NULL));
            } catch (JSONException unused) {
                C14918c.c("MixpanelAPI.API", "Exception deleting a user");
            }
        }

        public String g() {
            return C14886i.this.f130083g.p();
        }

        public void i(Map<String, ? extends Number> map) {
            if (!C14886i.this.x()) {
                try {
                    C14886i.this.G(k("$add", new JSONObject(map)));
                } catch (JSONException e10) {
                    C14918c.d("MixpanelAPI.API", "Exception incrementing properties", e10);
                }
            }
        }

        public void j(JSONObject jSONObject) {
            if (!C14886i.this.x()) {
                try {
                    JSONObject jSONObject2 = new JSONObject(C14886i.this.f130085i);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                    C14886i.this.G(k("$set", jSONObject2));
                } catch (JSONException e10) {
                    C14918c.d("MixpanelAPI.API", "Exception setting people properties", e10);
                }
            }
        }

        public void l(String str) {
            if (!C14886i.this.x()) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    C14886i.this.G(k("$unset", jSONArray));
                } catch (JSONException e10) {
                    C14918c.d("MixpanelAPI.API", "Exception unsetting a property", e10);
                }
            }
        }

        /* synthetic */ e(C14886i iVar, C14885h hVar) {
            this();
        }
    }

    C14886i(Context context, Future<SharedPreferences> future, String str, boolean z10, JSONObject jSONObject, String str2) {
        this(context, future, str, C14883f.m(context), z10, jSONObject, str2);
    }

    private void A(String str, boolean z10, boolean z11) {
        if (!x()) {
            if (str == null) {
                C14918c.c("MixpanelAPI.API", "Can't identify with null distinct_id.");
                return;
            }
            synchronized (this.f130083g) {
                try {
                    String k10 = this.f130083g.k();
                    this.f130083g.K(k10);
                    this.f130083g.N(str);
                    if (z10) {
                        this.f130083g.D();
                    }
                    String p10 = this.f130083g.p();
                    if (p10 == null) {
                        p10 = this.f130083g.k();
                    }
                    this.f130084h.e(p10);
                    if (!str.equals(k10)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$anon_distinct_id", k10);
                        O("$identify", jSONObject);
                        if (B()) {
                            this.f130083g.R(this.f130080d);
                        }
                    }
                } catch (JSONException unused) {
                    C14918c.c("MixpanelAPI.API", "Could not track $identify event");
                } catch (Throwable th2) {
                    throw th2;
                }
                if (z11) {
                    this.f130081e.h(str);
                }
            }
        }
    }

    private boolean B() {
        return (p().getApplicationInfo().flags & 2) != 0;
    }

    /* access modifiers changed from: private */
    public void F(String str) {
        this.f130078b.p(new C14878a.g(str, this.f130080d));
    }

    /* access modifiers changed from: private */
    public void G(JSONObject jSONObject) {
        if (!x()) {
            this.f130078b.n(new C14878a.f(jSONObject, this.f130080d));
        }
    }

    private static void H(Context context, C14886i iVar) {
        Class<p3.a> cls = p3.a.class;
        try {
            int i10 = p3.a.f27593b;
            cls.getMethod("registerReceiver", new Class[]{BroadcastReceiver.class, IntentFilter.class}).invoke(cls.getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}), new Object[]{new b(), new IntentFilter("com.parse.bolts.measurement_event")});
        } catch (InvocationTargetException e10) {
            C14918c.b("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e10);
        } catch (ClassNotFoundException e11) {
            C14918c.a("MixpanelAPI.AL", "To enable App Links tracking, add implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e11.getMessage());
        } catch (NoSuchMethodException e12) {
            C14918c.a("MixpanelAPI.AL", "To enable App Links tracking, add implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e12.getMessage());
        } catch (IllegalAccessException e13) {
            C14918c.a("MixpanelAPI.AL", "App Links tracking will not be enabled due to this exception: " + e13.getMessage());
        }
    }

    private void N(String str, String str2, String str3, JSONObject jSONObject, boolean z10) {
        String str4;
        String str5;
        JSONObject v10 = v();
        String str6 = null;
        if (v10 != null) {
            try {
                str4 = (String) v10.get("mp_lib");
                try {
                    str5 = (String) v10.get("$lib_version");
                    str6 = str4;
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                str4 = null;
            }
        } else {
            str5 = null;
        }
        str4 = str6;
        str6 = str5;
        JSONObject jSONObject2 = new JSONObject();
        if (str4 == null) {
            str4 = "Android";
        }
        jSONObject2.put("mp_lib", str4);
        jSONObject2.put("distinct_id", str3);
        if (str6 == null) {
            str6 = "6.5.2";
        }
        jSONObject2.put("$lib_version", str6);
        jSONObject2.put("DevX", true);
        jSONObject2.put("Project Token", str3);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        this.f130078b.f(new C14878a.C3202a(str, jSONObject2, str2));
        if (z10) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(str, 1);
            jSONObject3.put("$add", jSONObject4);
            jSONObject3.put("$token", str2);
            jSONObject3.put("$distinct_id", str3);
            this.f130078b.n(new C14878a.f(jSONObject3, str2));
        }
        this.f130078b.o(new C14878a.b(str2, false));
    }

    private void Q() {
        int h10 = this.f130083g.h(this.f130080d) + 1;
        this.f130083g.M(this.f130080d, h10);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Debug Launch Count", h10);
        N("SDK Debug Launch", "metrics-1", this.f130080d, jSONObject, true);
    }

    private void S() {
        Q();
        T();
    }

    private void T() {
        if (!this.f130083g.u(this.f130080d)) {
            int i10 = (this.f130083g.x(this.f130080d) ? 1 : 0) + (this.f130083g.w(this.f130080d) ? 1 : 0) + (this.f130083g.v(this.f130080d) ? 1 : 0) + (this.f130083g.y(this.f130080d) ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Tracked", this.f130083g.x(this.f130080d));
            jSONObject.put("Identified", this.f130083g.w(this.f130080d));
            jSONObject.put("Aliased", this.f130083g.v(this.f130080d));
            jSONObject.put("Used People", this.f130083g.y(this.f130080d));
            if (i10 >= 3) {
                N("SDK Implemented", "metrics-1", this.f130080d, jSONObject, true);
                this.f130083g.O(this.f130080d);
            }
        }
    }

    static void i(c cVar) {
        Map<String, Map<Context, C14886i>> map = f130074m;
        synchronized (map) {
            try {
                for (Map<Context, C14886i> values : map.values()) {
                    for (C14886i a10 : values.values()) {
                        cVar.a(a10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void j(Context context) {
        if (context instanceof Activity) {
            try {
                Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", new Class[]{Context.class, Intent.class}).invoke((Object) null, new Object[]{context, ((Activity) context).getIntent()});
            } catch (InvocationTargetException e10) {
                C14918c.b("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e10);
            } catch (ClassNotFoundException e11) {
                C14918c.a("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e11.getMessage());
            } catch (NoSuchMethodException e12) {
                C14918c.a("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e12.getMessage());
            } catch (IllegalAccessException e13) {
                C14918c.a("MixpanelAPI.AL", "Unable to detect inbound App Links: " + e13.getMessage());
            }
        } else {
            C14918c.a("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
        }
    }

    public static C14886i r(Context context, String str) {
        return s(context, str, false, (JSONObject) null, (String) null);
    }

    public static C14886i s(Context context, String str, boolean z10, JSONObject jSONObject, String str2) {
        C14886i iVar;
        if (str == null || context == null) {
            return null;
        }
        Map<String, Map<Context, C14886i>> map = f130074m;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (f130076o == null) {
                    f130076o = f130075n.a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", (C14890m.b) null);
                }
                String str3 = str2 != null ? str2 : str;
                Map map2 = map.get(str3);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(str3, map2);
                }
                Map map3 = map2;
                iVar = (C14886i) map3.get(applicationContext);
                if (iVar == null && C14879b.a(applicationContext)) {
                    C14886i iVar2 = new C14886i(applicationContext, f130076o, str, z10, jSONObject, str2);
                    H(context, iVar2);
                    map3.put(applicationContext, iVar2);
                    iVar = iVar2;
                }
                j(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        if (this.f130079c.k()) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.f130088l.d();
    }

    public void E() {
        n().e(new C14878a.d(this.f130080d));
        if (t().a()) {
            t().e();
            t().b();
        }
        this.f130083g.e();
        synchronized (this.f130086j) {
            this.f130086j.clear();
            this.f130083g.g();
        }
        this.f130083g.f();
        this.f130083g.W(true, this.f130080d);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public void I() {
        if (this.f130077a.getApplicationContext() instanceof Application) {
            C14887j jVar = new C14887j(this, this.f130079c);
            this.f130087k = jVar;
            ((Application) this.f130077a.getApplicationContext()).registerActivityLifecycleCallbacks(jVar);
            return;
        }
        C14918c.e("MixpanelAPI.API", "Context is not an Application, Mixpanel won't be able to automatically flush on an app background.");
    }

    public void J(JSONObject jSONObject) {
        if (!x()) {
            this.f130083g.I(jSONObject);
        }
    }

    public void K(Map<String, Object> map) {
        if (!x()) {
            if (map == null) {
                C14918c.c("MixpanelAPI.API", "registerSuperPropertiesMap does not accept null properties");
                return;
            }
            try {
                J(new JSONObject(map));
            } catch (NullPointerException unused) {
                C14918c.k("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesMap");
            }
        }
    }

    public void L() {
        this.f130083g.e();
        n().c(new C14878a.d(this.f130080d));
        z(q(), false);
        l();
    }

    /* access modifiers changed from: package-private */
    public boolean M() {
        return !this.f130079c.d();
    }

    public void O(String str, JSONObject jSONObject) {
        if (!x()) {
            P(str, jSONObject, false);
        }
    }

    /* access modifiers changed from: protected */
    public void P(String str, JSONObject jSONObject, boolean z10) {
        Long l10;
        if (x()) {
            return;
        }
        if (!z10 || this.f130084h.f()) {
            synchronized (this.f130086j) {
                l10 = this.f130086j.get(str);
                this.f130086j.remove(str);
                this.f130083g.J(str);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : this.f130083g.r().entrySet()) {
                    jSONObject2.put((String) next.getKey(), (String) next.getValue());
                }
                this.f130083g.d(jSONObject2);
                double currentTimeMillis = ((double) System.currentTimeMillis()) / 1000.0d;
                String q10 = q();
                String o10 = o();
                String w10 = w();
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("distinct_id", q10);
                jSONObject2.put("$had_persisted_distinct_id", this.f130083g.m());
                if (o10 != null) {
                    jSONObject2.put("$device_id", o10);
                }
                if (w10 != null) {
                    jSONObject2.put("$user_id", w10);
                }
                if (l10 != null) {
                    jSONObject2.put("$duration", currentTimeMillis - (((double) l10.longValue()) / 1000.0d));
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next2 = keys.next();
                        jSONObject2.put(next2, jSONObject.get(next2));
                    }
                }
                this.f130078b.f(new C14878a.C3202a(str, jSONObject2, this.f130080d, z10, this.f130088l.a()));
                if (B() && !str.startsWith("$")) {
                    this.f130083g.S(this.f130080d);
                }
            } catch (JSONException e10) {
                C14918c.d("MixpanelAPI.API", "Exception tracking event " + str, e10);
            }
        }
    }

    public void R(String str, Map<String, Object> map) {
        if (!x()) {
            if (map == null) {
                O(str, (JSONObject) null);
                return;
            }
            try {
                O(str, new JSONObject(map));
            } catch (NullPointerException unused) {
                C14918c.k("MixpanelAPI.API", "Can't have null keys in the properties of trackMap!");
            }
        }
    }

    public void h(String str, String str2) {
        if (!x()) {
            if (str2 == null) {
                str2 = q();
            }
            if (str.equals(str2)) {
                C14918c.k("MixpanelAPI.API", "Attempted to alias identical distinct_ids " + str + ". Alias message will not be sent.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alias", str);
                jSONObject.put("original", str2);
                O("$create_alias", jSONObject);
                if (B()) {
                    this.f130083g.Q(this.f130080d);
                }
            } catch (JSONException e10) {
                C14918c.d("MixpanelAPI.API", "Failed to alias", e10);
            }
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public C14881d k(String str) {
        return new C14881d(this.f130077a, str);
    }

    public void l() {
        if (!x()) {
            this.f130078b.o(new C14878a.b(this.f130080d));
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        if (!x()) {
            this.f130078b.o(new C14878a.b(this.f130080d, false));
        }
    }

    /* access modifiers changed from: package-private */
    public C14878a n() {
        return C14878a.h(this.f130077a);
    }

    public String o() {
        return this.f130083g.i();
    }

    /* access modifiers changed from: package-private */
    public Context p() {
        return this.f130077a;
    }

    public String q() {
        return this.f130083g.k();
    }

    public d t() {
        return this.f130081e;
    }

    /* access modifiers changed from: package-private */
    public C14888k u(Context context, Future<SharedPreferences> future, String str, String str2) {
        a aVar = new a();
        if (str2 != null) {
            str = str2;
        }
        C14890m mVar = f130075n;
        return new C14888k(future, mVar.a(context, "com.mixpanel.android.mpmetrics.MixpanelAPI_" + str, aVar), mVar.a(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_" + str, (C14890m.b) null), mVar.a(context, "com.mixpanel.android.mpmetrics.Mixpanel", (C14890m.b) null));
    }

    public JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        this.f130083g.d(jSONObject);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public String w() {
        return this.f130083g.l();
    }

    public boolean x() {
        return this.f130083g.o(this.f130080d);
    }

    public void y(String str) {
        A(str, true, true);
    }

    public void z(String str, boolean z10) {
        A(str, true, z10);
    }

    C14886i(Context context, Future<SharedPreferences> future, String str, C14883f fVar, boolean z10, JSONObject jSONObject, String str2) {
        this.f130077a = context;
        this.f130080d = str;
        this.f130081e = new e(this, (C14885h) null);
        this.f130082f = new HashMap();
        this.f130079c = fVar;
        HashMap hashMap = new HashMap();
        hashMap.put("$android_lib_version", "6.5.2");
        hashMap.put("$android_os", "Android");
        String str3 = Build.VERSION.RELEASE;
        String str4 = "UNKNOWN";
        hashMap.put("$android_os_version", str3 == null ? str4 : str3);
        String str5 = Build.MANUFACTURER;
        hashMap.put("$android_manufacturer", str5 == null ? str4 : str5);
        String str6 = Build.BRAND;
        hashMap.put("$android_brand", str6 == null ? str4 : str6);
        String str7 = Build.MODEL;
        hashMap.put("$android_model", str7 != null ? str7 : str4);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashMap.put("$android_app_version", packageInfo.versionName);
            hashMap.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e10) {
            C14918c.d("MixpanelAPI.API", "Exception getting app version name", e10);
        }
        this.f130085i = Collections.unmodifiableMap(hashMap);
        this.f130088l = new C14889l();
        C14878a n10 = n();
        this.f130078b = n10;
        C14888k u10 = u(context, future, str, str2);
        this.f130083g = u10;
        this.f130086j = u10.t();
        if (z10 && (x() || !u10.z(str))) {
            E();
        }
        if (jSONObject != null) {
            J(jSONObject);
        }
        C14881d k10 = k(str);
        this.f130084h = k10;
        String p10 = u10.p();
        k10.e(p10 == null ? u10.k() : p10);
        boolean exists = C14884g.s(this.f130077a).r().exists();
        I();
        if (u10.B(exists, this.f130080d)) {
            P("$ae_first_open", (JSONObject) null, true);
            u10.P(this.f130080d);
        }
        if (!this.f130079c.e()) {
            n10.j(k10);
        }
        if (M()) {
            O("$app_open", (JSONObject) null);
        }
        if (!u10.A(this.f130080d)) {
            try {
                N("Integration", "85053bf24bba75239b16a601d9387e17", str, (JSONObject) null, false);
                u10.V(this.f130080d);
            } catch (JSONException unused) {
            }
        }
        if (this.f130083g.C((String) hashMap.get("$android_app_version_code"))) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$ae_updated_version", hashMap.get("$android_app_version"));
                P("$ae_updated", jSONObject2, true);
            } catch (JSONException unused2) {
            }
        }
        if (B()) {
            try {
                if (this.f130080d.length() == 32) {
                    S();
                }
            } catch (JSONException unused3) {
            }
        }
        if (!this.f130079c.f()) {
            C14882e.a();
        }
    }
}
