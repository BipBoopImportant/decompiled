package com.google.android.gms.internal.vision;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.b2  reason: case insensitive filesystem */
final class C7471b2 implements Comparable, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    private final Comparable f49302a;

    /* renamed from: b  reason: collision with root package name */
    private Object f49303b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ W1 f49304c;

    C7471b2(W1 w12, Map.Entry entry) {
        this(w12, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C7471b2) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f49302a, entry.getKey()) && a(this.f49303b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f49302a;
    }

    public final Object getValue() {
        return this.f49303b;
    }

    public final int hashCode() {
        Comparable comparable = this.f49302a;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f49303b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.f49304c.t();
        Object obj2 = this.f49303b;
        this.f49303b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f49302a);
        String valueOf2 = String.valueOf(this.f49303b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    C7471b2(W1 w12, Comparable comparable, Object obj) {
        this.f49304c = w12;
        this.f49302a = comparable;
        this.f49303b = obj;
    }
}
