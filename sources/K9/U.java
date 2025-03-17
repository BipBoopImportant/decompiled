package K9;

import K9.C6613k;
import L9.a;
import L9.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

public final class U extends a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* renamed from: a  reason: collision with root package name */
    final int f37779a;

    /* renamed from: b  reason: collision with root package name */
    final IBinder f37780b;

    /* renamed from: c  reason: collision with root package name */
    private final ConnectionResult f37781c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f37782d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f37783e;

    U(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f37779a = i10;
        this.f37780b = iBinder;
        this.f37781c = connectionResult;
        this.f37782d = z10;
        this.f37783e = z11;
    }

    public final C6613k B() {
        IBinder iBinder = this.f37780b;
        if (iBinder == null) {
            return null;
        }
        return C6613k.a.J3(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return this.f37781c.equals(u10.f37781c) && C6619q.b(B(), u10.B());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f37779a);
        c.m(parcel, 2, this.f37780b, false);
        c.t(parcel, 3, this.f37781c, i10, false);
        c.c(parcel, 4, this.f37782d);
        c.c(parcel, 5, this.f37783e);
        c.b(parcel, a10);
    }

    public final ConnectionResult x() {
        return this.f37781c;
    }
}
