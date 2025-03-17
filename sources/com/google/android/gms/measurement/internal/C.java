package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C7671q3;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import sa.E;

public final class C {

    /* renamed from: f  reason: collision with root package name */
    private static final C f49542f = new C((Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final int f49543a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49544b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f49545c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49546d;

    /* renamed from: e  reason: collision with root package name */
    private final EnumMap<C7671q3.a, E> f49547e;

    C(Boolean bool, int i10) {
        this((Boolean) null, i10, (Boolean) null, (String) null);
    }

    public static C b(Bundle bundle, int i10) {
        Boolean bool = null;
        if (bundle == null) {
            return new C((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(C7671q3.a.class);
        for (C7671q3.a aVar : C7677r3.DMA.a()) {
            enumMap.put(aVar, C7671q3.k(bundle.getString(aVar.zze)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C((EnumMap<C7671q3.a, E>) enumMap, i10, bool, bundle.getString("cps_display_str"));
    }

    public static C c(String str) {
        if (str == null || str.length() <= 0) {
            return f49542f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(C7671q3.a.class);
        C7671q3.a[] a10 = C7677r3.DMA.a();
        int length = a10.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(a10[i11], C7671q3.i(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new C((EnumMap<C7671q3.a, E>) enumMap, parseInt, (Boolean) null, (String) null);
    }

    static C d(E e10, int i10) {
        EnumMap enumMap = new EnumMap(C7671q3.a.class);
        enumMap.put(C7671q3.a.AD_USER_DATA, e10);
        return new C((EnumMap<C7671q3.a, E>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        E k10;
        if (bundle == null || (k10 = C7671q3.k(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i10 = B.f49533a[k10.ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49543a);
        for (C7671q3.a aVar : C7677r3.DMA.a()) {
            sb2.append(":");
            sb2.append(C7671q3.a(this.f49547e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f49543a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f49544b.equalsIgnoreCase(c10.f49544b) && Objects.equals(this.f49545c, c10.f49545c)) {
            return Objects.equals(this.f49546d, c10.f49546d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f49547e.entrySet()) {
            String q10 = C7671q3.q((E) next.getValue());
            if (q10 != null) {
                bundle.putString(((C7671q3.a) next.getKey()).zze, q10);
            }
        }
        Boolean bool = this.f49545c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f49546d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final E g() {
        E e10 = this.f49547e.get(C7671q3.a.AD_USER_DATA);
        return e10 == null ? E.UNINITIALIZED : e10;
    }

    public final Boolean h() {
        return this.f49545c;
    }

    public final int hashCode() {
        Boolean bool = this.f49545c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f49546d;
        return this.f49544b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f49546d;
    }

    public final String j() {
        return this.f49544b;
    }

    public final boolean k() {
        for (E e10 : this.f49547e.values()) {
            if (e10 != E.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C7671q3.g(this.f49543a));
        for (C7671q3.a aVar : C7677r3.DMA.a()) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            E e10 = this.f49547e.get(aVar);
            if (e10 == null) {
                sb2.append("uninitialized");
            } else {
                int i10 = B.f49533a[e10.ordinal()];
                if (i10 == 1) {
                    sb2.append("uninitialized");
                } else if (i10 == 2) {
                    sb2.append("eu_consent_policy");
                } else if (i10 == 3) {
                    sb2.append("denied");
                } else if (i10 == 4) {
                    sb2.append("granted");
                }
            }
        }
        if (this.f49545c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f49545c);
        }
        if (this.f49546d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f49546d);
        }
        return sb2.toString();
    }

    C(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<C7671q3.a, E> enumMap = new EnumMap<>(C7671q3.a.class);
        this.f49547e = enumMap;
        enumMap.put(C7671q3.a.AD_USER_DATA, C7671q3.j(bool));
        this.f49543a = i10;
        this.f49544b = l();
        this.f49545c = bool2;
        this.f49546d = str;
    }

    private C(EnumMap<C7671q3.a, E> enumMap, int i10, Boolean bool, String str) {
        EnumMap<C7671q3.a, E> enumMap2 = new EnumMap<>(C7671q3.a.class);
        this.f49547e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f49543a = i10;
        this.f49544b = l();
        this.f49545c = bool;
        this.f49546d = str;
    }
}
