package com.google.android.gms.internal.vision;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.vision.p1  reason: case insensitive filesystem */
public final class C7525p1 extends a {
    public static final Parcelable.Creator<C7525p1> CREATOR = new O0();

    /* renamed from: a  reason: collision with root package name */
    public int f49365a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f49366b;

    public C7525p1() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f49365a);
        c.c(parcel, 3, this.f49366b);
        c.b(parcel, a10);
    }

    public C7525p1(int i10, boolean z10) {
        this.f49365a = i10;
        this.f49366b = z10;
    }
}
