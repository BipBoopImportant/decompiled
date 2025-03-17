package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C7026l;
import java.util.Map;

/* renamed from: androidx.transition.b  reason: case insensitive filesystem */
public class C7016b extends C7026l {

    /* renamed from: R  reason: collision with root package name */
    private static final String[] f44632R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: S  reason: collision with root package name */
    private static final Property<i, PointF> f44633S;

    /* renamed from: T  reason: collision with root package name */
    private static final Property<i, PointF> f44634T;

    /* renamed from: U  reason: collision with root package name */
    private static final Property<View, PointF> f44635U;

    /* renamed from: X  reason: collision with root package name */
    private static final Property<View, PointF> f44636X;

    /* renamed from: Y  reason: collision with root package name */
    private static final Property<View, PointF> f44637Y;

    /* renamed from: Z  reason: collision with root package name */
    private static final C7022h f44638Z = new C7022h();

    /* renamed from: Q  reason: collision with root package name */
    private boolean f44639Q = false;

    /* renamed from: androidx.transition.b$a */
    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(i iVar) {
            return null;
        }

        /* renamed from: b */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: androidx.transition.b$b  reason: collision with other inner class name */
    class C0769b extends Property<i, PointF> {
        C0769b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(i iVar) {
            return null;
        }

        /* renamed from: b */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: androidx.transition.b$c */
    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            D.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.b$d */
    class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            D.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.b$e */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            D.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f44640a;
        private final i mViewBounds;

        f(i iVar) {
            this.f44640a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        private final View f44642a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f44643b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f44644c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f44645d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f44646e;

        /* renamed from: f  reason: collision with root package name */
        private final int f44647f;

        /* renamed from: g  reason: collision with root package name */
        private final int f44648g;

        /* renamed from: h  reason: collision with root package name */
        private final int f44649h;

        /* renamed from: i  reason: collision with root package name */
        private final int f44650i;

        /* renamed from: j  reason: collision with root package name */
        private final int f44651j;

        /* renamed from: k  reason: collision with root package name */
        private final int f44652k;

        /* renamed from: l  reason: collision with root package name */
        private final int f44653l;

        /* renamed from: m  reason: collision with root package name */
        private final int f44654m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f44655n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f44642a = view;
            this.f44643b = rect;
            this.f44644c = z10;
            this.f44645d = rect2;
            this.f44646e = z11;
            this.f44647f = i10;
            this.f44648g = i11;
            this.f44649h = i12;
            this.f44650i = i13;
            this.f44651j = i14;
            this.f44652k = i15;
            this.f44653l = i16;
            this.f44654m = i17;
        }

        public void d(C7026l lVar) {
            this.f44642a.setTag(C7021g.f44671b, (Object) null);
            this.f44642a.setClipBounds((Rect) this.f44642a.getTag(C7021g.f44671b));
        }

        public void e(C7026l lVar) {
        }

        public void g(C7026l lVar) {
            this.f44642a.setTag(C7021g.f44671b, this.f44642a.getClipBounds());
            this.f44642a.setClipBounds(this.f44646e ? null : this.f44645d);
        }

        public void j(C7026l lVar) {
        }

        public void l(C7026l lVar) {
            this.f44655n = true;
        }

        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        public void onAnimationEnd(Animator animator, boolean z10) {
            if (!this.f44655n) {
                Rect rect = null;
                if (z10) {
                    if (!this.f44644c) {
                        rect = this.f44643b;
                    }
                } else if (!this.f44646e) {
                    rect = this.f44645d;
                }
                this.f44642a.setClipBounds(rect);
                if (z10) {
                    D.d(this.f44642a, this.f44647f, this.f44648g, this.f44649h, this.f44650i);
                } else {
                    D.d(this.f44642a, this.f44651j, this.f44652k, this.f44653l, this.f44654m);
                }
            }
        }

        public void onAnimationStart(Animator animator, boolean z10) {
            int max = Math.max(this.f44649h - this.f44647f, this.f44653l - this.f44651j);
            int max2 = Math.max(this.f44650i - this.f44648g, this.f44654m - this.f44652k);
            int i10 = z10 ? this.f44651j : this.f44647f;
            int i11 = z10 ? this.f44652k : this.f44648g;
            D.d(this.f44642a, i10, i11, max + i10, max2 + i11);
            this.f44642a.setClipBounds(z10 ? this.f44645d : this.f44643b);
        }
    }

    /* renamed from: androidx.transition.b$h */
    private static class h extends s {

        /* renamed from: a  reason: collision with root package name */
        boolean f44656a = false;

        /* renamed from: b  reason: collision with root package name */
        final ViewGroup f44657b;

        h(ViewGroup viewGroup) {
            this.f44657b = viewGroup;
        }

        public void d(C7026l lVar) {
            C.b(this.f44657b, true);
        }

        public void g(C7026l lVar) {
            C.b(this.f44657b, false);
        }

        public void j(C7026l lVar) {
            if (!this.f44656a) {
                C.b(this.f44657b, false);
            }
            lVar.k0(this);
        }

        public void l(C7026l lVar) {
            C.b(this.f44657b, false);
            this.f44656a = true;
        }
    }

    /* renamed from: androidx.transition.b$i */
    private static class i {

        /* renamed from: a  reason: collision with root package name */
        private int f44658a;

        /* renamed from: b  reason: collision with root package name */
        private int f44659b;

        /* renamed from: c  reason: collision with root package name */
        private int f44660c;

        /* renamed from: d  reason: collision with root package name */
        private int f44661d;

        /* renamed from: e  reason: collision with root package name */
        private final View f44662e;

