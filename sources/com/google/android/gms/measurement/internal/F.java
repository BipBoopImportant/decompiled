package com.google.android.gms.measurement.internal;

import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class F extends a implements Iterable<String> {
    public static final Parcelable.Creator<F> CREATOR = new H();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f49622a;

    F(Bundle bundle) {
        this.f49622a = bundle;
    }

    /* access modifiers changed from: package-private */
    public final String E0(String str) {
        return this.f49622a.getString(str);
    }

    /* access modifiers changed from: package-private */
    public final Double F(String str) {
        return Double.valueOf(this.f49622a.getDouble(str));
    }

    public final Bundle J() {
        return new Bundle(this.f49622a);
    }

    /* access modifiers changed from: package-private */
    public final Long U(String str) {
        return Long.valueOf(this.f49622a.getLong(str));
    }

    public final Iterator<String> iterator() {
        return new I(this);
    }

    /* access modifiers changed from: package-private */
    public final Object t0(String str) {
        return this.f49622a.get(str);
    }

    public final String toString() {
        return this.f49622a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 2, J(), false);
        c.b(parcel, a10);
    }

    public final int x() {
        return this.f49622a.size();
    }
}
