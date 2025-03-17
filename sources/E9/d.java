package E9;

import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35288a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35289b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35290c;

    public d(boolean z10, long j10, long j11) {
        this.f35288a = z10;
        this.f35289b = j10;
        this.f35290c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f35288a == dVar.f35288a && this.f35289b == dVar.f35289b && this.f35290c == dVar.f35290c;
        }
    }

    public final int hashCode() {
        return C6619q.c(Boolean.valueOf(this.f35288a), Long.valueOf(this.f35289b), Long.valueOf(this.f35290c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f35288a + ",collectForDebugStartTimeMillis: " + this.f35289b + ",collectForDebugExpiryTimeMillis: " + this.f35290c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f35288a);
        c.r(parcel, 2, this.f35290c);
        c.r(parcel, 3, this.f35289b);
        c.b(parcel, a10);
    }
}
