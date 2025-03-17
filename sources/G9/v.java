package G9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class v extends a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f36342a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36343b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36344c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36345d;

    v(boolean z10, String str, int i10, int i11) {
        this.f36342a = z10;
        this.f36343b = str;
        this.f36344c = C.a(i10) - 1;
        this.f36345d = i.a(i11) - 1;
    }

    public final boolean B() {
        return this.f36342a;
    }

    public final int F() {
        return i.a(this.f36345d);
    }

    public final int J() {
        return C.a(this.f36344c);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f36342a);
        c.u(parcel, 2, this.f36343b, false);
        c.n(parcel, 3, this.f36344c);
        c.n(parcel, 4, this.f36345d);
        c.b(parcel, a10);
    }

    public final String x() {
        return this.f36343b;
    }
}
