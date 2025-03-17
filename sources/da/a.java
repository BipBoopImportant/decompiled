package Da;

import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends L9.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    String f34617a;

    /* renamed from: b  reason: collision with root package name */
    String f34618b;

    public a(String str, String str2) {
        this.f34617a = str;
        this.f34618b = str2;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f34617a, false);
        c.u(parcel, 3, this.f34618b, false);
        c.b(parcel, a10);
    }
}
