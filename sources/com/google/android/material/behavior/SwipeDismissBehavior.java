package com.google.android.material.behavior;

import I2.C4600b0;
import J2.t;
import J2.w;
import P2.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    P2.c f66004a;

    /* renamed from: b  reason: collision with root package name */
    c f66005b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66006c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f66007d;

    /* renamed from: e  reason: collision with root package name */
    private float f66008e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private boolean f66009f;

    /* renamed from: g  reason: collision with root package name */
    int f66010g = 2;

    /* renamed from: h  reason: collision with root package name */
    float f66011h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    float f66012i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    float f66013j = 0.5f;

    /* renamed from: k  reason: collision with root package name */
    private final c.C0179c f66014k = new a();

    class a extends c.C0179c {

        /* renamed from: a  reason: collision with root package name */
        private int f66015a;

        /* renamed from: b  reason: collision with root package name */
        private int f66016b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                boolean z10 = C4600b0.z(view) == 1;
                int i11 = SwipeDismissBehavior.this.f66010g;
                if (i11 == 2) {
                    return true;
                }
                if (i11 == 0) {
                    if (z10) {
                        if (f10 >= 0.0f) {
                            return false;
                        }
                    } else if (i10 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i11 != 1) {
                    return false;
                } else {
                    if (z10) {
                        if (i10 <= 0) {
                            return false;
                        }
                    } else if (f10 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                return Math.abs(view.getLeft() - this.f66015a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f66011h);
            }
        }

        public int a(View view, int i10, int i11) {
            int i12;
            int i13;
            int width;
            boolean z10 = C4600b0.z(view) == 1;
            int i14 = SwipeDismissBehavior.this.f66010g;
            if (i14 != 0) {
                if (i14 != 1) {
                    i12 = this.f66015a - view.getWidth();
                    i13 = view.getWidth() + this.f66015a;
                } else if (z10) {
                    i12 = this.f66015a;
                    width = view.getWidth();
                } else {
                    i12 = this.f66015a - view.getWidth();
                    i13 = this.f66015a;
                }
                return SwipeDismissBehavior.L(i12, i10, i13);
            } else if (z10) {
                i12 = this.f66015a - view.getWidth();
                i13 = this.f66015a;
                return SwipeDismissBehavior.L(i12, i10, i13);
            } else {
                i12 = this.f66015a;
                width = view.getWidth();
            }
            i13 = width + i12;
            return SwipeDismissBehavior.L(i12, i10, i13);
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i10) {
            this.f66016b = i10;
            this.f66015a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                boolean unused = SwipeDismissBehavior.this.f66007d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                boolean unused2 = SwipeDismissBehavior.this.f66007d = false;
            }
        }

        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f66005b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = ((float) view.getWidth()) * SwipeDismissBehavior.this.f66012i;
            float width2 = ((float) view.getWidth()) * SwipeDismissBehavior.this.f66013j;
            float abs = (float) Math.abs(i10 - this.f66015a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, abs), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r4 = r3.getLeft();
            r0 = r2.f66015a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f66016b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L_0x0023
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L_0x001d
                int r4 = r3.getLeft()
                int r0 = r2.f66015a
                if (r4 >= r0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                int r0 = r0 + r5
                goto L_0x0021
            L_0x001d:
                int r4 = r2.f66015a
                int r0 = r4 - r5
            L_0x0021:
                r4 = 1
                goto L_0x0026
            L_0x0023:
                int r0 = r2.f66015a
                r4 = 0
            L_0x0026:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                P2.c r5 = r5.f66004a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L_0x003f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                I2.C4600b0.g0(r3, r5)
                goto L_0x004a
            L_0x003f:
                if (r4 == 0) goto L_0x004a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f66005b
                if (r4 == 0) goto L_0x004a
                r4.a(r3)
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i10) {
            int i11 = this.f66016b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }
    }

    class b implements w {
        b() {
        }

        public boolean a(View view, w.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            if (C4600b0.z(view) == 1) {
                z10 = true;
            }
            int i10 = SwipeDismissBehavior.this.f66010g;
            C4600b0.Y(view, ((i10 != 0 || !z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f66005b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f66019a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f66020b;

        d(View view, boolean z10) {
            this.f66019a = view;
            this.f66020b = z10;
        }

        public void run() {
            c cVar;
            P2.c cVar2 = SwipeDismissBehavior.this.f66004a;
            if (cVar2 != null && cVar2.m(true)) {
                C4600b0.g0(this.f66019a, this);
            } else if (this.f66020b && (cVar = SwipeDismissBehavior.this.f66005b) != null) {
                cVar.a(this.f66019a);
            }
        }
    }

    static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f66004a == null) {
            this.f66004a = this.f66009f ? P2.c.n(viewGroup, this.f66008e, this.f66014k) : P2.c.o(viewGroup, this.f66014k);
        }
    }

    static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void S(View view) {
        C4600b0.i0(view, ImageMetadata.SHADING_MODE);
        if (J(view)) {
            C4600b0.k0(view, t.a.f8854y, (CharSequence) null, new b());
        }
    }

    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f66004a == null) {
            return false;
        }
        if (this.f66007d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f66004a.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f10) {
        this.f66013j = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f66005b = cVar;
    }

    public void Q(float f10) {
        this.f66012i = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f66010g = i10;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f66006c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.B(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f66006c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f66006c = false;
        }
        if (!z10) {
            return false;
        }
        M(coordinatorLayout);
        return !this.f66007d && this.f66004a.P(motionEvent);
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean p10 = super.p(coordinatorLayout, v10, i10);
        if (C4600b0.x(v10) == 0) {
            C4600b0.z0(v10, 1);
            S(v10);
        }
        return p10;
    }
}
