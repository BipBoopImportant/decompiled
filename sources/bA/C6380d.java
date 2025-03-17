package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ba.d  reason: case insensitive filesystem */
public final class C6380d extends a {
    public static final Parcelable.Creator<C6380d> CREATOR = new N();

    /* renamed from: a  reason: collision with root package name */
    private String f33301a;

    /* renamed from: b  reason: collision with root package name */
    private String f33302b;

    /* renamed from: c  reason: collision with root package name */
    private int f33303c;

    private C6380d() {
    }

    public String B() {
        return this.f33302b;
    }

    public String F() {
        return this.f33301a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, F(), false);
        c.u(parcel, 3, B(), false);
        c.n(parcel, 4, x());
        c.b(parcel, a10);
    }

    public int x() {
        int i10 = this.f33303c;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    public C6380d(String str, String str2, int i10) {
        this.f33301a = str;
        this.f33302b = str2;
        this.f33303c = i10;
    }
}
