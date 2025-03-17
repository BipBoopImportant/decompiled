package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class M8 extends a {
    public static final Parcelable.Creator<M8> CREATOR = new b9();

    /* renamed from: a  reason: collision with root package name */
    private final Q8 f52048a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52049b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52050c;

    /* renamed from: d  reason: collision with root package name */
    private final R8[] f52051d;

    /* renamed from: e  reason: collision with root package name */
    private final O8[] f52052e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f52053f;

    /* renamed from: g  reason: collision with root package name */
    private final I8[] f52054g;

    public M8(Q8 q82, String str, String str2, R8[] r8Arr, O8[] o8Arr, String[] strArr, I8[] i8Arr) {
        this.f52048a = q82;
        this.f52049b = str;
        this.f52050c = str2;
        this.f52051d = r8Arr;
        this.f52052e = o8Arr;
        this.f52053f = strArr;
        this.f52054g = i8Arr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f52048a, i10, false);
        c.u(parcel, 2, this.f52049b, false);
        c.u(parcel, 3, this.f52050c, false);
        c.x(parcel, 4, this.f52051d, i10, false);
        c.x(parcel, 5, this.f52052e, i10, false);
        c.v(parcel, 6, this.f52053f, false);
        c.x(parcel, 7, this.f52054g, i10, false);
        c.b(parcel, a10);
    }
}
