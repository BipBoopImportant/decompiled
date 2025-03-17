package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class f {

    /* renamed from: a  reason: collision with root package name */
    final b f43973a;

    /* renamed from: b  reason: collision with root package name */
    final a f43974b;

    /* renamed from: c  reason: collision with root package name */
    final List<View> f43975c;

    /* renamed from: d  reason: collision with root package name */
    private int f43976d = 0;

    /* renamed from: e  reason: collision with root package name */
    private View f43977e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f43978a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f43979b;

        a() {
        }

        private void c() {
            if (this.f43979b == null) {
                this.f43979b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f43979b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f43978a &= ~(1 << i10);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            a aVar = this.f43979b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f43978a) : Long.bitCount(this.f43978a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f43978a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f43978a);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f43978a & (1 << i10)) != 0;
            }
            c();
            return this.f43979b.d(i10 - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f43979b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f43978a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f43978a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f43979b != null) {
                c();
                this.f43979b.e(0, z11);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f43979b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f43978a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f43978a = j12;
            long j13 = j10 - 1;
            this.f43978a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f43979b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f43979b.f(0);
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f43978a = 0;
            a aVar = this.f43979b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f43979b.h(i10 - 64);
                return;
            }
            this.f43978a |= 1 << i10;
        }

        public String toString() {
            if (this.f43979b == null) {
                return Long.toBinaryString(this.f43978a);
            }
            return this.f43979b.toString() + "xx" + Long.toBinaryString(this.f43978a);
        }
    }

    interface b {
        View a(int i10);

        void b(View view);

        int c();

        RecyclerView.G d(View view);

        void e(int i10);

        void f(View view, int i10);

        void g();

        int h(View view);

        void i(View view);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    f(b bVar) {
        this.f43973a = bVar;
        this.f43974b = new a();
        this.f43975c = new ArrayList();
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f43973a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f43974b.b(i11));
            if (b10 == 0) {
                while (this.f43974b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f43975c.add(view);
        this.f43973a.b(view);
    }

    private boolean t(View view) {
        if (!this.f43975c.remove(view)) {
            return false;
        }
        this.f43973a.i(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i10, boolean z10) {
        int c10 = i10 < 0 ? this.f43973a.c() : h(i10);
        this.f43974b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f43973a.f(view, c10);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int c10 = i10 < 0 ? this.f43973a.c() : h(i10);
        this.f43974b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f43973a.k(view, c10, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        int h10 = h(i10);
        this.f43974b.f(h10);
        this.f43973a.e(h10);
    }

    /* access modifiers changed from: package-private */
    public View e(int i10) {
        int size = this.f43975c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f43975c.get(i11);
            RecyclerView.G d10 = this.f43973a.d(view);
            if (d10.getLayoutPosition() == i10 && !d10.isInvalid() && !d10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f43973a.a(h(i10));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f43973a.c() - this.f43975c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i10) {
        return this.f43973a.a(i10);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f43973a.c();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int h10 = this.f43973a.h(view);
        if (h10 >= 0) {
            this.f43974b.h(h10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int h10 = this.f43973a.h(view);
        if (h10 != -1 && !this.f43974b.d(h10)) {
            return h10 - this.f43974b.b(h10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f43975c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f43974b.g();
        for (int size = this.f43975c.size() - 1; size >= 0; size--) {
            this.f43973a.i(this.f43975c.get(size));
            this.f43975c.remove(size);
        }
        this.f43973a.g();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int i10 = this.f43976d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i10 != 2) {
            try {
                this.f43976d = 1;
                this.f43977e = view;
                int h10 = this.f43973a.h(view);
                if (h10 < 0) {
                    this.f43976d = 0;
                    this.f43977e = null;
                    return;
                }
                if (this.f43974b.f(h10)) {
                    t(view);
                }
                this.f43973a.j(h10);
                this.f43976d = 0;
                this.f43977e = null;
            } catch (Throwable th2) {
                this.f43976d = 0;
                this.f43977e = null;
                throw th2;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        int i11 = this.f43976d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i11 != 2) {
            try {
                int h10 = h(i10);
                View a10 = this.f43973a.a(h10);
                if (a10 == null) {
                    this.f43976d = 0;
                    this.f43977e = null;
                    return;
                }
                this.f43976d = 1;
                this.f43977e = a10;
                if (this.f43974b.f(h10)) {
                    t(a10);
                }
                this.f43973a.j(h10);
                this.f43976d = 0;
                this.f43977e = null;
            } catch (Throwable th2) {
                this.f43976d = 0;
                this.f43977e = null;
                throw th2;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int i10 = this.f43976d;
        if (i10 == 1) {
            if (this.f43977e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        } else if (i10 != 2) {
            try {
                this.f43976d = 2;
                int h10 = this.f43973a.h(view);
                if (h10 == -1) {
                    t(view);
                    this.f43976d = 0;
                    return true;
                } else if (this.f43974b.d(h10)) {
                    this.f43974b.f(h10);
                    t(view);
                    this.f43973a.j(h10);
                    this.f43976d = 0;
                    return true;
                } else {
                    this.f43976d = 0;
                    return false;
                }
            } catch (Throwable th2) {
                this.f43976d = 0;
                throw th2;
            }
        } else {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int h10 = this.f43973a.h(view);
        if (h10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f43974b.d(h10)) {
            this.f43974b.a(h10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f43974b.toString() + ", hidden list:" + this.f43975c.size();
    }
}
