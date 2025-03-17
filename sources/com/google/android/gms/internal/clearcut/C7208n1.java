package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.n1  reason: case insensitive filesystem */
final class C7208n1 implements Comparable, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    private final Comparable f48435a;

    /* renamed from: b  reason: collision with root package name */
    private Object f48436b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7187g1 f48437c;

    C7208n1(C7187g1 g1Var, Comparable comparable, Object obj) {
        this.f48437c = g1Var;
        this.f48435a = comparable;
        this.f48436b = obj;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C7208n1) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f48435a, entry.getKey()) && a(this.f48436b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f48435a;
    }

    public final Object getValue() {
        return this.f48436b;
    }

    public final int hashCode() {
        Comparable comparable = this.f48435a;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f48436b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.f48437c.s();
        Object obj2 = this.f48436b;
        this.f48436b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48435a);
        String valueOf2 = String.valueOf(this.f48436b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    C7208n1(C7187g1 g1Var, Map.Entry entry) {
        this(g1Var, (Comparable) entry.getKey(), entry.getValue());
    }
}
