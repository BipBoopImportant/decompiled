package com.google.android.material.floatingactionbutton;

import Ea.C9068b;
import Ea.C9073g;
import Fa.C9081a;
import Fa.C9082b;
import Fa.C9086f;
import Fa.C9087g;
import Fa.C9088h;
import I2.C4600b0;
import Qa.C9242i;
import Sa.C9270b;
import Ta.C9272b;
import Ua.C9286g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Iterator;
import y2.C6260a;

class b {

    /* renamed from: D  reason: collision with root package name */
    static final TimeInterpolator f66731D = C9081a.f60373c;

    /* renamed from: E  reason: collision with root package name */
    private static final int f66732E = C9068b.f59302H;

    /* renamed from: F  reason: collision with root package name */
    private static final int f66733F = C9068b.f59312R;

    /* renamed from: G  reason: collision with root package name */
    private static final int f66734G = C9068b.f59303I;

    /* renamed from: H  reason: collision with root package name */
    private static final int f66735H = C9068b.f59310P;

    /* renamed from: I  reason: collision with root package name */
    static final int[] f66736I = {16842919, 16842910};

    /* renamed from: J  reason: collision with root package name */
    static final int[] f66737J = {16843623, 16842908, 16842910};

    /* renamed from: K  reason: collision with root package name */
    static final int[] f66738K = {16842908, 16842910};

    /* renamed from: L  reason: collision with root package name */
    static final int[] f66739L = {16843623, 16842910};

    /* renamed from: M  reason: collision with root package name */
    static final int[] f66740M = {16842910};

    /* renamed from: N  reason: collision with root package name */
    static final int[] f66741N = new int[0];

    /* renamed from: A  reason: collision with root package name */
    private final RectF f66742A = new RectF();

    /* renamed from: B  reason: collision with root package name */
    private final Matrix f66743B = new Matrix();

    /* renamed from: C  reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f66744C;

    /* renamed from: a  reason: collision with root package name */
    Ua.k f66745a;

    /* renamed from: b  reason: collision with root package name */
    C9286g f66746b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f66747c;

    /* renamed from: d  reason: collision with root package name */
    a f66748d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f66749e;

    /* renamed from: f  reason: collision with root package name */
    boolean f66750f;

    /* renamed from: g  reason: collision with root package name */
    boolean f66751g = true;

    /* renamed from: h  reason: collision with root package name */
    float f66752h;

    /* renamed from: i  reason: collision with root package name */
    float f66753i;

    /* renamed from: j  reason: collision with root package name */
    float f66754j;

    /* renamed from: k  reason: collision with root package name */
    int f66755k;

    /* renamed from: l  reason: collision with root package name */
    private final n f66756l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public Animator f66757m;

    /* renamed from: n  reason: collision with root package name */
    private C9088h f66758n;

    /* renamed from: o  reason: collision with root package name */
    private C9088h f66759o;

    /* renamed from: p  reason: collision with root package name */
    private float f66760p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public float f66761q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private int f66762r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f66763s = 0;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f66764t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f66765u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<j> f66766v;

    /* renamed from: w  reason: collision with root package name */
    final FloatingActionButton f66767w;

    /* renamed from: x  reason: collision with root package name */
    final C9272b f66768x;

    /* renamed from: y  reason: collision with root package name */
    private final Rect f66769y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    private final RectF f66770z = new RectF();

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f66771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f66772b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f66773c;

