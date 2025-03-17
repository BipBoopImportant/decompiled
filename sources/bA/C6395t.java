package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ba.t  reason: case insensitive filesystem */
public final class C6395t extends a {
    public static final Parcelable.Creator<C6395t> CREATOR = new F();

    /* renamed from: a  reason: collision with root package name */
    int f33378a;

    /* renamed from: b  reason: collision with root package name */
    String f33379b;

    /* renamed from: c  reason: collision with root package name */
    String f33380c;

    private C6395t() {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f33378a);
        c.u(parcel, 2, this.f33379b, false);
        c.u(parcel, 3, this.f33380c, false);
        c.b(parcel, a10);
    }

    public C6395t(int i10, String str, String str2) {
        this.f33378a = i10;
        this.f33379b = str;
        this.f33380c = str2;
    }
}
