package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class K8 extends a {
    public static final Parcelable.Creator<K8> CREATOR = new a9();

    /* renamed from: a  reason: collision with root package name */
    private final String f52012a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52013b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52014c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52015d;

    /* renamed from: e  reason: collision with root package name */
    private final String f52016e;

    /* renamed from: f  reason: collision with root package name */
    private final J8 f52017f;

    /* renamed from: g  reason: collision with root package name */
    private final J8 f52018g;

    public K8(String str, String str2, String str3, String str4, String str5, J8 j82, J8 j83) {
        this.f52012a = str;
        this.f52013b = str2;
        this.f52014c = str3;
        this.f52015d = str4;
        this.f52016e = str5;
        this.f52017f = j82;
        this.f52018g = j83;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f52012a, false);
        c.u(parcel, 2, this.f52013b, false);
        c.u(parcel, 3, this.f52014c, false);
        c.u(parcel, 4, this.f52015d, false);
        c.u(parcel, 5, this.f52016e, false);
        c.t(parcel, 6, this.f52017f, i10, false);
        c.t(parcel, 7, this.f52018g, i10, false);
        c.b(parcel, a10);
    }
}
