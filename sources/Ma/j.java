package ma;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    final byte[] f55058a;

    public j(byte[] bArr) {
        this.f55058a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f55058a;
        int a10 = c.a(parcel);
        c.g(parcel, 1, bArr, false);
        c.b(parcel, a10);
    }
}
