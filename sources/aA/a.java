package Aa;

import L9.c;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends L9.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final PointF[] f32773a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32774b;

    public a(PointF[] pointFArr, int i10) {
        this.f32773a = pointFArr;
        this.f32774b = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.x(parcel, 2, this.f32773a, i10, false);
        c.n(parcel, 3, this.f32774b);
        c.b(parcel, a10);
    }
}
