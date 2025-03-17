package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.n2  reason: case insensitive filesystem */
public final class C8081n2 extends a {
    public static final Parcelable.Creator<C8081n2> CREATOR = new M1();

    /* renamed from: a  reason: collision with root package name */
    public int f52666a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f52667b;

    public C8081n2() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52666a);
        c.v(parcel, 3, this.f52667b, false);
        c.b(parcel, a10);
    }

    public C8081n2(int i10, String[] strArr) {
        this.f52666a = i10;
        this.f52667b = strArr;
    }
}
