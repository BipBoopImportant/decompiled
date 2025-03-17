package androidx.recyclerview.widget;

import J2.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.q implements l.i, RecyclerView.B.b {

    /* renamed from: A  reason: collision with root package name */
    int f43647A;

    /* renamed from: B  reason: collision with root package name */
    int f43648B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f43649C;

    /* renamed from: D  reason: collision with root package name */
    d f43650D;

    /* renamed from: E  reason: collision with root package name */
    final a f43651E;

    /* renamed from: F  reason: collision with root package name */
    private final b f43652F;

    /* renamed from: G  reason: collision with root package name */
    private int f43653G;

    /* renamed from: H  reason: collision with root package name */
    private int[] f43654H;

    /* renamed from: s  reason: collision with root package name */
    int f43655s;

    /* renamed from: t  reason: collision with root package name */
    private c f43656t;

    /* renamed from: u  reason: collision with root package name */
    t f43657u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f43658v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f43659w;

    /* renamed from: x  reason: collision with root package name */
    boolean f43660x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f43661y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f43662z;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        t f43663a;

        /* renamed from: b  reason: collision with root package name */
        int f43664b;

        /* renamed from: c  reason: collision with root package name */
        int f43665c;

        /* renamed from: d  reason: collision with root package name */
        boolean f43666d;

        /* renamed from: e  reason: collision with root package name */
        boolean f43667e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f43665c = this.f43666d ? this.f43663a.i() : this.f43663a.m();
        }

        public void b(View view, int i10) {
            if (this.f43666d) {
                this.f43665c = this.f43663a.d(view) + this.f43663a.o();
            } else {
                this.f43665c = this.f43663a.g(view);
            }
            this.f43664b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f43663a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f43664b = i10;
            if (this.f43666d) {
                int i11 = (this.f43663a.i() - o10) - this.f43663a.d(view);
                this.f43665c = this.f43663a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f43665c - this.f43663a.e(view);
                    int m10 = this.f43663a.m();
                    int min = e10 - (m10 + Math.min(this.f43663a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f43665c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f43663a.g(view);
            int m11 = g10 - this.f43663a.m();
            this.f43665c = g10;
            if (m11 > 0) {
                int i12 = (this.f43663a.i() - Math.min(0, (this.f43663a.i() - o10) - this.f43663a.d(view))) - (g10 + this.f43663a.e(view));
                if (i12 < 0) {
                    this.f43665c -= Math.min(m11, -i12);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.C c10) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.c() && rVar.a() >= 0 && rVar.a() < c10.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f43664b = -1;
            this.f43665c = Integer.MIN_VALUE;
            this.f43666d = false;
            this.f43667e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f43664b + ", mCoordinate=" + this.f43665c + ", mLayoutFromEnd=" + this.f43666d + ", mValid=" + this.f43667e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f43668a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f43669b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f43670c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f43671d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f43668a = 0;
            this.f43669b = false;
            this.f43670c = false;
            this.f43671d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f43672a = true;

        /* renamed from: b  reason: collision with root package name */
        int f43673b;

        /* renamed from: c  reason: collision with root package name */
        int f43674c;

        /* renamed from: d  reason: collision with root package name */
        int f43675d;

        /* renamed from: e  reason: collision with root package name */
        int f43676e;

        /* renamed from: f  reason: collision with root package name */
        int f43677f;

        /* renamed from: g  reason: collision with root package name */
        int f43678g;

        /* renamed from: h  reason: collision with root package name */
        int f43679h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f43680i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f43681j = false;

        /* renamed from: k  reason: collision with root package name */
        int f43682k;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.G> f43683l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f43684m;

        c() {
        }

        private View e() {
            int size = this.f43683l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f43683l.get(i10).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.c() && this.f43675d == rVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f43675d = -1;
            } else {
                this.f43675d = ((RecyclerView.r) f10.getLayoutParams()).a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.C c10) {
            int i10 = this.f43675d;
            return i10 >= 0 && i10 < c10.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.x xVar) {
            if (this.f43683l != null) {
                return e();
            }
            View o10 = xVar.o(this.f43675d);
            this.f43675d += this.f43676e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f43683l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f43683l.get(i11).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.c() && (a10 = (rVar.a() - this.f43675d) * this.f43676e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f43685a;

        /* renamed from: b  reason: collision with root package name */
        int f43686b;

        /* renamed from: c  reason: collision with root package name */
        boolean f43687c;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f43685a >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f43685a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f43685a);
            parcel.writeInt(this.f43686b);
            parcel.writeInt(this.f43687c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f43685a = parcel.readInt();
            this.f43686b = parcel.readInt();
            this.f43687c = parcel.readInt() != 1 ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f43685a = dVar.f43685a;
            this.f43686b = dVar.f43686b;
            this.f43687c = dVar.f43687c;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View A2() {
        return C2(l0() - 1, -1);
    }

    private View E2() {
        return this.f43660x ? v2() : A2();
    }

    private View F2() {
        return this.f43660x ? A2() : v2();
    }

    private int H2(int i10, RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int i11;
        int i12 = this.f43657u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -Y2(-i12, xVar, c10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f43657u.i() - i14) <= 0) {
            return i13;
        }
        this.f43657u.r(i11);
        return i11 + i13;
    }

    private int I2(int i10, RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int m10;
        int m11 = i10 - this.f43657u.m();
        if (m11 <= 0) {
            return 0;
        }
        int i11 = -Y2(m11, xVar, c10);
        int i12 = i10 + i11;
        if (!z10 || (m10 = i12 - this.f43657u.m()) <= 0) {
            return i11;
        }
        this.f43657u.r(-m10);
        return i11 - m10;
    }

    private View J2() {
        return k0(this.f43660x ? 0 : l0() - 1);
    }

    private View K2() {
        return k0(this.f43660x ? l0() - 1 : 0);
    }

    private void Q2(RecyclerView.x xVar, RecyclerView.C c10, int i10, int i11) {
        if (c10.g() && l0() != 0 && !c10.e() && l2()) {
            List<RecyclerView.G> k10 = xVar.k();
            int size = k10.size();
            int E02 = E0(k0(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.G g10 = k10.get(i14);
                if (!g10.isRemoved()) {
                    if ((g10.getLayoutPosition() < E02) != this.f43660x) {
                        i12 += this.f43657u.e(g10.itemView);
                    } else {
                        i13 += this.f43657u.e(g10.itemView);
                    }
                }
            }
            this.f43656t.f43683l = k10;
            if (i12 > 0) {
                j3(E0(K2()), i10);
                c cVar = this.f43656t;
                cVar.f43679h = i12;
                cVar.f43674c = 0;
                cVar.a();
                u2(xVar, this.f43656t, c10, false);
            }
            if (i13 > 0) {
                h3(E0(J2()), i11);
                c cVar2 = this.f43656t;
                cVar2.f43679h = i13;
                cVar2.f43674c = 0;
                cVar2.a();
                u2(xVar, this.f43656t, c10, false);
            }
            this.f43656t.f43683l = null;
        }
    }

    private void S2(RecyclerView.x xVar, c cVar) {
        if (cVar.f43672a && !cVar.f43684m) {
            int i10 = cVar.f43678g;
            int i11 = cVar.f43680i;
            if (cVar.f43677f == -1) {
                U2(xVar, i10, i11);
            } else {
                V2(xVar, i10, i11);
            }
        }
    }

    private void T2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    N1(i12, xVar);
                }
                return;
            }
            while (i10 > i11) {
                N1(i10, xVar);
                i10--;
            }
        }
    }

    private void U2(RecyclerView.x xVar, int i10, int i11) {
        int l02 = l0();
        if (i10 >= 0) {
            int h10 = (this.f43657u.h() - i10) + i11;
            if (this.f43660x) {
                for (int i12 = 0; i12 < l02; i12++) {
                    View k02 = k0(i12);
                    if (this.f43657u.g(k02) < h10 || this.f43657u.q(k02) < h10) {
                        T2(xVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = l02 - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View k03 = k0(i14);
                if (this.f43657u.g(k03) < h10 || this.f43657u.q(k03) < h10) {
                    T2(xVar, i13, i14);
                    return;
                }
            }
        }
    }

    private void V2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int l02 = l0();
            if (this.f43660x) {
                int i13 = l02 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View k02 = k0(i14);
                    if (this.f43657u.d(k02) > i12 || this.f43657u.p(k02) > i12) {
                        T2(xVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < l02; i15++) {
                View k03 = k0(i15);
                if (this.f43657u.d(k03) > i12 || this.f43657u.p(k03) > i12) {
                    T2(xVar, 0, i15);
                    return;
                }
            }
        }
    }

    private void X2() {
        if (this.f43655s == 1 || !N2()) {
            this.f43660x = this.f43659w;
        } else {
            this.f43660x = !this.f43659w;
        }
    }

    private boolean d3(RecyclerView.x xVar, RecyclerView.C c10, a aVar) {
        View G22;
        boolean z10 = false;
        if (l0() == 0) {
            return false;
        }
        View x02 = x0();
        if (x02 == null || !aVar.d(x02, c10)) {
            boolean z11 = this.f43658v;
            boolean z12 = this.f43661y;
            if (z11 != z12 || (G22 = G2(xVar, c10, aVar.f43666d, z12)) == null) {
                return false;
            }
            aVar.b(G22, E0(G22));
            if (!c10.e() && l2()) {
                int g10 = this.f43657u.g(G22);
                int d10 = this.f43657u.d(G22);
                int m10 = this.f43657u.m();
                int i10 = this.f43657u.i();
                boolean z13 = d10 <= m10 && g10 < m10;
                if (g10 >= i10 && d10 > i10) {
                    z10 = true;
                }
                if (z13 || z10) {
                    if (aVar.f43666d) {
                        m10 = i10;
                    }
                    aVar.f43665c = m10;
                }
            }
            return true;
        }
        aVar.c(x02, E0(x02));
        return true;
    }

    private boolean e3(RecyclerView.C c10, a aVar) {
        int i10;
        boolean z10 = false;
        if (!c10.e() && (i10 = this.f43647A) != -1) {
            if (i10 < 0 || i10 >= c10.b()) {
                this.f43647A = -1;
                this.f43648B = Integer.MIN_VALUE;
            } else {
                aVar.f43664b = this.f43647A;
                d dVar = this.f43650D;
                if (dVar != null && dVar.a()) {
                    boolean z11 = this.f43650D.f43687c;
                    aVar.f43666d = z11;
                    if (z11) {
                        aVar.f43665c = this.f43657u.i() - this.f43650D.f43686b;
                    } else {
                        aVar.f43665c = this.f43657u.m() + this.f43650D.f43686b;
                    }
                    return true;
                } else if (this.f43648B == Integer.MIN_VALUE) {
                    View e02 = e0(this.f43647A);
                    if (e02 == null) {
                        if (l0() > 0) {
                            if ((this.f43647A < E0(k0(0))) == this.f43660x) {
                                z10 = true;
                            }
                            aVar.f43666d = z10;
                        }
                        aVar.a();
                    } else if (this.f43657u.e(e02) > this.f43657u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f43657u.g(e02) - this.f43657u.m() < 0) {
                        aVar.f43665c = this.f43657u.m();
                        aVar.f43666d = false;
                        return true;
                    } else if (this.f43657u.i() - this.f43657u.d(e02) < 0) {
                        aVar.f43665c = this.f43657u.i();
                        aVar.f43666d = true;
                        return true;
                    } else {
                        aVar.f43665c = aVar.f43666d ? this.f43657u.d(e02) + this.f43657u.o() : this.f43657u.g(e02);
                    }
                    return true;
                } else {
                    boolean z12 = this.f43660x;
                    aVar.f43666d = z12;
                    if (z12) {
                        aVar.f43665c = this.f43657u.i() - this.f43648B;
                    } else {
                        aVar.f43665c = this.f43657u.m() + this.f43648B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void f3(RecyclerView.x xVar, RecyclerView.C c10, a aVar) {
        if (!e3(c10, aVar) && !d3(xVar, c10, aVar)) {
            aVar.a();
            aVar.f43664b = this.f43661y ? c10.b() - 1 : 0;
        }
    }

    private void g3(int i10, int i11, boolean z10, RecyclerView.C c10) {
        int i12;
        this.f43656t.f43684m = W2();
        this.f43656t.f43677f = i10;
        int[] iArr = this.f43654H;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        m2(c10, iArr);
        int max = Math.max(0, this.f43654H[0]);
        int max2 = Math.max(0, this.f43654H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f43656t;
        int i14 = z11 ? max2 : max;
        cVar.f43679h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f43680i = max;
        if (z11) {
            cVar.f43679h = i14 + this.f43657u.j();
            View J22 = J2();
            c cVar2 = this.f43656t;
            if (this.f43660x) {
                i13 = -1;
            }
            cVar2.f43676e = i13;
            int E02 = E0(J22);
            c cVar3 = this.f43656t;
            cVar2.f43675d = E02 + cVar3.f43676e;
            cVar3.f43673b = this.f43657u.d(J22);
            i12 = this.f43657u.d(J22) - this.f43657u.i();
        } else {
            View K22 = K2();
            this.f43656t.f43679h += this.f43657u.m();
            c cVar4 = this.f43656t;
            if (!this.f43660x) {
                i13 = -1;
            }
            cVar4.f43676e = i13;
            int E03 = E0(K22);
            c cVar5 = this.f43656t;
            cVar4.f43675d = E03 + cVar5.f43676e;
            cVar5.f43673b = this.f43657u.g(K22);
            i12 = (-this.f43657u.g(K22)) + this.f43657u.m();
        }
        c cVar6 = this.f43656t;
        cVar6.f43674c = i11;
        if (z10) {
            cVar6.f43674c = i11 - i12;
        }
        cVar6.f43678g = i12;
    }

    private void h3(int i10, int i11) {
        this.f43656t.f43674c = this.f43657u.i() - i11;
        c cVar = this.f43656t;
        cVar.f43676e = this.f43660x ? -1 : 1;
        cVar.f43675d = i10;
        cVar.f43677f = 1;
        cVar.f43673b = i11;
        cVar.f43678g = Integer.MIN_VALUE;
    }

    private void i3(a aVar) {
        h3(aVar.f43664b, aVar.f43665c);
    }

    private void j3(int i10, int i11) {
        this.f43656t.f43674c = i11 - this.f43657u.m();
        c cVar = this.f43656t;
        cVar.f43675d = i10;
        cVar.f43676e = this.f43660x ? 1 : -1;
        cVar.f43677f = -1;
        cVar.f43673b = i11;
        cVar.f43678g = Integer.MIN_VALUE;
    }

    private void k3(a aVar) {
        j3(aVar.f43664b, aVar.f43665c);
    }

    private int o2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        t2();
        t tVar = this.f43657u;
        View x22 = x2(!this.f43662z, true);
        return w.a(c10, tVar, x22, w2(!this.f43662z, true), this, this.f43662z);
    }

    private int p2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        t2();
        t tVar = this.f43657u;
        View x22 = x2(!this.f43662z, true);
        return w.b(c10, tVar, x22, w2(!this.f43662z, true), this, this.f43662z, this.f43660x);
    }

    private int q2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        t2();
        t tVar = this.f43657u;
        View x22 = x2(!this.f43662z, true);
        return w.c(c10, tVar, x22, w2(!this.f43662z, true), this, this.f43662z);
    }

    private View v2() {
        return C2(0, l0());
    }

    @SuppressLint({"UnknownNullness"})
    public void B1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f43650D = dVar;
            if (this.f43647A != -1) {
                dVar.b();
            }
            T1();
        }
    }

    public int B2() {
        View D22 = D2(l0() - 1, -1, false, true);
        if (D22 == null) {
            return -1;
        }
        return E0(D22);
    }

    @SuppressLint({"UnknownNullness"})
    public Parcelable C1() {
        if (this.f43650D != null) {
            return new d(this.f43650D);
        }
        d dVar = new d();
        if (l0() > 0) {
            t2();
            boolean z10 = this.f43658v ^ this.f43660x;
            dVar.f43687c = z10;
            if (z10) {
                View J22 = J2();
                dVar.f43686b = this.f43657u.i() - this.f43657u.d(J22);
                dVar.f43685a = E0(J22);
            } else {
                View K22 = K2();
                dVar.f43685a = E0(K22);
                dVar.f43686b = this.f43657u.g(K22) - this.f43657u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public View C2(int i10, int i11) {
        int i12;
        int i13;
        t2();
        if (i11 <= i10 && i11 >= i10) {
            return k0(i10);
        }
        if (this.f43657u.g(k0(i10)) < this.f43657u.m()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        return this.f43655s == 0 ? this.f43834e.a(i10, i11, i13, i12) : this.f43835f.a(i10, i11, i13, i12);
    }

    /* access modifiers changed from: package-private */
    public View D2(int i10, int i11, boolean z10, boolean z11) {
        t2();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.f43655s == 0 ? this.f43834e.a(i10, i11, i13, i12) : this.f43835f.a(i10, i11, i13, i12);
    }

    /* access modifiers changed from: package-private */
    public boolean F1(int i10, Bundle bundle) {
        int i11;
        if (super.F1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f43655s == 1) {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f43831b;
                i11 = Math.min(i12, H0(recyclerView.f43749c, recyclerView.f43717J0) - 1);
            } else {
                int i13 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i13 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f43831b;
                i11 = Math.min(i13, p0(recyclerView2.f43749c, recyclerView2.f43717J0) - 1);
            }
            if (i11 >= 0) {
                Z2(i11, 0);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public View G2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        t2();
        int l02 = l0();
        if (z11) {
            i12 = l0() - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = l02;
            i12 = 0;
            i10 = 1;
        }
        int b10 = c10.b();
        int m10 = this.f43657u.m();
        int i13 = this.f43657u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i12 != i11) {
            View k02 = k0(i12);
            int E02 = E0(k02);
            int g10 = this.f43657u.g(k02);
            int d10 = this.f43657u.d(k02);
            if (E02 >= 0 && E02 < b10) {
                if (!((RecyclerView.r) k02.getLayoutParams()).c()) {
                    boolean z12 = d10 <= m10 && g10 < m10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return k02;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = k02;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = k02;
                    }
                    view2 = k02;
                } else if (view3 == null) {
                    view3 = k02;
                }
            }
            i12 += i10;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @SuppressLint({"UnknownNullness"})
    public void I(String str) {
        if (this.f43650D == null) {
            super.I(str);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int L2(RecyclerView.C c10) {
        if (c10.d()) {
            return this.f43657u.n();
        }
        return 0;
    }

    public boolean M() {
        return this.f43655s == 0;
    }

    public int M2() {
        return this.f43655s;
    }

    public boolean N() {
        return this.f43655s == 1;
    }

    /* access modifiers changed from: protected */
    public boolean N2() {
        return A0() == 1;
    }

    public boolean O2() {
        return this.f43662z;
    }

    public boolean P0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void P2(RecyclerView.x xVar, RecyclerView.C c10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View d10 = cVar.d(xVar);
        if (d10 == null) {
            bVar.f43669b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) d10.getLayoutParams();
        if (cVar.f43683l == null) {
            if (this.f43660x == (cVar.f43677f == -1)) {
                F(d10);
            } else {
                G(d10, 0);
            }
        } else {
            if (this.f43660x == (cVar.f43677f == -1)) {
                D(d10);
            } else {
                E(d10, 0);
            }
        }
        Z0(d10, 0, 0);
        bVar.f43668a = this.f43657u.e(d10);
        if (this.f43655s == 1) {
            if (N2()) {
                i14 = L0() - o();
                i13 = i14 - this.f43657u.f(d10);
            } else {
                i13 = t();
                i14 = this.f43657u.f(d10) + i13;
            }
            if (cVar.f43677f == -1) {
                int i15 = cVar.f43673b;
                i10 = i15;
                i11 = i14;
                i12 = i15 - bVar.f43668a;
            } else {
                int i16 = cVar.f43673b;
                i12 = i16;
                i11 = i14;
                i10 = bVar.f43668a + i16;
            }
        } else {
            int s10 = s();
            int f10 = this.f43657u.f(d10) + s10;
            if (cVar.f43677f == -1) {
                int i17 = cVar.f43673b;
                i11 = i17;
                i12 = s10;
                i10 = f10;
                i13 = i17 - bVar.f43668a;
            } else {
                int i18 = cVar.f43673b;
                i12 = s10;
                i11 = bVar.f43668a + i18;
                i10 = f10;
                i13 = i18;
            }
        }
        Y0(d10, i13, i12, i11, i10);
        if (rVar.c() || rVar.b()) {
            bVar.f43670c = true;
        }
        bVar.f43671d = d10.hasFocusable();
    }

    @SuppressLint({"UnknownNullness"})
    public void Q(int i10, int i11, RecyclerView.C c10, RecyclerView.q.c cVar) {
        if (this.f43655s != 0) {
            i10 = i11;
        }
        if (l0() != 0 && i10 != 0) {
            t2();
            g3(i10 > 0 ? 1 : -1, Math.abs(i10), true, c10);
            n2(c10, this.f43656t, cVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void R(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f43650D;
        int i12 = -1;
        if (dVar == null || !dVar.a()) {
            X2();
            z10 = this.f43660x;
            i11 = this.f43647A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f43650D;
            z10 = dVar2.f43687c;
            i11 = dVar2.f43685a;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.f43653G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    /* access modifiers changed from: package-private */
    public void R2(RecyclerView.x xVar, RecyclerView.C c10, a aVar, int i10) {
    }

    @SuppressLint({"UnknownNullness"})
    public int S(RecyclerView.C c10) {
        return o2(c10);
    }

    @SuppressLint({"UnknownNullness"})
    public int T(RecyclerView.C c10) {
        return p2(c10);
    }

    public boolean T0() {
        return this.f43659w;
    }

    @SuppressLint({"UnknownNullness"})
    public int U(RecyclerView.C c10) {
        return q2(c10);
    }

    @SuppressLint({"UnknownNullness"})
    public int V(RecyclerView.C c10) {
        return o2(c10);
    }

    @SuppressLint({"UnknownNullness"})
    public int W(RecyclerView.C c10) {
        return p2(c10);
    }

    @SuppressLint({"UnknownNullness"})
    public int W1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f43655s == 1) {
            return 0;
        }
        return Y2(i10, xVar, c10);
    }

    /* access modifiers changed from: package-private */
    public boolean W2() {
        return this.f43657u.k() == 0 && this.f43657u.h() == 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int X(RecyclerView.C c10) {
        return q2(c10);
    }

    public void X1(int i10) {
        this.f43647A = i10;
        this.f43648B = Integer.MIN_VALUE;
        d dVar = this.f43650D;
        if (dVar != null) {
            dVar.b();
        }
        T1();
    }

    @SuppressLint({"UnknownNullness"})
    public int Y1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f43655s == 0) {
            return 0;
        }
        return Y2(i10, xVar, c10);
    }

    /* access modifiers changed from: package-private */
    public int Y2(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (l0() == 0 || i10 == 0) {
            return 0;
        }
        t2();
        this.f43656t.f43672a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        g3(i11, abs, true, c10);
        c cVar = this.f43656t;
        int u22 = cVar.f43678g + u2(xVar, cVar, c10, false);
        if (u22 < 0) {
            return 0;
        }
        if (abs > u22) {
            i10 = i11 * u22;
        }
        this.f43657u.r(-i10);
        this.f43656t.f43682k = i10;
        return i10;
    }

    public void Z2(int i10, int i11) {
        this.f43647A = i10;
        this.f43648B = i11;
        d dVar = this.f43650D;
        if (dVar != null) {
            dVar.b();
        }
        T1();
    }

    public void a3(int i10) {
        if (i10 == 0 || i10 == 1) {
            I((String) null);
            if (i10 != this.f43655s || this.f43657u == null) {
                t b10 = t.b(this, i10);
                this.f43657u = b10;
                this.f43651E.f43663a = b10;
                this.f43655s = i10;
                T1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void b3(boolean z10) {
        I((String) null);
        if (z10 != this.f43659w) {
            this.f43659w = z10;
            T1();
        }
    }

    public void c3(boolean z10) {
        I((String) null);
        if (this.f43661y != z10) {
            this.f43661y = z10;
            T1();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public View e0(int i10) {
        int l02 = l0();
        if (l02 == 0) {
            return null;
        }
        int E02 = i10 - E0(k0(0));
        if (E02 >= 0 && E02 < l02) {
            View k02 = k0(E02);
            if (E0(k02) == i10) {
                return k02;
            }
        }
        return super.e0(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public RecyclerView.r f0() {
        return new RecyclerView.r(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public boolean g2() {
        return (z0() == 1073741824 || M0() == 1073741824 || !N0()) ? false : true;
    }

    @SuppressLint({"UnknownNullness"})
    public PointF h(int i10) {
        if (l0() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < E0(k0(0))) {
            z10 = true;
        }
        if (z10 != this.f43660x) {
            i11 = -1;
        }
        return this.f43655s == 0 ? new PointF((float) i11, 0.0f) : new PointF(0.0f, (float) i11);
    }

    @SuppressLint({"UnknownNullness"})
    public void h1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.h1(recyclerView, xVar);
        if (this.f43649C) {
            K1(xVar);
            xVar.c();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public View i1(View view, int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        int r22;
        X2();
        if (l0() == 0 || (r22 = r2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        t2();
        g3(r22, (int) (((float) this.f43657u.n()) * 0.33333334f), false, c10);
        c cVar = this.f43656t;
        cVar.f43678g = Integer.MIN_VALUE;
        cVar.f43672a = false;
        u2(xVar, cVar, c10, true);
        View F22 = r22 == -1 ? F2() : E2();
        View K22 = r22 == -1 ? K2() : J2();
        if (!K22.hasFocusable()) {
            return F22;
        }
        if (F22 == null) {
            return null;
        }
        return K22;
    }

    @SuppressLint({"UnknownNullness"})
    public void i2(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i10);
        j2(pVar);
    }

    @SuppressLint({"UnknownNullness"})
    public void j1(AccessibilityEvent accessibilityEvent) {
        super.j1(accessibilityEvent);
        if (l0() > 0) {
            accessibilityEvent.setFromIndex(y2());
            accessibilityEvent.setToIndex(B2());
        }
    }

    public boolean l2() {
        return this.f43650D == null && this.f43658v == this.f43661y;
    }

    public void m1(RecyclerView.x xVar, RecyclerView.C c10, t tVar) {
        super.m1(xVar, c10, tVar);
        RecyclerView.h hVar = this.f43831b.f43763m;
        if (hVar != null && hVar.getItemCount() > 0) {
            tVar.b(t.a.f8813B);
        }
    }

    /* access modifiers changed from: protected */
    public void m2(RecyclerView.C c10, int[] iArr) {
        int i10;
        int L22 = L2(c10);
        if (this.f43656t.f43677f == -1) {
            i10 = 0;
        } else {
            i10 = L22;
            L22 = 0;
        }
        iArr[0] = L22;
        iArr[1] = i10;
    }

    public void n(View view, View view2, int i10, int i11) {
        I("Cannot drop a view during a scroll or layout calculation");
        t2();
        X2();
        int E02 = E0(view);
        int E03 = E0(view2);
        boolean z10 = E02 < E03 ? true : true;
        if (this.f43660x) {
            if (z10) {
                Z2(E03, this.f43657u.i() - (this.f43657u.g(view2) + this.f43657u.e(view)));
            } else {
                Z2(E03, this.f43657u.i() - this.f43657u.d(view2));
            }
        } else if (z10) {
            Z2(E03, this.f43657u.g(view2));
        } else {
            Z2(E03, this.f43657u.d(view2) - this.f43657u.e(view));
        }
    }

    /* access modifiers changed from: package-private */
    public void n2(RecyclerView.C c10, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f43675d;
        if (i10 >= 0 && i10 < c10.b()) {
            cVar2.a(i10, Math.max(0, cVar.f43678g));
        }
    }

    /* access modifiers changed from: package-private */
    public int r2(int i10) {
        if (i10 == 1) {
            return (this.f43655s != 1 && N2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f43655s != 1 && N2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f43655s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f43655s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f43655s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f43655s == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    public c s2() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void t2() {
        if (this.f43656t == null) {
            this.f43656t = s2();
        }
    }

    /* access modifiers changed from: package-private */
    public int u2(RecyclerView.x xVar, c cVar, RecyclerView.C c10, boolean z10) {
        int i10 = cVar.f43674c;
        int i11 = cVar.f43678g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f43678g = i11 + i10;
            }
            S2(xVar, cVar);
        }
        int i12 = cVar.f43674c + cVar.f43679h;
        b bVar = this.f43652F;
        while (true) {
            if ((!cVar.f43684m && i12 <= 0) || !cVar.c(c10)) {
                break;
            }
            bVar.a();
            P2(xVar, c10, cVar, bVar);
            if (!bVar.f43669b) {
                cVar.f43673b += bVar.f43668a * cVar.f43677f;
                if (!bVar.f43670c || cVar.f43683l != null || !c10.e()) {
                    int i13 = cVar.f43674c;
                    int i14 = bVar.f43668a;
                    cVar.f43674c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f43678g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f43668a;
                    cVar.f43678g = i16;
                    int i17 = cVar.f43674c;
                    if (i17 < 0) {
                        cVar.f43678g = i16 + i17;
                    }
                    S2(xVar, cVar);
                }
                if (z10 && bVar.f43671d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f43674c;
    }

    @SuppressLint({"UnknownNullness"})
    public void w1(RecyclerView.x xVar, RecyclerView.C c10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int H22;
        int i14;
        View e02;
        int g10;
        int i15;
        int i16 = -1;
        if (!(this.f43650D == null && this.f43647A == -1) && c10.b() == 0) {
            K1(xVar);
            return;
        }
        d dVar = this.f43650D;
        if (dVar != null && dVar.a()) {
            this.f43647A = this.f43650D.f43685a;
        }
        t2();
        this.f43656t.f43672a = false;
        X2();
        View x02 = x0();
        a aVar = this.f43651E;
        if (!aVar.f43667e || this.f43647A != -1 || this.f43650D != null) {
            aVar.e();
            a aVar2 = this.f43651E;
            aVar2.f43666d = this.f43660x ^ this.f43661y;
            f3(xVar, c10, aVar2);
            this.f43651E.f43667e = true;
        } else if (x02 != null && (this.f43657u.g(x02) >= this.f43657u.i() || this.f43657u.d(x02) <= this.f43657u.m())) {
            this.f43651E.c(x02, E0(x02));
        }
        c cVar = this.f43656t;
        cVar.f43677f = cVar.f43682k >= 0 ? 1 : -1;
        int[] iArr = this.f43654H;
        iArr[0] = 0;
        iArr[1] = 0;
        m2(c10, iArr);
        int max = Math.max(0, this.f43654H[0]) + this.f43657u.m();
        int max2 = Math.max(0, this.f43654H[1]) + this.f43657u.j();
        if (!(!c10.e() || (i14 = this.f43647A) == -1 || this.f43648B == Integer.MIN_VALUE || (e02 = e0(i14)) == null)) {
            if (this.f43660x) {
                i15 = this.f43657u.i() - this.f43657u.d(e02);
                g10 = this.f43648B;
            } else {
                g10 = this.f43657u.g(e02) - this.f43657u.m();
                i15 = this.f43648B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.f43651E;
        if (!aVar3.f43666d ? !this.f43660x : this.f43660x) {
            i16 = 1;
        }
        R2(xVar, c10, aVar3, i16);
        Y(xVar);
        this.f43656t.f43684m = W2();
        this.f43656t.f43681j = c10.e();
        this.f43656t.f43680i = 0;
        a aVar4 = this.f43651E;
        if (aVar4.f43666d) {
            k3(aVar4);
            c cVar2 = this.f43656t;
            cVar2.f43679h = max;
            u2(xVar, cVar2, c10, false);
            c cVar3 = this.f43656t;
            i11 = cVar3.f43673b;
            int i18 = cVar3.f43675d;
            int i19 = cVar3.f43674c;
            if (i19 > 0) {
                max2 += i19;
            }
            i3(this.f43651E);
            c cVar4 = this.f43656t;
            cVar4.f43679h = max2;
            cVar4.f43675d += cVar4.f43676e;
            u2(xVar, cVar4, c10, false);
            c cVar5 = this.f43656t;
            i10 = cVar5.f43673b;
            int i20 = cVar5.f43674c;
            if (i20 > 0) {
                j3(i18, i11);
                c cVar6 = this.f43656t;
                cVar6.f43679h = i20;
                u2(xVar, cVar6, c10, false);
                i11 = this.f43656t.f43673b;
            }
        } else {
            i3(aVar4);
            c cVar7 = this.f43656t;
            cVar7.f43679h = max2;
            u2(xVar, cVar7, c10, false);
            c cVar8 = this.f43656t;
            i10 = cVar8.f43673b;
            int i21 = cVar8.f43675d;
            int i22 = cVar8.f43674c;
            if (i22 > 0) {
                max += i22;
            }
            k3(this.f43651E);
            c cVar9 = this.f43656t;
            cVar9.f43679h = max;
            cVar9.f43675d += cVar9.f43676e;
            u2(xVar, cVar9, c10, false);
            c cVar10 = this.f43656t;
            i11 = cVar10.f43673b;
            int i23 = cVar10.f43674c;
            if (i23 > 0) {
                h3(i21, i10);
                c cVar11 = this.f43656t;
                cVar11.f43679h = i23;
                u2(xVar, cVar11, c10, false);
                i10 = this.f43656t.f43673b;
            }
        }
        if (l0() > 0) {
            if (this.f43660x ^ this.f43661y) {
                int H23 = H2(i10, xVar, c10, true);
                i12 = i11 + H23;
                i13 = i10 + H23;
                H22 = I2(i12, xVar, c10, false);
            } else {
                int I22 = I2(i11, xVar, c10, true);
                i12 = i11 + I22;
                i13 = i10 + I22;
                H22 = H2(i13, xVar, c10, false);
            }
            i11 = i12 + H22;
            i10 = i13 + H22;
        }
        Q2(xVar, c10, i11, i10);
        if (!c10.e()) {
            this.f43657u.s();
        } else {
            this.f43651E.e();
        }
        this.f43658v = this.f43661y;
    }

    /* access modifiers changed from: package-private */
    public View w2(boolean z10, boolean z11) {
        return this.f43660x ? D2(0, l0(), z10, z11) : D2(l0() - 1, -1, z10, z11);
    }

    @SuppressLint({"UnknownNullness"})
    public void x1(RecyclerView.C c10) {
        super.x1(c10);
        this.f43650D = null;
        this.f43647A = -1;
        this.f43648B = Integer.MIN_VALUE;
        this.f43651E.e();
    }

    /* access modifiers changed from: package-private */
    public View x2(boolean z10, boolean z11) {
        return this.f43660x ? D2(l0() - 1, -1, z10, z11) : D2(0, l0(), z10, z11);
    }

    public int y2() {
        View D22 = D2(0, l0(), false, true);
        if (D22 == null) {
            return -1;
        }
        return E0(D22);
    }

    public int z2() {
        View D22 = D2(l0() - 1, -1, true, false);
        if (D22 == null) {
            return -1;
        }
        return E0(D22);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f43655s = 1;
        this.f43659w = false;
        this.f43660x = false;
        this.f43661y = false;
        this.f43662z = true;
        this.f43647A = -1;
        this.f43648B = Integer.MIN_VALUE;
        this.f43650D = null;
        this.f43651E = new a();
        this.f43652F = new b();
        this.f43653G = 2;
        this.f43654H = new int[2];
        a3(i10);
        b3(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f43655s = 1;
        this.f43659w = false;
        this.f43660x = false;
        this.f43661y = false;
        this.f43662z = true;
        this.f43647A = -1;
        this.f43648B = Integer.MIN_VALUE;
        this.f43650D = null;
        this.f43651E = new a();
        this.f43652F = new b();
        this.f43653G = 2;
        this.f43654H = new int[2];
        RecyclerView.q.d F02 = RecyclerView.q.F0(context, attributeSet, i10, i11);
        a3(F02.f43850a);
        b3(F02.f43852c);
        c3(F02.f43853d);
    }
}
