package ha;

import L9.a;
import L9.c;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.v8  reason: case insensitive filesystem */
public final class C8166v8 extends a {
    public static final Parcelable.Creator<C8166v8> CREATOR = new L8();

    /* renamed from: a  reason: collision with root package name */
    public int f52854a;

    /* renamed from: b  reason: collision with root package name */
    public String f52855b;

    /* renamed from: c  reason: collision with root package name */
    public String f52856c;

    /* renamed from: d  reason: collision with root package name */
    public int f52857d;

    /* renamed from: e  reason: collision with root package name */
    public Point[] f52858e;

    /* renamed from: f  reason: collision with root package name */
    public S4 f52859f;

    /* renamed from: g  reason: collision with root package name */
    public C8164v6 f52860g;

    /* renamed from: h  reason: collision with root package name */
    public W6 f52861h;

    /* renamed from: i  reason: collision with root package name */
    public U7 f52862i;

    /* renamed from: j  reason: collision with root package name */
    public C8185x7 f52863j;

    /* renamed from: k  reason: collision with root package name */
    public C8143t5 f52864k;

    /* renamed from: l  reason: collision with root package name */
    public C8102p3 f52865l;

    /* renamed from: m  reason: collision with root package name */
    public Q3 f52866m;

    /* renamed from: n  reason: collision with root package name */
    public C8122r4 f52867n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f52868o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f52869p;

    /* renamed from: q  reason: collision with root package name */
    public double f52870q;

    public C8166v8() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52854a);
        c.u(parcel, 3, this.f52855b, false);
        c.u(parcel, 4, this.f52856c, false);
        c.n(parcel, 5, this.f52857d);
        c.x(parcel, 6, this.f52858e, i10, false);
        c.t(parcel, 7, this.f52859f, i10, false);
        c.t(parcel, 8, this.f52860g, i10, false);
        c.t(parcel, 9, this.f52861h, i10, false);
        c.t(parcel, 10, this.f52862i, i10, false);
        c.t(parcel, 11, this.f52863j, i10, false);
        c.t(parcel, 12, this.f52864k, i10, false);
        c.t(parcel, 13, this.f52865l, i10, false);
        c.t(parcel, 14, this.f52866m, i10, false);
        c.t(parcel, 15, this.f52867n, i10, false);
        c.g(parcel, 16, this.f52868o, false);
        c.c(parcel, 17, this.f52869p);
        c.i(parcel, 18, this.f52870q);
        c.b(parcel, a10);
    }

    public C8166v8(int i10, String str, String str2, int i11, Point[] pointArr, S4 s42, C8164v6 v6Var, W6 w62, U7 u72, C8185x7 x7Var, C8143t5 t5Var, C8102p3 p3Var, Q3 q32, C8122r4 r4Var, byte[] bArr, boolean z10, double d10) {
        this.f52854a = i10;
        this.f52855b = str;
        this.f52868o = bArr;
        this.f52856c = str2;
        this.f52857d = i11;
        this.f52858e = pointArr;
        this.f52869p = z10;
        this.f52870q = d10;
        this.f52859f = s42;
        this.f52860g = v6Var;
        this.f52861h = w62;
        this.f52862i = u72;
        this.f52863j = x7Var;
        this.f52864k = t5Var;
        this.f52865l = p3Var;
        this.f52866m = q32;
        this.f52867n = r4Var;
    }
}
