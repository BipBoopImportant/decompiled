package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.x7  reason: case insensitive filesystem */
public final class C8185x7 extends a {
    public static final Parcelable.Creator<C8185x7> CREATOR = new C8008g();

    /* renamed from: a  reason: collision with root package name */
    public String f53006a;

    /* renamed from: b  reason: collision with root package name */
    public String f53007b;

    public C8185x7() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f53006a, false);
        c.u(parcel, 3, this.f53007b, false);
        c.b(parcel, a10);
    }

    public C8185x7(String str, String str2) {
        this.f53006a = str;
        this.f53007b = str2;
    }
}
