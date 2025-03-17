package com.google.android.gms.vision.face.internal.client;

import Aa.c;
import L9.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("wrapper.cc")
public class FaceParcel extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<FaceParcel> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final int f50562a;

    /* renamed from: b  reason: collision with root package name */
    public final int f50563b;

    /* renamed from: c  reason: collision with root package name */
    public final float f50564c;

    /* renamed from: d  reason: collision with root package name */
    public final float f50565d;

    /* renamed from: e  reason: collision with root package name */
    public final float f50566e;

    /* renamed from: f  reason: collision with root package name */
    public final float f50567f;

    /* renamed from: g  reason: collision with root package name */
    public final float f50568g;

    /* renamed from: h  reason: collision with root package name */
    public final float f50569h;

    /* renamed from: i  reason: collision with root package name */
    public final float f50570i;
    @RecentlyNonNull

    /* renamed from: j  reason: collision with root package name */
    public final LandmarkParcel[] f50571j;

    /* renamed from: k  reason: collision with root package name */
    public final float f50572k;

    /* renamed from: l  reason: collision with root package name */
    public final float f50573l;

    /* renamed from: m  reason: collision with root package name */
    public final float f50574m;

    /* renamed from: n  reason: collision with root package name */
    public final Aa.a[] f50575n;

    /* renamed from: o  reason: collision with root package name */
    public final float f50576o;

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, Aa.a[] aVarArr, float f20) {
        this.f50562a = i10;
        this.f50563b = i11;
        this.f50564c = f10;
        this.f50565d = f11;
        this.f50566e = f12;
        this.f50567f = f13;
        this.f50568g = f14;
        this.f50569h = f15;
        this.f50570i = f16;
        this.f50571j = landmarkParcelArr;
        this.f50572k = f17;
        this.f50573l = f18;
        this.f50574m = f19;
        this.f50575n = aVarArr;
        this.f50576o = f20;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = L9.c.a(parcel);
        L9.c.n(parcel, 1, this.f50562a);
        L9.c.n(parcel, 2, this.f50563b);
        L9.c.k(parcel, 3, this.f50564c);
        L9.c.k(parcel, 4, this.f50565d);
        L9.c.k(parcel, 5, this.f50566e);
        L9.c.k(parcel, 6, this.f50567f);
        L9.c.k(parcel, 7, this.f50568g);
        L9.c.k(parcel, 8, this.f50569h);
        L9.c.x(parcel, 9, this.f50571j, i10, false);
        L9.c.k(parcel, 10, this.f50572k);
        L9.c.k(parcel, 11, this.f50573l);
        L9.c.k(parcel, 12, this.f50574m);
        L9.c.x(parcel, 13, this.f50575n, i10, false);
        L9.c.k(parcel, 14, this.f50570i);
        L9.c.k(parcel, 15, this.f50576o);
        L9.c.b(parcel, a10);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, @RecentlyNonNull LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i10, i11, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new Aa.a[0], -1.0f);
    }
}
