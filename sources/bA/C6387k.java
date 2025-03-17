package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ba.k  reason: case insensitive filesystem */
public final class C6387k extends a {
    public static final Parcelable.Creator<C6387k> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    int f33359a;

    /* renamed from: b  reason: collision with root package name */
    String f33360b;

    private C6387k() {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f33359a);
        c.u(parcel, 3, this.f33360b, false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f33360b;
    }

    C6387k(int i10, String str) {
        this.f33359a = i10;
        this.f33360b = str;
    }
}
