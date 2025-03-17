package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.v6  reason: case insensitive filesystem */
public final class C8164v6 extends a {
    public static final Parcelable.Creator<C8164v6> CREATOR = new C7988e();

    /* renamed from: a  reason: collision with root package name */
    public int f52852a;

    /* renamed from: b  reason: collision with root package name */
    public String f52853b;

    public C8164v6() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52852a);
        c.u(parcel, 3, this.f52853b, false);
        c.b(parcel, a10);
    }

    public C8164v6(int i10, String str) {
        this.f52852a = i10;
        this.f52853b = str;
    }
}
