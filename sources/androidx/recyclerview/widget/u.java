package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class u extends y {

    /* renamed from: d  reason: collision with root package name */
    private t f44182d;

    /* renamed from: e  reason: collision with root package name */
    private t f44183e;

    class a extends p {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.C c10, RecyclerView.B.a aVar) {
            u uVar = u.this;
            int[] c11 = uVar.c(uVar.f44189a.getLayoutManager(), view);
            int i10 = c11[0];
            int i11 = c11[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f44170j);
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.m() + (tVar.n() / 2));
    }

    private View l(RecyclerView.q qVar, t tVar) {
        int l02 = qVar.l0();
        View view = null;
        if (l02 == 0) {
            return null;
        }
        int m10 = tVar.m() + (tVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < l02; i11++) {
            View k02 = qVar.k0(i11);
            int abs = Math.abs((tVar.g(k02) + (tVar.e(k02) / 2)) - m10);
            if (abs < i10) {
                view = k02;
                i10 = abs;
            }
        }
        return view;
    }

    private t m(RecyclerView.q qVar) {
        t tVar = this.f44183e;
        if (tVar == null || tVar.f44179a != qVar) {
            this.f44183e = t.a(qVar);
        }
        return this.f44183e;
    }

    private t n(RecyclerView.q qVar) {
        if (qVar.N()) {
            return o(qVar);
        }
        if (qVar.M()) {
            return m(qVar);
        }
        return null;
    }

    private t o(RecyclerView.q qVar) {
        t tVar = this.f44182d;
        if (tVar == null || tVar.f44179a != qVar) {
            this.f44182d = t.c(qVar);
        }
        return this.f44182d;
    }

    private boolean p(RecyclerView.q qVar, int i10, int i11) {
        return qVar.M() ? i10 > 0 : i11 > 0;
    }

    private boolean q(RecyclerView.q qVar) {
        PointF h10;
        int a10 = qVar.a();
        if (!(qVar instanceof RecyclerView.B.b) || (h10 = ((RecyclerView.B.b) qVar).h(a10 - 1)) == null) {
            return false;
        }
        return h10.x < 0.0f || h10.y < 0.0f;
    }

    public int[] c(RecyclerView.q qVar, View view) {
        int[] iArr = new int[2];
        if (qVar.M()) {
            iArr[0] = k(view, m(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.N()) {
            iArr[1] = k(view, o(qVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.B d(RecyclerView.q qVar) {
        if (!(qVar instanceof RecyclerView.B.b)) {
            return null;
        }
        return new a(this.f44189a.getContext());
    }

    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.q qVar) {
        if (qVar.N()) {
            return l(qVar, o(qVar));
        }
        if (qVar.M()) {
            return l(qVar, m(qVar));
        }
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.q qVar, int i10, int i11) {
        t n10;
        int a10 = qVar.a();
        if (a10 == 0 || (n10 = n(qVar)) == null) {
            return -1;
        }
        int l02 = qVar.l0();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < l02; i14++) {
            View k02 = qVar.k0(i14);
            if (k02 != null) {
                int k10 = k(k02, n10);
                if (k10 <= 0 && k10 > i13) {
                    view2 = k02;
                    i13 = k10;
                }
                if (k10 >= 0 && k10 < i12) {
                    view = k02;
                    i12 = k10;
                }
            }
        }
        boolean p10 = p(qVar, i10, i11);
        if (p10 && view != null) {
            return qVar.E0(view);
        }
        if (!p10 && view2 != null) {
            return qVar.E0(view2);
        }
        if (p10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int E02 = qVar.E0(view) + (q(qVar) == p10 ? -1 : 1);
        if (E02 < 0 || E02 >= a10) {
            return -1;
        }
        return E02;
    }
}
