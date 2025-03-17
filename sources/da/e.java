package Da;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    String f34631a;

    /* renamed from: b  reason: collision with root package name */
    String f34632b;

    public e(String str, String str2) {
        this.f34631a = str;
        this.f34632b = str2;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f34631a, false);
        c.u(parcel, 3, this.f34632b, false);
        c.b(parcel, a10);
    }
}
