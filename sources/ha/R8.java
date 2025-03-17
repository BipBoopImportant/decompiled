package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class R8 extends a {
    public static final Parcelable.Creator<R8> CREATOR = new k9();

    /* renamed from: a  reason: collision with root package name */
    private final int f52195a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52196b;

    public R8(int i10, String str) {
        this.f52195a = i10;
        this.f52196b = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f52195a);
        c.u(parcel, 2, this.f52196b, false);
        c.b(parcel, a10);
    }
}
