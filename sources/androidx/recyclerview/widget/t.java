package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.q f44179a;

    /* renamed from: b  reason: collision with root package name */
    private int f44180b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f44181c;

    class a extends t {
        a(RecyclerView.q qVar) {
            super(qVar, (a) null);
        }

        public int d(View view) {
            return this.f44179a.v0(view) + ((RecyclerView.r) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f44179a.u0(view) + rVar.leftMargin + rVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f44179a.t0(view) + rVar.topMargin + rVar.bottomMargin;
        }

        public int g(View view) {
            return this.f44179a.s0(view) - ((RecyclerView.r) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f44179a.L0();
        }

        public int i() {
            return this.f44179a.L0() - this.f44179a.o();
        }

        public int j() {
            return this.f44179a.o();
        }

        public int k() {
            return this.f44179a.M0();
        }

        public int l() {
            return this.f44179a.z0();
        }

        public int m() {
            return this.f44179a.t();
        }

        public int n() {
            return (this.f44179a.L0() - this.f44179a.t()) - this.f44179a.o();
        }

        public int p(View view) {
            this.f44179a.K0(view, true, this.f44181c);
            return this.f44181c.right;
        }

        public int q(View view) {
            this.f44179a.K0(view, true, this.f44181c);
            return this.f44181c.left;
        }

        public void r(int i10) {
            this.f44179a.b1(i10);
        }
    }

    class b extends t {
        b(RecyclerView.q qVar) {
            super(qVar, (a) null);
        }

        public int d(View view) {
            return this.f44179a.q0(view) + ((RecyclerView.r) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f44179a.t0(view) + rVar.topMargin + rVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f44179a.u0(view) + rVar.leftMargin + rVar.rightMargin;
        }

        public int g(View view) {
            return this.f44179a.w0(view) - ((RecyclerView.r) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f44179a.y0();
        }

        public int i() {
            return this.f44179a.y0() - this.f44179a.c();
        }

        public int j() {
            return this.f44179a.c();
        }

        public int k() {
            return this.f44179a.z0();
        }

        public int l() {
            return this.f44179a.M0();
        }

        public int m() {
            return this.f44179a.s();
        }

        public int n() {
            return (this.f44179a.y0() - this.f44179a.s()) - this.f44179a.c();
        }

        public int p(View view) {
            this.f44179a.K0(view, true, this.f44181c);
            return this.f44181c.bottom;
        }

        public int q(View view) {
            this.f44179a.K0(view, true, this.f44181c);
            return this.f44181c.top;
        }

        public void r(int i10) {
            this.f44179a.c1(i10);
        }
    }

    /* synthetic */ t(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static t a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static t b(RecyclerView.q qVar, int i10) {
        if (i10 == 0) {
            return a(qVar);
        }
        if (i10 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static t c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f44180b) {
            return 0;
        }
        return n() - this.f44180b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f44180b = n();
    }

    private t(RecyclerView.q qVar) {
        this.f44180b = Integer.MIN_VALUE;
        this.f44181c = new Rect();
        this.f44179a = qVar;
    }
}
