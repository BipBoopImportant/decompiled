package Da;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    int f34625a;

    /* renamed from: b  reason: collision with root package name */
    String f34626b;

    /* renamed from: c  reason: collision with root package name */
    double f34627c;

    /* renamed from: d  reason: collision with root package name */
    String f34628d;

    /* renamed from: e  reason: collision with root package name */
    long f34629e;

    /* renamed from: f  reason: collision with root package name */
    int f34630f;

    d() {
        this.f34630f = -1;
        this.f34625a = -1;
        this.f34627c = -1.0d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f34625a);
        c.u(parcel, 3, this.f34626b, false);
        c.i(parcel, 4, this.f34627c);
        c.u(parcel, 5, this.f34628d, false);
        c.r(parcel, 6, this.f34629e);
        c.n(parcel, 7, this.f34630f);
        c.b(parcel, a10);
    }

    d(int i10, String str, double d10, String str2, long j10, int i11) {
        this.f34625a = i10;
        this.f34626b = str;
        this.f34627c = d10;
        this.f34628d = str2;
        this.f34629e = j10;
        this.f34630f = i11;
    }
}
