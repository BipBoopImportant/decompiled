package O9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final int f39305a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39306b;

    public g(int i10) {
        this(i10, false);
    }

    public final boolean B() {
        return this.f39306b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, x());
        c.c(parcel, 2, this.f39306b);
        c.b(parcel, a10);
    }

    public int x() {
        return this.f39305a;
    }

    public g(int i10, boolean z10) {
        this.f39305a = i10;
        this.f39306b = z10;
    }
}
