package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class X8 extends a {
    public static final Parcelable.Creator<X8> CREATOR = new Y8();

    /* renamed from: a  reason: collision with root package name */
    private final int f52367a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52368b;

    public X8(int i10, boolean z10) {
        this.f52367a = i10;
        this.f52368b = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f52367a);
        c.c(parcel, 2, this.f52368b);
        c.b(parcel, a10);
    }
}
