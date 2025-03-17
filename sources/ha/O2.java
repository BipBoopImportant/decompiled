package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class O2 extends a {
    public static final Parcelable.Creator<O2> CREATOR = new m9();

    /* renamed from: a  reason: collision with root package name */
    public int f52098a;

    /* renamed from: b  reason: collision with root package name */
    public int f52099b;

    /* renamed from: c  reason: collision with root package name */
    public int f52100c;

    /* renamed from: d  reason: collision with root package name */
    public int f52101d;

    /* renamed from: e  reason: collision with root package name */
    public int f52102e;

    /* renamed from: f  reason: collision with root package name */
    public int f52103f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f52104g;

    /* renamed from: h  reason: collision with root package name */
    public String f52105h;

    public O2() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52098a);
        c.n(parcel, 3, this.f52099b);
        c.n(parcel, 4, this.f52100c);
        c.n(parcel, 5, this.f52101d);
        c.n(parcel, 6, this.f52102e);
        c.n(parcel, 7, this.f52103f);
        c.c(parcel, 8, this.f52104g);
        c.u(parcel, 9, this.f52105h, false);
        c.b(parcel, a10);
    }

    public O2(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f52098a = i10;
        this.f52099b = i11;
        this.f52100c = i12;
        this.f52101d = i13;
        this.f52102e = i14;
        this.f52103f = i15;
        this.f52104g = z10;
        this.f52105h = str;
    }
}
