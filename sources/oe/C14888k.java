package oE;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
import pE.C14918c;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: oE.k  reason: case insensitive filesystem */
class C14888k {

    /* renamed from: p  reason: collision with root package name */
    private static Integer f130101p = null;

    /* renamed from: q  reason: collision with root package name */
    private static Boolean f130102q = null;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static boolean f130103r = true;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Object f130104s = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Future<SharedPreferences> f130105a;

    /* renamed from: b  reason: collision with root package name */
    private final Future<SharedPreferences> f130106b;

    /* renamed from: c  reason: collision with root package name */
    private final Future<SharedPreferences> f130107c;

    /* renamed from: d  reason: collision with root package name */
    private final Future<SharedPreferences> f130108d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f130109e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f130110f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f130111g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f130112h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f130113i;

    /* renamed from: j  reason: collision with root package name */
    private String f130114j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f130115k;

    /* renamed from: l  reason: collision with root package name */
    private String f130116l;

    /* renamed from: m  reason: collision with root package name */
    private String f130117m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f130118n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f130119o;

    /* renamed from: oE.k$a */
    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (C14888k.f130104s) {
                C14888k.this.G();
                boolean unused = C14888k.f130103r = false;
            }
        }
    }

    public C14888k(Future<SharedPreferences> future, Future<SharedPreferences> future2, Future<SharedPreferences> future3, Future<SharedPreferences> future4) {
        this.f130106b = future;
        this.f130105a = future2;
        this.f130107c = future3;
        this.f130108d = future4;
        this.f130110f = null;
        this.f130112h = null;
        this.f130113i = false;
        this.f130109e = new a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void E() {
        /*
            r4 = this;
            java.lang.String r0 = "Cannot read distinct ids from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            r2 = 0
            java.util.concurrent.Future<android.content.SharedPreferences> r3 = r4.f130105a     // Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e }
            java.lang.Object r3 = r3.get()     // Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e }
            goto L_0x001e
        L_0x000e:
            r3 = move-exception
            goto L_0x0012
        L_0x0010:
            r3 = move-exception
            goto L_0x0016
        L_0x0012:
            pE.C14918c.d(r1, r0, r3)
            goto L_0x001d
        L_0x0016:
            java.lang.Throwable r3 = r3.getCause()
            pE.C14918c.d(r1, r0, r3)
        L_0x001d:
            r3 = r2
        L_0x001e:
            if (r3 != 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.String r0 = "events_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f130114j = r0
            java.lang.String r0 = "events_user_id_present"
            r1 = 0
            boolean r0 = r3.getBoolean(r0, r1)
            r4.f130115k = r0
            java.lang.String r0 = "people_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f130116l = r0
            java.lang.String r0 = "anonymous_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f130117m = r0
            java.lang.String r0 = "had_persisted_distinct_id"
            boolean r0 = r3.getBoolean(r0, r1)
            r4.f130118n = r0
            java.lang.String r0 = r4.f130114j
            if (r0 != 0) goto L_0x005f
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.f130117m = r0
            r4.f130114j = r0
            r4.f130115k = r1
            r4.a0()
        L_0x005f:
            r0 = 1
            r4.f130113i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14888k.E():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Cannot read opt out flag from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            java.util.concurrent.Future<android.content.SharedPreferences> r2 = r3.f130108d     // Catch:{ ExecutionException -> 0x000f, InterruptedException -> 0x000d }
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x000f, InterruptedException -> 0x000d }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ ExecutionException -> 0x000f, InterruptedException -> 0x000d }
            goto L_0x001d
        L_0x000d:
            r2 = move-exception
            goto L_0x0011
        L_0x000f:
            r2 = move-exception
            goto L_0x0015
        L_0x0011:
            pE.C14918c.d(r1, r0, r2)
            goto L_0x001c
        L_0x0015:
            java.lang.Throwable r2 = r2.getCause()
            pE.C14918c.d(r1, r0, r2)
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            return
        L_0x0020:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "opt_out_"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            boolean r4 = r2.getBoolean(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.f130119o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14888k.F(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void G() {
        this.f130112h = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.f130106b.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.f130109e);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f130109e);
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                Object value = next.getValue();
                this.f130112h.put((String) next.getKey(), value.toString());
            }
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r5.f130110f = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void H() {
        /*
            r5 = this;
            java.lang.String r0 = "Cannot load superProperties from SharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            java.util.concurrent.Future<android.content.SharedPreferences> r2 = r5.f130105a     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            java.lang.String r3 = "super_properties"
            java.lang.String r4 = "{}"
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            r3.<init>()     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            java.lang.String r4 = "Loading Super Properties "
            r3.append(r4)     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            r3.append(r2)     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            java.lang.String r3 = r3.toString()     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            pE.C14918c.i(r1, r3)     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            r3.<init>(r2)     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            r5.f130110f = r3     // Catch:{ ExecutionException -> 0x0034, InterruptedException -> 0x0032, JSONException -> 0x0036 }
            goto L_0x0068
        L_0x0030:
            r0 = move-exception
            goto L_0x0069
        L_0x0032:
            r2 = move-exception
            goto L_0x004a
        L_0x0034:
            r2 = move-exception
            goto L_0x0057
        L_0x0036:
            java.lang.String r0 = "Cannot parse stored superProperties"
            pE.C14918c.c(r1, r0)     // Catch:{ all -> 0x0030 }
            r5.Y()     // Catch:{ all -> 0x0030 }
            org.json.JSONObject r0 = r5.f130110f
            if (r0 != 0) goto L_0x0068
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0047:
            r5.f130110f = r0
            goto L_0x0068
        L_0x004a:
            pE.C14918c.d(r1, r0, r2)     // Catch:{ all -> 0x0030 }
            org.json.JSONObject r0 = r5.f130110f
            if (r0 != 0) goto L_0x0068
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0047
        L_0x0057:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x0030 }
            pE.C14918c.d(r1, r0, r2)     // Catch:{ all -> 0x0030 }
            org.json.JSONObject r0 = r5.f130110f
            if (r0 != 0) goto L_0x0068
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0047
        L_0x0068:
            return
        L_0x0069:
            org.json.JSONObject r1 = r5.f130110f
            if (r1 != 0) goto L_0x0074
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5.f130110f = r1
        L_0x0074:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14888k.H():void");
    }

    private synchronized void L(String str, String str2, boolean z10) {
        try {
            SharedPreferences.Editor edit = this.f130108d.get().edit();
            edit.putBoolean(str + str2, z10);
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e11);
        }
    }

    private synchronized void U(String str, String str2, int i10) {
        try {
            SharedPreferences.Editor edit = this.f130108d.get().edit();
            edit.putInt(str + str2, i10);
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e11);
        }
    }

    private void Y() {
        JSONObject jSONObject = this.f130110f;
        if (jSONObject == null) {
            C14918c.c("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        C14918c.i("MixpanelAPI.PIdentity", "Storing Super Properties " + jSONObject2);
        try {
            SharedPreferences.Editor edit = this.f130105a.get().edit();
            edit.putString("super_properties", jSONObject2);
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e11);
        }
    }

    private static void Z(SharedPreferences.Editor editor) {
        editor.apply();
    }

    private void a0() {
        try {
            SharedPreferences.Editor edit = this.f130105a.get().edit();
            edit.putString("events_distinct_id", this.f130114j);
            edit.putBoolean("events_user_id_present", this.f130115k);
            edit.putString("people_distinct_id", this.f130116l);
            edit.putString("anonymous_id", this.f130117m);
            edit.putBoolean("had_persisted_distinct_id", this.f130118n);
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e11);
        }
    }

    private void b0(String str) {
        try {
            SharedPreferences.Editor edit = this.f130108d.get().edit();
            edit.putBoolean("opt_out_" + str, this.f130119o.booleanValue());
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e11);
        }
    }

    private synchronized boolean j(String str, String str2) {
        boolean z10;
        z10 = false;
        try {
            z10 = this.f130108d.get().getBoolean(str + str2, false);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e11);
        }
        return z10;
    }

    private synchronized int n(String str, String str2) {
        int i10;
        i10 = 0;
        try {
            i10 = this.f130108d.get().getInt(str + str2, 0);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e11);
        }
        return i10;
    }

    public static String q(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("people_distinct_id", (String) null);
    }

    private JSONObject s() {
        if (this.f130110f == null) {
            H();
        }
        return this.f130110f;
    }

    public synchronized boolean A(String str) {
        boolean z10;
        z10 = false;
        try {
            z10 = this.f130108d.get().getBoolean(str, false);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e11);
        }
        return z10;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean B(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Boolean r0 = f130102q     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0047
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r3.f130108d     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            r1.<init>()     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            java.lang.String r2 = "has_launched_"
            r1.append(r2)     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            r1.append(r5)     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            if (r0 == 0) goto L_0x002c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            f130102q = r4     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            goto L_0x0047
        L_0x002a:
            r4 = move-exception
            goto L_0x004f
        L_0x002c:
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            f130102q = r4     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            boolean r4 = r4.booleanValue()     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            if (r4 != 0) goto L_0x0047
            r3.P(r5)     // Catch:{ ExecutionException -> 0x0043, InterruptedException -> 0x003e }
            goto L_0x0047
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x002a }
            f130102q = r4     // Catch:{ all -> 0x002a }
            goto L_0x0047
        L_0x0043:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x002a }
            f130102q = r4     // Catch:{ all -> 0x002a }
        L_0x0047:
            java.lang.Boolean r4 = f130102q     // Catch:{ all -> 0x002a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            return r4
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14888k.B(boolean, java.lang.String):boolean");
    }

    public synchronized boolean C(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer valueOf = Integer.valueOf(str);
            if (f130101p == null) {
                Integer valueOf2 = Integer.valueOf(this.f130108d.get().getInt("latest_version_code", -1));
                f130101p = valueOf2;
                if (valueOf2.intValue() == -1) {
                    f130101p = valueOf;
                    SharedPreferences.Editor edit = this.f130108d.get().edit();
                    edit.putInt("latest_version_code", valueOf.intValue());
                    Z(edit);
                }
            }
            if (f130101p.intValue() < valueOf.intValue()) {
                SharedPreferences.Editor edit2 = this.f130108d.get().edit();
                edit2.putInt("latest_version_code", valueOf.intValue());
                Z(edit2);
                return true;
            }
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e11);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return false;
    }

    public synchronized void D() {
        try {
            if (!this.f130113i) {
                E();
            }
            this.f130115k = true;
            a0();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void I(JSONObject jSONObject) {
        synchronized (this.f130111g) {
            JSONObject s10 = s();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    s10.put(next, jSONObject.get(next));
                } catch (JSONException e10) {
                    C14918c.d("MixpanelAPI.PIdentity", "Exception registering super property.", e10);
                }
            }
            Y();
        }
    }

    public void J(String str) {
        try {
            SharedPreferences.Editor edit = this.f130107c.get().edit();
            edit.remove(str);
            Z(edit);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        } catch (ExecutionException e11) {
            e11.printStackTrace();
        }
    }

    public synchronized void K(String str) {
        try {
            if (!this.f130113i) {
                E();
            }
            if (this.f130117m == null) {
                this.f130117m = str;
                this.f130118n = true;
                a0();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void M(String str, int i10) {
        U(str, "mpDebugInitCount", i10);
    }

    public synchronized void N(String str) {
        try {
            if (!this.f130113i) {
                E();
            }
            this.f130114j = str;
            a0();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void O(String str) {
        L(str, "mpHasImplemented", true);
    }

    public synchronized void P(String str) {
        try {
            SharedPreferences.Editor edit = this.f130108d.get().edit();
            edit.putBoolean("has_launched_" + str, true);
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11);
        }
    }

    public synchronized void Q(String str) {
        L(str, "mpHasDebugAliased", true);
    }

    public synchronized void R(String str) {
        L(str, "mpHasDebugIdentified", true);
    }

    public synchronized void S(String str) {
        L(str, "mpHasDebugTracked", true);
    }

    public synchronized void T(String str) {
        L(str, "mpHasDebugUsedPeople", true);
    }

    public synchronized void V(String str) {
        try {
            SharedPreferences.Editor edit = this.f130108d.get().edit();
            edit.putBoolean(str, true);
            Z(edit);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e11);
        }
    }

    public synchronized void W(boolean z10, String str) {
        this.f130119o = Boolean.valueOf(z10);
        b0(str);
    }

    public synchronized void X(String str) {
        try {
            if (!this.f130113i) {
                E();
            }
            this.f130116l = str;
            a0();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void d(JSONObject jSONObject) {
        synchronized (this.f130111g) {
            JSONObject s10 = s();
            Iterator<String> keys = s10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.put(next, s10.get(next));
                } catch (JSONException e10) {
                    C14918c.d("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e10);
                }
            }
        }
    }

    public synchronized void e() {
        try {
            SharedPreferences.Editor edit = this.f130105a.get().edit();
            edit.clear();
            Z(edit);
            H();
            E();
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10.getCause());
        } catch (InterruptedException e11) {
            throw new RuntimeException(e11.getCause());
        }
    }

    public void f() {
        synchronized (f130104s) {
            try {
                SharedPreferences.Editor edit = this.f130106b.get().edit();
                edit.clear();
                Z(edit);
            } catch (ExecutionException e10) {
                C14918c.d("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e10.getCause());
            } catch (InterruptedException e11) {
                C14918c.d("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e11);
            }
        }
    }

    public void g() {
        try {
            SharedPreferences.Editor edit = this.f130107c.get().edit();
            edit.clear();
            Z(edit);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        } catch (ExecutionException e11) {
            e11.printStackTrace();
        }
    }

    public synchronized int h(String str) {
        return n(str, "mpDebugInitCount");
    }

    public synchronized String i() {
        try {
            if (!this.f130113i) {
                E();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f130117m;
    }

    public synchronized String k() {
        try {
            if (!this.f130113i) {
                E();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f130114j;
    }

    public synchronized String l() {
        try {
            if (!this.f130113i) {
                E();
            }
            if (!this.f130115k) {
                return null;
            }
            return this.f130114j;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized boolean m() {
        try {
            if (!this.f130113i) {
                E();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f130118n;
    }

    public synchronized boolean o(String str) {
        try {
            if (this.f130119o == null) {
                F(str);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f130119o.booleanValue();
    }

    public synchronized String p() {
        try {
            if (!this.f130113i) {
                E();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f130116l;
    }

    public Map<String, String> r() {
        synchronized (f130104s) {
            try {
                if (!f130103r) {
                    if (this.f130112h == null) {
                    }
                }
                G();
                f130103r = false;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return this.f130112h;
    }

    public Map<String, Long> t() {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry next : this.f130107c.get().getAll().entrySet()) {
                hashMap.put(next.getKey(), Long.valueOf(next.getValue().toString()));
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        } catch (ExecutionException e11) {
            e11.printStackTrace();
        }
        return hashMap;
    }

    public synchronized boolean u(String str) {
        return j(str, "mpHasImplemented");
    }

    public synchronized boolean v(String str) {
        return j(str, "mpHasDebugAliased");
    }

    public synchronized boolean w(String str) {
        return j(str, "mpHasDebugIdentified");
    }

    public synchronized boolean x(String str) {
        return j(str, "mpHasDebugTracked");
    }

    public synchronized boolean y(String str) {
        return j(str, "mpHasDebugUsedPeople");
    }

    /* access modifiers changed from: protected */
    public boolean z(String str) {
        try {
            return this.f130108d.get().contains("opt_out_" + str);
        } catch (ExecutionException e10) {
            C14918c.d("MixpanelAPI.PIdentity", "Can't read opt-out shared preferences.", e10.getCause());
            return false;
        } catch (InterruptedException e11) {
            C14918c.d("MixpanelAPI.PIdentity", "Can't read opt-out shared preferences.", e11);
            return false;
        }
    }
}
