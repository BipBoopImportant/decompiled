package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: androidx.transition.k  reason: case insensitive filesystem */
public class C7025k extends P {

    /* renamed from: A0  reason: collision with root package name */
    private static final g f44680A0 = new e();

    /* renamed from: B0  reason: collision with root package name */
    private static final g f44681B0 = new f();

    /* renamed from: U  reason: collision with root package name */
    private static final TimeInterpolator f44682U = new DecelerateInterpolator();

    /* renamed from: X  reason: collision with root package name */
    private static final TimeInterpolator f44683X = new AccelerateInterpolator();

    /* renamed from: Y  reason: collision with root package name */
    private static final g f44684Y = new a();

    /* renamed from: Z  reason: collision with root package name */
    private static final g f44685Z = new b();

    /* renamed from: y0  reason: collision with root package name */
    private static final g f44686y0 = new c();

    /* renamed from: z0  reason: collision with root package name */
    private static final g f44687z0 = new d();

    /* renamed from: S  reason: collision with root package name */
    private g f44688S = f44681B0;

    /* renamed from: T  reason: collision with root package name */
    private int f44689T = 80;

    /* renamed from: androidx.transition.k$a */
    class a extends h {
        a() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.k$b */
    class b extends h {
        b() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.k$c */
    class c extends i {
        c() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.k$d */
    class d extends h {
        d() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.k$e */
    class e extends h {
        e() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.k$f */
    class f extends i {
        f() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.k$g */
    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.k$h */
    private static abstract class h implements g {
        private h() {
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.transition.k$i */
    private static abstract class i implements g {
        private i() {
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public C7025k(int i10) {
        H0(i10);
    }

    private void z0(y yVar) {
        int[] iArr = new int[2];
        yVar.f44775b.getLocationOnScreen(iArr);
        yVar.f44774a.put("android:slide:screenPosition", iArr);
    }

    public Animator B0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        if (yVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) yVar2.f44774a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return A.a(view, yVar2, iArr[0], iArr[1], this.f44688S.b(viewGroup, view), this.f44688S.a(viewGroup, view), translationX, translationY, f44682U, this);
    }

    public Animator D0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        if (yVar == null) {
            return null;
        }
        int[] iArr = (int[]) yVar.f44774a.get("android:slide:screenPosition");
        return A.a(view, yVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f44688S.b(viewGroup, view), this.f44688S.a(viewGroup, view), f44683X, this);
    }

    public void H0(int i10) {
        if (i10 == 3) {
            this.f44688S = f44684Y;
        } else if (i10 == 5) {
            this.f44688S = f44687z0;
        } else if (i10 == 48) {
            this.f44688S = f44686y0;
        } else if (i10 == 80) {
            this.f44688S = f44681B0;
        } else if (i10 == 8388611) {
            this.f44688S = f44685Z;
        } else if (i10 == 8388613) {
            this.f44688S = f44680A0;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f44689T = i10;
        C7024j jVar = new C7024j();
        jVar.j(i10);
        v0(jVar);
    }

    public boolean W() {
        return true;
    }

    public void k(y yVar) {
        super.k(yVar);
        z0(yVar);
    }

    public void n(y yVar) {
        super.n(yVar);
        z0(yVar);
    }
}
