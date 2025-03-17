package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.o  reason: case insensitive filesystem */
public final class C8088o extends a {
    public static final Parcelable.Creator<C8088o> CREATOR = new C8098p();

    /* renamed from: a  reason: collision with root package name */
    public int f52679a;

    /* renamed from: b  reason: collision with root package name */
    public int f52680b;

    /* renamed from: c  reason: collision with root package name */
    public int f52681c;

    /* renamed from: d  reason: collision with root package name */
    public long f52682d;

    /* renamed from: e  reason: collision with root package name */
    public int f52683e;

    public C8088o(int i10, int i11, int i12, long j10, int i13) {
        this.f52679a = i10;
        this.f52680b = i11;
        this.f52681c = i12;
        this.f52682d = j10;
        this.f52683e = i13;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52679a);
        c.n(parcel, 3, this.f52680b);
        c.n(parcel, 4, this.f52681c);
        c.r(parcel, 5, this.f52682d);
        c.n(parcel, 6, this.f52683e);
        c.b(parcel, a10);
    }
}
