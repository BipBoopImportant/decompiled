package com.google.android.gms.maps;

import K9.C6619q;
import L9.a;
import L9.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import oa.h;
import pa.C8645f;

public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    private static final Integer f49461u = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* renamed from: a  reason: collision with root package name */
    private Boolean f49462a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f49463b;

    /* renamed from: c  reason: collision with root package name */
    private int f49464c = -1;

    /* renamed from: d  reason: collision with root package name */
    private CameraPosition f49465d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f49466e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f49467f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f49468g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f49469h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f49470i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f49471j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f49472k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f49473l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f49474m;

    /* renamed from: n  reason: collision with root package name */
    private Float f49475n = null;

    /* renamed from: o  reason: collision with root package name */
    private Float f49476o = null;

    /* renamed from: p  reason: collision with root package name */
    private LatLngBounds f49477p = null;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f49478q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f49479r = null;

    /* renamed from: s  reason: collision with root package name */
    private String f49480s = null;

    /* renamed from: t  reason: collision with root package name */
    private int f49481t;

    public GoogleMapOptions() {
    }

    public static CameraPosition E3(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, h.f55345a);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(h.f55351g) ? obtainAttributes.getFloat(h.f55351g, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(h.f55352h) ? obtainAttributes.getFloat(h.f55352h, 0.0f) : 0.0f));
        CameraPosition.a x10 = CameraPosition.x();
        x10.c(latLng);
        if (obtainAttributes.hasValue(h.f55354j)) {
            x10.e(obtainAttributes.getFloat(h.f55354j, 0.0f));
        }
        if (obtainAttributes.hasValue(h.f55348d)) {
            x10.a(obtainAttributes.getFloat(h.f55348d, 0.0f));
        }
        if (obtainAttributes.hasValue(h.f55353i)) {
            x10.d(obtainAttributes.getFloat(h.f55353i, 0.0f));
        }
        obtainAttributes.recycle();
        return x10.b();
    }

    public static LatLngBounds F3(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, h.f55345a);
        Float valueOf = obtainAttributes.hasValue(h.f55357m) ? Float.valueOf(obtainAttributes.getFloat(h.f55357m, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(h.f55358n) ? Float.valueOf(obtainAttributes.getFloat(h.f55358n, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(h.f55355k) ? Float.valueOf(obtainAttributes.getFloat(h.f55355k, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(h.f55356l) ? Float.valueOf(obtainAttributes.getFloat(h.f55356l, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static GoogleMapOptions U(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, h.f55345a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(h.f55362r)) {
            googleMapOptions.t3(obtainAttributes.getInt(h.f55362r, -1));
        }
        if (obtainAttributes.hasValue(h.f55344B)) {
            googleMapOptions.B3(obtainAttributes.getBoolean(h.f55344B, false));
        }
        if (obtainAttributes.hasValue(h.f55343A)) {
            googleMapOptions.A3(obtainAttributes.getBoolean(h.f55343A, false));
        }
        if (obtainAttributes.hasValue(h.f55363s)) {
            googleMapOptions.J(obtainAttributes.getBoolean(h.f55363s, true));
        }
        if (obtainAttributes.hasValue(h.f55365u)) {
            googleMapOptions.w3(obtainAttributes.getBoolean(h.f55365u, true));
        }
        if (obtainAttributes.hasValue(h.f55367w)) {
            googleMapOptions.y3(obtainAttributes.getBoolean(h.f55367w, true));
        }
        if (obtainAttributes.hasValue(h.f55366v)) {
            googleMapOptions.x3(obtainAttributes.getBoolean(h.f55366v, true));
        }
        if (obtainAttributes.hasValue(h.f55368x)) {
            googleMapOptions.z3(obtainAttributes.getBoolean(h.f55368x, true));
        }
        if (obtainAttributes.hasValue(h.f55370z)) {
            googleMapOptions.D3(obtainAttributes.getBoolean(h.f55370z, true));
        }
        if (obtainAttributes.hasValue(h.f55369y)) {
            googleMapOptions.C3(obtainAttributes.getBoolean(h.f55369y, true));
        }
        if (obtainAttributes.hasValue(h.f55359o)) {
            googleMapOptions.y2(obtainAttributes.getBoolean(h.f55359o, false));
        }
        if (obtainAttributes.hasValue(h.f55364t)) {
            googleMapOptions.H2(obtainAttributes.getBoolean(h.f55364t, true));
        }
        if (obtainAttributes.hasValue(h.f55346b)) {
            googleMapOptions.x(obtainAttributes.getBoolean(h.f55346b, false));
        }
        if (obtainAttributes.hasValue(h.f55350f)) {
            googleMapOptions.v3(obtainAttributes.getFloat(h.f55350f, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(h.f55350f)) {
            googleMapOptions.u3(obtainAttributes.getFloat(h.f55349e, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(h.f55347c)) {
            googleMapOptions.B(Integer.valueOf(obtainAttributes.getColor(h.f55347c, f49461u.intValue())));
        }
        if (obtainAttributes.hasValue(h.f55361q) && (string = obtainAttributes.getString(h.f55361q)) != null && !string.isEmpty()) {
            googleMapOptions.G2(string);
        }
        if (obtainAttributes.hasValue(h.f55360p)) {
            googleMapOptions.z2(obtainAttributes.getInt(h.f55360p, 0));
        }
        googleMapOptions.c2(F3(context, attributeSet));
        googleMapOptions.F(E3(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions A3(boolean z10) {
        this.f49463b = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions B(Integer num) {
        this.f49479r = num;
        return this;
    }

    public GoogleMapOptions B3(boolean z10) {
        this.f49462a = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions C3(boolean z10) {
        this.f49466e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions D3(boolean z10) {
        this.f49469h = Boolean.valueOf(z10);
        return this;
    }

    public CameraPosition E0() {
        return this.f49465d;
    }

    public GoogleMapOptions F(CameraPosition cameraPosition) {
        this.f49465d = cameraPosition;
        return this;
    }

    public GoogleMapOptions G2(String str) {
        this.f49480s = str;
        return this;
    }

    public GoogleMapOptions H2(boolean z10) {
        this.f49473l = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions J(boolean z10) {
        this.f49467f = Boolean.valueOf(z10);
        return this;
    }

    public LatLngBounds N0() {
        return this.f49477p;
    }

    public int S0() {
        return this.f49481t;
    }

    public Float W1() {
        return this.f49475n;
    }

    public String X0() {
        return this.f49480s;
    }

    public int a1() {
        return this.f49464c;
    }

    public GoogleMapOptions c2(LatLngBounds latLngBounds) {
        this.f49477p = latLngBounds;
        return this;
    }

    public Float o1() {
        return this.f49476o;
    }

    public Integer t0() {
        return this.f49479r;
    }

    public GoogleMapOptions t3(int i10) {
        this.f49464c = i10;
        return this;
    }

    public String toString() {
        return C6619q.d(this).a("MapType", Integer.valueOf(this.f49464c)).a("LiteMode", this.f49472k).a("Camera", this.f49465d).a("CompassEnabled", this.f49467f).a("ZoomControlsEnabled", this.f49466e).a("ScrollGesturesEnabled", this.f49468g).a("ZoomGesturesEnabled", this.f49469h).a("TiltGesturesEnabled", this.f49470i).a("RotateGesturesEnabled", this.f49471j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f49478q).a("MapToolbarEnabled", this.f49473l).a("AmbientEnabled", this.f49474m).a("MinZoomPreference", this.f49475n).a("MaxZoomPreference", this.f49476o).a("BackgroundColor", this.f49479r).a("LatLngBoundsForCameraTarget", this.f49477p).a("ZOrderOnTop", this.f49462a).a("UseViewLifecycleInFragment", this.f49463b).a("mapColorScheme", Integer.valueOf(this.f49481t)).toString();
    }

    public GoogleMapOptions u3(float f10) {
        this.f49476o = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions v3(float f10) {
        this.f49475n = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions w3(boolean z10) {
        this.f49471j = Boolean.valueOf(z10);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.f(parcel, 2, C8645f.a(this.f49462a));
        c.f(parcel, 3, C8645f.a(this.f49463b));
        c.n(parcel, 4, a1());
        c.t(parcel, 5, E0(), i10, false);
        c.f(parcel, 6, C8645f.a(this.f49466e));
        c.f(parcel, 7, C8645f.a(this.f49467f));
        c.f(parcel, 8, C8645f.a(this.f49468g));
        c.f(parcel, 9, C8645f.a(this.f49469h));
        c.f(parcel, 10, C8645f.a(this.f49470i));
        c.f(parcel, 11, C8645f.a(this.f49471j));
        c.f(parcel, 12, C8645f.a(this.f49472k));
        c.f(parcel, 14, C8645f.a(this.f49473l));
        c.f(parcel, 15, C8645f.a(this.f49474m));
        c.l(parcel, 16, W1(), false);
        c.l(parcel, 17, o1(), false);
        c.t(parcel, 18, N0(), i10, false);
        c.f(parcel, 19, C8645f.a(this.f49478q));
        c.q(parcel, 20, t0(), false);
        c.u(parcel, 21, X0(), false);
        c.n(parcel, 23, S0());
        c.b(parcel, a10);
    }

    public GoogleMapOptions x(boolean z10) {
        this.f49474m = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions x3(boolean z10) {
        this.f49468g = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions y2(boolean z10) {
        this.f49472k = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions y3(boolean z10) {
        this.f49478q = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions z2(int i10) {
        this.f49481t = i10;
        return this;
    }

    public GoogleMapOptions z3(boolean z10) {
        this.f49470i = Boolean.valueOf(z10);
        return this;
    }

    GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str, int i11) {
        this.f49462a = C8645f.b(b10);
        this.f49463b = C8645f.b(b11);
        this.f49464c = i10;
        this.f49465d = cameraPosition;
        this.f49466e = C8645f.b(b12);
        this.f49467f = C8645f.b(b13);
        this.f49468g = C8645f.b(b14);
        this.f49469h = C8645f.b(b15);
        this.f49470i = C8645f.b(b16);
        this.f49471j = C8645f.b(b17);
        this.f49472k = C8645f.b(b18);
        this.f49473l = C8645f.b(b19);
        this.f49474m = C8645f.b(b20);
        this.f49475n = f10;
        this.f49476o = f11;
        this.f49477p = latLngBounds;
        this.f49478q = C8645f.b(b21);
        this.f49479r = num;
        this.f49480s = str;
        this.f49481t = i11;
    }
}
