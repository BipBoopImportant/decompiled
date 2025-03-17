package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.C7281e0;
import com.google.android.gms.internal.measurement.C7292f2;
import com.google.android.gms.internal.measurement.C7301g2;
import com.google.android.gms.internal.measurement.C7310h2;
import com.google.android.gms.internal.measurement.C7319i2;
import com.google.android.gms.internal.measurement.C7355m2;
import com.google.android.gms.internal.measurement.C7361n;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.I7;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.T2;
import com.google.android.gms.internal.measurement.U4;
import com.google.android.gms.measurement.internal.C7671q3;
import j0.C5444A;
import j0.C5445a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import sa.C8766t;
import sa.C8767u;
import sa.E;
import sa.H;

public final class C2 extends C7721x5 implements C7625k {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Map<String, String>> f49548d = new C5445a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Set<String>> f49549e = new C5445a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f49550f = new C5445a();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f49551g = new C5445a();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, C7319i2> f49552h = new C5445a();

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f49553i = new C5445a();

    /* renamed from: j  reason: collision with root package name */
    final C5444A<String, C> f49554j = new G2(this, 20);

    /* renamed from: k  reason: collision with root package name */
    private final I7 f49555k = new F2(this);

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f49556l = new C5445a();

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, String> f49557m = new C5445a();

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, String> f49558n = new C5445a();

    C2(C7728y5 y5Var) {
        super(y5Var);
    }

