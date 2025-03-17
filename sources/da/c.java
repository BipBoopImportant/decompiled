package Da;

import L9.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    String f34622a;

    /* renamed from: b  reason: collision with root package name */
    d f34623b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    f f34624c;

    c() {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = L9.c.a(parcel);
        L9.c.u(parcel, 2, this.f34622a, false);
        L9.c.t(parcel, 3, this.f34623b, i10, false);
        L9.c.t(parcel, 5, this.f34624c, i10, false);
        L9.c.b(parcel, a10);
    }

    c(String str, d dVar, f fVar) {
        this.f34622a = str;
        this.f34623b = dVar;
        this.f34624c = fVar;
    }
}
