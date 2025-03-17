package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.p3  reason: case insensitive filesystem */
public final class C8102p3 extends a {
    public static final Parcelable.Creator<C8102p3> CREATOR = new r9();

    /* renamed from: a  reason: collision with root package name */
    public String f52708a;

    /* renamed from: b  reason: collision with root package name */
    public String f52709b;

    /* renamed from: c  reason: collision with root package name */
    public String f52710c;

    /* renamed from: d  reason: collision with root package name */
    public String f52711d;

    /* renamed from: e  reason: collision with root package name */
    public String f52712e;

    /* renamed from: f  reason: collision with root package name */
    public O2 f52713f;

    /* renamed from: g  reason: collision with root package name */
    public O2 f52714g;

    public C8102p3() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f52708a, false);
        c.u(parcel, 3, this.f52709b, false);
        c.u(parcel, 4, this.f52710c, false);
        c.u(parcel, 5, this.f52711d, false);
        c.u(parcel, 6, this.f52712e, false);
        c.t(parcel, 7, this.f52713f, i10, false);
        c.t(parcel, 8, this.f52714g, i10, false);
        c.b(parcel, a10);
    }

    public C8102p3(String str, String str2, String str3, String str4, String str5, O2 o22, O2 o23) {
        this.f52708a = str;
        this.f52709b = str2;
        this.f52710c = str3;
        this.f52711d = str4;
        this.f52712e = str5;
        this.f52713f = o22;
        this.f52714g = o23;
    }
}
