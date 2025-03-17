package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C7671q3;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.n  reason: case insensitive filesystem */
final class C7646n {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<C7671q3.a, C7639m> f50242a;

    C7646n() {
        this.f50242a = new EnumMap<>(C7671q3.a.class);
    }

    public static C7646n b(String str) {
        EnumMap enumMap = new EnumMap(C7671q3.a.class);
        if (str.length() >= C7671q3.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                C7671q3.a[] values = C7671q3.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(values[i10], C7639m.b(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C7646n(enumMap);
            }
        }
        return new C7646n();
    }

    public final C7639m a(C7671q3.a aVar) {
        C7639m mVar = this.f50242a.get(aVar);
        return mVar == null ? C7639m.UNSET : mVar;
    }

    public final void c(C7671q3.a aVar, int i10) {
        C7639m mVar = C7639m.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    mVar = C7639m.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        mVar = C7639m.INITIALIZATION;
                    }
                }
            }
            mVar = C7639m.API;
        } else {
            mVar = C7639m.TCF;
        }
        this.f50242a.put(aVar, mVar);
    }

    public final void d(C7671q3.a aVar, C7639m mVar) {
        this.f50242a.put(aVar, mVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (C7671q3.a aVar : C7671q3.a.values()) {
            C7639m mVar = this.f50242a.get(aVar);
            if (mVar == null) {
                mVar = C7639m.UNSET;
            }
            sb2.append(mVar.zzl);
        }
        return sb2.toString();
    }

    private C7646n(EnumMap<C7671q3.a, C7639m> enumMap) {
        EnumMap<C7671q3.a, C7639m> enumMap2 = new EnumMap<>(C7671q3.a.class);
        this.f50242a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
