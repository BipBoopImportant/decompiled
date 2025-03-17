package va;

import K9.S;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    final int f56974a;

    /* renamed from: b  reason: collision with root package name */
    final S f56975b;

    j(int i10, S s10) {
        this.f56974a = i10;
        this.f56975b = s10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f56974a);
        c.t(parcel, 2, this.f56975b, i10, false);
        c.b(parcel, a10);
    }
}
