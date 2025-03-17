package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class Q3 extends a {
    public static final Parcelable.Creator<Q3> CREATOR = new s9();

    /* renamed from: a  reason: collision with root package name */
    public U5 f52148a;

    /* renamed from: b  reason: collision with root package name */
    public String f52149b;

    /* renamed from: c  reason: collision with root package name */
    public String f52150c;

    /* renamed from: d  reason: collision with root package name */
    public C8164v6[] f52151d;

    /* renamed from: e  reason: collision with root package name */
    public S4[] f52152e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f52153f;

    /* renamed from: g  reason: collision with root package name */
    public C8081n2[] f52154g;

    public Q3() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, this.f52148a, i10, false);
        c.u(parcel, 3, this.f52149b, false);
        c.u(parcel, 4, this.f52150c, false);
        c.x(parcel, 5, this.f52151d, i10, false);
        c.x(parcel, 6, this.f52152e, i10, false);
        c.v(parcel, 7, this.f52153f, false);
        c.x(parcel, 8, this.f52154g, i10, false);
        c.b(parcel, a10);
    }

    public Q3(U5 u52, String str, String str2, C8164v6[] v6VarArr, S4[] s4Arr, String[] strArr, C8081n2[] n2VarArr) {
        this.f52148a = u52;
        this.f52149b = str;
        this.f52150c = str2;
        this.f52151d = v6VarArr;
        this.f52152e = s4Arr;
        this.f52153f = strArr;
        this.f52154g = n2VarArr;
    }
}
