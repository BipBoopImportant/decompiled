package ha;

import L9.a;
import L9.c;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

public final class V8 extends a {
    public static final Parcelable.Creator<V8> CREATOR = new W8();

    /* renamed from: a  reason: collision with root package name */
    private final int f52300a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52301b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52302c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f52303d;

    /* renamed from: e  reason: collision with root package name */
    private final Point[] f52304e;

    /* renamed from: f  reason: collision with root package name */
    private final int f52305f;

    /* renamed from: g  reason: collision with root package name */
    private final O8 f52306g;

    /* renamed from: h  reason: collision with root package name */
    private final R8 f52307h;

    /* renamed from: i  reason: collision with root package name */
    private final S8 f52308i;

    /* renamed from: j  reason: collision with root package name */
    private final U8 f52309j;

    /* renamed from: k  reason: collision with root package name */
    private final T8 f52310k;

    /* renamed from: l  reason: collision with root package name */
    private final P8 f52311l;

    /* renamed from: m  reason: collision with root package name */
    private final K8 f52312m;

    /* renamed from: n  reason: collision with root package name */
    private final M8 f52313n;

    /* renamed from: o  reason: collision with root package name */
    private final N8 f52314o;

    public V8(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, O8 o82, R8 r82, S8 s82, U8 u82, T8 t82, P8 p82, K8 k82, M8 m82, N8 n82) {
        this.f52300a = i10;
        this.f52301b = str;
        this.f52302c = str2;
        this.f52303d = bArr;
        this.f52304e = pointArr;
        this.f52305f = i11;
        this.f52306g = o82;
        this.f52307h = r82;
        this.f52308i = s82;
        this.f52309j = u82;
        this.f52310k = t82;
        this.f52311l = p82;
        this.f52312m = k82;
        this.f52313n = m82;
        this.f52314o = n82;
    }

    public final int B() {
        return this.f52305f;
    }

    public final String F() {
        return this.f52302c;
    }

    public final Point[] J() {
        return this.f52304e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f52300a);
        c.u(parcel, 2, this.f52301b, false);
        c.u(parcel, 3, this.f52302c, false);
        c.g(parcel, 4, this.f52303d, false);
        c.x(parcel, 5, this.f52304e, i10, false);
        c.n(parcel, 6, this.f52305f);
        c.t(parcel, 7, this.f52306g, i10, false);
        c.t(parcel, 8, this.f52307h, i10, false);
        c.t(parcel, 9, this.f52308i, i10, false);
        c.t(parcel, 10, this.f52309j, i10, false);
        c.t(parcel, 11, this.f52310k, i10, false);
        c.t(parcel, 12, this.f52311l, i10, false);
        c.t(parcel, 13, this.f52312m, i10, false);
        c.t(parcel, 14, this.f52313n, i10, false);
        c.t(parcel, 15, this.f52314o, i10, false);
        c.b(parcel, a10);
    }

    public final int x() {
        return this.f52300a;
    }
}
