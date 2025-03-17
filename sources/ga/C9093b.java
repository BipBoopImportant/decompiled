package Ga;

import Ea.C9070d;
import Ea.C9075i;
import Ea.C9076j;
import Ea.C9077k;
import Ea.C9078l;
import Ra.c;
import Ra.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.s;
import java.util.Locale;

/* renamed from: Ga.b  reason: case insensitive filesystem */
public final class C9093b {

    /* renamed from: a  reason: collision with root package name */
    private final a f60529a;

    /* renamed from: b  reason: collision with root package name */
    private final a f60530b;

    /* renamed from: c  reason: collision with root package name */
    final float f60531c;

    /* renamed from: d  reason: collision with root package name */
    final float f60532d;

    /* renamed from: e  reason: collision with root package name */
    final float f60533e;

    /* renamed from: f  reason: collision with root package name */
    final float f60534f;

    /* renamed from: g  reason: collision with root package name */
    final float f60535g;

    /* renamed from: h  reason: collision with root package name */
    final float f60536h;

    /* renamed from: i  reason: collision with root package name */
    final int f60537i;

    /* renamed from: j  reason: collision with root package name */
    final int f60538j;

    /* renamed from: k  reason: collision with root package name */
    int f60539k;

    C9093b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f60530b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            int unused = aVar.f60544a = i10;
        }
        TypedArray a10 = a(context, aVar.f60544a, i11, i12);
        Resources resources = context.getResources();
        this.f60531c = (float) a10.getDimensionPixelSize(C9078l.f59727K, -1);
        this.f60537i = context.getResources().getDimensionPixelSize(C9070d.f59395X);
        this.f60538j = context.getResources().getDimensionPixelSize(C9070d.f59397Z);
        this.f60532d = (float) a10.getDimensionPixelSize(C9078l.f59830U, -1);
        this.f60533e = a10.getDimension(C9078l.f59810S, resources.getDimension(C9070d.f59430q));
        this.f60535g = a10.getDimension(C9078l.f59860X, resources.getDimension(C9070d.f59432r));
        this.f60534f = a10.getDimension(C9078l.f59716J, resources.getDimension(C9070d.f59430q));
        this.f60536h = a10.getDimension(C9078l.f59820T, resources.getDimension(C9070d.f59432r));
        boolean z10 = true;
        this.f60539k = a10.getInt(C9078l.f59935e0, 1);
        int unused2 = aVar2.f60552i = aVar.f60552i == -2 ? 255 : aVar.f60552i;
        if (aVar.f60554k != -2) {
            int unused3 = aVar2.f60554k = aVar.f60554k;
        } else if (a10.hasValue(C9078l.f59924d0)) {
            int unused4 = aVar2.f60554k = a10.getInt(C9078l.f59924d0, 0);
        } else {
            int unused5 = aVar2.f60554k = -1;
        }
        if (aVar.f60553j != null) {
            String unused6 = aVar2.f60553j = aVar.f60553j;
        } else if (a10.hasValue(C9078l.f59760N)) {
            String unused7 = aVar2.f60553j = a10.getString(C9078l.f59760N);
        }
        CharSequence unused8 = aVar2.f60558o = aVar.f60558o;
        CharSequence unused9 = aVar2.f60559p = aVar.f60559p == null ? context.getString(C9076j.f59567j) : aVar.f60559p;
        int unused10 = aVar2.f60560q = aVar.f60560q == 0 ? C9075i.f59543a : aVar.f60560q;
        int unused11 = aVar2.f60561r = aVar.f60561r == 0 ? C9076j.f59572o : aVar.f60561r;
        if (aVar.f60563t != null && !aVar.f60563t.booleanValue()) {
            z10 = false;
        }
        Boolean unused12 = aVar2.f60563t = Boolean.valueOf(z10);
        int unused13 = aVar2.f60555l = aVar.f60555l == -2 ? a10.getInt(C9078l.f59902b0, -2) : aVar.f60555l;
        int unused14 = aVar2.f60556m = aVar.f60556m == -2 ? a10.getInt(C9078l.f59913c0, -2) : aVar.f60556m;
        Integer unused15 = aVar2.f60548e = Integer.valueOf(aVar.f60548e == null ? a10.getResourceId(C9078l.f59738L, C9077k.f59593c) : aVar.f60548e.intValue());
        Integer unused16 = aVar2.f60549f = Integer.valueOf(aVar.f60549f == null ? a10.getResourceId(C9078l.f59749M, 0) : aVar.f60549f.intValue());
        Integer unused17 = aVar2.f60550g = Integer.valueOf(aVar.f60550g == null ? a10.getResourceId(C9078l.f59840V, C9077k.f59593c) : aVar.f60550g.intValue());
        Integer unused18 = aVar2.f60551h = Integer.valueOf(aVar.f60551h == null ? a10.getResourceId(C9078l.f59850W, 0) : aVar.f60551h.intValue());
        Integer unused19 = aVar2.f60545b = Integer.valueOf(aVar.f60545b == null ? G(context, a10, C9078l.f59694H) : aVar.f60545b.intValue());
        Integer unused20 = aVar2.f60547d = Integer.valueOf(aVar.f60547d == null ? a10.getResourceId(C9078l.f59770O, C9077k.f59596f) : aVar.f60547d.intValue());
        if (aVar.f60546c != null) {
            Integer unused21 = aVar2.f60546c = aVar.f60546c;
        } else if (a10.hasValue(C9078l.f59780P)) {
            Integer unused22 = aVar2.f60546c = Integer.valueOf(G(context, a10, C9078l.f59780P));
        } else {
            Integer unused23 = aVar2.f60546c = Integer.valueOf(new d(context, aVar2.f60547d.intValue()).i().getDefaultColor());
        }
        Integer unused24 = aVar2.f60562s = Integer.valueOf(aVar.f60562s == null ? a10.getInt(C9078l.f59705I, 8388661) : aVar.f60562s.intValue());
        Integer unused25 = aVar2.f60564u = Integer.valueOf(aVar.f60564u == null ? a10.getDimensionPixelSize(C9078l.f59800R, resources.getDimensionPixelSize(C9070d.f59396Y)) : aVar.f60564u.intValue());
        Integer unused26 = aVar2.f60565v = Integer.valueOf(aVar.f60565v == null ? a10.getDimensionPixelSize(C9078l.f59790Q, resources.getDimensionPixelSize(C9070d.f59434s)) : aVar.f60565v.intValue());
        Integer unused27 = aVar2.f60566w = Integer.valueOf(aVar.f60566w == null ? a10.getDimensionPixelOffset(C9078l.f59870Y, 0) : aVar.f60566w.intValue());
        Integer unused28 = aVar2.f60567x = Integer.valueOf(aVar.f60567x == null ? a10.getDimensionPixelOffset(C9078l.f59946f0, 0) : aVar.f60567x.intValue());
        Integer unused29 = aVar2.f60568y = Integer.valueOf(aVar.f60568y == null ? a10.getDimensionPixelOffset(C9078l.f59880Z, aVar2.f60566w.intValue()) : aVar.f60568y.intValue());
        Integer unused30 = aVar2.f60569z = Integer.valueOf(aVar.f60569z == null ? a10.getDimensionPixelOffset(C9078l.f59957g0, aVar2.f60567x.intValue()) : aVar.f60569z.intValue());
        Integer unused31 = aVar2.f60542C = Integer.valueOf(aVar.f60542C == null ? a10.getDimensionPixelOffset(C9078l.f59891a0, 0) : aVar.f60542C.intValue());
        Integer unused32 = aVar2.f60540A = Integer.valueOf(aVar.f60540A == null ? 0 : aVar.f60540A.intValue());
        Integer unused33 = aVar2.f60541B = Integer.valueOf(aVar.f60541B == null ? 0 : aVar.f60541B.intValue());
        Boolean unused34 = aVar2.f60543D = Boolean.valueOf(aVar.f60543D == null ? a10.getBoolean(C9078l.f59683G, false) : aVar.f60543D.booleanValue());
        a10.recycle();
        if (aVar.f60557n == null) {
            Locale unused35 = aVar2.f60557n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            Locale unused36 = aVar2.f60557n = aVar.f60557n;
        }
        this.f60529a = aVar;
    }

    private static int G(Context context, TypedArray typedArray, int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSet;
        int i13;
        if (i10 != 0) {
            AttributeSet i14 = com.google.android.material.drawable.d.i(context, i10, "badge");
            i13 = i14.getStyleAttribute();
            attributeSet = i14;
        } else {
            attributeSet = null;
            i13 = 0;
        }
        return s.i(context, attributeSet, C9078l.f59672F, i11, i13 == 0 ? i12 : i13, new int[0]);
    }

    /* access modifiers changed from: package-private */
    public int A() {
        return this.f60530b.f60569z.intValue();
    }

    /* access modifiers changed from: package-private */
    public int B() {
        return this.f60530b.f60567x.intValue();
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.f60530b.f60554k != -1;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        return this.f60530b.f60553j != null;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f60530b.f60543D.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f60530b.f60563t.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void H(int i10) {
        int unused = this.f60529a.f60552i = i10;
        int unused2 = this.f60530b.f60552i = i10;
    }

    /* access modifiers changed from: package-private */
    public void I(int i10) {
        int unused = this.f60529a.f60554k = i10;
        int unused2 = this.f60530b.f60554k = i10;
    }

    /* access modifiers changed from: package-private */
    public void J(boolean z10) {
        Boolean unused = this.f60529a.f60563t = Boolean.valueOf(z10);
        Boolean unused2 = this.f60530b.f60563t = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f60530b.f60540A.intValue();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f60530b.f60541B.intValue();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f60530b.f60552i;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f60530b.f60545b.intValue();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f60530b.f60562s.intValue();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f60530b.f60564u.intValue();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f60530b.f60549f.intValue();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f60530b.f60548e.intValue();
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f60530b.f60546c.intValue();
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f60530b.f60565v.intValue();
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f60530b.f60551h.intValue();
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f60530b.f60550g.intValue();
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f60530b.f60561r;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f60530b.f60558o;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f60530b.f60559p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f60530b.f60560q;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return this.f60530b.f60568y.intValue();
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.f60530b.f60566w.intValue();
    }

    /* access modifiers changed from: package-private */
    public int t() {
        return this.f60530b.f60542C.intValue();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        return this.f60530b.f60555l;
    }

    /* access modifiers changed from: package-private */
    public int v() {
        return this.f60530b.f60556m;
    }

    /* access modifiers changed from: package-private */
    public int w() {
        return this.f60530b.f60554k;
    }

    /* access modifiers changed from: package-private */
    public Locale x() {
        return this.f60530b.f60557n;
    }

    /* access modifiers changed from: package-private */
    public String y() {
        return this.f60530b.f60553j;
    }

    /* access modifiers changed from: package-private */
    public int z() {
        return this.f60530b.f60547d.intValue();
    }

    /* renamed from: Ga.b$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0992a();
        /* access modifiers changed from: private */

        /* renamed from: A  reason: collision with root package name */
        public Integer f60540A;
        /* access modifiers changed from: private */

        /* renamed from: B  reason: collision with root package name */
        public Integer f60541B;
        /* access modifiers changed from: private */

        /* renamed from: C  reason: collision with root package name */
        public Integer f60542C;
        /* access modifiers changed from: private */

        /* renamed from: D  reason: collision with root package name */
        public Boolean f60543D;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f60544a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Integer f60545b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Integer f60546c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Integer f60547d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Integer f60548e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Integer f60549f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Integer f60550g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Integer f60551h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f60552i = 255;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public String f60553j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f60554k = -2;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public int f60555l = -2;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f60556m = -2;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public Locale f60557n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f60558o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public CharSequence f60559p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f60560q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public int f60561r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public Integer f60562s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public Boolean f60563t = Boolean.TRUE;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public Integer f60564u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public Integer f60565v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public Integer f60566w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public Integer f60567x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public Integer f60568y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public Integer f60569z;

        /* renamed from: Ga.b$a$a  reason: collision with other inner class name */
        class C0992a implements Parcelable.Creator<a> {
            C0992a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f60544a);
            parcel.writeSerializable(this.f60545b);
            parcel.writeSerializable(this.f60546c);
            parcel.writeSerializable(this.f60547d);
            parcel.writeSerializable(this.f60548e);
            parcel.writeSerializable(this.f60549f);
            parcel.writeSerializable(this.f60550g);
            parcel.writeSerializable(this.f60551h);
            parcel.writeInt(this.f60552i);
            parcel.writeString(this.f60553j);
            parcel.writeInt(this.f60554k);
            parcel.writeInt(this.f60555l);
            parcel.writeInt(this.f60556m);
            CharSequence charSequence = this.f60558o;
            String str = null;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f60559p;
            if (charSequence2 != null) {
                str = charSequence2.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f60560q);
            parcel.writeSerializable(this.f60562s);
            parcel.writeSerializable(this.f60564u);
            parcel.writeSerializable(this.f60565v);
            parcel.writeSerializable(this.f60566w);
            parcel.writeSerializable(this.f60567x);
            parcel.writeSerializable(this.f60568y);
            parcel.writeSerializable(this.f60569z);
            parcel.writeSerializable(this.f60542C);
            parcel.writeSerializable(this.f60540A);
            parcel.writeSerializable(this.f60541B);
            parcel.writeSerializable(this.f60563t);
            parcel.writeSerializable(this.f60557n);
            parcel.writeSerializable(this.f60543D);
        }

        a(Parcel parcel) {
            this.f60544a = parcel.readInt();
            this.f60545b = (Integer) parcel.readSerializable();
            this.f60546c = (Integer) parcel.readSerializable();
            this.f60547d = (Integer) parcel.readSerializable();
            this.f60548e = (Integer) parcel.readSerializable();
            this.f60549f = (Integer) parcel.readSerializable();
            this.f60550g = (Integer) parcel.readSerializable();
            this.f60551h = (Integer) parcel.readSerializable();
            this.f60552i = parcel.readInt();
            this.f60553j = parcel.readString();
            this.f60554k = parcel.readInt();
            this.f60555l = parcel.readInt();
            this.f60556m = parcel.readInt();
            this.f60558o = parcel.readString();
            this.f60559p = parcel.readString();
            this.f60560q = parcel.readInt();
            this.f60562s = (Integer) parcel.readSerializable();
            this.f60564u = (Integer) parcel.readSerializable();
            this.f60565v = (Integer) parcel.readSerializable();
            this.f60566w = (Integer) parcel.readSerializable();
            this.f60567x = (Integer) parcel.readSerializable();
            this.f60568y = (Integer) parcel.readSerializable();
            this.f60569z = (Integer) parcel.readSerializable();
            this.f60542C = (Integer) parcel.readSerializable();
            this.f60540A = (Integer) parcel.readSerializable();
            this.f60541B = (Integer) parcel.readSerializable();
            this.f60563t = (Boolean) parcel.readSerializable();
            this.f60557n = (Locale) parcel.readSerializable();
            this.f60543D = (Boolean) parcel.readSerializable();
        }
    }
}
