package va;

import K9.U;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    final int f56976a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f56977b;

    /* renamed from: c  reason: collision with root package name */
    private final U f56978c;

    l(int i10, ConnectionResult connectionResult, U u10) {
        this.f56976a = i10;
        this.f56977b = connectionResult;
        this.f56978c = u10;
    }

    public final U B() {
        return this.f56978c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f56976a);
        c.t(parcel, 2, this.f56977b, i10, false);
        c.t(parcel, 3, this.f56978c, i10, false);
        c.b(parcel, a10);
    }

    public final ConnectionResult x() {
        return this.f56977b;
    }
}
