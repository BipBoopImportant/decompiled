package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l  reason: case insensitive filesystem */
public final class C7343l implements C7400s {

    /* renamed from: a  reason: collision with root package name */
    private final C7400s f48989a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48990b;

    public C7343l() {
        this.f48989a = C7400s.f49052k0;
        this.f48990b = "return";
    }

    public final C7400s a() {
        return this.f48989a;
    }

    public final String b() {
        return this.f48990b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7343l)) {
            return false;
        }
        C7343l lVar = (C7343l) obj;
        return this.f48990b.equals(lVar.f48990b) && this.f48989a.equals(lVar.f48989a);
    }

    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.f48990b.hashCode() * 31) + this.f48989a.hashCode();
    }

    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final C7400s zzc() {
        return new C7343l(this.f48990b, this.f48989a.zzc());
    }

    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Iterator<C7400s> zzh() {
        return null;
    }

    public C7343l(String str) {
        this.f48989a = C7400s.f49052k0;
        this.f48990b = str;
    }

    public C7343l(String str, C7400s sVar) {
        this.f48989a = sVar;
        this.f48990b = str;
    }
}
