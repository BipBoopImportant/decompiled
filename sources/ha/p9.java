package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class p9 extends a {
    public static final Parcelable.Creator<p9> CREATOR = new q9();

    /* renamed from: a  reason: collision with root package name */
    private final int f52723a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52724b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52725c;

    /* renamed from: d  reason: collision with root package name */
    private final int f52726d;

    /* renamed from: e  reason: collision with root package name */
    private final long f52727e;

    public p9(int i10, int i11, int i12, int i13, long j10) {
        this.f52723a = i10;
        this.f52724b = i11;
        this.f52725c = i12;
        this.f52726d = i13;
        this.f52727e = j10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f52723a);
        c.n(parcel, 2, this.f52724b);
        c.n(parcel, 3, this.f52725c);
        c.n(parcel, 4, this.f52726d);
        c.r(parcel, 5, this.f52727e);
        c.b(parcel, a10);
    }
}
