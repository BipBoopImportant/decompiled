package Ba;

import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ba.l  reason: case insensitive filesystem */
public final class C6388l extends a {
    public static final Parcelable.Creator<C6388l> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    int f33361a;

    /* renamed from: b  reason: collision with root package name */
    final Bundle f33362b;

    private C6388l() {
        this.f33362b = new Bundle();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f33361a);
        c.e(parcel, 3, this.f33362b, false);
        c.b(parcel, a10);
    }

    C6388l(int i10, Bundle bundle) {
        new Bundle();
        this.f33361a = i10;
        this.f33362b = bundle;
    }
}
