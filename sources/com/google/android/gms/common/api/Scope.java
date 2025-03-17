package com.google.android.gms.common.api;

import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new u();

    /* renamed from: a  reason: collision with root package name */
    final int f47980a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47981b;

    Scope(int i10, String str) {
        C6620s.g(str, "scopeUri must not be null or empty");
        this.f47980a = i10;
        this.f47981b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f47981b.equals(((Scope) obj).f47981b);
    }

    public int hashCode() {
        return this.f47981b.hashCode();
    }

    public String toString() {
        return this.f47981b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f47980a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.u(parcel, 2, x(), false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f47981b;
    }

    public Scope(String str) {
        this(1, str);
    }
}
