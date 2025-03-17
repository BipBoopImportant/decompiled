package na;

import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final int f55156a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55157b;

    /* renamed from: c  reason: collision with root package name */
    public final long f55158c;

    /* renamed from: d  reason: collision with root package name */
    public final long f55159d;

    s(int i10, int i11, long j10, long j11) {
        this.f55156a = i10;
        this.f55157b = i11;
        this.f55158c = j10;
        this.f55159d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f55156a == sVar.f55156a && this.f55157b == sVar.f55157b && this.f55158c == sVar.f55158c && this.f55159d == sVar.f55159d;
        }
    }

    public final int hashCode() {
        return C6619q.c(Integer.valueOf(this.f55157b), Integer.valueOf(this.f55156a), Long.valueOf(this.f55159d), Long.valueOf(this.f55158c));
    }

    public final String toString() {
        int i10 = this.f55156a;
        int length = String.valueOf(i10).length();
        int i11 = this.f55157b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f55159d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f55158c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j10);
        sb2.append(" system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f55156a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f55157b);
        c.r(parcel, 3, this.f55158c);
        c.r(parcel, 4, this.f55159d);
        c.b(parcel, a10);
    }
}
