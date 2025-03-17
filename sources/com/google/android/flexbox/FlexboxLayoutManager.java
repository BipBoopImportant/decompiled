package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.q implements a, RecyclerView.B.b {

    /* renamed from: S  reason: collision with root package name */
    private static final Rect f47812S = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final d f47813A = new d(this);

    /* renamed from: B  reason: collision with root package name */
    private RecyclerView.x f47814B;

    /* renamed from: C  reason: collision with root package name */
    private RecyclerView.C f47815C;

    /* renamed from: D  reason: collision with root package name */
    private d f47816D;

    /* renamed from: E  reason: collision with root package name */
    private b f47817E = new b();
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public t f47818F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public t f47819G;

    /* renamed from: H  reason: collision with root package name */
    private e f47820H;

    /* renamed from: I  reason: collision with root package name */
    private int f47821I = -1;

    /* renamed from: J  reason: collision with root package name */
    private int f47822J = Integer.MIN_VALUE;

    /* renamed from: K  reason: collision with root package name */
    private int f47823K = Integer.MIN_VALUE;

    /* renamed from: L  reason: collision with root package name */
    private int f47824L = Integer.MIN_VALUE;

    /* renamed from: M  reason: collision with root package name */
    private boolean f47825M;

    /* renamed from: N  reason: collision with root package name */
    private SparseArray<View> f47826N = new SparseArray<>();

    /* renamed from: O  reason: collision with root package name */
    private final Context f47827O;

    /* renamed from: P  reason: collision with root package name */
    private View f47828P;

    /* renamed from: Q  reason: collision with root package name */
    private int f47829Q = -1;

    /* renamed from: R  reason: collision with root package name */
    private d.a f47830R = new d.a();
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f47831s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f47832t;

    /* renamed from: u  reason: collision with root package name */
    private int f47833u;

    /* renamed from: v  reason: collision with root package name */
    private int f47834v;

    /* renamed from: w  reason: collision with root package name */
    private int f47835w = -1;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f47836x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f47837y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public List<c> f47838z = new ArrayList();

    private class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f47839a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f47840b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f47841c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f47842d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f47843e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f47844f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public boolean f47845g;

        private b() {
            this.f47842d = 0;
        }

        static /* synthetic */ int l(b bVar, int i10) {
            int i11 = bVar.f47842d + i10;
            bVar.f47842d = i11;
            return i11;
        }

        /* access modifiers changed from: private */
        public void r() {
            if (FlexboxLayoutManager.this.C() || !FlexboxLayoutManager.this.f47836x) {
                this.f47841c = this.f47843e ? FlexboxLayoutManager.this.f47818F.i() : FlexboxLayoutManager.this.f47818F.m();
            } else {
                this.f47841c = this.f47843e ? FlexboxLayoutManager.this.f47818F.i() : FlexboxLayoutManager.this.L0() - FlexboxLayoutManager.this.f47818F.m();
            }
        }

        /* access modifiers changed from: private */
        public void s(View view) {
            t q22 = FlexboxLayoutManager.this.f47832t == 0 ? FlexboxLayoutManager.this.f47819G : FlexboxLayoutManager.this.f47818F;
            if (FlexboxLayoutManager.this.C() || !FlexboxLayoutManager.this.f47836x) {
                if (this.f47843e) {
                    this.f47841c = q22.d(view) + q22.o();
                } else {
                    this.f47841c = q22.g(view);
                }
            } else if (this.f47843e) {
                this.f47841c = q22.g(view) + q22.o();
            } else {
                this.f47841c = q22.d(view);
            }
            this.f47839a = FlexboxLayoutManager.this.E0(view);
            int i10 = 0;
            this.f47845g = false;
            int[] iArr = FlexboxLayoutManager.this.f47813A.f47888c;
            int i11 = this.f47839a;
            if (i11 == -1) {
                i11 = 0;
            }
            int i12 = iArr[i11];
            if (i12 != -1) {
                i10 = i12;
            }
            this.f47840b = i10;
            if (FlexboxLayoutManager.this.f47838z.size() > this.f47840b) {
                this.f47839a = ((c) FlexboxLayoutManager.this.f47838z.get(this.f47840b)).f47882o;
            }
        }

        /* access modifiers changed from: private */
        public void t() {
            this.f47839a = -1;
            this.f47840b = -1;
            this.f47841c = Integer.MIN_VALUE;
            boolean z10 = false;
            this.f47844f = false;
            this.f47845g = false;
            if (FlexboxLayoutManager.this.C()) {
                if (FlexboxLayoutManager.this.f47832t == 0) {
                    if (FlexboxLayoutManager.this.f47831s == 1) {
                        z10 = true;
                    }
                    this.f47843e = z10;
                    return;
                }
                if (FlexboxLayoutManager.this.f47832t == 2) {
                    z10 = true;
                }
                this.f47843e = z10;
            } else if (FlexboxLayoutManager.this.f47832t == 0) {
                if (FlexboxLayoutManager.this.f47831s == 3) {
                    z10 = true;
                }
                this.f47843e = z10;
            } else {
                if (FlexboxLayoutManager.this.f47832t == 2) {
                    z10 = true;
                }
                this.f47843e = z10;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f47839a + ", mFlexLinePosition=" + this.f47840b + ", mCoordinate=" + this.f47841c + ", mPerpendicularCoordinate=" + this.f47842d + ", mLayoutFromEnd=" + this.f47843e + ", mValid=" + this.f47844f + ", mAssignedFromSavedState=" + this.f47845g + '}';
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f47856a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f47857b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f47858c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f47859d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f47860e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f47861f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f47862g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f47863h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f47864i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public boolean f47865j;

        private d() {
            this.f47863h = 1;
            this.f47864i = 1;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r2 = r1.f47858c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean D(androidx.recyclerview.widget.RecyclerView.C r2, java.util.List<com.google.android.flexbox.c> r3) {
            /*
                r1 = this;
                int r0 = r1.f47859d
                if (r0 < 0) goto L_0x0016
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x0016
                int r2 = r1.f47858c
                if (r2 < 0) goto L_0x0016
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.d.D(androidx.recyclerview.widget.RecyclerView$C, java.util.List):boolean");
        }

        static /* synthetic */ int c(d dVar, int i10) {
            int i11 = dVar.f47860e + i10;
            dVar.f47860e = i11;
            return i11;
        }

        static /* synthetic */ int d(d dVar, int i10) {
            int i11 = dVar.f47860e - i10;
            dVar.f47860e = i11;
            return i11;
        }

        static /* synthetic */ int i(d dVar, int i10) {
            int i11 = dVar.f47856a - i10;
            dVar.f47856a = i11;
            return i11;
        }

        static /* synthetic */ int l(d dVar) {
            int i10 = dVar.f47858c;
            dVar.f47858c = i10 + 1;
            return i10;
        }

        static /* synthetic */ int m(d dVar) {
            int i10 = dVar.f47858c;
            dVar.f47858c = i10 - 1;
            return i10;
        }

        static /* synthetic */ int n(d dVar, int i10) {
            int i11 = dVar.f47858c + i10;
            dVar.f47858c = i11;
            return i11;
        }

        static /* synthetic */ int q(d dVar, int i10) {
            int i11 = dVar.f47861f + i10;
            dVar.f47861f = i11;
            return i11;
        }

        static /* synthetic */ int u(d dVar, int i10) {
            int i11 = dVar.f47859d + i10;
            dVar.f47859d = i11;
            return i11;
        }

        static /* synthetic */ int v(d dVar, int i10) {
            int i11 = dVar.f47859d - i10;
            dVar.f47859d = i11;
            return i11;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f47856a + ", mFlexLinePosition=" + this.f47858c + ", mPosition=" + this.f47859d + ", mOffset=" + this.f47860e + ", mScrollingOffset=" + this.f47861f + ", mLastScrollDelta=" + this.f47862g + ", mItemDirection=" + this.f47863h + ", mLayoutDirection=" + this.f47864i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d F02 = RecyclerView.q.F0(context, attributeSet, i10, i11);
        int i12 = F02.f43850a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (F02.f43852c) {
                    f3(3);
                } else {
                    f3(2);
                }
            }
        } else if (F02.f43852c) {
            f3(1);
        } else {
            f3(0);
        }
        g3(1);
        e3(4);
        this.f47827O = context;
    }

    private void A2() {
        if (this.f47818F == null) {
            if (C()) {
                if (this.f47832t == 0) {
                    this.f47818F = t.a(this);
                    this.f47819G = t.c(this);
                    return;
                }
                this.f47818F = t.c(this);
                this.f47819G = t.a(this);
            } else if (this.f47832t == 0) {
                this.f47818F = t.c(this);
                this.f47819G = t.a(this);
            } else {
                this.f47818F = t.a(this);
                this.f47819G = t.c(this);
            }
        }
    }

    private int B2(RecyclerView.x xVar, RecyclerView.C c10, d dVar) {
        if (dVar.f47861f != Integer.MIN_VALUE) {
            if (dVar.f47856a < 0) {
                d.q(dVar, dVar.f47856a);
            }
            Y2(xVar, dVar);
        }
        int g10 = dVar.f47856a;
        int g11 = dVar.f47856a;
        boolean C10 = C();
        int i10 = 0;
        while (true) {
            if ((g11 > 0 || this.f47816D.f47857b) && dVar.D(c10, this.f47838z)) {
                c cVar = this.f47838z.get(dVar.f47858c);
                int unused = dVar.f47859d = cVar.f47882o;
                i10 += V2(cVar, dVar);
                if (C10 || !this.f47836x) {
                    d.c(dVar, cVar.a() * dVar.f47864i);
                } else {
                    d.d(dVar, cVar.a() * dVar.f47864i);
                }
                g11 -= cVar.a();
            }
        }
        d.i(dVar, i10);
        if (dVar.f47861f != Integer.MIN_VALUE) {
            d.q(dVar, i10);
            if (dVar.f47856a < 0) {
                d.q(dVar, dVar.f47856a);
            }
            Y2(xVar, dVar);
        }
        return g10 - dVar.f47856a;
    }

    private View C2(int i10) {
        int i11;
        View J22 = J2(0, l0(), i10);
        if (J22 == null || (i11 = this.f47813A.f47888c[E0(J22)]) == -1) {
            return null;
        }
        return D2(J22, this.f47838z.get(i11));
    }

    private View D2(View view, c cVar) {
        boolean C10 = C();
        int i10 = cVar.f47875h;
        for (int i11 = 1; i11 < i10; i11++) {
            View k02 = k0(i11);
            if (!(k02 == null || k02.getVisibility() == 8)) {
                if (!this.f47836x || C10) {
                    if (this.f47818F.g(view) <= this.f47818F.g(k02)) {
                    }
                } else if (this.f47818F.d(view) >= this.f47818F.d(k02)) {
                }
                view = k02;
            }
        }
        return view;
    }

    private View F2(int i10) {
        View J22 = J2(l0() - 1, -1, i10);
        if (J22 == null) {
            return null;
        }
        return G2(J22, this.f47838z.get(this.f47813A.f47888c[E0(J22)]));
    }

    private View G2(View view, c cVar) {
        boolean C10 = C();
        int l02 = (l0() - cVar.f47875h) - 1;
        for (int l03 = l0() - 2; l03 > l02; l03--) {
            View k02 = k0(l03);
            if (!(k02 == null || k02.getVisibility() == 8)) {
                if (!this.f47836x || C10) {
                    if (this.f47818F.d(view) >= this.f47818F.d(k02)) {
                    }
                } else if (this.f47818F.g(view) <= this.f47818F.g(k02)) {
                }
                view = k02;
            }
        }
        return view;
    }

    private View I2(int i10, int i11, boolean z10) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View k02 = k0(i10);
            if (U2(k02, z10)) {
                return k02;
            }
            i10 += i12;
        }
        return null;
    }

    private View J2(int i10, int i11, int i12) {
        int E02;
        A2();
        z2();
        int m10 = this.f47818F.m();
        int i13 = this.f47818F.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View k02 = k0(i10);
            if (k02 != null && (E02 = E0(k02)) >= 0 && E02 < i12) {
                if (((RecyclerView.r) k02.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = k02;
                    }
                } else if (this.f47818F.g(k02) >= m10 && this.f47818F.d(k02) <= i13) {
                    return k02;
                } else {
                    if (view == null) {
                        view = k02;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    private int K2(int i10, RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int i11;
        int i12;
        if (C() || !this.f47836x) {
            int i13 = this.f47818F.i() - i10;
            if (i13 <= 0) {
                return 0;
            }
            i11 = -S2(-i13, xVar, c10);
        } else {
            int m10 = i10 - this.f47818F.m();
            if (m10 <= 0) {
                return 0;
            }
            i11 = S2(m10, xVar, c10);
        }
        int i14 = i10 + i11;
        if (!z10 || (i12 = this.f47818F.i() - i14) <= 0) {
            return i11;
        }
        this.f47818F.r(i12);
        return i12 + i11;
    }

    private int L2(int i10, RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int i11;
        int m10;
        if (C() || !this.f47836x) {
            int m11 = i10 - this.f47818F.m();
            if (m11 <= 0) {
                return 0;
            }
            i11 = -S2(m11, xVar, c10);
        } else {
            int i12 = this.f47818F.i() - i10;
            if (i12 <= 0) {
                return 0;
            }
            i11 = S2(-i12, xVar, c10);
        }
        int i13 = i10 + i11;
        if (!z10 || (m10 = i13 - this.f47818F.m()) <= 0) {
            return i11;
        }
        this.f47818F.r(-m10);
        return i11 - m10;
    }

    private int M2(View view) {
        return q0(view) + ((RecyclerView.r) view.getLayoutParams()).bottomMargin;
    }

    private View N2() {
        return k0(0);
    }

    private int O2(View view) {
        return s0(view) - ((RecyclerView.r) view.getLayoutParams()).leftMargin;
    }

    private int P2(View view) {
        return v0(view) + ((RecyclerView.r) view.getLayoutParams()).rightMargin;
    }

    private int Q2(View view) {
        return w0(view) - ((RecyclerView.r) view.getLayoutParams()).topMargin;
    }

    private int S2(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (l0() == 0 || i10 == 0) {
            return 0;
        }
        A2();
        int i11 = 1;
        boolean unused = this.f47816D.f47865j = true;
        boolean z10 = !C() && this.f47836x;
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m3(i11, abs);
        int o10 = this.f47816D.f47861f + B2(xVar, c10, this.f47816D);
        if (o10 < 0) {
            return 0;
        }
        if (z10) {
            if (abs > o10) {
                i10 = (-i11) * o10;
            }
        } else if (abs > o10) {
            i10 = i11 * o10;
        }
        this.f47818F.r(-i10);
        int unused2 = this.f47816D.f47862g = i10;
        return i10;
    }

    private int T2(int i10) {
        int j10;
        if (l0() == 0 || i10 == 0) {
            return 0;
        }
        A2();
        boolean C10 = C();
        View view = this.f47828P;
        int width = C10 ? view.getWidth() : view.getHeight();
        int L02 = C10 ? L0() : y0();
        if (A0() == 1) {
            int abs = Math.abs(i10);
            if (i10 < 0) {
                j10 = Math.min((L02 + this.f47817E.f47842d) - width, abs);
            } else if (this.f47817E.f47842d + i10 <= 0) {
                return i10;
            } else {
                j10 = this.f47817E.f47842d;
            }
        } else if (i10 > 0) {
            return Math.min((L02 - this.f47817E.f47842d) - width, i10);
        } else {
            if (this.f47817E.f47842d + i10 >= 0) {
                return i10;
            }
            j10 = this.f47817E.f47842d;
        }
        return -j10;
    }

    private boolean U2(View view, boolean z10) {
        int t10 = t();
        int s10 = s();
        int L02 = L0() - o();
        int y02 = y0() - c();
        int O22 = O2(view);
        int Q22 = Q2(view);
        int P22 = P2(view);
        int M22 = M2(view);
        return z10 ? (t10 <= O22 && L02 >= P22) && (s10 <= Q22 && y02 >= M22) : (O22 >= L02 || P22 >= t10) && (Q22 >= y02 || M22 >= s10);
    }

    private static boolean V0(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    private int V2(c cVar, d dVar) {
        return C() ? W2(cVar, dVar) : X2(cVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int W2(com.google.android.flexbox.c r22, com.google.android.flexbox.FlexboxLayoutManager.d r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.t()
            int r2 = r21.o()
            int r3 = r21.L0()
            int r4 = r23.f47860e
            int r5 = r23.f47864i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.f47874g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.f47859d
            int r4 = r0.f47833u
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00ae
            if (r4 == r11) goto L_0x00a0
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x008f
            r6 = 3
            if (r4 == r6) goto L_0x007c
            r6 = 4
            if (r4 == r6) goto L_0x0067
            r6 = 5
            if (r4 != r6) goto L_0x004e
            int r4 = r8.f47875h
            if (r4 == 0) goto L_0x0046
            int r6 = r8.f47872e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b2
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f47833u
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0067:
            int r4 = r8.f47875h
            if (r4 == 0) goto L_0x0073
            int r6 = r8.f47872e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0074
        L_0x0073:
            r6 = r5
        L_0x0074:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b2
        L_0x007c:
            float r1 = (float) r1
            int r4 = r8.f47875h
            if (r4 == r11) goto L_0x0084
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0086
        L_0x0084:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0086:
            int r6 = r8.f47872e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b2
        L_0x008f:
            float r1 = (float) r1
            int r4 = r8.f47872e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
        L_0x009e:
            r6 = r5
            goto L_0x00b2
        L_0x00a0:
            int r4 = r8.f47872e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b2
        L_0x00ae:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x009e
        L_0x00b2:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f47817E
            int r3 = r3.f47842d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f47817E
            int r3 = r3.f47842d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r6, r5)
            int r13 = r22.b()
            r3 = 0
            r14 = r10
        L_0x00cc:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x019a
            android.view.View r15 = r0.R2(r14)
            if (r15 != 0) goto L_0x00d8
            goto L_0x0195
        L_0x00d8:
            int r4 = r23.f47864i
            if (r4 != r11) goto L_0x00e9
            android.graphics.Rect r4 = f47812S
            r0.L(r15, r4)
            r0.F(r15)
        L_0x00e6:
            r16 = r3
            goto L_0x00f4
        L_0x00e9:
            android.graphics.Rect r4 = f47812S
            r0.L(r15, r4)
            r0.G(r15, r3)
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00f4:
            com.google.android.flexbox.d r3 = r0.f47813A
            long[] r4 = r3.f47889d
            r5 = r4[r14]
            int r3 = r3.r(r5)
            com.google.android.flexbox.d r4 = r0.f47813A
            int r4 = r4.q(r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$c r7 = (com.google.android.flexbox.FlexboxLayoutManager.c) r7
            boolean r5 = r0.f2(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x0114
            r15.measure(r3, r4)
        L_0x0114:
            int r3 = r7.leftMargin
            int r4 = r0.B0(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.G0(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.J0(r15)
            int r5 = r9 + r1
            boolean r1 = r0.f47836x
            if (r1 == 0) goto L_0x0152
            com.google.android.flexbox.d r1 = r0.f47813A
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            r1.I(r2, r3, r4, r5, r6, r7)
            goto L_0x016f
        L_0x0152:
            r11 = r7
            com.google.android.flexbox.d r1 = r0.f47813A
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
            r1.I(r2, r3, r4, r5, r6, r7)
        L_0x016f:
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.G0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.B0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x0195:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00cc
        L_0x019a:
            com.google.android.flexbox.FlexboxLayoutManager$d r1 = r0.f47816D
            int r1 = r1.f47864i
            r2 = r23
            com.google.android.flexbox.FlexboxLayoutManager.d.n(r2, r1)
            int r1 = r22.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.W2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int X2(com.google.android.flexbox.c r26, com.google.android.flexbox.FlexboxLayoutManager.d r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.s()
            int r2 = r25.c()
            int r3 = r25.y0()
            int r4 = r27.f47860e
            int r5 = r27.f47860e
            int r6 = r27.f47864i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.f47874g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.f47859d
            int r4 = r0.f47833u
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b4
            if (r4 == r13) goto L_0x00a6
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0095
            r6 = 3
            if (r4 == r6) goto L_0x0082
            r6 = 4
            if (r4 == r6) goto L_0x006d
            r6 = 5
            if (r4 != r6) goto L_0x0054
            int r4 = r9.f47875h
            if (r4 == 0) goto L_0x004c
            int r6 = r9.f47872e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x004d
        L_0x004c:
            r6 = r5
        L_0x004d:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b8
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f47833u
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            int r4 = r9.f47875h
            if (r4 == 0) goto L_0x0079
            int r6 = r9.f47872e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x007a
        L_0x0079:
            r6 = r5
        L_0x007a:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b8
        L_0x0082:
            float r1 = (float) r1
            int r4 = r9.f47875h
            if (r4 == r13) goto L_0x008a
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008c
        L_0x008a:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008c:
            int r6 = r9.f47872e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b8
        L_0x0095:
            float r1 = (float) r1
            int r4 = r9.f47872e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
        L_0x00a4:
            r6 = r5
            goto L_0x00b8
        L_0x00a6:
            int r4 = r9.f47872e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b8
        L_0x00b4:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00a4
        L_0x00b8:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f47817E
            int r3 = r3.f47842d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f47817E
            int r3 = r3.f47842d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r6, r5)
            int r15 = r26.b()
            r3 = 0
            r8 = r12
        L_0x00d2:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x0210
            android.view.View r7 = r0.R2(r8)
            if (r7 != 0) goto L_0x00e4
            r23 = r8
            r22 = r13
            r17 = r14
            goto L_0x0208
        L_0x00e4:
            com.google.android.flexbox.d r4 = r0.f47813A
            long[] r5 = r4.f47889d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.r(r13)
            com.google.android.flexbox.d r5 = r0.f47813A
            int r5 = r5.q(r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$c r13 = (com.google.android.flexbox.FlexboxLayoutManager.c) r13
            boolean r6 = r0.f2(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0106
            r7.measure(r4, r5)
        L_0x0106:
            int r4 = r13.topMargin
            int r5 = r0.J0(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.j0(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.f47864i
            r6 = 1
            if (r1 != r6) goto L_0x012c
            android.graphics.Rect r1 = f47812S
            r0.L(r7, r1)
            r0.F(r7)
        L_0x0129:
            r16 = r3
            goto L_0x0137
        L_0x012c:
            android.graphics.Rect r1 = f47812S
            r0.L(r7, r1)
            r0.G(r7, r3)
            int r3 = r3 + 1
            goto L_0x0129
        L_0x0137:
            int r1 = r0.B0(r7)
            int r5 = r10 + r1
            int r1 = r0.G0(r7)
            int r19 = r11 - r1
            boolean r4 = r0.f47836x
            if (r4 == 0) goto L_0x019b
            boolean r1 = r0.f47837y
            if (r1 == 0) goto L_0x0175
            com.google.android.flexbox.d r1 = r0.f47813A
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = r6
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            r1.J(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e0
        L_0x0175:
            r22 = r6
            r20 = r7
            r23 = r8
            com.google.android.flexbox.d r1 = r0.f47813A
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            r1.J(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e0
        L_0x019b:
            r22 = r6
            r20 = r7
            r23 = r8
            boolean r1 = r0.f47837y
            if (r1 == 0) goto L_0x01c3
            com.google.android.flexbox.d r1 = r0.f47813A
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            r2 = r20
            r3 = r26
            r1.J(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e0
        L_0x01c3:
            com.google.android.flexbox.d r1 = r0.f47813A
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r1.J(r2, r3, r4, r5, r6, r7, r8)
        L_0x01e0:
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.j0(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.J0(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x0208:
            int r8 = r23 + 1
            r14 = r17
            r13 = r22
            goto L_0x00d2
        L_0x0210:
            com.google.android.flexbox.FlexboxLayoutManager$d r1 = r0.f47816D
            int r1 = r1.f47864i
            r2 = r27
            com.google.android.flexbox.FlexboxLayoutManager.d.n(r2, r1)
            int r1 = r26.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.X2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    private void Y2(RecyclerView.x xVar, d dVar) {
        if (dVar.f47865j) {
            if (dVar.f47864i == -1) {
                a3(xVar, dVar);
            } else {
                b3(xVar, dVar);
            }
        }
    }

    private void Z2(RecyclerView.x xVar, int i10, int i11) {
        while (i11 >= i10) {
            N1(i11, xVar);
            i11--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a3(androidx.recyclerview.widget.RecyclerView.x r8, com.google.android.flexbox.FlexboxLayoutManager.d r9) {
        /*
            r7 = this;
            int r0 = r9.f47861f
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.l0()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r1 = r0 + -1
            android.view.View r2 = r7.k0(r1)
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            com.google.android.flexbox.d r3 = r7.f47813A
            int[] r3 = r3.f47888c
            int r2 = r7.E0(r2)
            r2 = r3[r2]
            r3 = -1
            if (r2 != r3) goto L_0x0025
            return
        L_0x0025:
            java.util.List<com.google.android.flexbox.c> r3 = r7.f47838z
            java.lang.Object r3 = r3.get(r2)
            com.google.android.flexbox.c r3 = (com.google.android.flexbox.c) r3
            r4 = r1
        L_0x002e:
            if (r4 < 0) goto L_0x005f
            android.view.View r5 = r7.k0(r4)
            if (r5 != 0) goto L_0x0037
            goto L_0x005c
        L_0x0037:
            int r6 = r9.f47861f
            boolean r6 = r7.t2(r5, r6)
            if (r6 == 0) goto L_0x005f
            int r6 = r3.f47882o
            int r5 = r7.E0(r5)
            if (r6 != r5) goto L_0x005c
            if (r2 > 0) goto L_0x004d
            r0 = r4
            goto L_0x005f
        L_0x004d:
            int r0 = r9.f47864i
            int r2 = r2 + r0
            java.util.List<com.google.android.flexbox.c> r0 = r7.f47838z
            java.lang.Object r0 = r0.get(r2)
            com.google.android.flexbox.c r0 = (com.google.android.flexbox.c) r0
            r3 = r0
            r0 = r4
        L_0x005c:
            int r4 = r4 + -1
            goto L_0x002e
        L_0x005f:
            r7.Z2(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.a3(androidx.recyclerview.widget.RecyclerView$x, com.google.android.flexbox.FlexboxLayoutManager$d):void");
    }

    private void b3(RecyclerView.x xVar, d dVar) {
        int l02;
        View k02;
        if (dVar.f47861f >= 0 && (l02 = l0()) != 0 && (k02 = k0(0)) != null) {
            int i10 = this.f47813A.f47888c[E0(k02)];
            int i11 = -1;
            if (i10 != -1) {
                c cVar = this.f47838z.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= l02) {
                        break;
                    }
                    View k03 = k0(i12);
                    if (k03 != null) {
                        if (!u2(k03, dVar.f47861f)) {
                            break;
                        } else if (cVar.f47883p != E0(k03)) {
                            continue;
                        } else if (i10 >= this.f47838z.size() - 1) {
                            i11 = i12;
                            break;
                        } else {
                            i10 += dVar.f47864i;
                            cVar = this.f47838z.get(i10);
                            i11 = i12;
                        }
                    }
                    i12++;
                }
                Z2(xVar, 0, i11);
            }
        }
    }

    private void c3() {
        int z02 = C() ? z0() : M0();
        boolean unused = this.f47816D.f47857b = z02 == 0 || z02 == Integer.MIN_VALUE;
    }

    private void d3() {
        int A02 = A0();
        int i10 = this.f47831s;
        boolean z10 = false;
        if (i10 == 0) {
            this.f47836x = A02 == 1;
            if (this.f47832t == 2) {
                z10 = true;
            }
            this.f47837y = z10;
        } else if (i10 == 1) {
            this.f47836x = A02 != 1;
            if (this.f47832t == 2) {
                z10 = true;
            }
            this.f47837y = z10;
        } else if (i10 == 2) {
            boolean z11 = A02 == 1;
            this.f47836x = z11;
            if (this.f47832t == 2) {
                this.f47836x = !z11;
            }
            this.f47837y = false;
        } else if (i10 != 3) {
            this.f47836x = false;
            this.f47837y = false;
        } else {
            if (A02 == 1) {
                z10 = true;
            }
            this.f47836x = z10;
            if (this.f47832t == 2) {
                this.f47836x = !z10;
            }
            this.f47837y = true;
        }
    }

    private boolean f2(View view, int i10, int i11, RecyclerView.r rVar) {
        return view.isLayoutRequested() || !U0() || !V0(view.getWidth(), i10, rVar.width) || !V0(view.getHeight(), i11, rVar.height);
    }

    private boolean h3(RecyclerView.C c10, b bVar) {
        if (l0() == 0) {
            return false;
        }
        View F22 = bVar.f47843e ? F2(c10.b()) : C2(c10.b());
        if (F22 == null) {
            return false;
        }
        bVar.s(F22);
        if (c10.e() || !l2()) {
            return true;
        }
        if (this.f47818F.g(F22) < this.f47818F.i() && this.f47818F.d(F22) >= this.f47818F.m()) {
            return true;
        }
        int unused = bVar.f47841c = bVar.f47843e ? this.f47818F.i() : this.f47818F.m();
        return true;
    }

    private boolean i3(RecyclerView.C c10, b bVar, e eVar) {
        int i10;
        View k02;
        boolean z10 = false;
        if (!c10.e() && (i10 = this.f47821I) != -1) {
            if (i10 < 0 || i10 >= c10.b()) {
                this.f47821I = -1;
                this.f47822J = Integer.MIN_VALUE;
            } else {
                int unused = bVar.f47839a = this.f47821I;
                int unused2 = bVar.f47840b = this.f47813A.f47888c[bVar.f47839a];
                e eVar2 = this.f47820H;
                if (eVar2 != null && eVar2.g(c10.b())) {
                    int unused3 = bVar.f47841c = this.f47818F.m() + eVar.f47867b;
                    boolean unused4 = bVar.f47845g = true;
                    int unused5 = bVar.f47840b = -1;
                    return true;
                } else if (this.f47822J == Integer.MIN_VALUE) {
                    View e02 = e0(this.f47821I);
                    if (e02 == null) {
                        if (l0() > 0 && (k02 = k0(0)) != null) {
                            if (this.f47821I < E0(k02)) {
                                z10 = true;
                            }
                            boolean unused6 = bVar.f47843e = z10;
                        }
                        bVar.r();
                    } else if (this.f47818F.e(e02) > this.f47818F.n()) {
                        bVar.r();
                        return true;
                    } else if (this.f47818F.g(e02) - this.f47818F.m() < 0) {
                        int unused7 = bVar.f47841c = this.f47818F.m();
                        boolean unused8 = bVar.f47843e = false;
                        return true;
                    } else if (this.f47818F.i() - this.f47818F.d(e02) < 0) {
                        int unused9 = bVar.f47841c = this.f47818F.i();
                        boolean unused10 = bVar.f47843e = true;
                        return true;
                    } else {
                        int unused11 = bVar.f47841c = bVar.f47843e ? this.f47818F.d(e02) + this.f47818F.o() : this.f47818F.g(e02);
                    }
                    return true;
                } else {
                    if (C() || !this.f47836x) {
                        int unused12 = bVar.f47841c = this.f47818F.m() + this.f47822J;
                    } else {
                        int unused13 = bVar.f47841c = this.f47822J - this.f47818F.j();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void j3(RecyclerView.C c10, b bVar) {
        if (!i3(c10, bVar, this.f47820H) && !h3(c10, bVar)) {
            bVar.r();
            int unused = bVar.f47839a = 0;
            int unused2 = bVar.f47840b = 0;
        }
    }

    private void k3(int i10) {
        if (i10 < H2()) {
            int l02 = l0();
            this.f47813A.m(l02);
            this.f47813A.n(l02);
            this.f47813A.l(l02);
            if (i10 < this.f47813A.f47888c.length) {
                this.f47829Q = i10;
                View N22 = N2();
                if (N22 != null) {
                    this.f47821I = E0(N22);
                    if (C() || !this.f47836x) {
                        this.f47822J = this.f47818F.g(N22) - this.f47818F.m();
                    } else {
                        this.f47822J = this.f47818F.d(N22) + this.f47818F.j();
                    }
                }
            }
        }
    }

    private void l3(int i10) {
        int g10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L0(), M0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(y0(), z0());
        int L02 = L0();
        int y02 = y0();
        boolean z10 = false;
        if (C()) {
            int i11 = this.f47823K;
            if (!(i11 == Integer.MIN_VALUE || i11 == L02)) {
                z10 = true;
            }
            g10 = this.f47816D.f47857b ? this.f47827O.getResources().getDisplayMetrics().heightPixels : this.f47816D.f47856a;
        } else {
            int i12 = this.f47824L;
            if (!(i12 == Integer.MIN_VALUE || i12 == y02)) {
                z10 = true;
            }
            g10 = this.f47816D.f47857b ? this.f47827O.getResources().getDisplayMetrics().widthPixels : this.f47816D.f47856a;
        }
        int i13 = g10;
        this.f47823K = L02;
        this.f47824L = y02;
        int i14 = this.f47829Q;
        if (i14 != -1 || (this.f47821I == -1 && !z10)) {
            int min = i14 != -1 ? Math.min(i14, this.f47817E.f47839a) : this.f47817E.f47839a;
            this.f47830R.a();
            if (C()) {
                if (this.f47838z.size() > 0) {
                    this.f47813A.h(this.f47838z, min);
                    this.f47813A.b(this.f47830R, makeMeasureSpec, makeMeasureSpec2, i13, min, this.f47817E.f47839a, this.f47838z);
                } else {
                    this.f47813A.l(i10);
                    this.f47813A.c(this.f47830R, makeMeasureSpec, makeMeasureSpec2, i13, 0, this.f47838z);
                }
            } else if (this.f47838z.size() > 0) {
                this.f47813A.h(this.f47838z, min);
                this.f47813A.b(this.f47830R, makeMeasureSpec2, makeMeasureSpec, i13, min, this.f47817E.f47839a, this.f47838z);
            } else {
                this.f47813A.l(i10);
                this.f47813A.e(this.f47830R, makeMeasureSpec, makeMeasureSpec2, i13, 0, this.f47838z);
            }
            this.f47838z = this.f47830R.f47891a;
            this.f47813A.j(makeMeasureSpec, makeMeasureSpec2, min);
            this.f47813A.P(min);
        } else if (!this.f47817E.f47843e) {
            this.f47838z.clear();
            this.f47830R.a();
            if (C()) {
                this.f47813A.d(this.f47830R, makeMeasureSpec, makeMeasureSpec2, i13, this.f47817E.f47839a, this.f47838z);
            } else {
                this.f47813A.f(this.f47830R, makeMeasureSpec, makeMeasureSpec2, i13, this.f47817E.f47839a, this.f47838z);
            }
            this.f47838z = this.f47830R.f47891a;
            this.f47813A.i(makeMeasureSpec, makeMeasureSpec2);
            this.f47813A.O();
            b bVar = this.f47817E;
            int unused = bVar.f47840b = this.f47813A.f47888c[bVar.f47839a];
            int unused2 = this.f47816D.f47858c = this.f47817E.f47840b;
        }
    }

    private void m3(int i10, int i11) {
        int unused = this.f47816D.f47864i = i10;
        boolean C10 = C();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L0(), M0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(y0(), z0());
        boolean z10 = !C10 && this.f47836x;
        if (i10 == 1) {
            View k02 = k0(l0() - 1);
            if (k02 != null) {
                int unused2 = this.f47816D.f47860e = this.f47818F.d(k02);
                int E02 = E0(k02);
                View G22 = G2(k02, this.f47838z.get(this.f47813A.f47888c[E02]));
                int unused3 = this.f47816D.f47863h = 1;
                d dVar = this.f47816D;
                int unused4 = dVar.f47859d = E02 + dVar.f47863h;
                if (this.f47813A.f47888c.length <= this.f47816D.f47859d) {
                    int unused5 = this.f47816D.f47858c = -1;
                } else {
                    d dVar2 = this.f47816D;
                    int unused6 = dVar2.f47858c = this.f47813A.f47888c[dVar2.f47859d];
                }
                if (z10) {
                    int unused7 = this.f47816D.f47860e = this.f47818F.g(G22);
                    int unused8 = this.f47816D.f47861f = (-this.f47818F.g(G22)) + this.f47818F.m();
                    d dVar3 = this.f47816D;
                    int unused9 = dVar3.f47861f = Math.max(dVar3.f47861f, 0);
                } else {
                    int unused10 = this.f47816D.f47860e = this.f47818F.d(G22);
                    int unused11 = this.f47816D.f47861f = this.f47818F.d(G22) - this.f47818F.i();
                }
                if ((this.f47816D.f47858c == -1 || this.f47816D.f47858c > this.f47838z.size() - 1) && this.f47816D.f47859d <= g()) {
                    int o10 = i11 - this.f47816D.f47861f;
                    this.f47830R.a();
                    if (o10 > 0) {
                        if (C10) {
                            this.f47813A.c(this.f47830R, makeMeasureSpec, makeMeasureSpec2, o10, this.f47816D.f47859d, this.f47838z);
                        } else {
                            this.f47813A.e(this.f47830R, makeMeasureSpec, makeMeasureSpec2, o10, this.f47816D.f47859d, this.f47838z);
                        }
                        this.f47813A.j(makeMeasureSpec, makeMeasureSpec2, this.f47816D.f47859d);
                        this.f47813A.P(this.f47816D.f47859d);
                    }
                }
            } else {
                return;
            }
        } else {
            View k03 = k0(0);
            if (k03 != null) {
                int unused12 = this.f47816D.f47860e = this.f47818F.g(k03);
                int E03 = E0(k03);
                View D22 = D2(k03, this.f47838z.get(this.f47813A.f47888c[E03]));
                int unused13 = this.f47816D.f47863h = 1;
                int i12 = this.f47813A.f47888c[E03];
                if (i12 == -1) {
                    i12 = 0;
                }
                if (i12 > 0) {
                    int unused14 = this.f47816D.f47859d = E03 - this.f47838z.get(i12 - 1).b();
                } else {
                    int unused15 = this.f47816D.f47859d = -1;
                }
                int unused16 = this.f47816D.f47858c = i12 > 0 ? i12 - 1 : 0;
                if (z10) {
                    int unused17 = this.f47816D.f47860e = this.f47818F.d(D22);
                    int unused18 = this.f47816D.f47861f = this.f47818F.d(D22) - this.f47818F.i();
                    d dVar4 = this.f47816D;
                    int unused19 = dVar4.f47861f = Math.max(dVar4.f47861f, 0);
                } else {
                    int unused20 = this.f47816D.f47860e = this.f47818F.g(D22);
                    int unused21 = this.f47816D.f47861f = (-this.f47818F.g(D22)) + this.f47818F.m();
                }
            } else {
                return;
            }
        }
        d dVar5 = this.f47816D;
        int unused22 = dVar5.f47856a = i11 - dVar5.f47861f;
    }

    private void n3(b bVar, boolean z10, boolean z11) {
        if (z11) {
            c3();
        } else {
            boolean unused = this.f47816D.f47857b = false;
        }
        if (C() || !this.f47836x) {
            int unused2 = this.f47816D.f47856a = this.f47818F.i() - bVar.f47841c;
        } else {
            int unused3 = this.f47816D.f47856a = bVar.f47841c - o();
        }
        int unused4 = this.f47816D.f47859d = bVar.f47839a;
        int unused5 = this.f47816D.f47863h = 1;
        int unused6 = this.f47816D.f47864i = 1;
        int unused7 = this.f47816D.f47860e = bVar.f47841c;
        int unused8 = this.f47816D.f47861f = Integer.MIN_VALUE;
        int unused9 = this.f47816D.f47858c = bVar.f47840b;
        if (z10 && this.f47838z.size() > 1 && bVar.f47840b >= 0 && bVar.f47840b < this.f47838z.size() - 1) {
            d.l(this.f47816D);
            d.u(this.f47816D, this.f47838z.get(bVar.f47840b).b());
        }
    }

    private void o3(b bVar, boolean z10, boolean z11) {
        if (z11) {
            c3();
        } else {
            boolean unused = this.f47816D.f47857b = false;
        }
        if (C() || !this.f47836x) {
            int unused2 = this.f47816D.f47856a = bVar.f47841c - this.f47818F.m();
        } else {
            int unused3 = this.f47816D.f47856a = (this.f47828P.getWidth() - bVar.f47841c) - this.f47818F.m();
        }
        int unused4 = this.f47816D.f47859d = bVar.f47839a;
        int unused5 = this.f47816D.f47863h = 1;
        int unused6 = this.f47816D.f47864i = -1;
        int unused7 = this.f47816D.f47860e = bVar.f47841c;
        int unused8 = this.f47816D.f47861f = Integer.MIN_VALUE;
        int unused9 = this.f47816D.f47858c = bVar.f47840b;
        if (z10 && bVar.f47840b > 0 && this.f47838z.size() > bVar.f47840b) {
            d.m(this.f47816D);
            d.v(this.f47816D, this.f47838z.get(bVar.f47840b).b());
        }
    }

    private boolean t2(View view, int i10) {
        return (C() || !this.f47836x) ? this.f47818F.g(view) >= this.f47818F.h() - i10 : this.f47818F.d(view) <= i10;
    }

    private boolean u2(View view, int i10) {
        return (C() || !this.f47836x) ? this.f47818F.d(view) <= i10 : this.f47818F.h() - this.f47818F.g(view) <= i10;
    }

    private void v2() {
        this.f47838z.clear();
        this.f47817E.t();
        int unused = this.f47817E.f47842d = 0;
    }

    private int w2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        int b10 = c10.b();
        A2();
        View C22 = C2(b10);
        View F22 = F2(b10);
        if (c10.b() == 0 || C22 == null || F22 == null) {
            return 0;
        }
        return Math.min(this.f47818F.n(), this.f47818F.d(F22) - this.f47818F.g(C22));
    }

    private int x2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        int b10 = c10.b();
        View C22 = C2(b10);
        View F22 = F2(b10);
        if (!(c10.b() == 0 || C22 == null || F22 == null)) {
            int E02 = E0(C22);
            int E03 = E0(F22);
            int abs = Math.abs(this.f47818F.d(F22) - this.f47818F.g(C22));
            int[] iArr = this.f47813A.f47888c;
            int i10 = iArr[E02];
            if (!(i10 == 0 || i10 == -1)) {
                return Math.round((((float) i10) * (((float) abs) / ((float) ((iArr[E03] - i10) + 1)))) + ((float) (this.f47818F.m() - this.f47818F.g(C22))));
            }
        }
        return 0;
    }

    private int y2(RecyclerView.C c10) {
        if (l0() == 0) {
            return 0;
        }
        int b10 = c10.b();
        View C22 = C2(b10);
        View F22 = F2(b10);
        if (c10.b() == 0 || C22 == null || F22 == null) {
            return 0;
        }
        int E22 = E2();
        return (int) ((((float) Math.abs(this.f47818F.d(F22) - this.f47818F.g(C22))) / ((float) ((H2() - E22) + 1))) * ((float) c10.b()));
    }

    private void z2() {
        if (this.f47816D == null) {
            this.f47816D = new d();
        }
    }

    public int A(View view, int i10, int i11) {
        int J02;
        int j02;
        if (C()) {
            J02 = B0(view);
            j02 = G0(view);
        } else {
            J02 = J0(view);
            j02 = j0(view);
        }
        return J02 + j02;
    }

    public void B1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f47820H = (e) parcelable;
            T1();
        }
    }

    public boolean C() {
        int i10 = this.f47831s;
        return i10 == 0 || i10 == 1;
    }

    public Parcelable C1() {
        if (this.f47820H != null) {
            return new e(this.f47820H);
        }
        e eVar = new e();
        if (l0() > 0) {
            View N22 = N2();
            int unused = eVar.f47866a = E0(N22);
            int unused2 = eVar.f47867b = this.f47818F.g(N22) - this.f47818F.m();
        } else {
            eVar.h();
        }
        return eVar;
    }

    public int E2() {
        View I22 = I2(0, l0(), false);
        if (I22 == null) {
            return -1;
        }
        return E0(I22);
    }

    public int H2() {
        View I22 = I2(l0() - 1, -1, false);
        if (I22 == null) {
            return -1;
        }
        return E0(I22);
    }

    public boolean M() {
        if (this.f47832t == 0) {
            return C();
        }
        if (C()) {
            int L02 = L0();
            View view = this.f47828P;
            return L02 > (view != null ? view.getWidth() : 0);
        }
    }

    public boolean N() {
        if (this.f47832t == 0) {
            return !C();
        }
        if (C()) {
            return true;
        }
        int y02 = y0();
        View view = this.f47828P;
        return y02 > (view != null ? view.getHeight() : 0);
    }

    public boolean O(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public boolean P0() {
        return true;
    }

    public View R2(int i10) {
        View view = this.f47826N.get(i10);
        return view != null ? view : this.f47814B.o(i10);
    }

    public int S(RecyclerView.C c10) {
        return w2(c10);
    }

    public int T(RecyclerView.C c10) {
        return x2(c10);
    }

    public int U(RecyclerView.C c10) {
        return y2(c10);
    }

    public int V(RecyclerView.C c10) {
        return w2(c10);
    }

    public int W(RecyclerView.C c10) {
        return x2(c10);
    }

    public int W1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (!C() || this.f47832t == 0) {
            int S22 = S2(i10, xVar, c10);
            this.f47826N.clear();
            return S22;
        }
        int T22 = T2(i10);
        b.l(this.f47817E, T22);
        this.f47819G.r(-T22);
        return T22;
    }

    public int X(RecyclerView.C c10) {
        return y2(c10);
    }

    public void X1(int i10) {
        this.f47821I = i10;
        this.f47822J = Integer.MIN_VALUE;
        e eVar = this.f47820H;
        if (eVar != null) {
            eVar.h();
        }
        T1();
    }

    public int Y1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (C() || (this.f47832t == 0 && !C())) {
            int S22 = S2(i10, xVar, c10);
            this.f47826N.clear();
            return S22;
        }
        int T22 = T2(i10);
        b.l(this.f47817E, T22);
        this.f47819G.r(-T22);
        return T22;
    }

    public void d1(RecyclerView.h hVar, RecyclerView.h hVar2) {
        J1();
    }

    public void e3(int i10) {
        int i11 = this.f47834v;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                J1();
                v2();
            }
            this.f47834v = i10;
            T1();
        }
    }

    public RecyclerView.r f0() {
        return new c(-2, -2);
    }

    public void f1(RecyclerView recyclerView) {
        super.f1(recyclerView);
        this.f47828P = (View) recyclerView.getParent();
    }

    public void f3(int i10) {
        if (this.f47831s != i10) {
            J1();
            this.f47831s = i10;
            this.f47818F = null;
            this.f47819G = null;
            v2();
            T1();
        }
    }

    public int g() {
        return this.f47815C.b();
    }

    public RecyclerView.r g0(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void g3(int i10) {
        if (i10 != 2) {
            int i11 = this.f47832t;
            if (i11 != i10) {
                if (i11 == 0 || i10 == 0) {
                    J1();
                    v2();
                }
                this.f47832t = i10;
                this.f47818F = null;
                this.f47819G = null;
                T1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public PointF h(int i10) {
        View k02;
        if (l0() == 0 || (k02 = k0(0)) == null) {
            return null;
        }
        int i11 = i10 < E0(k02) ? -1 : 1;
        return C() ? new PointF(0.0f, (float) i11) : new PointF((float) i11, 0.0f);
    }

    public void h1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.h1(recyclerView, xVar);
        if (this.f47825M) {
            K1(xVar);
            xVar.c();
        }
    }

    public void i(View view, int i10, int i11, c cVar) {
        L(view, f47812S);
        if (C()) {
            int B02 = B0(view) + G0(view);
            cVar.f47872e += B02;
            cVar.f47873f += B02;
            return;
        }
        int J02 = J0(view) + j0(view);
        cVar.f47872e += J02;
        cVar.f47873f += J02;
    }

    public void i2(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i10);
        j2(pVar);
    }

    public int j() {
        return this.f47831s;
    }

    public int k() {
        return this.f47835w;
    }

    public int l() {
        if (this.f47838z.size() == 0) {
            return 0;
        }
        int size = this.f47838z.size();
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.f47838z.get(i11).f47872e);
        }
        return i10;
    }

    public int m(int i10, int i11, int i12) {
        return RecyclerView.q.m0(L0(), M0(), i11, i12, M());
    }

    public List<c> q() {
        return this.f47838z;
    }

    public void q1(RecyclerView recyclerView, int i10, int i11) {
        super.q1(recyclerView, i10, i11);
        k3(i10);
    }

    public int r(int i10, int i11, int i12) {
        return RecyclerView.q.m0(y0(), z0(), i11, i12, N());
    }

    public void s1(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.s1(recyclerView, i10, i11, i12);
        k3(Math.min(i10, i11));
    }

    public void t1(RecyclerView recyclerView, int i10, int i11) {
        super.t1(recyclerView, i10, i11);
        k3(i10);
    }

    public int u(View view) {
        int B02;
        int G02;
        if (C()) {
            B02 = J0(view);
            G02 = j0(view);
        } else {
            B02 = B0(view);
            G02 = G0(view);
        }
        return B02 + G02;
    }

    public void u1(RecyclerView recyclerView, int i10, int i11) {
        super.u1(recyclerView, i10, i11);
        k3(i10);
    }

    public int v() {
        return this.f47832t;
    }

    public void v1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.v1(recyclerView, i10, i11, obj);
        k3(i10);
    }

    public void w(c cVar) {
    }

    public void w1(RecyclerView.x xVar, RecyclerView.C c10) {
        int i10;
        int i11;
        this.f47814B = xVar;
        this.f47815C = c10;
        int b10 = c10.b();
        if (b10 != 0 || !c10.e()) {
            d3();
            A2();
            z2();
            this.f47813A.m(b10);
            this.f47813A.n(b10);
            this.f47813A.l(b10);
            boolean unused = this.f47816D.f47865j = false;
            e eVar = this.f47820H;
            if (eVar != null && eVar.g(b10)) {
                this.f47821I = this.f47820H.f47866a;
            }
            if (!(this.f47817E.f47844f && this.f47821I == -1 && this.f47820H == null)) {
                this.f47817E.t();
                j3(c10, this.f47817E);
                boolean unused2 = this.f47817E.f47844f = true;
            }
            Y(xVar);
            if (this.f47817E.f47843e) {
                o3(this.f47817E, false, true);
            } else {
                n3(this.f47817E, false, true);
            }
            l3(b10);
            B2(xVar, c10, this.f47816D);
            if (this.f47817E.f47843e) {
                i11 = this.f47816D.f47860e;
                n3(this.f47817E, true, false);
                B2(xVar, c10, this.f47816D);
                i10 = this.f47816D.f47860e;
            } else {
                i10 = this.f47816D.f47860e;
                o3(this.f47817E, true, false);
                B2(xVar, c10, this.f47816D);
                i11 = this.f47816D.f47860e;
            }
            if (l0() <= 0) {
                return;
            }
            if (this.f47817E.f47843e) {
                L2(i11 + K2(i10, xVar, c10, true), xVar, c10, false);
            } else {
                K2(i10 + L2(i11, xVar, c10, true), xVar, c10, false);
            }
        }
    }

    public View x(int i10) {
        return R2(i10);
    }

    public void x1(RecyclerView.C c10) {
        super.x1(c10);
        this.f47820H = null;
        this.f47821I = -1;
        this.f47822J = Integer.MIN_VALUE;
        this.f47829Q = -1;
        this.f47817E.t();
        this.f47826N.clear();
    }

    public int y() {
        return this.f47834v;
    }

    public void z(int i10, View view) {
        this.f47826N.put(i10, view);
    }

    private static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f47866a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f47867b;

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

        /* access modifiers changed from: private */
        public boolean g(int i10) {
            int i11 = this.f47866a;
            return i11 >= 0 && i11 < i10;
        }

        /* access modifiers changed from: private */
        public void h() {
            this.f47866a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f47866a + ", mAnchorOffset=" + this.f47867b + '}';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f47866a);
            parcel.writeInt(this.f47867b);
        }

        e() {
        }

        private e(Parcel parcel) {
            this.f47866a = parcel.readInt();
            this.f47867b = parcel.readInt();
        }

        private e(e eVar) {
            this.f47866a = eVar.f47866a;
            this.f47867b = eVar.f47867b;
        }
    }

    public static class c extends RecyclerView.r implements b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private float f47847e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f47848f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private int f47849g = -1;

        /* renamed from: h  reason: collision with root package name */
        private float f47850h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f47851i;

        /* renamed from: j  reason: collision with root package name */
        private int f47852j;

        /* renamed from: k  reason: collision with root package name */
        private int f47853k = 16777215;

        /* renamed from: l  reason: collision with root package name */
        private int f47854l = 16777215;

        /* renamed from: m  reason: collision with root package name */
        private boolean f47855m;

        class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int I0() {
            return this.topMargin;
        }

        public void O0(int i10) {
            this.f47852j = i10;
        }

        public float Q0() {
            return this.f47847e;
        }

        public int V2() {
            return this.rightMargin;
        }

        public int X2() {
            return this.f47852j;
        }

        public float Y0() {
            return this.f47850h;
        }

        public int describeContents() {
            return 0;
        }

        public int g3() {
            return this.f47854l;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public int h0() {
            return this.f47849g;
        }

        public float i0() {
            return this.f47848f;
        }

        public boolean k1() {
            return this.f47855m;
        }

        public int l0() {
            return this.f47851i;
        }

        public void m2(int i10) {
            this.f47851i = i10;
        }

        public int n2() {
            return this.bottomMargin;
        }

        public int p2() {
            return this.leftMargin;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f47847e);
            parcel.writeFloat(this.f47848f);
            parcel.writeInt(this.f47849g);
            parcel.writeFloat(this.f47850h);
            parcel.writeInt(this.f47851i);
            parcel.writeInt(this.f47852j);
            parcel.writeInt(this.f47853k);
            parcel.writeInt(this.f47854l);
            parcel.writeByte(this.f47855m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public int y1() {
            return this.f47853k;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        protected c(Parcel parcel) {
            super(-2, -2);
            this.f47847e = parcel.readFloat();
            this.f47848f = parcel.readFloat();
            this.f47849g = parcel.readInt();
            this.f47850h = parcel.readFloat();
            this.f47851i = parcel.readInt();
            this.f47852j = parcel.readInt();
            this.f47853k = parcel.readInt();
            this.f47854l = parcel.readInt();
            this.f47855m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
