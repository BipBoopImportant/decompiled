package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class P8 extends a {
    public static final Parcelable.Creator<P8> CREATOR = new e9();

    /* renamed from: a  reason: collision with root package name */
    private final double f52138a;

    /* renamed from: b  reason: collision with root package name */
    private final double f52139b;

    public P8(double d10, double d11) {
        this.f52138a = d10;
        this.f52139b = d11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.i(parcel, 1, this.f52138a);
        c.i(parcel, 2, this.f52139b);
        c.b(parcel, a10);
    }
}
