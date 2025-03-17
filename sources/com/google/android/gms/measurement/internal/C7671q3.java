package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map;
import sa.E;

/* renamed from: com.google.android.gms.measurement.internal.q3  reason: case insensitive filesystem */
public final class C7671q3 {

    /* renamed from: c  reason: collision with root package name */
    public static final C7671q3 f50297c = new C7671q3((Boolean) null, (Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<a, E> f50298a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50299b;

    /* renamed from: com.google.android.gms.measurement.internal.q3$a */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        
        public final String zze;

        private a(String str) {
            this.zze = str;
        }
    }

    private C7671q3(EnumMap<a, E> enumMap, int i10) {
        EnumMap<a, E> enumMap2 = new EnumMap<>(a.class);
        this.f50298a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f50299b = i10;
    }

    static char a(E e10) {
        if (e10 == null) {
            return '-';
        }
        int ordinal = e10.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static C7671q3 c(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C7671q3((Boolean) null, (Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : C7677r3.STORAGE.zzd) {
            enumMap.put(aVar, k(bundle.getString(aVar.zze)));
        }
        return new C7671q3(enumMap, i10);
    }

    public static C7671q3 e(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] a10 = C7677r3.STORAGE.a();
        for (int i11 = 0; i11 < a10.length; i11++) {
            a aVar = a10[i11];
            int i12 = i11 + 2;
            if (i12 < str.length()) {
                enumMap.put(aVar, i(str.charAt(i12)));
            } else {
                enumMap.put(aVar, E.UNINITIALIZED);
            }
        }
        return new C7671q3(enumMap, i10);
    }

    public static C7671q3 f(E e10, E e11, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put(a.AD_STORAGE, e10);
        enumMap.put(a.ANALYTICS_STORAGE, e11);
        return new C7671q3(enumMap, -10);
    }

    static String g(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String h(Bundle bundle) {
        String string;
        a[] b10 = C7677r3.STORAGE.zzd;
        int length = b10.length;
        int i10 = 0;
        while (true) {
            Boolean bool = null;
            if (i10 >= length) {
                return null;
            }
            a aVar = b10[i10];
            if (bundle.containsKey(aVar.zze) && (string = bundle.getString(aVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i10++;
        }
    }

    static E i(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? E.UNINITIALIZED : E.GRANTED : E.DENIED : E.POLICY;
    }

    static E j(Boolean bool) {
        return bool == null ? E.UNINITIALIZED : bool.booleanValue() ? E.GRANTED : E.DENIED;
    }

    static E k(String str) {
        return str == null ? E.UNINITIALIZED : str.equals("granted") ? E.GRANTED : str.equals("denied") ? E.DENIED : E.UNINITIALIZED;
    }

    public static boolean l(int i10, int i11) {
        if (i10 == -20 && i11 == -30) {
            return true;
        }
        return (i10 == -30 && i11 == -20) || i10 == i11 || i10 < i11;
    }

    public static C7671q3 p(String str) {
        return e(str, 100);
    }

    static String q(E e10) {
        int ordinal = e10.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public final int b() {
        return this.f50299b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7671q3 d(com.google.android.gms.measurement.internal.C7671q3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.q3$a> r1 = com.google.android.gms.measurement.internal.C7671q3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.r3 r1 = com.google.android.gms.measurement.internal.C7677r3.STORAGE
            com.google.android.gms.measurement.internal.q3$a[] r1 = r1.zzd
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x004d
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.q3$a, sa.E> r5 = r8.f50298a
            java.lang.Object r5 = r5.get(r4)
            sa.E r5 = (sa.E) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.q3$a, sa.E> r6 = r9.f50298a
            java.lang.Object r6 = r6.get(r4)
            sa.E r6 = (sa.E) r6
            if (r5 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            if (r6 != 0) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            sa.E r7 = sa.E.UNINITIALIZED
            if (r5 != r7) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            if (r6 != r7) goto L_0x0031
            goto L_0x0045
        L_0x0031:
            sa.E r7 = sa.E.POLICY
            if (r5 != r7) goto L_0x0037
        L_0x0035:
            r5 = r6
            goto L_0x0045
        L_0x0037:
            if (r6 != r7) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            sa.E r7 = sa.E.DENIED
            if (r5 == r7) goto L_0x0044
            if (r6 != r7) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            sa.E r5 = sa.E.GRANTED
            goto L_0x0045
        L_0x0044:
            r5 = r7
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r0.put(r4, r5)
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            com.google.android.gms.measurement.internal.q3 r9 = new com.google.android.gms.measurement.internal.q3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7671q3.d(com.google.android.gms.measurement.internal.q3):com.google.android.gms.measurement.internal.q3");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7671q3)) {
            return false;
        }
        C7671q3 q3Var = (C7671q3) obj;
        for (a aVar : C7677r3.STORAGE.zzd) {
            if (this.f50298a.get(aVar) != q3Var.f50298a.get(aVar)) {
                return false;
            }
        }
        return this.f50299b == q3Var.f50299b;
    }

    public final int hashCode() {
        int i10 = this.f50299b * 17;
        for (E hashCode : this.f50298a.values()) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public final boolean m(a aVar) {
        return this.f50298a.get(aVar) != E.DENIED;
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f50298a.entrySet()) {
            String q10 = q((E) next.getValue());
            if (q10 != null) {
                bundle.putString(((a) next.getKey()).zze, q10);
            }
        }
        return bundle;
    }

    public final C7671q3 o(C7671q3 q3Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : C7677r3.STORAGE.zzd) {
            E e10 = this.f50298a.get(aVar);
            if (e10 == E.UNINITIALIZED) {
                e10 = q3Var.f50298a.get(aVar);
            }
            if (e10 != null) {
                enumMap.put(aVar, e10);
            }
        }
        return new C7671q3(enumMap, this.f50299b);
    }

    public final E r() {
        E e10 = this.f50298a.get(a.AD_STORAGE);
        return e10 == null ? E.UNINITIALIZED : e10;
    }

    public final boolean s(C7671q3 q3Var) {
        for (a aVar : (a[]) this.f50298a.keySet().toArray(new a[0])) {
            E e10 = this.f50298a.get(aVar);
            E e11 = q3Var.f50298a.get(aVar);
            E e12 = E.DENIED;
            if (e10 == e12 && e11 != e12) {
                return true;
            }
        }
        return false;
    }

    public final E t() {
        E e10 = this.f50298a.get(a.ANALYTICS_STORAGE);
        return e10 == null ? E.UNINITIALIZED : e10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(g(this.f50299b));
        for (a aVar : C7677r3.STORAGE.zzd) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            E e10 = this.f50298a.get(aVar);
            if (e10 == null) {
                e10 = E.UNINITIALIZED;
            }
            sb2.append(e10);
        }
        return sb2.toString();
    }

    public final String u() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : C7677r3.STORAGE.a()) {
            E e10 = this.f50298a.get(aVar);
            char c10 = '-';
            if (!(e10 == null || (ordinal = e10.ordinal()) == 0)) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : C7677r3.STORAGE.a()) {
            sb2.append(a(this.f50298a.get(aVar)));
        }
        return sb2.toString();
    }

    public final boolean w() {
        return m(a.AD_STORAGE);
    }

    public final boolean x() {
        return m(a.ANALYTICS_STORAGE);
    }

    public final boolean y() {
        for (E e10 : this.f50298a.values()) {
            if (e10 != E.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public C7671q3(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, E> enumMap = new EnumMap<>(a.class);
        this.f50298a = enumMap;
        enumMap.put(a.AD_STORAGE, j((Boolean) null));
        enumMap.put(a.ANALYTICS_STORAGE, j((Boolean) null));
        this.f50299b = i10;
    }
}
