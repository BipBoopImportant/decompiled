package Da;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    long f34633a;

    /* renamed from: b  reason: collision with root package name */
    long f34634b;

    f() {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 2, this.f34633a);
        c.r(parcel, 3, this.f34634b);
        c.b(parcel, a10);
    }

    public f(long j10, long j11) {
        this.f34633a = j10;
        this.f34634b = j11;
    }
}
