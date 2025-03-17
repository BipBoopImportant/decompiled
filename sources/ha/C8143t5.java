package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.t5  reason: case insensitive filesystem */
public final class C8143t5 extends a {
    public static final Parcelable.Creator<C8143t5> CREATOR = new C7968c();

    /* renamed from: a  reason: collision with root package name */
    public double f52804a;

    /* renamed from: b  reason: collision with root package name */
    public double f52805b;

    public C8143t5() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.i(parcel, 2, this.f52804a);
        c.i(parcel, 3, this.f52805b);
        c.b(parcel, a10);
    }

    public C8143t5(double d10, double d11) {
        this.f52804a = d10;
        this.f52805b = d11;
    }
}
