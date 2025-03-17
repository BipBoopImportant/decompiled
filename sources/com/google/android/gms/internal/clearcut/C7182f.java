package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.UserManager;
import android.util.Log;
import u2.e;

/* renamed from: com.google.android.gms.internal.clearcut.f  reason: case insensitive filesystem */
public abstract class C7182f<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f48356h = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i  reason: collision with root package name */
    private static Context f48357i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f48358j = false;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Boolean f48359k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile Boolean f48360l;

    /* renamed from: a  reason: collision with root package name */
    private final C7212p f48361a;

    /* renamed from: b  reason: collision with root package name */
    final String f48362b;

    /* renamed from: c  reason: collision with root package name */
    private final String f48363c;

    /* renamed from: d  reason: collision with root package name */
    private final T f48364d;

    /* renamed from: e  reason: collision with root package name */
    private T f48365e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C7173c f48366f;

    /* renamed from: g  reason: collision with root package name */
    private volatile SharedPreferences f48367g;

    private C7182f(C7212p pVar, String str, T t10) {
        this.f48365e = null;
        this.f48366f = null;
        this.f48367g = null;
        if (pVar.f48470a == null && pVar.f48471b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (pVar.f48470a == null || pVar.f48471b == null) {
            this.f48361a = pVar;
            String valueOf = String.valueOf(pVar.f48472c);
            String valueOf2 = String.valueOf(str);
            this.f48363c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(pVar.f48473d);
            String valueOf4 = String.valueOf(str);
            this.f48362b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f48364d = t10;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public static void b(Context context) {
        if (f48357i == null) {
            synchronized (f48356h) {
                try {
                    if (!context.isDeviceProtectedStorage()) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                    }
                    if (f48357i != context) {
                        f48359k = null;
                    }
                    f48357i = context;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            f48358j = false;
        }
    }

    /* access modifiers changed from: private */
    public static <T> C7182f<T> c(C7212p pVar, String str, T t10, C7209o<T> oVar) {
        return new C7203m(pVar, str, t10, oVar);
    }

    /* access modifiers changed from: private */
    public static C7182f<String> d(C7212p pVar, String str, String str2) {
        return new C7200l(pVar, str, str2);
    }

    /* access modifiers changed from: private */
    public static C7182f<Boolean> e(C7212p pVar, String str, boolean z10) {
        return new C7197k(pVar, str, Boolean.valueOf(z10));
    }

    private static <V> V g(C7206n<V> nVar) {
        long clearCallingIdentity;
        try {
            return nVar.j();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V j10 = nVar.j();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return j10;
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
    }

    static boolean h(String str, boolean z10) {
        if (p()) {
            return ((Boolean) g(new C7191i(str, false))).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    private final T n() {
        boolean z10;
        if (h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f48362b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f48361a.f48471b != null) {
            if (this.f48366f == null) {
                this.f48366f = C7173c.a(f48357i.getContentResolver(), this.f48361a.f48471b);
            }
            String str = (String) g(new C7185g(this, this.f48366f));
            if (str != null) {
                return m(str);
            }
        } else if (this.f48361a.f48470a != null) {
            if (!f48357i.isDeviceProtectedStorage()) {
                if (f48360l == null || !f48360l.booleanValue()) {
                    f48360l = Boolean.valueOf(((UserManager) f48357i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z10 = f48360l.booleanValue();
            } else {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            if (this.f48367g == null) {
                this.f48367g = f48357i.getSharedPreferences(this.f48361a.f48470a, 0);
            }
            SharedPreferences sharedPreferences = this.f48367g;
            if (sharedPreferences.contains(this.f48362b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    private final T o() {
        String str;
        if (this.f48361a.f48474e || !p() || (str = (String) g(new C7188h(this))) == null) {
            return null;
        }
        return m(str);
    }

    private static boolean p() {
        if (f48359k == null) {
            Context context = f48357i;
            boolean z10 = false;
            if (context == null) {
                return false;
            }
            if (e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z10 = true;
            }
            f48359k = Boolean.valueOf(z10);
        }
        return f48359k.booleanValue();
    }

    public final T a() {
        if (f48357i != null) {
            if (this.f48361a.f48475f) {
                T o10 = o();
                if (o10 != null) {
                    return o10;
                }
                T n10 = n();
                if (n10 != null) {
                    return n10;
                }
            } else {
                T n11 = n();
                if (n11 != null) {
                    return n11;
                }
                T o11 = o();
                if (o11 != null) {
                    return o11;
                }
            }
            return this.f48364d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* access modifiers changed from: protected */
    public abstract T f(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract T m(String str);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String q() {
        return A2.c(f48357i.getContentResolver(), this.f48363c, (String) null);
    }

    /* synthetic */ C7182f(C7212p pVar, String str, Object obj, C7194j jVar) {
        this(pVar, str, obj);
    }
}
