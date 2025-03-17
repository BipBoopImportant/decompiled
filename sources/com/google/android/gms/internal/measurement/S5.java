package com.google.android.gms.internal.measurement;

import java.util.Map;

final class S5 implements Comparable, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    private final Comparable f48807a;

    /* renamed from: b  reason: collision with root package name */
    private Object f48808b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ O5 f48809c;

    S5(O5 o52, Map.Entry entry) {
        this(o52, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((S5) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f48807a, entry.getKey()) && a(this.f48808b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f48807a;
    }

    public final Object getValue() {
        return this.f48808b;
    }

    public final int hashCode() {
        Comparable comparable = this.f48807a;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f48808b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.f48809c.u();
        Object obj2 = this.f48808b;
        this.f48808b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48807a);
        String valueOf2 = String.valueOf(this.f48808b);
        return valueOf + "=" + valueOf2;
    }

    S5(O5 o52, Comparable comparable, Object obj) {
        this.f48809c = o52;
        this.f48807a = comparable;
        this.f48808b = obj;
    }
}
