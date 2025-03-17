package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class U7 extends a {
    public static final Parcelable.Creator<U7> CREATOR = new C8018h();

    /* renamed from: a  reason: collision with root package name */
    public String f52278a;

    /* renamed from: b  reason: collision with root package name */
    public String f52279b;

    /* renamed from: c  reason: collision with root package name */
    public int f52280c;

    public U7() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f52278a, false);
        c.u(parcel, 3, this.f52279b, false);
        c.n(parcel, 4, this.f52280c);
        c.b(parcel, a10);
    }

    public U7(String str, String str2, int i10) {
        this.f52278a = str;
        this.f52279b = str2;
        this.f52280c = i10;
    }
}