        a(boolean z10, k kVar) {
            this.f66772b = z10;
            this.f66773c = kVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f66771a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.f66763s = 0;
            Animator unused2 = b.this.f66757m = null;
            if (!this.f66771a) {
                FloatingActionButton floatingActionButton = b.this.f66767w;
                boolean z10 = this.f66772b;
                floatingActionButton.b(z10 ? 8 : 4, z10);
                k kVar = this.f66773c;
                if (kVar != null) {
                    kVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.f66767w.b(0, this.f66772b);
            int unused = b.this.f66763s = 1;
            Animator unused2 = b.this.f66757m = animator;
            this.f66771a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    class C1167b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f66775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f66776b;

        C1167b(boolean z10, k kVar) {
            this.f66775a = z10;
            this.f66776b = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.f66763s = 0;
            Animator unused2 = b.this.f66757m = null;
            k kVar = this.f66776b;
            if (kVar != null) {
                kVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.f66767w.b(0, this.f66775a);
            int unused = b.this.f66763s = 2;
            Animator unused2 = b.this.f66757m = animator;
        }
    }

    class c extends C9087g {
        c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            float unused = b.this.f66761q = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f66779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f66780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f66781c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f66782d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f66783e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f66784f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f66785g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Matrix f66786h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f66779a = f10;
            this.f66780b = f11;
            this.f66781c = f12;
            this.f66782d = f13;
            this.f66783e = f14;
            this.f66784f = f15;
            this.f66785g = f16;
            this.f66786h = matrix;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.f66767w.setAlpha(C9081a.b(this.f66779a, this.f66780b, 0.0f, 0.2f, floatValue));
            b.this.f66767w.setScaleX(C9081a.a(this.f66781c, this.f66782d, floatValue));
            b.this.f66767w.setScaleY(C9081a.a(this.f66783e, this.f66782d, floatValue));
            float unused = b.this.f66761q = C9081a.a(this.f66784f, this.f66785g, floatValue);
            b.this.h(C9081a.a(this.f66784f, this.f66785g, floatValue), this.f66786h);
            b.this.f66767w.setImageMatrix(this.f66786h);
        }
    }

    class e implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f66788a = new FloatEvaluator();

        e() {
        }

        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f66788a.evaluate(f10, f11, f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        public boolean onPreDraw() {
            b.this.H();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return 0.0f;
        }
    }

    private class h extends m {
        h() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            b bVar = b.this;
            return bVar.f66752h + bVar.f66753i;
        }
    }

    private class i extends m {
        i() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            b bVar = b.this;
            return bVar.f66752h + bVar.f66754j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return b.this.f66752h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f66795a;

        /* renamed from: b  reason: collision with root package name */
        private float f66796b;

        /* renamed from: c  reason: collision with root package name */
        private float f66797c;

        private m() {
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            b.this.g0((float) ((int) this.f66797c));
            this.f66795a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f66795a) {
                C9286g gVar = b.this.f66746b;
                this.f66796b = gVar == null ? 0.0f : gVar.w();
                this.f66797c = a();
                this.f66795a = true;
            }
            b bVar = b.this;
            float f10 = this.f66796b;
            bVar.g0((float) ((int) (f10 + ((this.f66797c - f10) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, C9272b bVar) {
        this.f66767w = floatingActionButton;
        this.f66768x = bVar;
        n nVar = new n();
        this.f66756l = nVar;
        nVar.a(f66736I, k(new i()));
        nVar.a(f66737J, k(new h()));
        nVar.a(f66738K, k(new h()));
        nVar.a(f66739L, k(new h()));
        nVar.a(f66740M, k(new l()));
        nVar.a(f66741N, k(new g()));
        this.f66760p = floatingActionButton.getRotation();
    }

    private boolean a0() {
        return C4600b0.S(this.f66767w) && !this.f66767w.isInEditMode();
    }

    /* access modifiers changed from: private */
    public void h(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f66767w.getDrawable();
        if (drawable != null && this.f66762r != 0) {
            RectF rectF = this.f66770z;
            RectF rectF2 = this.f66742A;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f66762r;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f66762r;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new e());
        }
    }

    private AnimatorSet i(C9088h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f66767w, View.ALPHA, new float[]{f10});
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f66767w, View.SCALE_X, new float[]{f11});
        hVar.e("scale").a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f66767w, View.SCALE_Y, new float[]{f11});
        hVar.e("scale").a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f12, this.f66743B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f66767w, new C9086f(), new c(), new Matrix[]{new Matrix(this.f66743B)});
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C9082b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new d(this.f66767w.getAlpha(), f10, this.f66767w.getScaleX(), f11, this.f66767w.getScaleY(), this.f66761q, f12, new Matrix(this.f66743B)));
        arrayList.add(ofFloat);
        C9082b.a(animatorSet, arrayList);
        animatorSet.setDuration((long) C9242i.f(this.f66767w.getContext(), i10, this.f66767w.getContext().getResources().getInteger(C9073g.f59510b)));
        animatorSet.setInterpolator(C9242i.g(this.f66767w.getContext(), i11, C9081a.f60372b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f66731D);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.f66744C == null) {
            this.f66744C = new f();
        }
        return this.f66744C;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void B() {
        C9286g gVar = this.f66746b;
        if (gVar != null) {
            Ua.h.f(this.f66767w, gVar);
        }
        if (K()) {
            this.f66767w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        ViewTreeObserver viewTreeObserver = this.f66767w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f66744C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f66744C = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int[] iArr) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void F(float f10, float f11, float f12) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void G(Rect rect) {
        H2.i.h(this.f66749e, "Didn't initialize content background");
        if (Z()) {
            this.f66768x.c(new InsetDrawable(this.f66749e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f66768x.c(this.f66749e);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        float rotation = this.f66767w.getRotation();
        if (this.f66760p != rotation) {
            this.f66760p = rotation;
            d0();
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        ArrayList<j> arrayList = this.f66766v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        ArrayList<j> arrayList = this.f66766v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        C9286g gVar = this.f66746b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        a aVar = this.f66748d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(PorterDuff.Mode mode) {
        C9286g gVar = this.f66746b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(float f10) {
        if (this.f66752h != f10) {
            this.f66752h = f10;
            F(f10, this.f66753i, this.f66754j);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f66750f = z10;
    }

    /* access modifiers changed from: package-private */
    public final void P(C9088h hVar) {
        this.f66759o = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void Q(float f10) {
        if (this.f66753i != f10) {
            this.f66753i = f10;
            F(this.f66752h, f10, this.f66754j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(float f10) {
        this.f66761q = f10;
        Matrix matrix = this.f66743B;
        h(f10, matrix);
        this.f66767w.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void S(int i10) {
        if (this.f66762r != i10) {
            this.f66762r = i10;
            e0();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        this.f66755k = i10;
    }

    /* access modifiers changed from: package-private */
    public final void U(float f10) {
        if (this.f66754j != f10) {
            this.f66754j = f10;
            F(this.f66752h, this.f66753i, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f66747c;
        if (drawable != null) {
            C6260a.o(drawable, C9270b.d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void W(boolean z10) {
        this.f66751g = z10;
        f0();
    }

    /* access modifiers changed from: package-private */
    public final void X(Ua.k kVar) {
        this.f66745a = kVar;
        C9286g gVar = this.f66746b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f66747c;
        if (drawable instanceof Ua.n) {
            ((Ua.n) drawable).setShapeAppearanceModel(kVar);
        }
        a aVar = this.f66748d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Y(C9088h hVar) {
        this.f66758n = hVar;
    }

    /* access modifiers changed from: package-private */
    public boolean Z() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b0() {
        return !this.f66750f || this.f66767w.getSizeDimension() >= this.f66755k;
    }

    /* access modifiers changed from: package-private */
    public void c0(k kVar, boolean z10) {
        if (!z()) {
            Animator animator = this.f66757m;
            if (animator != null) {
                animator.cancel();
            }
            boolean z11 = this.f66758n == null;
            if (a0()) {
                if (this.f66767w.getVisibility() != 0) {
                    float f10 = 0.0f;
                    this.f66767w.setAlpha(0.0f);
                    this.f66767w.setScaleY(z11 ? 0.4f : 0.0f);
                    this.f66767w.setScaleX(z11 ? 0.4f : 0.0f);
                    if (z11) {
                        f10 = 0.4f;
                    }
                    R(f10);
                }
                C9088h hVar = this.f66758n;
                AnimatorSet i10 = hVar != null ? i(hVar, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f, f66732E, f66733F);
                i10.addListener(new C1167b(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f66764t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        i10.addListener(it.next());
                    }
                }
                i10.start();
                return;
            }
            this.f66767w.b(0, z10);
            this.f66767w.setAlpha(1.0f);
            this.f66767w.setScaleY(1.0f);
            this.f66767w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        throw null;
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f66765u == null) {
            this.f66765u = new ArrayList<>();
        }
        this.f66765u.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public final void e0() {
        R(this.f66761q);
    }

    /* access modifiers changed from: package-private */
    public void f(Animator.AnimatorListener animatorListener) {
        if (this.f66764t == null) {
            this.f66764t = new ArrayList<>();
        }
        this.f66764t.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public final void f0() {
        Rect rect = this.f66769y;
        r(rect);
        G(rect);
        this.f66768x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void g(j jVar) {
        if (this.f66766v == null) {
            this.f66766v = new ArrayList<>();
        }
        this.f66766v.add(jVar);
    }

    /* access modifiers changed from: package-private */
    public void g0(float f10) {
        C9286g gVar = this.f66746b;
        if (gVar != null) {
            gVar.a0(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public final Drawable l() {
        return this.f66749e;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f66750f;
    }

    /* access modifiers changed from: package-private */
    public final C9088h o() {
        return this.f66759o;
    }

    /* access modifiers changed from: package-private */
    public float p() {
        return this.f66753i;
    }

    /* access modifiers changed from: package-private */
    public void r(Rect rect) {
        int v10 = v();
        float m10 = this.f66751g ? m() + this.f66754j : 0.0f;
        int max = Math.max(v10, (int) Math.ceil((double) m10));
        int max2 = Math.max(v10, (int) Math.ceil((double) (m10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public float s() {
        return this.f66754j;
    }

    /* access modifiers changed from: package-private */
    public final Ua.k t() {
        return this.f66745a;
    }

    /* access modifiers changed from: package-private */
    public final C9088h u() {
        return this.f66758n;
    }

    /* access modifiers changed from: package-private */
    public int v() {
        if (this.f66750f) {
            return Math.max((this.f66755k - this.f66767w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void w(k kVar, boolean z10) {
        if (!y()) {
            Animator animator = this.f66757m;
            if (animator != null) {
                animator.cancel();
            }
            if (a0()) {
                C9088h hVar = this.f66759o;
                AnimatorSet i10 = hVar != null ? i(hVar, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f, f66734G, f66735H);
                i10.addListener(new a(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f66765u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        i10.addListener(it.next());
                    }
                }
                i10.start();
                return;
            }
            this.f66767w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return this.f66767w.getVisibility() == 0 ? this.f66763s == 1 : this.f66763s != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        return this.f66767w.getVisibility() != 0 ? this.f66763s == 2 : this.f66763s != 1;
    }
}
