package qa;

import L9.a;
import L9.c;
import T9.b;
import T9.d;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

public class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    private LatLng f55653a;

    /* renamed from: b  reason: collision with root package name */
    private String f55654b;

    /* renamed from: c  reason: collision with root package name */
    private String f55655c;

    /* renamed from: d  reason: collision with root package name */
    private b f55656d;

    /* renamed from: e  reason: collision with root package name */
    private float f55657e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    private float f55658f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55659g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f55660h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55661i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f55662j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    private float f55663k = 0.5f;

    /* renamed from: l  reason: collision with root package name */
    private float f55664l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f55665m = 1.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f55666n;

    /* renamed from: o  reason: collision with root package name */
    private int f55667o = 0;

    /* renamed from: p  reason: collision with root package name */
    private View f55668p;

    /* renamed from: q  reason: collision with root package name */
    private int f55669q;

    /* renamed from: r  reason: collision with root package name */
    private String f55670r;

    /* renamed from: s  reason: collision with root package name */
    private float f55671s;

    public i() {
    }

    public i A3(float f10) {
        this.f55666n = f10;
        return this;
    }

    public i B(float f10, float f11) {
        this.f55657e = f10;
        this.f55658f = f11;
        return this;
    }

    public final int B3() {
        return this.f55669q;
    }

    public float E0() {
        return this.f55657e;
    }

    public i F(String str) {
        this.f55670r = str;
        return this;
    }

    public i G2(float f10, float f11) {
        this.f55663k = f10;
        this.f55664l = f11;
        return this;
    }

    public boolean H2() {
        return this.f55659g;
    }

    public i J(boolean z10) {
        this.f55659g = z10;
        return this;
    }

    public float N0() {
        return this.f55658f;
    }

    public float S0() {
        return this.f55663k;
    }

    public i U(boolean z10) {
        this.f55661i = z10;
        return this;
    }

    public String W1() {
        return this.f55655c;
    }

    public float X0() {
        return this.f55664l;
    }

    public LatLng a1() {
        return this.f55653a;
    }

    public String c2() {
        return this.f55654b;
    }

    public float o1() {
        return this.f55662j;
    }

    public float t0() {
        return this.f55665m;
    }

    public boolean t3() {
        return this.f55661i;
    }

    public boolean u3() {
        return this.f55660h;
    }

    public i v3(LatLng latLng) {
        if (latLng != null) {
            this.f55653a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public i w3(float f10) {
        this.f55662j = f10;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, a1(), i10, false);
        c.u(parcel, 3, c2(), false);
        c.u(parcel, 4, W1(), false);
        b bVar = this.f55656d;
        c.m(parcel, 5, bVar == null ? null : bVar.a().asBinder(), false);
        c.k(parcel, 6, E0());
        c.k(parcel, 7, N0());
        c.c(parcel, 8, H2());
        c.c(parcel, 9, u3());
        c.c(parcel, 10, t3());
        c.k(parcel, 11, o1());
        c.k(parcel, 12, S0());
        c.k(parcel, 13, X0());
        c.k(parcel, 14, t0());
        c.k(parcel, 15, y2());
        c.n(parcel, 17, this.f55667o);
        c.m(parcel, 18, d.L3(this.f55668p).asBinder(), false);
        c.n(parcel, 19, this.f55669q);
        c.u(parcel, 20, this.f55670r, false);
        c.k(parcel, 21, this.f55671s);
        c.b(parcel, a10);
    }

    public i x(float f10) {
        this.f55665m = f10;
        return this;
    }

    public i x3(String str) {
        this.f55655c = str;
        return this;
    }

    public float y2() {
        return this.f55666n;
    }

    public i y3(String str) {
        this.f55654b = str;
        return this;
    }

    public i z2(b bVar) {
        this.f55656d = bVar;
        return this;
    }

    public i z3(boolean z10) {
        this.f55660h = z10;
        return this;
    }

    i(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f55653a = latLng;
        this.f55654b = str;
        this.f55655c = str2;
        View view = null;
        if (iBinder == null) {
            this.f55656d = null;
        } else {
            this.f55656d = new b(b.a.J3(iBinder));
        }
        this.f55657e = f10;
        this.f55658f = f11;
        this.f55659g = z10;
        this.f55660h = z11;
        this.f55661i = z12;
        this.f55662j = f12;
        this.f55663k = f13;
        this.f55664l = f14;
        this.f55665m = f15;
        this.f55666n = f16;
        this.f55669q = i11;
        this.f55667o = i10;
        b J32 = b.a.J3(iBinder2);
        this.f55668p = J32 != null ? (View) d.K3(J32) : view;
        this.f55670r = str3;
        this.f55671s = f17;
    }
}
