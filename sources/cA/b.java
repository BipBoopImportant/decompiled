package Ca;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    String f33796a;

    /* renamed from: b  reason: collision with root package name */
    int f33797b;

    /* renamed from: c  reason: collision with root package name */
    boolean f33798c;

    /* renamed from: d  reason: collision with root package name */
    String f33799d;

    /* renamed from: e  reason: collision with root package name */
    String f33800e;

    /* renamed from: f  reason: collision with root package name */
    String f33801f;

    /* renamed from: g  reason: collision with root package name */
    String f33802g;

    /* renamed from: h  reason: collision with root package name */
    String f33803h;

    /* renamed from: i  reason: collision with root package name */
    String f33804i;

    private b() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f33796a, false);
        c.n(parcel, 2, this.f33797b);
        c.c(parcel, 3, this.f33798c);
        c.u(parcel, 4, this.f33799d, false);
        c.u(parcel, 5, this.f33800e, false);
        c.u(parcel, 6, this.f33801f, false);
        c.u(parcel, 7, this.f33802g, false);
        c.u(parcel, 8, this.f33803h, false);
        c.u(parcel, 9, this.f33804i, false);
        c.b(parcel, a10);
    }

    b(String str, int i10, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f33796a = str;
        this.f33797b = i10;
        this.f33798c = z10;
        this.f33799d = str2;
        this.f33800e = str3;
        this.f33801f = str4;
        this.f33802g = str5;
        this.f33803h = str6;
        this.f33804i = str7;
    }
}
