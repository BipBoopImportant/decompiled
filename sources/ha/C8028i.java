package ha;

import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.i  reason: case insensitive filesystem */
public final class C8028i extends a {
    public static final Parcelable.Creator<C8028i> CREATOR = new C8038j();

    /* renamed from: a  reason: collision with root package name */
    public int f52575a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52576b;

    public C8028i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8028i)) {
            return false;
        }
        C8028i iVar = (C8028i) obj;
        return this.f52575a == iVar.f52575a && C6619q.b(Boolean.valueOf(this.f52576b), Boolean.valueOf(iVar.f52576b));
    }

    public final int hashCode() {
        return C6619q.c(Integer.valueOf(this.f52575a), Boolean.valueOf(this.f52576b));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52575a);
        c.c(parcel, 3, this.f52576b);
        c.b(parcel, a10);
    }

    public C8028i(int i10, boolean z10) {
        this.f52575a = i10;
        this.f52576b = z10;
    }
}
