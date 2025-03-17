package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.measurement.internal.h2  reason: case insensitive filesystem */
public final class C7607h2 extends C7664p3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f50154c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f50155d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f50156e;

    /* renamed from: f  reason: collision with root package name */
    private final C7614i2 f50157f = new C7614i2(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final C7614i2 f50158g = new C7614i2(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final C7614i2 f50159h = new C7614i2(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final C7614i2 f50160i = new C7614i2(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final C7614i2 f50161j = new C7614i2(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    private final C7614i2 f50162k = new C7614i2(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    private final C7614i2 f50163l = new C7614i2(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    private final C7614i2 f50164m = new C7614i2(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    private final C7614i2 f50165n = new C7614i2(this, 2, false, false);

    C7607h2(P2 p22) {
        super(p22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r3.lastIndexOf(46);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String C(java.lang.String r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            r2 = -1
            if (r0 != r2) goto L_0x0013
            return r1
        L_0x0013:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7607h2.C(java.lang.String):java.lang.String");
    }

    private final String N() {
        String str;
        synchronized (this) {
            try {
                if (this.f50156e == null) {
                    this.f50156e = this.f50228a.P() != null ? this.f50228a.P() : "FA";
                }
                C6620s.l(this.f50156e);
                str = this.f50156e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    protected static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new C7635l2(str);
    }

    private static String u(boolean z10, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C7635l2 ? ((C7635l2) obj).f50218a : z10 ? "-" : String.valueOf(obj);
            }
            Throwable th2 = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
            String C10 = C(P2.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C10)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb2.toString();
        }
    }

    static String v(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String u10 = u(z10, obj);
        String u11 = u(z10, obj2);
        String u12 = u(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(u10)) {
            sb2.append(str2);
            sb2.append(u10);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(u11)) {
            sb2.append(str2);
            sb2.append(u11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(u12)) {
            sb2.append(str3);
            sb2.append(u12);
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean A(int i10) {
        return Log.isLoggable(N(), i10);
    }

    public final C7614i2 D() {
        return this.f50164m;
    }

    public final C7614i2 E() {
        return this.f50157f;
    }

    public final C7614i2 F() {
        return this.f50159h;
    }

    public final C7614i2 G() {
        return this.f50158g;
    }

    public final C7614i2 H() {
        return this.f50163l;
    }

    public final C7614i2 I() {
        return this.f50165n;
    }

    public final C7614i2 J() {
        return this.f50160i;
    }

    public final C7614i2 K() {
        return this.f50162k;
    }

    public final C7614i2 L() {
        return this.f50161j;
    }

    public final String M() {
        Pair<String, Long> a10;
        if (e().f50361f == null || (a10 = e().f50361f.a()) == null || a10 == C7683s2.f50356B) {
            return null;
        }
        String valueOf = String.valueOf(a10.second);
        return valueOf + ":" + ((String) a10.first);
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void w(int i10, String str) {
        Log.println(i10, N(), str);
    }

    /* access modifiers changed from: protected */
    public final void x(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && A(i10)) {
            w(i10, v(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            C6620s.l(str);
            J2 F10 = this.f50228a.F();
            if (F10 == null) {
                w(6, "Scheduler not set. Not logging error/warn");
            } else if (!F10.p()) {
                w(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                F10.B(new C7621j2(this, i10, str, obj, obj2, obj3));
            }
        }
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