        /* renamed from: f  reason: collision with root package name */
        private int f44663f;

        /* renamed from: g  reason: collision with root package name */
        private int f44664g;

        i(View view) {
            this.f44662e = view;
        }

        private void b() {
            D.d(this.f44662e, this.f44658a, this.f44659b, this.f44660c, this.f44661d);
            this.f44663f = 0;
            this.f44664g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f44660c = Math.round(pointF.x);
            this.f44661d = Math.round(pointF.y);
            int i10 = this.f44664g + 1;
            this.f44664g = i10;
            if (this.f44663f == i10) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f44658a = Math.round(pointF.x);
            this.f44659b = Math.round(pointF.y);
            int i10 = this.f44663f + 1;
            this.f44663f = i10;
            if (i10 == this.f44664g) {
                b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        f44633S = new a(cls, "topLeft");
        f44634T = new C0769b(cls, "bottomRight");
        f44635U = new c(cls, "bottomRight");
        f44636X = new d(cls, "topLeft");
        f44637Y = new e(cls, "position");
    }

    private void z0(y yVar) {
        View view = yVar.f44775b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            yVar.f44774a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            yVar.f44774a.put("android:changeBounds:parent", yVar.f44775b.getParent());
            if (this.f44639Q) {
                yVar.f44774a.put("android:changeBounds:clip", view.getClipBounds());
            }
        }
    }

    public String[] S() {
        return f44632R;
    }

    public boolean W() {
        return true;
    }

    public void k(y yVar) {
        z0(yVar);
    }

    public void n(y yVar) {
        Rect rect;
        z0(yVar);
        if (this.f44639Q && (rect = (Rect) yVar.f44775b.getTag(C7021g.f44671b)) != null) {
            yVar.f44774a.put("android:changeBounds:clip", rect);
        }
    }

    public Animator u(ViewGroup viewGroup, y yVar, y yVar2) {
        int i10;
        View view;
        Animator animator;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimator;
        boolean z10;
        ObjectAnimator objectAnimator2;
        y yVar3 = yVar;
        y yVar4 = yVar2;
        if (yVar3 == null || yVar4 == null) {
            return null;
        }
        Map<String, Object> map = yVar3.f44774a;
        Map<String, Object> map2 = yVar4.f44774a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = yVar4.f44775b;
        Rect rect = (Rect) yVar3.f44774a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) yVar4.f44774a.get("android:changeBounds:bounds");
        int i14 = rect.left;
        int i15 = rect2.left;
        int i16 = rect.top;
        int i17 = rect2.top;
        int i18 = rect.right;
        int i19 = rect2.right;
        int i20 = rect.bottom;
        int i21 = rect2.bottom;
        int i22 = i18 - i14;
        int i23 = i20 - i16;
        int i24 = i19 - i15;
        int i25 = i21 - i17;
        View view3 = view2;
        Rect rect3 = (Rect) yVar3.f44774a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) yVar4.f44774a.get("android:changeBounds:clip");
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i10 = 0;
        } else {
            i10 = (i14 == i15 && i16 == i17) ? 0 : 1;
            if (!(i18 == i19 && i20 == i21)) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        Rect rect5 = rect4;
        if (!this.f44639Q) {
            view = view3;
            D.d(view, i14, i16, i18, i20);
            if (i10 != 2) {
                animator = (i14 == i15 && i16 == i17) ? C7019e.a(view, f44635U, H().a((float) i18, (float) i20, (float) i19, (float) i21)) : C7019e.a(view, f44636X, H().a((float) i14, (float) i16, (float) i15, (float) i17));
            } else if (i22 == i24 && i23 == i25) {
                animator = C7019e.a(view, f44637Y, H().a((float) i14, (float) i16, (float) i15, (float) i17));
            } else {
                i iVar = new i(view);
                ObjectAnimator a10 = C7019e.a(iVar, f44633S, H().a((float) i14, (float) i16, (float) i15, (float) i17));
                ObjectAnimator a11 = C7019e.a(iVar, f44634T, H().a((float) i18, (float) i20, (float) i19, (float) i21));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a10, a11});
                animatorSet.addListener(new f(iVar));
                animator = animatorSet;
            }
        } else {
            view = view3;
            int i26 = i21;
            D.d(view, i14, i16, Math.max(i22, i24) + i14, i16 + Math.max(i23, i25));
            if (i14 == i15 && i16 == i17) {
                i13 = i19;
                i12 = i18;
                i11 = i16;
                objectAnimator = null;
            } else {
                i13 = i19;
                i12 = i18;
                i11 = i16;
                objectAnimator = C7019e.a(view, f44637Y, H().a((float) i14, (float) i16, (float) i15, (float) i17));
            }
            boolean z11 = rect3 == null;
            if (z11) {
                z10 = false;
                rect3 = new Rect(0, 0, i22, i23);
            } else {
                z10 = false;
            }
            Rect rect6 = rect3;
            boolean z12 = rect5 == null ? true : z10;
            Rect rect7 = z12 ? new Rect(z10 ? 1 : 0, z10, i24, i25) : rect5;
            if (!rect6.equals(rect7)) {
                view.setClipBounds(rect6);
                objectAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", f44638Z, new Object[]{rect6, rect7});
                g gVar = new g(view, rect6, z11, rect7, z12, i14, i11, i12, i20, i15, i17, i13, i26);
                objectAnimator2.addListener(gVar);
                c(gVar);
            } else {
                objectAnimator2 = null;
            }
            animator = x.c(objectAnimator, objectAnimator2);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C.b(viewGroup4, true);
            K().c(new h(viewGroup4));
        }
        return animator;
    }
}
