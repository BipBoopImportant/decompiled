package K9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: K9.d  reason: case insensitive filesystem */
public class C6606d extends a {
    public static final Parcelable.Creator<C6606d> CREATOR = new A();

    /* renamed from: a  reason: collision with root package name */
    public final int f37820a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37821b;

    public C6606d(int i10, String str) {
        this.f37820a = i10;
        this.f37821b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6606d)) {
            return false;
        }
        C6606d dVar = (C6606d) obj;
        return dVar.f37820a == this.f37820a && C6619q.b(dVar.f37821b, this.f37821b);
    }

    public final int hashCode() {
        return this.f37820a;
    }

    public final String toString() {
        return this.f37820a + ":" + this.f37821b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f37820a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.u(parcel, 2, this.f37821b, false);
        c.b(parcel, a10);
    }
}
