package ma;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    String[] f55060a;

    /* renamed from: b  reason: collision with root package name */
    int[] f55061b;

    /* renamed from: c  reason: collision with root package name */
    RemoteViews f55062c;

    /* renamed from: d  reason: collision with root package name */
    byte[] f55063d;

    private n() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.v(parcel, 1, this.f55060a, false);
        c.o(parcel, 2, this.f55061b, false);
        c.t(parcel, 3, this.f55062c, i10, false);
        c.g(parcel, 4, this.f55063d, false);
        c.b(parcel, a10);
    }

    public n(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f55060a = strArr;
        this.f55061b = iArr;
        this.f55062c = remoteViews;
        this.f55063d = bArr;
    }
}
