package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class U8 extends a {
    public static final Parcelable.Creator<U8> CREATOR = new o9();

    /* renamed from: a  reason: collision with root package name */
    private final String f52281a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52282b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52283c;

    public U8(String str, String str2, int i10) {
        this.f52281a = str;
        this.f52282b = str2;
        this.f52283c = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f52281a, false);
        c.u(parcel, 2, this.f52282b, false);
        c.n(parcel, 3, this.f52283c);
        c.b(parcel, a10);
    }
}
