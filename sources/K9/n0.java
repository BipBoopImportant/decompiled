package K9;

import G9.C6521b;
import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class n0 extends a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: a  reason: collision with root package name */
    Bundle f37886a;

    /* renamed from: b  reason: collision with root package name */
    C6521b[] f37887b;

    /* renamed from: c  reason: collision with root package name */
    int f37888c;

    /* renamed from: d  reason: collision with root package name */
    C6608f f37889d;

    public n0() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 1, this.f37886a, false);
        c.x(parcel, 2, this.f37887b, i10, false);
        c.n(parcel, 3, this.f37888c);
        c.t(parcel, 4, this.f37889d, i10, false);
        c.b(parcel, a10);
    }

    n0(Bundle bundle, C6521b[] bVarArr, int i10, C6608f fVar) {
        this.f37886a = bundle;
        this.f37887b = bVarArr;
        this.f37888c = i10;
        this.f37889d = fVar;
    }
}
