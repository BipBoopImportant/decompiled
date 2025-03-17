package C9;

import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class a extends L9.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    final int f33774a;

    /* renamed from: b  reason: collision with root package name */
    private int f33775b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f33776c;

    a(int i10, int i11, Bundle bundle) {
        this.f33774a = i10;
        this.f33775b = i11;
        this.f33776c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f33774a);
        c.n(parcel, 2, x());
        c.e(parcel, 3, this.f33776c, false);
        c.b(parcel, a10);
    }

    public int x() {
        return this.f33775b;
    }
}
