package androidx.recyclerview.widget;

import J2.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.B.b {

    /* renamed from: A  reason: collision with root package name */
    boolean f43874A = false;

    /* renamed from: B  reason: collision with root package name */
    private BitSet f43875B;

    /* renamed from: C  reason: collision with root package name */
    int f43876C = -1;

    /* renamed from: D  reason: collision with root package name */
    int f43877D = Integer.MIN_VALUE;

    /* renamed from: E  reason: collision with root package name */
    d f43878E = new d();

    /* renamed from: F  reason: collision with root package name */
    private int f43879F = 2;

    /* renamed from: G  reason: collision with root package name */
    private boolean f43880G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f43881H;

    /* renamed from: I  reason: collision with root package name */
    private e f43882I;

    /* renamed from: J  reason: collision with root package name */
    private int f43883J;

    /* renamed from: K  reason: collision with root package name */
    private final Rect f43884K = new Rect();

    /* renamed from: L  reason: collision with root package name */
    private final b f43885L = new b();

    /* renamed from: M  reason: collision with root package name */
    private boolean f43886M = false;

    /* renamed from: N  reason: collision with root package name */
    private boolean f43887N = true;

    /* renamed from: O  reason: collision with root package name */
    private int[] f43888O;

    /* renamed from: P  reason: collision with root package name */
    private final Runnable f43889P = new a();

    /* renamed from: s  reason: collision with root package name */
    private int f43890s = -1;

    /* renamed from: t  reason: collision with root package name */
    f[] f43891t;

    /* renamed from: u  reason: collision with root package name */
    t f43892u;

    /* renamed from: v  reason: collision with root package name */
    t f43893v;

    /* renamed from: w  reason: collision with root package name */
    private int f43894w;

    /* renamed from: x  reason: collision with root package name */
    private int f43895x;

    /* renamed from: y  reason: collision with root package name */
    private final o f43896y;

    /* renamed from: z  reason: collision with root package name */
    boolean f43897z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.s2();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f43899a;

        /* renamed from: b  reason: collision with root package name */
        int f43900b;

        /* renamed from: c  reason: collision with root package name */
        boolean f43901c;

        /* renamed from: d  reason: collision with root package name */
        boolean f43902d;

        /* renamed from: e  reason: collision with root package name */
        boolean f43903e;

        /* renamed from: f  reason: collision with root package name */
        int[] f43904f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f43900b = this.f43901c ? StaggeredGridLayoutManager.this.f43892u.i() : StaggeredGridLayoutManager.this.f43892u.m();
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (this.f43901c) {
                this.f43900b = StaggeredGridLayoutManager.this.f43892u.i() - i10;
            } else {
                this.f43900b = StaggeredGridLayoutManager.this.f43892u.m() + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f43899a = -1;
            this.f43900b = Integer.MIN_VALUE;
            this.f43901c = false;
            this.f43902d = false;
            this.f43903e = false;
            int[] iArr = this.f43904f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f43904f;
            if (iArr == null || iArr.length < length) {
                this.f43904f = new int[StaggeredGridLayoutManager.this.f43891t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f43904f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e  reason: collision with root package name */
        f f43906e;

        /* renamed from: f  reason: collision with root package name */
        boolean f43907f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f43906e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f43928e;
        }

        public boolean f() {
            return this.f43907f;
        }

        public void g(boolean z10) {
            this.f43907f = z10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f43914a;

        /* renamed from: b  reason: collision with root package name */
        int f43915b;

        /* renamed from: c  reason: collision with root package name */
        int f43916c;

        /* renamed from: d  reason: collision with root package name */
        int[] f43917d;

        /* renamed from: e  reason: collision with root package name */
        int f43918e;

        /* renamed from: f  reason: collision with root package name */
        int[] f43919f;

        /* renamed from: g  reason: collision with root package name */
        List<d.a> f43920g;

        /* renamed from: h  reason: collision with root package name */
        boolean f43921h;

        /* renamed from: i  reason: collision with root package name */
        boolean f43922i;

        /* renamed from: j  reason: collision with root package name */
        boolean f43923j;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f43917d = null;
            this.f43916c = 0;
            this.f43914a = -1;
            this.f43915b = -1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f43917d = null;
            this.f43916c = 0;
            this.f43918e = 0;
            this.f43919f = null;
            this.f43920g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f43914a);
            parcel.writeInt(this.f43915b);
            parcel.writeInt(this.f43916c);
            if (this.f43916c > 0) {
                parcel.writeIntArray(this.f43917d);
            }
            parcel.writeInt(this.f43918e);
            if (this.f43918e > 0) {
                parcel.writeIntArray(this.f43919f);
            }
            parcel.writeInt(this.f43921h ? 1 : 0);
            parcel.writeInt(this.f43922i ? 1 : 0);
            parcel.writeInt(this.f43923j ? 1 : 0);
            parcel.writeList(this.f43920g);
        }

        e(Parcel parcel) {
            this.f43914a = parcel.readInt();
            this.f43915b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f43916c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f43917d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f43918e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f43919f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f43921h = parcel.readInt() == 1;
            this.f43922i = parcel.readInt() == 1;
            this.f43923j = parcel.readInt() == 1 ? true : z10;
            this.f43920g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f43916c = eVar.f43916c;
            this.f43914a = eVar.f43914a;
            this.f43915b = eVar.f43915b;
            this.f43917d = eVar.f43917d;
            this.f43918e = eVar.f43918e;
            this.f43919f = eVar.f43919f;
            this.f43921h = eVar.f43921h;
            this.f43922i = eVar.f43922i;
            this.f43923j = eVar.f43923j;
            this.f43920g = eVar.f43920g;
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f43924a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f43925b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f43926c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f43927d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f43928e;

        f(int i10) {
            this.f43928e = i10;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n10 = n(view);
            n10.f43906e = this;
            this.f43924a.add(view);
            this.f43926c = Integer.MIN_VALUE;
            if (this.f43924a.size() == 1) {
                this.f43925b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f43927d += StaggeredGridLayoutManager.this.f43892u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10, int i10) {
            int l10 = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l10 != Integer.MIN_VALUE) {
                if (z10 && l10 < StaggeredGridLayoutManager.this.f43892u.i()) {
                    return;
                }
                if (z10 || l10 <= StaggeredGridLayoutManager.this.f43892u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        l10 += i10;
                    }
                    this.f43926c = l10;
                    this.f43925b = l10;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d.a f10;
            ArrayList<View> arrayList = this.f43924a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f43926c = StaggeredGridLayoutManager.this.f43892u.d(view);
            if (n10.f43907f && (f10 = StaggeredGridLayoutManager.this.f43878E.f(n10.a())) != null && f10.f43911b == 1) {
                this.f43926c += f10.a(this.f43928e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d.a f10;
            View view = this.f43924a.get(0);
            c n10 = n(view);
            this.f43925b = StaggeredGridLayoutManager.this.f43892u.g(view);
            if (n10.f43907f && (f10 = StaggeredGridLayoutManager.this.f43878E.f(n10.a())) != null && f10.f43911b == -1) {
                this.f43925b -= f10.a(this.f43928e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f43924a.clear();
            q();
            this.f43927d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f43897z ? i(this.f43924a.size() - 1, -1, true) : i(0, this.f43924a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f43897z ? i(0, this.f43924a.size(), true) : i(this.f43924a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f43892u.m();
            int i12 = StaggeredGridLayoutManager.this.f43892u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f43924a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f43892u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f43892u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 < i12 : g10 <= i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (!z10 || !z11) {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.E0(view);
                        }
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.E0(view);
                        }
                    } else if (g10 >= m10 && d10 <= i12) {
                        return StaggeredGridLayoutManager.this.E0(view);
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f43927d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i10 = this.f43926c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f43926c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            int i11 = this.f43926c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f43924a.size() == 0) {
                return i10;
            }
            c();
            return this.f43926c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f43924a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f43924a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f43897z && staggeredGridLayoutManager.E0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f43897z && staggeredGridLayoutManager2.E0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f43924a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f43924a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f43897z && staggeredGridLayoutManager3.E0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f43897z && staggeredGridLayoutManager4.E0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i10 = this.f43925b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f43925b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i10) {
            int i11 = this.f43925b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f43924a.size() == 0) {
                return i10;
            }
            d();
            return this.f43925b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f43925b = Integer.MIN_VALUE;
            this.f43926c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            int i11 = this.f43925b;
            if (i11 != Integer.MIN_VALUE) {
                this.f43925b = i11 + i10;
            }
            int i12 = this.f43926c;
            if (i12 != Integer.MIN_VALUE) {
                this.f43926c = i12 + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f43924a.size();
            View remove = this.f43924a.remove(size - 1);
            c n10 = n(remove);
            n10.f43906e = null;
            if (n10.c() || n10.b()) {
                this.f43927d -= StaggeredGridLayoutManager.this.f43892u.e(remove);
            }
            if (size == 1) {
                this.f43925b = Integer.MIN_VALUE;
            }
            this.f43926c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View remove = this.f43924a.remove(0);
            c n10 = n(remove);
            n10.f43906e = null;
            if (this.f43924a.size() == 0) {
                this.f43926c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f43927d -= StaggeredGridLayoutManager.this.f43892u.e(remove);
            }
            this.f43925b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n10 = n(view);
            n10.f43906e = this;
            this.f43924a.add(0, view);
            this.f43925b = Integer.MIN_VALUE;
            if (this.f43924a.size() == 1) {
                this.f43926c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f43927d += StaggeredGridLayoutManager.this.f43892u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10) {
            this.f43925b = i10;
            this.f43926c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d F02 = RecyclerView.q.F0(context, attributeSet, i10, i11);
        h3(F02.f43850a);
        j3(F02.f43851b);
        i3(F02.f43852c);
        this.f43896y = new o();
        A2();
    }

    private void A2() {
        this.f43892u = t.b(this, this.f43894w);
        this.f43893v = t.b(this, 1 - this.f43894w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int B2(RecyclerView.x xVar, o oVar, RecyclerView.C c10) {
        f fVar;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        RecyclerView.x xVar2 = xVar;
        o oVar2 = oVar;
        ? r92 = 0;
        this.f43875B.set(0, this.f43890s, true);
        int i14 = this.f43896y.f44168i ? oVar2.f44164e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : oVar2.f44164e == 1 ? oVar2.f44166g + oVar2.f44161b : oVar2.f44165f - oVar2.f44161b;
        k3(oVar2.f44164e, i14);
        int i15 = this.f43874A ? this.f43892u.i() : this.f43892u.m();
        boolean z11 = false;
        while (oVar.a(c10) && (this.f43896y.f44168i || !this.f43875B.isEmpty())) {
            View b10 = oVar2.b(xVar2);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.f43878E.g(a10);
            boolean z12 = g10 == -1 ? true : r92;
            if (z12) {
                fVar = cVar.f43907f ? this.f43891t[r92] : P2(oVar2);
                this.f43878E.n(a10, fVar);
            } else {
                fVar = this.f43891t[g10];
            }
            f fVar2 = fVar;
            cVar.f43906e = fVar2;
            if (oVar2.f44164e == 1) {
                F(b10);
            } else {
                G(b10, r92);
            }
            V2(b10, cVar, r92);
            if (oVar2.f44164e == 1) {
                int L22 = cVar.f43907f ? L2(i15) : fVar2.l(i15);
                int e10 = this.f43892u.e(b10) + L22;
                if (z12 && cVar.f43907f) {
                    d.a y22 = y2(L22);
                    y22.f43911b = -1;
                    y22.f43910a = a10;
                    this.f43878E.a(y22);
                }
                i10 = e10;
                i11 = L22;
            } else {
                int O22 = cVar.f43907f ? O2(i15) : fVar2.p(i15);
                i11 = O22 - this.f43892u.e(b10);
                if (z12 && cVar.f43907f) {
                    d.a z22 = z2(O22);
                    z22.f43911b = 1;
                    z22.f43910a = a10;
                    this.f43878E.a(z22);
                }
                i10 = O22;
            }
            if (cVar.f43907f && oVar2.f44163d == -1) {
                if (z12) {
                    this.f43886M = true;
                } else {
                    if (!(oVar2.f44164e == 1 ? o2() : p2())) {
                        d.a f10 = this.f43878E.f(a10);
                        if (f10 != null) {
                            f10.f43913d = true;
                        }
                        this.f43886M = true;
                    }
                }
            }
            q2(b10, cVar, oVar2);
            if (!T2() || this.f43894w != 1) {
                int m10 = cVar.f43907f ? this.f43893v.m() : (fVar2.f43928e * this.f43895x) + this.f43893v.m();
                i13 = m10;
                i12 = this.f43893v.e(b10) + m10;
            } else {
                int i16 = cVar.f43907f ? this.f43893v.i() : this.f43893v.i() - (((this.f43890s - 1) - fVar2.f43928e) * this.f43895x);
                i12 = i16;
                i13 = i16 - this.f43893v.e(b10);
            }
            if (this.f43894w == 1) {
                Y0(b10, i13, i11, i12, i10);
            } else {
                Y0(b10, i11, i13, i10, i12);
            }
            if (cVar.f43907f) {
                k3(this.f43896y.f44164e, i14);
            } else {
                q3(fVar2, this.f43896y.f44164e, i14);
            }
            a3(xVar2, this.f43896y);
            if (this.f43896y.f44167h && b10.hasFocusable()) {
                if (cVar.f43907f) {
                    this.f43875B.clear();
                } else {
                    z10 = false;
                    this.f43875B.set(fVar2.f43928e, false);
                    r92 = z10;
                    z11 = true;
                }
            }
            z10 = false;
            r92 = z10;
            z11 = true;
        }
        int i17 = r92;
        if (!z11) {
            a3(xVar2, this.f43896y);
        }
        int m11 = this.f43896y.f44164e == -1 ? this.f43892u.m() - O2(this.f43892u.m()) : L2(this.f43892u.i()) - this.f43892u.i();
        return m11 > 0 ? Math.min(oVar2.f44161b, m11) : i17;
    }

    private int C2(int i10) {
        int l02 = l0();
        for (int i11 = 0; i11 < l02; i11++) {
            int E02 = E0(k0(i11));
            if (E02 >= 0 && E02 < i10) {
                return E02;
            }
        }
        return 0;
    }

    private int G2(int i10) {
        for (int l02 = l0() - 1; l02 >= 0; l02--) {
            int E02 = E0(k0(l02));
            if (E02 >= 0 && E02 < i10) {
                return E02;
            }
        }
        return 0;
    }

    private void H2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int i10;
        int L22 = L2(Integer.MIN_VALUE);
        if (L22 != Integer.MIN_VALUE && (i10 = this.f43892u.i() - L22) > 0) {
            int i11 = i10 - (-f3(-i10, xVar, c10));
            if (z10 && i11 > 0) {
                this.f43892u.r(i11);
            }
        }
    }

    private void I2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int m10;
        int O22 = O2(Integer.MAX_VALUE);
        if (O22 != Integer.MAX_VALUE && (m10 = O22 - this.f43892u.m()) > 0) {
            int f32 = m10 - f3(m10, xVar, c10);
            if (z10 && f32 > 0) {
                this.f43892u.r(-f32);
            }
        }
    }

    private int L2(int i10) {
        int l10 = this.f43891t[0].l(i10);
        for (int i11 = 1; i11 < this.f43890s; i11++) {
            int l11 = this.f43891t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int M2(int i10) {
        int p10 = this.f43891t[0].p(i10);
        for (int i11 = 1; i11 < this.f43890s; i11++) {
            int p11 = this.f43891t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int N2(int i10) {
        int l10 = this.f43891t[0].l(i10);
        for (int i11 = 1; i11 < this.f43890s; i11++) {
            int l11 = this.f43891t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int O2(int i10) {
        int p10 = this.f43891t[0].p(i10);
        for (int i11 = 1; i11 < this.f43890s; i11++) {
            int p11 = this.f43891t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private f P2(o oVar) {
        int i10;
        int i11;
        int i12;
        if (X2(oVar.f44164e)) {
            i12 = this.f43890s - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = this.f43890s;
            i12 = 0;
            i10 = 1;
        }
        f fVar = null;
        if (oVar.f44164e == 1) {
            int m10 = this.f43892u.m();
            int i13 = Integer.MAX_VALUE;
            while (i12 != i11) {
                f fVar2 = this.f43891t[i12];
                int l10 = fVar2.l(m10);
                if (l10 < i13) {
                    fVar = fVar2;
                    i13 = l10;
                }
                i12 += i10;
            }
            return fVar;
        }
        int i14 = this.f43892u.i();
        int i15 = Integer.MIN_VALUE;
        while (i12 != i11) {
            f fVar3 = this.f43891t[i12];
            int p10 = fVar3.p(i14);
            if (p10 > i15) {
                fVar = fVar3;
                i15 = p10;
            }
            i12 += i10;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f43874A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.K2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.J2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0017
            int r2 = r8 + 1
        L_0x0015:
            r3 = r7
            goto L_0x001e
        L_0x0017:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001e
        L_0x001b:
            int r2 = r7 + r8
            goto L_0x0015
        L_0x001e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f43878E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003d
            r5 = 2
            if (r9 == r5) goto L_0x0037
            if (r9 == r1) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f43878E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f43878E
            r7.j(r8, r4)
            goto L_0x0042
        L_0x0037:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f43878E
            r9.k(r7, r8)
            goto L_0x0042
        L_0x003d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f43878E
            r9.j(r7, r8)
        L_0x0042:
            if (r2 > r0) goto L_0x0045
            return
        L_0x0045:
            boolean r7 = r6.f43874A
            if (r7 == 0) goto L_0x004e
            int r7 = r6.J2()
            goto L_0x0052
        L_0x004e:
            int r7 = r6.K2()
        L_0x0052:
            if (r3 > r7) goto L_0x0057
            r6.T1()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q2(int, int, int):void");
    }

    private void U2(View view, int i10, int i11, boolean z10) {
        L(view, this.f43884K);
        c cVar = (c) view.getLayoutParams();
        int i12 = cVar.leftMargin;
        Rect rect = this.f43884K;
        int r32 = r3(i10, i12 + rect.left, cVar.rightMargin + rect.right);
        int i13 = cVar.topMargin;
        Rect rect2 = this.f43884K;
        int r33 = r3(i11, i13 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z10 ? h2(view, r32, r33, cVar) : f2(view, r32, r33, cVar)) {
            view.measure(r32, r33);
        }
    }

    private void V2(View view, c cVar, boolean z10) {
        if (cVar.f43907f) {
            if (this.f43894w == 1) {
                U2(view, this.f43883J, RecyclerView.q.m0(y0(), z0(), s() + c(), cVar.height, true), z10);
            } else {
                U2(view, RecyclerView.q.m0(L0(), M0(), t() + o(), cVar.width, true), this.f43883J, z10);
            }
        } else if (this.f43894w == 1) {
            U2(view, RecyclerView.q.m0(this.f43895x, M0(), 0, cVar.width, false), RecyclerView.q.m0(y0(), z0(), s() + c(), cVar.height, true), z10);
        } else {
            U2(view, RecyclerView.q.m0(L0(), M0(), t() + o(), cVar.width, true), RecyclerView.q.m0(this.f43895x, z0(), 0, cVar.height, false), z10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0152, code lost:
        if (s2() != false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void W2(androidx.recyclerview.widget.RecyclerView.x r9, androidx.recyclerview.widget.RecyclerView.C r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f43885L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f43882I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f43876C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.K1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f43903e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f43876C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f43882I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f43882I
            if (r5 == 0) goto L_0x0037
            r8.n2(r0)
            goto L_0x003e
        L_0x0037:
            r8.e3()
            boolean r5 = r8.f43874A
            r0.f43901c = r5
        L_0x003e:
            r8.n3(r10, r0)
            r0.f43903e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f43882I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f43876C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f43901c
            boolean r6 = r8.f43880G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.T2()
            boolean r6 = r8.f43881H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f43878E
            r5.b()
            r0.f43902d = r4
        L_0x0060:
            int r5 = r8.l0()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f43882I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f43916c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f43902d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f43890s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f43891t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f43900b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f43891t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f43885L
            int[] r1 = r1.f43904f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f43890s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f43891t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f43885L
            int[] r6 = r6.f43904f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f43890s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f43891t
            r5 = r5[r1]
            boolean r6 = r8.f43874A
            int r7 = r0.f43900b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f43885L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f43891t
            r1.d(r5)
        L_0x00c9:
            r8.Y(r9)
            androidx.recyclerview.widget.o r1 = r8.f43896y
            r1.f44160a = r3
            r8.f43886M = r3
            androidx.recyclerview.widget.t r1 = r8.f43893v
            int r1 = r1.n()
            r8.p3(r1)
            int r1 = r0.f43899a
            r8.o3(r1, r10)
            boolean r1 = r0.f43901c
            if (r1 == 0) goto L_0x00fc
            r8.g3(r2)
            androidx.recyclerview.widget.o r1 = r8.f43896y
            r8.B2(r9, r1, r10)
            r8.g3(r4)
            androidx.recyclerview.widget.o r1 = r8.f43896y
            int r2 = r0.f43899a
            int r5 = r1.f44163d
            int r2 = r2 + r5
            r1.f44162c = r2
            r8.B2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.g3(r4)
            androidx.recyclerview.widget.o r1 = r8.f43896y
            r8.B2(r9, r1, r10)
            r8.g3(r2)
            androidx.recyclerview.widget.o r1 = r8.f43896y
            int r2 = r0.f43899a
            int r5 = r1.f44163d
            int r2 = r2 + r5
            r1.f44162c = r2
            r8.B2(r9, r1, r10)
        L_0x0113:
            r8.d3()
            int r1 = r8.l0()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f43874A
            if (r1 == 0) goto L_0x0127
            r8.H2(r9, r10, r4)
            r8.I2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.I2(r9, r10, r4)
            r8.H2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x0155
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x0155
            int r11 = r8.f43879F
            if (r11 == 0) goto L_0x0155
            int r11 = r8.l0()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f43886M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.R2()
            if (r11 == 0) goto L_0x0155
        L_0x0149:
            java.lang.Runnable r11 = r8.f43889P
            r8.O1(r11)
            boolean r11 = r8.s2()
            if (r11 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r4 = r3
        L_0x0156:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0161
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f43885L
            r11.c()
        L_0x0161:
            boolean r11 = r0.f43901c
            r8.f43880G = r11
            boolean r11 = r8.T2()
            r8.f43881H = r11
            if (r4 == 0) goto L_0x0175
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f43885L
            r11.c()
            r8.W2(r9, r10, r3)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W2(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C, boolean):void");
    }

    private boolean X2(int i10) {
        if (this.f43894w == 0) {
            return (i10 == -1) != this.f43874A;
        }
        return ((i10 == -1) == this.f43874A) == T2();
    }

    private void Z2(View view) {
        for (int i10 = this.f43890s - 1; i10 >= 0; i10--) {
            this.f43891t[i10].u(view);
        }
    }

    private void a3(RecyclerView.x xVar, o oVar) {
        if (oVar.f44160a && !oVar.f44168i) {
            if (oVar.f44161b == 0) {
                if (oVar.f44164e == -1) {
                    b3(xVar, oVar.f44166g);
                } else {
                    c3(xVar, oVar.f44165f);
                }
            } else if (oVar.f44164e == -1) {
                int i10 = oVar.f44165f;
                int M22 = i10 - M2(i10);
                b3(xVar, M22 < 0 ? oVar.f44166g : oVar.f44166g - Math.min(M22, oVar.f44161b));
            } else {
                int N22 = N2(oVar.f44166g) - oVar.f44166g;
                c3(xVar, N22 < 0 ? oVar.f44165f : Math.min(N22, oVar.f44161b) + oVar.f44165f);
            }
        }
    }

    private void b3(RecyclerView.x xVar, int i10) {
        int l02 = l0() - 1;
        while (l02 >= 0) {
            View k02 = k0(l02);
            if (this.f43892u.g(k02) >= i10 && this.f43892u.q(k02) >= i10) {
                c cVar = (c) k02.getLayoutParams();
                if (cVar.f43907f) {
                    int i11 = 0;
                    while (i11 < this.f43890s) {
                        if (this.f43891t[i11].f43924a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f43890s; i12++) {
                        this.f43891t[i12].s();
                    }
                } else if (cVar.f43906e.f43924a.size() != 1) {
                    cVar.f43906e.s();
                } else {
                    return;
                }
                M1(k02, xVar);
                l02--;
            } else {
                return;
            }
        }
    }

    private void c3(RecyclerView.x xVar, int i10) {
        while (l0() > 0) {
            View k02 = k0(0);
            if (this.f43892u.d(k02) <= i10 && this.f43892u.p(k02) <= i10) {
                c cVar = (c) k02.getLayoutParams();
                if (cVar.f43907f) {
                    int i11 = 0;
                    while (i11 < this.f43890s) {
                        if (this.f43891t[i11].f43924a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f43890s; i12++) {
                        this.f43891t[i12].t();
                    }
                } else if (cVar.f43906e.f43924a.size() != 1) {
                    cVar.f43906e.t();
                } else {
                    return;
                }
                M1(k02, xVar);
            } else {
                return;
            }
        }
    }

    private void d3() {
        if (this.f43893v.k() != 1073741824) {
            int l02 = l0();
            float f10 = 0.0f;
            for (int i10 = 0; i10 < l02; i10++) {
                View k02 = k0(i10);
                float e10 = (float) this.f43893v.e(k02);
                if (e10 >= f10) {
                    if (((c) k02.getLayoutParams()).f()) {
                        e10 = (e10 * 1.0f) / ((float) this.f43890s);
                    }
                    f10 = Math.max(f10, e10);
                }
            }
            int i11 = this.f43895x;
            int round = Math.round(f10 * ((float) this.f43890s));
            if (this.f43893v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f43893v.n());
            }
            p3(round);
            if (this.f43895x != i11) {
                for (int i12 = 0; i12 < l02; i12++) {
                    View k03 = k0(i12);
                    c cVar = (c) k03.getLayoutParams();
                    if (!cVar.f43907f) {
                        if (!T2() || this.f43894w != 1) {
                            int i13 = cVar.f43906e.f43928e;
                            int i14 = this.f43895x * i13;
                            int i15 = i13 * i11;
                            if (this.f43894w == 1) {
                                k03.offsetLeftAndRight(i14 - i15);
                            } else {
                                k03.offsetTopAndBottom(i14 - i15);
                            }
                        } else {
                            int i16 = this.f43890s;
                            int i17 = cVar.f43906e.f43928e;
                            k03.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f43895x) - ((-((i16 - 1) - i17)) * i11));
                        }
                    }
                }
            }
        }
    }

    private void e3() {
        if (this.f43894w == 1 || !T2()) {
            this.f43874A = this.f43897z;
        } else {
            this.f43874A = !this.f43897z;
        }
    }

    private void g3(int i10) {
        o oVar = this.f43896y;
        oVar.f44164e = i10;
        int i11 = 1;
        if (this.f43874A != (i10 == -1)) {
            i11 = -1;
        }
        oVar.f44163d = i11;
    }

    private void k3(int i10, int i11) {
        for (int i12 = 0; i12 < this.f43890s; i12++) {
            if (!this.f43891t[i12].f43924a.isEmpty()) {
                q3(this.f43891t[i12], i10, i11);
            }
        }
    }

    private boolean l3(RecyclerView.C c10, b bVar) {
        bVar.f43899a = this.f43880G ? G2(c10.b()) : C2(c10.b());
        bVar.f43900b = Integer.MIN_VALUE;
        return true;
    }

    private void m2(View view) {
        for (int i10 = this.f43890s - 1; i10 >= 0; i10--) {
            this.f43891t[i10].a(view);
        }
    }

    private void n2(b bVar) {
        e eVar = this.f43882I;
        int i10 = eVar.f43916c;
        if (i10 > 0) {
            if (i10 == this.f43890s) {
                for (int i11 = 0; i11 < this.f43890s; i11++) {
                    this.f43891t[i11].e();
                    e eVar2 = this.f43882I;
                    int i12 = eVar2.f43917d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f43922i ? this.f43892u.i() : this.f43892u.m();
                    }
                    this.f43891t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f43882I;
                eVar3.f43914a = eVar3.f43915b;
            }
        }
        e eVar4 = this.f43882I;
        this.f43881H = eVar4.f43923j;
        i3(eVar4.f43921h);
        e3();
        e eVar5 = this.f43882I;
        int i13 = eVar5.f43914a;
        if (i13 != -1) {
            this.f43876C = i13;
            bVar.f43901c = eVar5.f43922i;
        } else {
            bVar.f43901c = this.f43874A;
        }
        if (eVar5.f43918e > 1) {
            d dVar = this.f43878E;
            dVar.f43908a = eVar5.f43919f;
            dVar.f43909b = eVar5.f43920g;
        }
    }

    private void o3(int i10, RecyclerView.C c10) {
        int i11;
        int i12;
        int c11;
        o oVar = this.f43896y;
        boolean z10 = false;
        oVar.f44161b = 0;
        oVar.f44162c = i10;
        if (!W0() || (c11 = c10.c()) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            if (this.f43874A == (c11 < i10)) {
                i12 = this.f43892u.n();
                i11 = 0;
            } else {
                i11 = this.f43892u.n();
                i12 = 0;
            }
        }
        if (o0()) {
            this.f43896y.f44165f = this.f43892u.m() - i11;
            this.f43896y.f44166g = this.f43892u.i() + i12;
        } else {
            this.f43896y.f44166g = this.f43892u.h() + i12;
            this.f43896y.f44165f = -i11;
        }
        o oVar2 = this.f43896y;
        oVar2.f44167h = false;
        oVar2.f44160a = true;
        if (this.f43892u.k() == 0 && this.f43892u.h() == 0) {
            z10 = true;
        }
        oVar2.f44168i = z10;
    }

    private void q2(View view, c cVar, o oVar) {
        if (oVar.f44164e == 1) {
            if (cVar.f43907f) {
                m2(view);
            } else {
                cVar.f43906e.a(view);
            }
        } else if (cVar.f43907f) {
            Z2(view);
        } else {
            cVar.f43906e.u(view);
        }
    }

    private void q3(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 <= i11) {
                this.f43875B.set(fVar.f43928e, false);
            }
        } else if (fVar.k() - j10 >= i11) {
            this.f43875B.set(fVar.f43928e, false);
        }
    }

    private int r2(int i10) {
        if (l0() == 0) {
            return this.f43874A ? 1 : -1;
        }
        return (i10 < J2()) != this.f43874A ? -1 : 1;
    }

    private int r3(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean t2(f fVar) {
        if (this.f43874A) {
            if (fVar.k() < this.f43892u.i()) {
                ArrayList<View> arrayList = fVar.f43924a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f43907f;
            }
        } else if (fVar.o() > this.f43892u.m()) {
            return !fVar.n(fVar.f43924a.get(0)).f43907f;
        }
        return false;
    }

    private int u2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        return w.a(c10, this.f43892u, E2(!this.f43887N), D2(!this.f43887N), this, this.f43887N);
    }

    private int v2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        return w.b(c10, this.f43892u, E2(!this.f43887N), D2(!this.f43887N), this, this.f43887N, this.f43874A);
    }

    private int w2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        return w.c(c10, this.f43892u, E2(!this.f43887N), D2(!this.f43887N), this, this.f43887N);
    }

    private int x2(int i10) {
        if (i10 == 1) {
            return (this.f43894w != 1 && T2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f43894w != 1 && T2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f43894w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f43894w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f43894w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f43894w == 1 ? 1 : Integer.MIN_VALUE;
    }

    private d.a y2(int i10) {
        d.a aVar = new d.a();
        aVar.f43912c = new int[this.f43890s];
        for (int i11 = 0; i11 < this.f43890s; i11++) {
            aVar.f43912c[i11] = i10 - this.f43891t[i11].l(i10);
        }
        return aVar;
    }

    private d.a z2(int i10) {
        d.a aVar = new d.a();
        aVar.f43912c = new int[this.f43890s];
        for (int i11 = 0; i11 < this.f43890s; i11++) {
            aVar.f43912c[i11] = this.f43891t[i11].p(i10) - i10;
        }
        return aVar;
    }

    public void B1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f43882I = eVar;
            if (this.f43876C != -1) {
                eVar.a();
                this.f43882I.b();
            }
            T1();
        }
    }

    public Parcelable C1() {
        int i10;
        int m10;
        int[] iArr;
        if (this.f43882I != null) {
            return new e(this.f43882I);
        }
        e eVar = new e();
        eVar.f43921h = this.f43897z;
        eVar.f43922i = this.f43880G;
        eVar.f43923j = this.f43881H;
        d dVar = this.f43878E;
        if (dVar == null || (iArr = dVar.f43908a) == null) {
            eVar.f43918e = 0;
        } else {
            eVar.f43919f = iArr;
            eVar.f43918e = iArr.length;
            eVar.f43920g = dVar.f43909b;
        }
        if (l0() > 0) {
            eVar.f43914a = this.f43880G ? K2() : J2();
            eVar.f43915b = F2();
            int i11 = this.f43890s;
            eVar.f43916c = i11;
            eVar.f43917d = new int[i11];
            for (int i12 = 0; i12 < this.f43890s; i12++) {
                if (this.f43880G) {
                    i10 = this.f43891t[i12].l(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        m10 = this.f43892u.i();
                    } else {
                        eVar.f43917d[i12] = i10;
                    }
                } else {
                    i10 = this.f43891t[i12].p(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        m10 = this.f43892u.m();
                    } else {
                        eVar.f43917d[i12] = i10;
                    }
                }
                i10 -= m10;
                eVar.f43917d[i12] = i10;
            }
        } else {
            eVar.f43914a = -1;
            eVar.f43915b = -1;
            eVar.f43916c = 0;
        }
        return eVar;
    }

    public void D1(int i10) {
        if (i10 == 0) {
            s2();
        }
    }

    /* access modifiers changed from: package-private */
    public View D2(boolean z10) {
        int m10 = this.f43892u.m();
        int i10 = this.f43892u.i();
        View view = null;
        for (int l02 = l0() - 1; l02 >= 0; l02--) {
            View k02 = k0(l02);
            int g10 = this.f43892u.g(k02);
            int d10 = this.f43892u.d(k02);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return k02;
                }
                if (view == null) {
                    view = k02;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View E2(boolean z10) {
        int m10 = this.f43892u.m();
        int i10 = this.f43892u.i();
        int l02 = l0();
        View view = null;
        for (int i11 = 0; i11 < l02; i11++) {
            View k02 = k0(i11);
            int g10 = this.f43892u.g(k02);
            if (this.f43892u.d(k02) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return k02;
                }
                if (view == null) {
                    view = k02;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int F2() {
        View D22 = this.f43874A ? D2(true) : E2(true);
        if (D22 == null) {
            return -1;
        }
        return E0(D22);
    }

    public int H0(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f43894w == 0) {
            return Math.min(this.f43890s, c10.b());
        }
        return -1;
    }

    public void I(String str) {
        if (this.f43882I == null) {
            super.I(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int J2() {
        if (l0() == 0) {
            return 0;
        }
        return E0(k0(0));
    }

    /* access modifiers changed from: package-private */
    public int K2() {
        int l02 = l0();
        if (l02 == 0) {
            return 0;
        }
        return E0(k0(l02 - 1));
    }

    public boolean M() {
        return this.f43894w == 0;
    }

    public boolean N() {
        return this.f43894w == 1;
    }

    public boolean O(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public boolean P0() {
        return this.f43879F != 0;
    }

    public void Q(int i10, int i11, RecyclerView.C c10, RecyclerView.q.c cVar) {
        int l10;
        int i12;
        if (this.f43894w != 0) {
            i10 = i11;
        }
        if (l0() != 0 && i10 != 0) {
            Y2(i10, c10);
            int[] iArr = this.f43888O;
            if (iArr == null || iArr.length < this.f43890s) {
                this.f43888O = new int[this.f43890s];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f43890s; i14++) {
                o oVar = this.f43896y;
                if (oVar.f44163d == -1) {
                    l10 = oVar.f44165f;
                    i12 = this.f43891t[i14].p(l10);
                } else {
                    l10 = this.f43891t[i14].l(oVar.f44166g);
                    i12 = this.f43896y.f44166g;
                }
                int i15 = l10 - i12;
                if (i15 >= 0) {
                    this.f43888O[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.f43888O, 0, i13);
            for (int i16 = 0; i16 < i13 && this.f43896y.a(c10); i16++) {
                cVar.a(this.f43896y.f44162c, this.f43888O[i16]);
                o oVar2 = this.f43896y;
                oVar2.f44162c += oVar2.f44163d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View R2() {
        int i10;
        int l02 = l0();
        int i11 = l02 - 1;
        BitSet bitSet = new BitSet(this.f43890s);
        bitSet.set(0, this.f43890s, true);
        int i12 = -1;
        char c10 = (this.f43894w != 1 || !T2()) ? (char) 65535 : 1;
        if (this.f43874A) {
            l02 = -1;
        } else {
            i11 = 0;
        }
        if (i11 < l02) {
            i12 = 1;
        }
        while (i11 != l02) {
            View k02 = k0(i11);
            c cVar = (c) k02.getLayoutParams();
            if (bitSet.get(cVar.f43906e.f43928e)) {
                if (t2(cVar.f43906e)) {
                    return k02;
                }
                bitSet.clear(cVar.f43906e.f43928e);
            }
            if (!cVar.f43907f && (i10 = i11 + i12) != l02) {
                View k03 = k0(i10);
                if (this.f43874A) {
                    int d10 = this.f43892u.d(k02);
                    int d11 = this.f43892u.d(k03);
                    if (d10 < d11) {
                        return k02;
                    }
                    if (d10 != d11) {
                        continue;
                    }
                } else {
                    int g10 = this.f43892u.g(k02);
                    int g11 = this.f43892u.g(k03);
                    if (g10 > g11) {
                        return k02;
                    }
                    if (g10 != g11) {
                        continue;
                    }
                }
                if ((cVar.f43906e.f43928e - ((c) k03.getLayoutParams()).f43906e.f43928e < 0) != (c10 < 0)) {
                    return k02;
                }
            }
            i11 += i12;
        }
        return null;
    }

    public int S(RecyclerView.C c10) {
        return u2(c10);
    }

    public void S2() {
        this.f43878E.b();
        T1();
    }

    public int T(RecyclerView.C c10) {
        return v2(c10);
    }

    public boolean T0() {
        return this.f43897z;
    }

    /* access modifiers changed from: package-private */
    public boolean T2() {
        return A0() == 1;
    }

    public int U(RecyclerView.C c10) {
        return w2(c10);
    }

    public int V(RecyclerView.C c10) {
        return u2(c10);
    }

    public int W(RecyclerView.C c10) {
        return v2(c10);
    }

    public int W1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        return f3(i10, xVar, c10);
    }

    public int X(RecyclerView.C c10) {
        return w2(c10);
    }

    public void X1(int i10) {
        e eVar = this.f43882I;
        if (!(eVar == null || eVar.f43914a == i10)) {
            eVar.a();
        }
        this.f43876C = i10;
        this.f43877D = Integer.MIN_VALUE;
        T1();
    }

    public int Y1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        return f3(i10, xVar, c10);
    }

    /* access modifiers changed from: package-private */
    public void Y2(int i10, RecyclerView.C c10) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = K2();
            i11 = 1;
        } else {
            i12 = J2();
            i11 = -1;
        }
        this.f43896y.f44160a = true;
        o3(i12, c10);
        g3(i11);
        o oVar = this.f43896y;
        oVar.f44162c = i12 + oVar.f44163d;
        oVar.f44161b = Math.abs(i10);
    }

    public void b1(int i10) {
        super.b1(i10);
        for (int i11 = 0; i11 < this.f43890s; i11++) {
            this.f43891t[i11].r(i10);
        }
    }

    public void c1(int i10) {
        super.c1(i10);
        for (int i11 = 0; i11 < this.f43890s; i11++) {
            this.f43891t[i11].r(i10);
        }
    }

    public void c2(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int t10 = t() + o();
        int s10 = s() + c();
        if (this.f43894w == 1) {
            i13 = RecyclerView.q.P(i11, rect.height() + s10, C0());
            i12 = RecyclerView.q.P(i10, (this.f43895x * this.f43890s) + t10, D0());
        } else {
            i12 = RecyclerView.q.P(i10, rect.width() + t10, D0());
            i13 = RecyclerView.q.P(i11, (this.f43895x * this.f43890s) + s10, C0());
        }
        b2(i12, i13);
    }

    public void d1(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f43878E.b();
        for (int i10 = 0; i10 < this.f43890s; i10++) {
            this.f43891t[i10].e();
        }
    }

    public RecyclerView.r f0() {
        return this.f43894w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    /* access modifiers changed from: package-private */
    public int f3(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (l0() == 0 || i10 == 0) {
            return 0;
        }
        Y2(i10, c10);
        int B22 = B2(xVar, this.f43896y, c10);
        if (this.f43896y.f44161b >= B22) {
            i10 = i10 < 0 ? -B22 : B22;
        }
        this.f43892u.r(-i10);
        this.f43880G = this.f43874A;
        o oVar = this.f43896y;
        oVar.f44161b = 0;
        a3(xVar, oVar);
        return i10;
    }

    public RecyclerView.r g0(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public PointF h(int i10) {
        int r22 = r2(i10);
        PointF pointF = new PointF();
        if (r22 == 0) {
            return null;
        }
        if (this.f43894w == 0) {
            pointF.x = (float) r22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) r22;
        }
        return pointF;
    }

    public RecyclerView.r h0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void h1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.h1(recyclerView, xVar);
        O1(this.f43889P);
        for (int i10 = 0; i10 < this.f43890s; i10++) {
            this.f43891t[i10].e();
        }
        recyclerView.requestLayout();
    }

    public void h3(int i10) {
        if (i10 == 0 || i10 == 1) {
            I((String) null);
            if (i10 != this.f43894w) {
                this.f43894w = i10;
                t tVar = this.f43892u;
                this.f43892u = this.f43893v;
                this.f43893v = tVar;
                T1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public View i1(View view, int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        View d02;
        View m10;
        if (l0() == 0 || (d02 = d0(view)) == null) {
            return null;
        }
        e3();
        int x22 = x2(i10);
        if (x22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) d02.getLayoutParams();
        boolean z10 = cVar.f43907f;
        f fVar = cVar.f43906e;
        int K22 = x22 == 1 ? K2() : J2();
        o3(K22, c10);
        g3(x22);
        o oVar = this.f43896y;
        oVar.f44162c = oVar.f44163d + K22;
        oVar.f44161b = (int) (((float) this.f43892u.n()) * 0.33333334f);
        o oVar2 = this.f43896y;
        oVar2.f44167h = true;
        oVar2.f44160a = false;
        B2(xVar, oVar2, c10);
        this.f43880G = this.f43874A;
        if (!z10 && (m10 = fVar.m(K22, x22)) != null && m10 != d02) {
            return m10;
        }
        if (X2(x22)) {
            for (int i11 = this.f43890s - 1; i11 >= 0; i11--) {
                View m11 = this.f43891t[i11].m(K22, x22);
                if (m11 != null && m11 != d02) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f43890s; i12++) {
                View m12 = this.f43891t[i12].m(K22, x22);
                if (m12 != null && m12 != d02) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f43897z ^ true) == (x22 == -1);
        if (!z10) {
            View e02 = e0(z11 ? fVar.f() : fVar.g());
            if (!(e02 == null || e02 == d02)) {
                return e02;
            }
        }
        if (X2(x22)) {
            for (int i13 = this.f43890s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f43928e) {
                    View e03 = e0(z11 ? this.f43891t[i13].f() : this.f43891t[i13].g());
                    if (!(e03 == null || e03 == d02)) {
                        return e03;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f43890s; i14++) {
                View e04 = e0(z11 ? this.f43891t[i14].f() : this.f43891t[i14].g());
                if (e04 != null && e04 != d02) {
                    return e04;
                }
            }
        }
        return null;
    }

    public void i2(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i10);
        j2(pVar);
    }

    public void i3(boolean z10) {
        I((String) null);
        e eVar = this.f43882I;
        if (!(eVar == null || eVar.f43921h == z10)) {
            eVar.f43921h = z10;
        }
        this.f43897z = z10;
        T1();
    }

    public void j1(AccessibilityEvent accessibilityEvent) {
        super.j1(accessibilityEvent);
        if (l0() > 0) {
            View E22 = E2(false);
            View D22 = D2(false);
            if (E22 != null && D22 != null) {
                int E02 = E0(E22);
                int E03 = E0(D22);
                if (E02 < E03) {
                    accessibilityEvent.setFromIndex(E02);
                    accessibilityEvent.setToIndex(E03);
                    return;
                }
                accessibilityEvent.setFromIndex(E03);
                accessibilityEvent.setToIndex(E02);
            }
        }
    }

    public void j3(int i10) {
        I((String) null);
        if (i10 != this.f43890s) {
            S2();
            this.f43890s = i10;
            this.f43875B = new BitSet(this.f43890s);
            this.f43891t = new f[this.f43890s];
            for (int i11 = 0; i11 < this.f43890s; i11++) {
                this.f43891t[i11] = new f(i11);
            }
            T1();
        }
    }

    public boolean l2() {
        return this.f43882I == null;
    }

    public void m1(RecyclerView.x xVar, RecyclerView.C c10, t tVar) {
        super.m1(xVar, c10, tVar);
        tVar.i0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* access modifiers changed from: package-private */
    public boolean m3(RecyclerView.C c10, b bVar) {
        int i10;
        boolean z10 = false;
        if (!c10.e() && (i10 = this.f43876C) != -1) {
            if (i10 < 0 || i10 >= c10.b()) {
                this.f43876C = -1;
                this.f43877D = Integer.MIN_VALUE;
            } else {
                e eVar = this.f43882I;
                if (eVar == null || eVar.f43914a == -1 || eVar.f43916c < 1) {
                    View e02 = e0(this.f43876C);
                    if (e02 != null) {
                        bVar.f43899a = this.f43874A ? K2() : J2();
                        if (this.f43877D != Integer.MIN_VALUE) {
                            if (bVar.f43901c) {
                                bVar.f43900b = (this.f43892u.i() - this.f43877D) - this.f43892u.d(e02);
                            } else {
                                bVar.f43900b = (this.f43892u.m() + this.f43877D) - this.f43892u.g(e02);
                            }
                            return true;
                        } else if (this.f43892u.e(e02) > this.f43892u.n()) {
                            bVar.f43900b = bVar.f43901c ? this.f43892u.i() : this.f43892u.m();
                            return true;
                        } else {
                            int g10 = this.f43892u.g(e02) - this.f43892u.m();
                            if (g10 < 0) {
                                bVar.f43900b = -g10;
                                return true;
                            }
                            int i11 = this.f43892u.i() - this.f43892u.d(e02);
                            if (i11 < 0) {
                                bVar.f43900b = i11;
                                return true;
                            }
                            bVar.f43900b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i12 = this.f43876C;
                        bVar.f43899a = i12;
                        int i13 = this.f43877D;
                        if (i13 == Integer.MIN_VALUE) {
                            if (r2(i12) == 1) {
                                z10 = true;
                            }
                            bVar.f43901c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f43902d = true;
                    }
                } else {
                    bVar.f43900b = Integer.MIN_VALUE;
                    bVar.f43899a = this.f43876C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n3(RecyclerView.C c10, b bVar) {
        if (!m3(c10, bVar) && !l3(c10, bVar)) {
            bVar.a();
            bVar.f43899a = 0;
        }
    }

    public void o1(RecyclerView.x xVar, RecyclerView.C c10, View view, t tVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.n1(view, tVar);
            return;
        }
        c cVar = (c) layoutParams;
        int i10 = 1;
        if (this.f43894w == 0) {
            int e10 = cVar.e();
            if (cVar.f43907f) {
                i10 = this.f43890s;
            }
            tVar.l0(t.f.a(e10, i10, -1, -1, false, false));
            return;
        }
        int e11 = cVar.e();
        if (cVar.f43907f) {
            i10 = this.f43890s;
        }
        tVar.l0(t.f.a(-1, -1, e11, i10, false, false));
    }

    /* access modifiers changed from: package-private */
    public boolean o2() {
        int l10 = this.f43891t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f43890s; i10++) {
            if (this.f43891t[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    public int p0(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f43894w == 1) {
            return Math.min(this.f43890s, c10.b());
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean p2() {
        int p10 = this.f43891t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f43890s; i10++) {
            if (this.f43891t[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p3(int i10) {
        this.f43895x = i10 / this.f43890s;
        this.f43883J = View.MeasureSpec.makeMeasureSpec(i10, this.f43893v.k());
    }

    public void q1(RecyclerView recyclerView, int i10, int i11) {
        Q2(i10, i11, 1);
    }

    public void r1(RecyclerView recyclerView) {
        this.f43878E.b();
        T1();
    }

    public void s1(RecyclerView recyclerView, int i10, int i11, int i12) {
        Q2(i10, i11, 8);
    }

    /* access modifiers changed from: package-private */
    public boolean s2() {
        int i10;
        int i11;
        if (l0() == 0 || this.f43879F == 0 || !O0()) {
            return false;
        }
        if (this.f43874A) {
            i11 = K2();
            i10 = J2();
        } else {
            i11 = J2();
            i10 = K2();
        }
        if (i11 == 0 && R2() != null) {
            this.f43878E.b();
            U1();
            T1();
            return true;
        } else if (!this.f43886M) {
            return false;
        } else {
            int i12 = this.f43874A ? -1 : 1;
            int i13 = i10 + 1;
            d.a e10 = this.f43878E.e(i11, i13, i12, true);
            if (e10 == null) {
                this.f43886M = false;
                this.f43878E.d(i13);
                return false;
            }
            d.a e11 = this.f43878E.e(i11, e10.f43910a, i12 * -1, true);
            if (e11 == null) {
                this.f43878E.d(e10.f43910a);
            } else {
                this.f43878E.d(e11.f43910a + 1);
            }
            U1();
            T1();
            return true;
        }
    }

    public void t1(RecyclerView recyclerView, int i10, int i11) {
        Q2(i10, i11, 2);
    }

    public void v1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Q2(i10, i11, 4);
    }

    public void w1(RecyclerView.x xVar, RecyclerView.C c10) {
        W2(xVar, c10, true);
    }

    public void x1(RecyclerView.C c10) {
        super.x1(c10);
        this.f43876C = -1;
        this.f43877D = Integer.MIN_VALUE;
        this.f43882I = null;
        this.f43885L.c();
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f43908a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f43909b;

        d() {
        }

        private int i(int i10) {
            if (this.f43909b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f43909b.remove(f10);
            }
            int size = this.f43909b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f43909b.get(i11).f43910a >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f43909b.remove(i11);
            return this.f43909b.get(i11).f43910a;
        }

        private void l(int i10, int i11) {
            List<a> list = this.f43909b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f43909b.get(size);
                    int i12 = aVar.f43910a;
                    if (i12 >= i10) {
                        aVar.f43910a = i12 + i11;
                    }
                }
            }
        }

        private void m(int i10, int i11) {
            List<a> list = this.f43909b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f43909b.get(size);
                    int i13 = aVar.f43910a;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f43909b.remove(size);
                        } else {
                            aVar.f43910a = i13 - i11;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f43909b == null) {
                this.f43909b = new ArrayList();
            }
            int size = this.f43909b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f43909b.get(i10);
                if (aVar2.f43910a == aVar.f43910a) {
                    this.f43909b.remove(i10);
                }
                if (aVar2.f43910a >= aVar.f43910a) {
                    this.f43909b.add(i10, aVar);
                    return;
                }
            }
            this.f43909b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f43908a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f43909b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            int[] iArr = this.f43908a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f43908a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f43908a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f43908a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i10) {
            List<a> list = this.f43909b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f43909b.get(size).f43910a >= i10) {
                        this.f43909b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f43909b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f43909b.get(i13);
                int i14 = aVar.f43910a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f43911b == i12 || (z10 && aVar.f43913d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f43909b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f43909b.get(size);
                if (aVar.f43910a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i10) {
            int[] iArr = this.f43908a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* access modifiers changed from: package-private */
        public int h(int i10) {
            int[] iArr = this.f43908a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f43908a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f43908a.length;
            }
            int min = Math.min(i11 + 1, this.f43908a.length);
            Arrays.fill(this.f43908a, i10, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            int[] iArr = this.f43908a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f43908a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f43908a, i10, i12, -1);
                l(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i10, int i11) {
            int[] iArr = this.f43908a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f43908a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f43908a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i10, f fVar) {
            c(i10);
            this.f43908a[i10] = fVar.f43928e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i10) {
            int length = this.f43908a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0750a();

            /* renamed from: a  reason: collision with root package name */
            int f43910a;

            /* renamed from: b  reason: collision with root package name */
            int f43911b;

            /* renamed from: c  reason: collision with root package name */
            int[] f43912c;

            /* renamed from: d  reason: collision with root package name */
            boolean f43913d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            class C0750a implements Parcelable.Creator<a> {
                C0750a() {
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

            a(Parcel parcel) {
                this.f43910a = parcel.readInt();
                this.f43911b = parcel.readInt();
                this.f43913d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f43912c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i10) {
                int[] iArr = this.f43912c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f43910a + ", mGapDir=" + this.f43911b + ", mHasUnwantedGapAfter=" + this.f43913d + ", mGapPerSpan=" + Arrays.toString(this.f43912c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f43910a);
                parcel.writeInt(this.f43911b);
                parcel.writeInt(this.f43913d ? 1 : 0);
                int[] iArr = this.f43912c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f43912c);
            }

            a() {
            }
        }
    }
}
