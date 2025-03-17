package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

final class e extends RecyclerView.v {

    /* renamed from: a  reason: collision with root package name */
    private ViewPager2.i f45007a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPager2 f45008b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f45009c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f45010d;

    /* renamed from: e  reason: collision with root package name */
    private int f45011e;

    /* renamed from: f  reason: collision with root package name */
    private int f45012f;

    /* renamed from: g  reason: collision with root package name */
    private a f45013g = new a();

    /* renamed from: h  reason: collision with root package name */
    private int f45014h;

    /* renamed from: i  reason: collision with root package name */
    private int f45015i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f45016j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f45017k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f45018l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f45019m;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f45020a;

        /* renamed from: b  reason: collision with root package name */
        float f45021b;

        /* renamed from: c  reason: collision with root package name */
        int f45022c;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f45020a = -1;
            this.f45021b = 0.0f;
            this.f45022c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f45008b = viewPager2;
        RecyclerView recyclerView = viewPager2.f44967j;
        this.f45009c = recyclerView;
        this.f45010d = (LinearLayoutManager) recyclerView.getLayoutManager();
        n();
    }

    private void a(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f45007a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void c(int i10) {
        ViewPager2.i iVar = this.f45007a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f45011e != 3 || this.f45012f != 0) && this.f45012f != i10) {
            this.f45012f = i10;
            ViewPager2.i iVar = this.f45007a;
            if (iVar != null) {
                iVar.a(i10);
            }
        }
    }

    private int f() {
        return this.f45010d.y2();
    }

    private boolean k() {
        int i10 = this.f45011e;
        return i10 == 1 || i10 == 4;
    }

    private void n() {
        this.f45011e = 0;
        this.f45012f = 0;
        this.f45013g.a();
        this.f45014h = -1;
        this.f45015i = -1;
        this.f45016j = false;
        this.f45017k = false;
        this.f45019m = false;
        this.f45018l = false;
    }

    private void p(boolean z10) {
        this.f45019m = z10;
        this.f45011e = z10 ? 4 : 1;
        int i10 = this.f45015i;
        if (i10 != -1) {
            this.f45014h = i10;
            this.f45015i = -1;
        } else if (this.f45014h == -1) {
            this.f45014h = f();
        }
        e(1);
    }

    private void q() {
        int i10;
        a aVar = this.f45013g;
        int y22 = this.f45010d.y2();
        aVar.f45020a = y22;
        if (y22 == -1) {
            aVar.a();
            return;
        }
        View e02 = this.f45010d.e0(y22);
        if (e02 == null) {
            aVar.a();
            return;
        }
        int B02 = this.f45010d.B0(e02);
        int G02 = this.f45010d.G0(e02);
        int J02 = this.f45010d.J0(e02);
        int j02 = this.f45010d.j0(e02);
        ViewGroup.LayoutParams layoutParams = e02.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            B02 += marginLayoutParams.leftMargin;
            G02 += marginLayoutParams.rightMargin;
            J02 += marginLayoutParams.topMargin;
            j02 += marginLayoutParams.bottomMargin;
        }
        int height = e02.getHeight() + J02 + j02;
        int width = e02.getWidth() + B02 + G02;
        if (this.f45010d.M2() == 0) {
            i10 = (e02.getLeft() - B02) - this.f45009c.getPaddingLeft();
            if (this.f45008b.d()) {
                i10 = -i10;
            }
            height = width;
        } else {
            i10 = (e02.getTop() - J02) - this.f45009c.getPaddingTop();
        }
        int i11 = -i10;
        aVar.f45022c = i11;
        if (i11 >= 0) {
            aVar.f45021b = height == 0 ? 0.0f : ((float) i11) / ((float) height);
        } else if (new a(this.f45010d).d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f45022c)}));
        }
    }

    /* access modifiers changed from: package-private */
    public double g() {
        q();
        a aVar = this.f45013g;
        return ((double) aVar.f45020a) + ((double) aVar.f45021b);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f45012f;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f45019m;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f45012f == 0;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f45018l = true;
    }

    /* access modifiers changed from: package-private */
    public void m(int i10, boolean z10) {
        this.f45011e = z10 ? 2 : 3;
        boolean z11 = false;
        this.f45019m = false;
        if (this.f45015i != i10) {
            z11 = true;
        }
        this.f45015i = i10;
        e(2);
        if (z11) {
            c(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(ViewPager2.i iVar) {
        this.f45007a = iVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        if (!(this.f45011e == 1 && this.f45012f == 1) && i10 == 1) {
            p(false);
        } else if (!k() || i10 != 2) {
            if (k() && i10 == 0) {
                q();
                if (!this.f45017k) {
                    int i11 = this.f45013g.f45020a;
                    if (i11 != -1) {
                        a(i11, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f45013g;
                    if (aVar.f45022c == 0) {
                        int i12 = this.f45014h;
                        int i13 = aVar.f45020a;
                        if (i12 != i13) {
                            c(i13);
                        }
                    }
                }
                e(0);
                n();
            }
            if (this.f45011e == 2 && i10 == 0 && this.f45018l) {
                q();
                a aVar2 = this.f45013g;
                if (aVar2.f45022c == 0) {
                    int i14 = this.f45015i;
                    int i15 = aVar2.f45020a;
                    if (i14 != i15) {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        c(i15);
                    }
                    e(0);
                    n();
                }
            }
        } else if (this.f45017k) {
            e(2);
            this.f45016j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f45008b.d()) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f45017k = r4
            r3.q()
            boolean r0 = r3.f45016j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            r3.f45016j = r2
            if (r6 > 0) goto L_0x001f
            if (r6 != 0) goto L_0x0029
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f45008b
            boolean r6 = r6.d()
            if (r5 != r6) goto L_0x0029
        L_0x001f:
            androidx.viewpager2.widget.e$a r5 = r3.f45013g
            int r6 = r5.f45022c
            if (r6 == 0) goto L_0x0029
            int r5 = r5.f45020a
            int r5 = r5 + r4
            goto L_0x002d
        L_0x0029:
            androidx.viewpager2.widget.e$a r5 = r3.f45013g
            int r5 = r5.f45020a
        L_0x002d:
            r3.f45015i = r5
            int r6 = r3.f45014h
            if (r6 == r5) goto L_0x0045
            r3.c(r5)
            goto L_0x0045
        L_0x0037:
            int r5 = r3.f45011e
            if (r5 != 0) goto L_0x0045
            androidx.viewpager2.widget.e$a r5 = r3.f45013g
            int r5 = r5.f45020a
            if (r5 != r1) goto L_0x0042
            r5 = r2
        L_0x0042:
            r3.c(r5)
        L_0x0045:
            androidx.viewpager2.widget.e$a r5 = r3.f45013g
            int r6 = r5.f45020a
            if (r6 != r1) goto L_0x004c
            r6 = r2
        L_0x004c:
            float r0 = r5.f45021b
            int r5 = r5.f45022c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f45013g
            int r6 = r5.f45020a
            int r0 = r3.f45015i
            if (r6 == r0) goto L_0x005d
            if (r0 != r1) goto L_0x006b
        L_0x005d:
            int r5 = r5.f45022c
            if (r5 != 0) goto L_0x006b
            int r5 = r3.f45012f
            if (r5 == r4) goto L_0x006b
            r3.e(r2)
            r3.n()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
