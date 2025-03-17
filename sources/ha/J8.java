package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class J8 extends a {
    public static final Parcelable.Creator<J8> CREATOR = new Z8();

    /* renamed from: a  reason: collision with root package name */
    private final int f51982a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51983b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51984c;

    /* renamed from: d  reason: collision with root package name */
    private final int f51985d;

    /* renamed from: e  reason: collision with root package name */
    private final int f51986e;

    /* renamed from: f  reason: collision with root package name */
    private final int f51987f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f51988g;

    /* renamed from: h  reason: collision with root package name */
    private final String f51989h;

    public J8(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f51982a = i10;
        this.f51983b = i11;
        this.f51984c = i12;
        this.f51985d = i13;
        this.f51986e = i14;
        this.f51987f = i15;
        this.f51988g = z10;
        this.f51989h = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f51982a);
        c.n(parcel, 2, this.f51983b);
        c.n(parcel, 3, this.f51984c);
        c.n(parcel, 4, this.f51985d);
        c.n(parcel, 5, this.f51986e);
        c.n(parcel, 6, this.f51987f);
        c.c(parcel, 7, this.f51988g);
        c.u(parcel, 8, this.f51989h, false);
        c.b(parcel, a10);
    }
}
