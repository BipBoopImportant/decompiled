package com.google.android.gms.internal.vision;

import L9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ya.c;

public final class L2 extends a {
    public static final Parcelable.Creator<L2> CREATOR = new N2();

    /* renamed from: a  reason: collision with root package name */
    public int f49216a;

    /* renamed from: b  reason: collision with root package name */
    public int f49217b;

    /* renamed from: c  reason: collision with root package name */
    public int f49218c;

    /* renamed from: d  reason: collision with root package name */
    public long f49219d;

    /* renamed from: e  reason: collision with root package name */
    public int f49220e;

    public L2() {
    }

    public static L2 x(c cVar) {
        L2 l22 = new L2();
        l22.f49216a = cVar.c().f();
        l22.f49217b = cVar.c().b();
        l22.f49220e = cVar.c().d();
        l22.f49218c = cVar.c().c();
        l22.f49219d = cVar.c().e();
        return l22;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = L9.c.a(parcel);
        L9.c.n(parcel, 2, this.f49216a);
        L9.c.n(parcel, 3, this.f49217b);
        L9.c.n(parcel, 4, this.f49218c);
        L9.c.r(parcel, 5, this.f49219d);
        L9.c.n(parcel, 6, this.f49220e);
        L9.c.b(parcel, a10);
    }

    public L2(int i10, int i11, int i12, long j10, int i13) {
        this.f49216a = i10;
        this.f49217b = i11;
        this.f49218c = i12;
        this.f49219d = j10;
        this.f49220e = i13;
    }
}
