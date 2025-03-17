package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class C extends a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: a  reason: collision with root package name */
    final String f33277a;

    /* renamed from: b  reason: collision with root package name */
    final String f33278b;

    /* renamed from: c  reason: collision with root package name */
    final int f33279c;

    /* renamed from: d  reason: collision with root package name */
    final int f33280d;

    public C(String str, String str2, int i10, int i11) {
        this.f33277a = str;
        this.f33278b = str2;
        this.f33279c = i10;
        this.f33280d = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f33277a;
        int a10 = c.a(parcel);
        c.u(parcel, 2, str, false);
        c.u(parcel, 3, this.f33278b, false);
        c.n(parcel, 4, this.f33279c);
        c.n(parcel, 5, this.f33280d);
        c.b(parcel, a10);
    }
}