    private static C7671q3.a A(C7292f2.e eVar) {
        int i10 = H2.f49647b[eVar.ordinal()];
        if (i10 == 1) {
            return C7671q3.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return C7671q3.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return C7671q3.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return C7671q3.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> B(C7319i2 i2Var) {
        C5445a aVar = new C5445a();
        if (i2Var != null) {
            for (C7355m2 next : i2Var.Y()) {
                aVar.put(next.K(), next.L());
            }
        }
        return aVar;
    }

    private final void D(String str, C7319i2.a aVar) {
        HashSet hashSet = new HashSet();
        C5445a aVar2 = new C5445a();
        C5445a aVar3 = new C5445a();
        C5445a aVar4 = new C5445a();
        if (aVar != null) {
            for (C7301g2 K10 : aVar.H()) {
                hashSet.add(K10.K());
            }
            for (int i10 = 0; i10 < aVar.z(); i10++) {
                C7310h2.a aVar5 = (C7310h2.a) aVar.A(i10).A();
                if (aVar5.C().isEmpty()) {
                    f().J().a("EventConfig contained null event name");
                } else {
                    String C10 = aVar5.C();
                    String b10 = H.b(aVar5.C());
                    if (!TextUtils.isEmpty(b10)) {
                        aVar5 = aVar5.A(b10);
                        aVar.C(i10, aVar5);
                    }
                    if (aVar5.G() && aVar5.D()) {
                        aVar2.put(C10, Boolean.TRUE);
                    }
                    if (aVar5.H() && aVar5.E()) {
                        aVar3.put(aVar5.C(), Boolean.TRUE);
                    }
                    if (aVar5.I()) {
                        if (aVar5.z() < 2 || aVar5.z() > 65535) {
                            f().J().c("Invalid sampling rate. Event name, sample rate", aVar5.C(), Integer.valueOf(aVar5.z()));
                        } else {
                            aVar4.put(aVar5.C(), Integer.valueOf(aVar5.z()));
                        }
                    }
                }
            }
        }
        this.f49549e.put(str, hashSet);
        this.f49550f.put(str, aVar2);
        this.f49551g.put(str, aVar3);
        this.f49553i.put(str, aVar4);
    }

    private final void E(String str, C7319i2 i2Var) {
        if (i2Var.m() == 0) {
            this.f49554j.g(str);
            return;
        }
        f().I().b("EES programs found", Integer.valueOf(i2Var.m()));
        T2 t22 = i2Var.X().get(0);
        try {
            C c10 = new C();
            c10.d("internal.remoteConfig", new D2(this, str));
            c10.d("internal.appMetadata", new C8766t(this, str));
            c10.d("internal.logger", new C8767u(this));
            c10.c(t22);
            this.f49554j.f(str, c10);
            f().I().c("EES program loaded for appId, activities", str, Integer.valueOf(t22.J().m()));
            for (S2 K10 : t22.J().L()) {
                f().I().b("EES program activity", K10.K());
            }
        } catch (C7281e0 unused) {
            f().E().b("Failed to load EES program. appId", str);
        }
    }

    private final void f0(String str) {
        s();
        k();
        C6620s.f(str);
        if (this.f49552h.get(str) == null) {
            r T02 = n().T0(str);
            if (T02 == null) {
                this.f49548d.put(str, (Object) null);
                this.f49550f.put(str, (Object) null);
                this.f49549e.put(str, (Object) null);
                this.f49551g.put(str, (Object) null);
                this.f49552h.put(str, (Object) null);
                this.f49556l.put(str, (Object) null);
                this.f49557m.put(str, (Object) null);
                this.f49558n.put(str, (Object) null);
                this.f49553i.put(str, (Object) null);
                return;
            }
            C7319i2.a aVar = (C7319i2.a) z(str, T02.f50304a).A();
            D(str, aVar);
            this.f49548d.put(str, B((C7319i2) ((L4) aVar.s())));
            this.f49552h.put(str, (C7319i2) ((L4) aVar.s()));
            E(str, (C7319i2) ((L4) aVar.s()));
            this.f49556l.put(str, aVar.E());
            this.f49557m.put(str, T02.f50305b);
            this.f49558n.put(str, T02.f50306c);
        }
    }

    public static /* synthetic */ C7361n x(C2 c22) {
        return new E7(c22.f49555k);
    }

    static /* synthetic */ C y(C2 c22, String str) {
        c22.s();
        C6620s.f(str);
        if (!c22.V(str)) {
            return null;
        }
        if (!c22.f49552h.containsKey(str) || c22.f49552h.get(str) == null) {
            c22.f0(str);
        } else {
            c22.E(str, c22.f49552h.get(str));
        }
        return c22.f49554j.k().get(str);
    }

    private final C7319i2 z(String str, byte[] bArr) {
        if (bArr == null) {
            return C7319i2.R();
        }
        try {
            C7319i2 i2Var = (C7319i2) ((L4) ((C7319i2.a) N5.E(C7319i2.P(), bArr)).s());
            C7614i2 I10 = f().I();
            String str2 = null;
            Long valueOf = i2Var.c0() ? Long.valueOf(i2Var.N()) : null;
            if (i2Var.a0()) {
                str2 = i2Var.T();
            }
            I10.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return i2Var;
        } catch (U4 e10) {
            f().J().c("Unable to merge remote config. appId", C7607h2.t(str), e10);
            return C7319i2.R();
        } catch (RuntimeException e11) {
            f().J().c("Unable to merge remote config. appId", C7607h2.t(str), e11);
            return C7319i2.R();
        }
    }

    /* access modifiers changed from: package-private */
    public final E C(String str, C7671q3.a aVar) {
        k();
        f0(str);
        C7292f2 H10 = H(str);
        if (H10 == null) {
            return E.UNINITIALIZED;
        }
        for (C7292f2.b next : H10.O()) {
            if (A(next.L()) == aVar) {
                int i10 = H2.f49648c[next.K().ordinal()];
                return i10 != 1 ? i10 != 2 ? E.UNINITIALIZED : E.GRANTED : E.DENIED;
            }
        }
        return E.UNINITIALIZED;
    }

    /* access modifiers changed from: protected */
    public final boolean F(String str, byte[] bArr, String str2, String str3) {
        s();
        k();
        C6620s.f(str);
        C7319i2.a aVar = (C7319i2.a) z(str, bArr).A();
        if (aVar == null) {
            return false;
        }
        D(str, aVar);
        E(str, (C7319i2) ((L4) aVar.s()));
        this.f49552h.put(str, (C7319i2) ((L4) aVar.s()));
        this.f49556l.put(str, aVar.E());
        this.f49557m.put(str, str2);
        this.f49558n.put(str, str3);
        this.f49548d.put(str, B((C7319i2) ((L4) aVar.s())));
        n().e0(str, new ArrayList(aVar.G()));
        try {
            aVar.D();
            bArr = ((C7319i2) ((L4) aVar.s())).l();
        } catch (RuntimeException e10) {
            f().J().c("Unable to serialize reduced-size config. Storing full config instead. appId", C7607h2.t(str), e10);
        }
        C7660p n10 = n();
        C6620s.f(str);
        n10.k();
        n10.s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) n10.z().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                n10.f().E().b("Failed to update remote config (got 0). appId", C7607h2.t(str));
            }
        } catch (SQLiteException e11) {
            n10.f().E().c("Error storing remote config. appId", C7607h2.t(str), e11);
        }
        this.f49552h.put(str, (C7319i2) ((L4) aVar.s()));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int G(String str, String str2) {
        Integer num;
        k();
        f0(str);
        Map map = this.f49553i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final C7292f2 H(String str) {
        k();
        f0(str);
        C7319i2 K10 = K(str);
        if (K10 == null || !K10.Z()) {
            return null;
        }
        return K10.O();
    }

    /* access modifiers changed from: package-private */
    public final C7671q3.a I(String str, C7671q3.a aVar) {
        k();
        f0(str);
        C7292f2 H10 = H(str);
        if (H10 == null) {
            return null;
        }
        for (C7292f2.c next : H10.N()) {
            if (aVar == A(next.L())) {
                return A(next.K());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final C7319i2 K(String str) {
        s();
        k();
        C6620s.f(str);
        f0(str);
        return this.f49552h.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean L(String str, C7671q3.a aVar) {
        k();
        f0(str);
        C7292f2 H10 = H(str);
        if (H10 == null) {
            return false;
        }
        Iterator<C7292f2.b> it = H10.M().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7292f2.b next = it.next();
            if (aVar == A(next.L())) {
                if (next.K() == C7292f2.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean M(String str, String str2) {
        Boolean bool;
        k();
        f0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f49551g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String N(String str) {
        k();
        return this.f49558n.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean O(String str, String str2) {
        Boolean bool;
        k();
        f0(str);
        if (W(str) && Q5.E0(str2)) {
            return true;
        }
        if (Y(str) && Q5.G0(str2)) {
            return true;
        }
        Map map = this.f49550f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String P(String str) {
        k();
        return this.f49557m.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String Q(String str) {
        k();
        f0(str);
        return this.f49556l.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Set<String> R(String str) {
        k();
        f0(str);
        return this.f49549e.get(str);
    }

    /* access modifiers changed from: package-private */
    public final SortedSet<String> S(String str) {
        k();
        f0(str);
        TreeSet treeSet = new TreeSet();
        C7292f2 H10 = H(str);
        if (H10 == null) {
            return treeSet;
        }
        for (C7292f2.f K10 : H10.L()) {
            treeSet.add(K10.K());
        }
        return treeSet;
    }

    /* access modifiers changed from: protected */
    public final void T(String str) {
        k();
        this.f49557m.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void U(String str) {
        k();
        this.f49552h.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r2.f49552h.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean V(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.i2> r0 = r2.f49552h
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.i2 r3 = (com.google.android.gms.internal.measurement.C7319i2) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.m()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2.V(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean W(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean X(String str) {
        k();
        f0(str);
        C7292f2 H10 = H(str);
        return H10 == null || !H10.Q() || H10.P();
    }

    /* access modifiers changed from: package-private */
    public final boolean Y(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    public final boolean Z(String str) {
        k();
        f0(str);
        return this.f49549e.get(str) != null && this.f49549e.get(str).contains("app_instance_id");
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(String str) {
        k();
        f0(str);
        if (this.f49549e.get(str) != null) {
            return this.f49549e.get(str).contains("device_model") || this.f49549e.get(str).contains("device_info");
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    /* access modifiers changed from: package-private */
    public final boolean b0(String str) {
        k();
        f0(str);
        return this.f49549e.get(str) != null && this.f49549e.get(str).contains("enhanced_user_id");
    }

    public final String c(String str, String str2) {
        k();
        f0(str);
        Map map = this.f49548d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean c0(String str) {
        k();
        f0(str);
        return this.f49549e.get(str) != null && this.f49549e.get(str).contains("google_signals");
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d0(String str) {
        k();
        f0(str);
        if (this.f49549e.get(str) != null) {
            return this.f49549e.get(str).contains("os_version") || this.f49549e.get(str).contains("device_info");
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final boolean e0(String str) {
        k();
        f0(str);
        return this.f49549e.get(str) != null && this.f49549e.get(str).contains("user_id");
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

    public final /* bridge */ /* synthetic */ N5 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Y5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7660p n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C2 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Y4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7714w5 r() {
        return super.r();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long w(String str) {
        String c10 = c(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(c10)) {
            return 0;
        }
        try {
            return Long.parseLong(c10);
        } catch (NumberFormatException e10) {
            f().J().c("Unable to parse timezone offset. appId", C7607h2.t(str), e10);
            return 0;
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
