package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h  reason: case insensitive filesystem */
public final class C7307h implements C7400s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f48932a;

    public C7307h(Boolean bool) {
        if (bool == null) {
            this.f48932a = false;
        } else {
            this.f48932a = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7307h) && this.f48932a == ((C7307h) obj).f48932a;
    }

    public final Double h() {
        return Double.valueOf(this.f48932a ? 1.0d : 0.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f48932a).hashCode();
    }

    public final String i() {
        return Boolean.toString(this.f48932a);
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        if ("toString".equals(str)) {
            return new C7416u(Boolean.toString(this.f48932a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f48932a), str}));
    }

    public final String toString() {
        return String.valueOf(this.f48932a);
    }

    public final C7400s zzc() {
        return new C7307h(Boolean.valueOf(this.f48932a));
    }

    public final Boolean zzd() {
        return Boolean.valueOf(this.f48932a);
    }

    public final Iterator<C7400s> zzh() {
        return null;
    }
}
