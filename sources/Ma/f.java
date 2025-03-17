package ma;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    final byte[] f55056a;

    f() {
        this.f55056a = new byte[0];
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f55056a;
        int a10 = c.a(parcel);
        c.g(parcel, 2, bArr, false);
        c.b(parcel, a10);
    }

    public f(byte[] bArr) {
        this.f55056a = bArr;
    }
}
