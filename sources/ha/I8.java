package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class I8 extends a {
    public static final Parcelable.Creator<I8> CREATOR = new H8();

    /* renamed from: a  reason: collision with root package name */
    private final int f51963a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f51964b;

    public I8(int i10, String[] strArr) {
        this.f51963a = i10;
        this.f51964b = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f51963a);
        c.v(parcel, 2, this.f51964b, false);
        c.b(parcel, a10);
    }
}
