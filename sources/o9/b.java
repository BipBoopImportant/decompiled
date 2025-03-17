package O9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39296a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39297b;

    public b(boolean z10, int i10) {
        this.f39296a = z10;
        this.f39297b = i10;
    }

    public int B() {
        return this.f39297b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, x());
        c.n(parcel, 2, B());
        c.b(parcel, a10);
    }

    public boolean x() {
        return this.f39296a;
    }
}
