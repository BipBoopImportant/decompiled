package com.google.android.gms.measurement.internal;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.v5  reason: case insensitive filesystem */
public final class C7707v5 extends a {
    public static final Parcelable.Creator<C7707v5> CREATOR = new C7700u5();

    /* renamed from: a  reason: collision with root package name */
    public final List<C7693t5> f50454a;

    C7707v5(List<C7693t5> list) {
        this.f50454a = list;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.y(parcel, 1, this.f50454a, false);
        c.b(parcel, a10);
    }
}
