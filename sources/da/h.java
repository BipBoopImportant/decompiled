package Da;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    String f34637a;

    /* renamed from: b  reason: collision with root package name */
    String f34638b;

    /* renamed from: c  reason: collision with root package name */
    f f34639c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    g f34640d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    g f34641e;

    h(String str, String str2, f fVar, g gVar, g gVar2) {
        this.f34637a = str;
        this.f34638b = str2;
        this.f34639c = fVar;
        this.f34640d = gVar;
        this.f34641e = gVar2;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f34637a, false);
        c.u(parcel, 3, this.f34638b, false);
        c.t(parcel, 4, this.f34639c, i10, false);
        c.t(parcel, 5, this.f34640d, i10, false);
        c.t(parcel, 6, this.f34641e, i10, false);
        c.b(parcel, a10);
    }
}
