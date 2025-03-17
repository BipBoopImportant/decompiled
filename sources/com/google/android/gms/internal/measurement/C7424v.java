package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v  reason: case insensitive filesystem */
public final class C7424v implements C7400s {

    /* renamed from: a  reason: collision with root package name */
    private final String f49092a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<C7400s> f49093b;

    public C7424v(String str, List<C7400s> list) {
        this.f49092a = str;
        ArrayList<C7400s> arrayList = new ArrayList<>();
        this.f49093b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f49092a;
    }

    public final ArrayList<C7400s> b() {
        return this.f49093b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7424v)) {
            return false;
        }
        C7424v vVar = (C7424v) obj;
        String str = this.f49092a;
        if (str == null ? vVar.f49092a != null : !str.equals(vVar.f49092a)) {
            return false;
        }
        ArrayList<C7400s> arrayList = this.f49093b;
        ArrayList<C7400s> arrayList2 = vVar.f49093b;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.f49092a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<C7400s> arrayList = this.f49093b;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return hashCode + i10;
    }

    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final C7400s zzc() {
        return this;
    }

    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Iterator<C7400s> zzh() {
        return null;
    }
}
