package ma;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    final byte[] f55057a;

    h() {
        this.f55057a = new byte[0];
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.f55057a;
        int a10 = c.a(parcel);
        c.g(parcel, 2, bArr, false);
        c.b(parcel, a10);
    }

    public h(byte[] bArr) {
        this.f55057a = bArr;
    }
}
