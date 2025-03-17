package org.maplibre.android.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.Arrays;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.i;
import org.maplibre.android.m;
import org.maplibre.android.utils.e;
import w2.C6214h;

public class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: A  reason: collision with root package name */
    private int f145946A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f145947B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f145948C;

    /* renamed from: D  reason: collision with root package name */
    private String f145949D;

    /* renamed from: E  reason: collision with root package name */
    private String[] f145950E;

    /* renamed from: F  reason: collision with root package name */
    private String f145951F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f145952G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f145953H;

    /* renamed from: I  reason: collision with root package name */
    private int f145954I;

    /* renamed from: J  reason: collision with root package name */
    private float f145955J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f145956K;

    /* renamed from: a  reason: collision with root package name */
    private CameraPosition f145957a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f145958b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f145959c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f145960d;

    /* renamed from: e  reason: collision with root package name */
    private int f145961e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f145962f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f145963g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f145964h;

    /* renamed from: i  reason: collision with root package name */
    private int f145965i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f145966j;

    /* renamed from: k  reason: collision with root package name */
    private int f145967k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f145968l;

    /* renamed from: m  reason: collision with root package name */
    private int f145969m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f145970n;

    /* renamed from: o  reason: collision with root package name */
    private double f145971o;

    /* renamed from: p  reason: collision with root package name */
    private double f145972p;

    /* renamed from: q  reason: collision with root package name */
    private double f145973q;

    /* renamed from: r  reason: collision with root package name */
    private double f145974r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f145975s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f145976t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f145977u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f145978v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f145979w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f145980x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f145981y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f145982z;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public static p m(Context context) {
        return n(context, (AttributeSet) null);
    }

    public static p n(Context context, AttributeSet attributeSet) {
        return o(new p(), context, context.obtainStyledAttributes(attributeSet, m.f145689s, 0, 0));
    }

    static p o(p pVar, Context context, TypedArray typedArray) {
        float f10 = context.getResources().getDisplayMetrics().density;
        try {
            pVar.g(new CameraPosition.a(typedArray).b());
            pVar.b(typedArray.getString(m.f145691u));
            String string = typedArray.getString(m.f145690t);
            if (!TextUtils.isEmpty(string)) {
                pVar.a(string);
            }
            pVar.y0(typedArray.getBoolean(m.f145687q0, true));
            pVar.s0(typedArray.getBoolean(m.f145683o0, true));
            pVar.a0(typedArray.getBoolean(m.f145665f0, true));
            pVar.r0(typedArray.getBoolean(m.f145681n0, true));
            pVar.w0(typedArray.getBoolean(m.f145685p0, true));
            pVar.q(typedArray.getBoolean(m.f145663e0, true));
            pVar.p0(typedArray.getBoolean(m.f145679m0, true));
            pVar.k0((double) typedArray.getFloat(m.f145630C, 25.5f));
            pVar.n0((double) typedArray.getFloat(m.f145631D, 0.0f));
            pVar.g0((double) typedArray.getFloat(m.f145693w, 60.0f));
            pVar.m0((double) typedArray.getFloat(m.f145694x, 0.0f));
            pVar.h(typedArray.getBoolean(m.f145650W, true));
            pVar.j(typedArray.getInt(m.f145653Z, 8388661));
            float f11 = 4.0f * f10;
            pVar.l(new int[]{(int) typedArray.getDimension(m.f145657b0, f11), (int) typedArray.getDimension(m.f145661d0, f11), (int) typedArray.getDimension(m.f145659c0, f11), (int) typedArray.getDimension(m.f145655a0, f11)});
            pVar.i(typedArray.getBoolean(m.f145652Y, true));
            Drawable drawable = typedArray.getDrawable(m.f145651X);
            if (drawable == null) {
                drawable = C6214h.e(context.getResources(), i.f145532a, (Resources.Theme) null);
            }
            pVar.k(drawable);
            pVar.d0(typedArray.getBoolean(m.f145667g0, true));
            pVar.e0(typedArray.getInt(m.f145669h0, 8388691));
            pVar.f0(new int[]{(int) typedArray.getDimension(m.f145673j0, f11), (int) typedArray.getDimension(m.f145677l0, f11), (int) typedArray.getDimension(m.f145675k0, f11), (int) typedArray.getDimension(m.f145671i0, f11)});
            pVar.f(typedArray.getColor(m.f145649V, -1));
            pVar.c(typedArray.getBoolean(m.f145643P, true));
            pVar.d(typedArray.getInt(m.f145644Q, 8388691));
            pVar.e(new int[]{(int) typedArray.getDimension(m.f145646S, f10 * 92.0f), (int) typedArray.getDimension(m.f145648U, f11), (int) typedArray.getDimension(m.f145647T, f11), (int) typedArray.getDimension(m.f145645R, f11)});
            pVar.v0(typedArray.getBoolean(m.f145641N, false));
            pVar.x0(typedArray.getBoolean(m.f145642O, false));
            pVar.u0(typedArray.getBoolean(m.f145633F, true));
            pVar.t0(typedArray.getInt(m.f145640M, 4));
            pVar.q0(typedArray.getBoolean(m.f145634G, false));
            pVar.f145948C = typedArray.getBoolean(m.f145636I, true);
            int resourceId = typedArray.getResourceId(m.f145637J, 0);
            if (resourceId != 0) {
                pVar.c0(context.getResources().getStringArray(resourceId));
            } else {
                String string2 = typedArray.getString(m.f145638K);
                if (string2 == null) {
                    string2 = "sans-serif";
                }
                pVar.b0(string2);
            }
            pVar.o0(typedArray.getFloat(m.f145639L, 0.0f));
            pVar.r(typedArray.getInt(m.f145635H, -988703));
            pVar.p(typedArray.getBoolean(m.f145632E, true));
            typedArray.recycle();
            return pVar;
        } catch (Throwable th2) {
            typedArray.recycle();
            throw th2;
        }
    }

    public int A() {
        return this.f145961e;
    }

    public Drawable B() {
        return this.f145963g;
    }

    public int[] C() {
        return this.f145962f;
    }

    public boolean D() {
        return this.f145956K;
    }

    public boolean E() {
        return this.f145958b;
    }

    public boolean F() {
        return this.f145980x;
    }

    public int G() {
        return this.f145954I;
    }

    public boolean H() {
        return this.f145977u;
    }

    public String I() {
        if (this.f145948C) {
            return this.f145949D;
        }
        return null;
    }

    public boolean J() {
        return this.f145964h;
    }

    public int K() {
        return this.f145965i;
    }

    public int[] L() {
        return this.f145966j;
    }

    public double M() {
        return this.f145974r;
    }

    public double N() {
        return this.f145972p;
    }

    public double O() {
        return this.f145973q;
    }

    public double P() {
        return this.f145971o;
    }

    public int Q() {
        return this.f145946A;
    }

    @Deprecated
    public boolean R() {
        return this.f145982z;
    }

    public boolean S() {
        return this.f145981y;
    }

    public boolean T() {
        return this.f145947B;
    }

    public boolean U() {
        return this.f145975s;
    }

    public boolean V() {
        return this.f145976t;
    }

    public boolean W() {
        return this.f145952G;
    }

    public boolean X() {
        return this.f145978v;
    }

    public boolean Y() {
        return this.f145953H;
    }

    public boolean Z() {
        return this.f145979w;
    }

    public p a(String str) {
        this.f145951F = str;
        return this;
    }

    public p a0(boolean z10) {
        this.f145977u = z10;
        return this;
    }

    @Deprecated
    public p b(String str) {
        this.f145951F = str;
        return this;
    }

    public p b0(String str) {
        this.f145949D = e.a(str);
        return this;
    }

    public p c(boolean z10) {
        this.f145968l = z10;
        return this;
    }

    public p c0(String... strArr) {
        this.f145949D = e.a(strArr);
        return this;
    }

    public p d(int i10) {
        this.f145969m = i10;
        return this;
    }

    public p d0(boolean z10) {
        this.f145964h = z10;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public p e(int[] iArr) {
        this.f145970n = iArr;
        return this;
    }

    public p e0(int i10) {
        this.f145965i = i10;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f145958b != pVar.f145958b || this.f145959c != pVar.f145959c || this.f145960d != pVar.f145960d) {
                return false;
            }
            Drawable drawable = this.f145963g;
            if (drawable == null ? pVar.f145963g != null : !drawable.equals(pVar.f145963g)) {
                return false;
            }
            if (this.f145961e != pVar.f145961e || this.f145964h != pVar.f145964h || this.f145965i != pVar.f145965i || this.f145967k != pVar.f145967k || this.f145968l != pVar.f145968l || this.f145969m != pVar.f145969m || Double.compare(pVar.f145971o, this.f145971o) != 0 || Double.compare(pVar.f145972p, this.f145972p) != 0 || Double.compare(pVar.f145973q, this.f145973q) != 0 || Double.compare(pVar.f145974r, this.f145974r) != 0 || this.f145975s != pVar.f145975s || this.f145976t != pVar.f145976t || this.f145977u != pVar.f145977u || this.f145978v != pVar.f145978v || this.f145979w != pVar.f145979w || this.f145980x != pVar.f145980x || this.f145981y != pVar.f145981y) {
                return false;
            }
            CameraPosition cameraPosition = this.f145957a;
            if (cameraPosition == null ? pVar.f145957a != null : !cameraPosition.equals(pVar.f145957a)) {
                return false;
            }
            if (!Arrays.equals(this.f145962f, pVar.f145962f) || !Arrays.equals(this.f145966j, pVar.f145966j) || !Arrays.equals(this.f145970n, pVar.f145970n)) {
                return false;
            }
            String str = this.f145951F;
            if (str == null ? pVar.f145951F != null : !str.equals(pVar.f145951F)) {
                return false;
            }
            if (this.f145982z != pVar.f145982z || this.f145946A != pVar.f145946A || this.f145947B != pVar.f145947B || this.f145948C != pVar.f145948C || !this.f145949D.equals(pVar.f145949D)) {
                return false;
            }
            Arrays.equals(this.f145950E, pVar.f145950E);
        }
        return false;
    }

    public p f(int i10) {
        this.f145967k = i10;
        return this;
    }

    public p f0(int[] iArr) {
        this.f145966j = iArr;
        return this;
    }

    public p g(CameraPosition cameraPosition) {
        this.f145957a = cameraPosition;
        return this;
    }

    public p g0(double d10) {
        this.f145974r = d10;
        return this;
    }

    public float getPixelRatio() {
        return this.f145955J;
    }

    public p h(boolean z10) {
        this.f145959c = z10;
        return this;
    }

    public int hashCode() {
        CameraPosition cameraPosition = this.f145957a;
        int i10 = 0;
        int hashCode = (((((((((cameraPosition != null ? cameraPosition.hashCode() : 0) * 31) + (this.f145958b ? 1 : 0)) * 31) + (this.f145959c ? 1 : 0)) * 31) + (this.f145960d ? 1 : 0)) * 31) + this.f145961e) * 31;
        Drawable drawable = this.f145963g;
        int hashCode2 = ((((((((((((((((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31) + Arrays.hashCode(this.f145962f)) * 31) + (this.f145964h ? 1 : 0)) * 31) + this.f145965i) * 31) + Arrays.hashCode(this.f145966j)) * 31) + this.f145967k) * 31) + (this.f145968l ? 1 : 0)) * 31) + this.f145969m) * 31) + Arrays.hashCode(this.f145970n);
        long doubleToLongBits = Double.doubleToLongBits(this.f145971o);
        int i11 = (hashCode2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f145972p);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f145973q);
        int i13 = (i12 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f145974r);
        int i14 = ((((((((((((((((i13 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + (this.f145975s ? 1 : 0)) * 31) + (this.f145976t ? 1 : 0)) * 31) + (this.f145977u ? 1 : 0)) * 31) + (this.f145978v ? 1 : 0)) * 31) + (this.f145979w ? 1 : 0)) * 31) + (this.f145980x ? 1 : 0)) * 31) + (this.f145981y ? 1 : 0)) * 31;
        String str = this.f145951F;
        int hashCode3 = (((((((((((((i14 + (str != null ? str.hashCode() : 0)) * 31) + (this.f145952G ? 1 : 0)) * 31) + (this.f145953H ? 1 : 0)) * 31) + (this.f145982z ? 1 : 0)) * 31) + this.f145946A) * 31) + (this.f145947B ? 1 : 0)) * 31) + (this.f145948C ? 1 : 0)) * 31;
        String str2 = this.f145949D;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((hashCode3 + i10) * 31) + Arrays.hashCode(this.f145950E)) * 31) + ((int) this.f145955J)) * 31) + (this.f145956K ? 1 : 0);
    }

    public p i(boolean z10) {
        this.f145960d = z10;
        return this;
    }

    public p j(int i10) {
        this.f145961e = i10;
        return this;
    }

    public p k(Drawable drawable) {
        this.f145963g = drawable;
        return this;
    }

    public p k0(double d10) {
        this.f145972p = d10;
        return this;
    }

    public p l(int[] iArr) {
        this.f145962f = iArr;
        return this;
    }

    public p m0(double d10) {
        this.f145973q = d10;
        return this;
    }

    public p n0(double d10) {
        this.f145971o = d10;
        return this;
    }

    public p o0(float f10) {
        this.f145955J = f10;
        return this;
    }

    public p p(boolean z10) {
        this.f145956K = z10;
        return this;
    }

    public p p0(boolean z10) {
        this.f145981y = z10;
        return this;
    }

    public p q(boolean z10) {
        this.f145980x = z10;
        return this;
    }

    public void q0(boolean z10) {
        this.f145947B = z10;
    }

    public p r(int i10) {
        this.f145954I = i10;
        return this;
    }

    public p r0(boolean z10) {
        this.f145975s = z10;
        return this;
    }

    @Deprecated
    public String s() {
        return this.f145951F;
    }

    public p s0(boolean z10) {
        this.f145976t = z10;
        return this;
    }

    public boolean t() {
        return this.f145968l;
    }

    public p t0(int i10) {
        this.f145946A = i10;
        return this;
    }

    public int u() {
        return this.f145969m;
    }

    @Deprecated
    public p u0(boolean z10) {
        this.f145982z = z10;
        return this;
    }

    public int[] v() {
        return this.f145970n;
    }

    public p v0(boolean z10) {
        this.f145952G = z10;
        return this;
    }

    public int w() {
        return this.f145967k;
    }

    public p w0(boolean z10) {
        this.f145978v = z10;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f145957a, i10);
        parcel.writeByte(this.f145958b ? (byte) 1 : 0);
        parcel.writeByte(this.f145959c ? (byte) 1 : 0);
        parcel.writeInt(this.f145961e);
        parcel.writeIntArray(this.f145962f);
        parcel.writeByte(this.f145960d ? (byte) 1 : 0);
        Drawable drawable = this.f145963g;
        parcel.writeParcelable(drawable != null ? org.maplibre.android.utils.a.b(drawable) : null, i10);
        parcel.writeByte(this.f145964h ? (byte) 1 : 0);
        parcel.writeInt(this.f145965i);
        parcel.writeIntArray(this.f145966j);
        parcel.writeByte(this.f145968l ? (byte) 1 : 0);
        parcel.writeInt(this.f145969m);
        parcel.writeIntArray(this.f145970n);
        parcel.writeInt(this.f145967k);
        parcel.writeDouble(this.f145971o);
        parcel.writeDouble(this.f145972p);
        parcel.writeDouble(this.f145973q);
        parcel.writeDouble(this.f145974r);
        parcel.writeByte(this.f145975s ? (byte) 1 : 0);
        parcel.writeByte(this.f145976t ? (byte) 1 : 0);
        parcel.writeByte(this.f145977u ? (byte) 1 : 0);
        parcel.writeByte(this.f145978v ? (byte) 1 : 0);
        parcel.writeByte(this.f145979w ? (byte) 1 : 0);
        parcel.writeByte(this.f145980x ? (byte) 1 : 0);
        parcel.writeByte(this.f145981y ? (byte) 1 : 0);
        parcel.writeString(this.f145951F);
        parcel.writeByte(this.f145952G ? (byte) 1 : 0);
        parcel.writeByte(this.f145953H ? (byte) 1 : 0);
        parcel.writeByte(this.f145982z ? (byte) 1 : 0);
        parcel.writeInt(this.f145946A);
        parcel.writeByte(this.f145947B ? (byte) 1 : 0);
        parcel.writeByte(this.f145948C ? (byte) 1 : 0);
        parcel.writeString(this.f145949D);
        parcel.writeStringArray(this.f145950E);
        parcel.writeFloat(this.f145955J);
        parcel.writeInt(this.f145954I);
        parcel.writeByte(this.f145956K ? (byte) 1 : 0);
    }

    public CameraPosition x() {
        return this.f145957a;
    }

    public p x0(boolean z10) {
        this.f145953H = z10;
        return this;
    }

    public boolean y() {
        return this.f145959c;
    }

    public p y0(boolean z10) {
        this.f145979w = z10;
        return this;
    }

    public boolean z() {
        return this.f145960d;
    }

    @Deprecated
    public p() {
        this.f145959c = true;
        this.f145960d = true;
        this.f145961e = 8388661;
        this.f145964h = true;
        this.f145965i = 8388691;
        this.f145967k = -1;
        this.f145968l = true;
        this.f145969m = 8388691;
        this.f145971o = 0.0d;
        this.f145972p = 25.5d;
        this.f145973q = 0.0d;
        this.f145974r = 60.0d;
        this.f145975s = true;
        this.f145976t = true;
        this.f145977u = true;
        this.f145978v = true;
        this.f145979w = true;
        this.f145980x = true;
        this.f145981y = true;
        this.f145982z = true;
        this.f145946A = 4;
        this.f145947B = false;
        this.f145948C = true;
        this.f145956K = true;
    }

    private p(Parcel parcel) {
        boolean z10 = true;
        this.f145959c = true;
        this.f145960d = true;
        this.f145961e = 8388661;
        this.f145964h = true;
        this.f145965i = 8388691;
        this.f145967k = -1;
        this.f145968l = true;
        this.f145969m = 8388691;
        this.f145971o = 0.0d;
        this.f145972p = 25.5d;
        this.f145973q = 0.0d;
        this.f145974r = 60.0d;
        this.f145975s = true;
        this.f145976t = true;
        this.f145977u = true;
        this.f145978v = true;
        this.f145979w = true;
        this.f145980x = true;
        this.f145981y = true;
        this.f145982z = true;
        this.f145946A = 4;
        this.f145947B = false;
        this.f145948C = true;
        this.f145956K = true;
        this.f145957a = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        this.f145958b = parcel.readByte() != 0;
        this.f145959c = parcel.readByte() != 0;
        this.f145961e = parcel.readInt();
        this.f145962f = parcel.createIntArray();
        this.f145960d = parcel.readByte() != 0;
        Bitmap bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.f145963g = new BitmapDrawable(bitmap);
        }
        this.f145964h = parcel.readByte() != 0;
        this.f145965i = parcel.readInt();
        this.f145966j = parcel.createIntArray();
        this.f145968l = parcel.readByte() != 0;
        this.f145969m = parcel.readInt();
        this.f145970n = parcel.createIntArray();
        this.f145967k = parcel.readInt();
        this.f145971o = parcel.readDouble();
        this.f145972p = parcel.readDouble();
        this.f145973q = parcel.readDouble();
        this.f145974r = parcel.readDouble();
        this.f145975s = parcel.readByte() != 0;
        this.f145976t = parcel.readByte() != 0;
        this.f145977u = parcel.readByte() != 0;
        this.f145978v = parcel.readByte() != 0;
        this.f145979w = parcel.readByte() != 0;
        this.f145980x = parcel.readByte() != 0;
        this.f145981y = parcel.readByte() != 0;
        this.f145951F = parcel.readString();
        this.f145952G = parcel.readByte() != 0;
        this.f145953H = parcel.readByte() != 0;
        this.f145982z = parcel.readByte() != 0;
        this.f145946A = parcel.readInt();
        this.f145947B = parcel.readByte() != 0;
        this.f145948C = parcel.readByte() != 0;
        this.f145949D = parcel.readString();
        this.f145950E = parcel.createStringArray();
        this.f145955J = parcel.readFloat();
        this.f145954I = parcel.readInt();
        this.f145956K = parcel.readByte() == 0 ? false : z10;
    }
}
