package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class O8 extends a {
    public static final Parcelable.Creator<O8> CREATOR = new d9();

    /* renamed from: a  reason: collision with root package name */
    private final int f52120a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52121b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52122c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52123d;

    public O8(int i10, String str, String str2, String str3) {
        this.f52120a = i10;
        this.f52121b = str;
        this.f52122c = str2;
        this.f52123d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f52120a);
        c.u(parcel, 2, this.f52121b, false);
        c.u(parcel, 3, this.f52122c, false);
        c.u(parcel, 4, this.f52123d, false);
        c.b(parcel, a10);
    }
}
