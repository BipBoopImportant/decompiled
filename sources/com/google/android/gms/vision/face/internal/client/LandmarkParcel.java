package com.google.android.gms.vision.face.internal.client;

import Aa.d;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("wrapper.cc")
public final class LandmarkParcel extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    private final int f50577a;

    /* renamed from: b  reason: collision with root package name */
    public final float f50578b;

    /* renamed from: c  reason: collision with root package name */
    public final float f50579c;

    /* renamed from: d  reason: collision with root package name */
    public final int f50580d;

    @UsedByNative("wrapper.cc")
    public LandmarkParcel(int i10, float f10, float f11, int i11) {
        this.f50577a = i10;
        this.f50578b = f10;
        this.f50579c = f11;
        this.f50580d = i11;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f50577a);
        c.k(parcel, 2, this.f50578b);
        c.k(parcel, 3, this.f50579c);
        c.n(parcel, 4, this.f50580d);
        c.b(parcel, a10);
    }
}
