package com.google.android.material.floatingactionbutton;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9088h;
import Fa.C9091k;
import H2.i;
import I2.C4600b0;
import Oa.C9153a;
import Oa.C9154b;
import Ta.C9272b;
import Ua.k;
import Ua.n;
import Wa.C9345a;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C4993e;
import androidx.appcompat.widget.C4997i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.List;
import y2.C6260a;

public class FloatingActionButton extends VisibilityAwareImageButton implements C9153a, n, CoordinatorLayout.b {

    /* renamed from: r  reason: collision with root package name */
    private static final int f66690r = C9077k.f59601k;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f66691b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f66692c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f66693d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f66694e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f66695f;

    /* renamed from: g  reason: collision with root package name */
    private int f66696g;

    /* renamed from: h  reason: collision with root package name */
    private int f66697h;

    /* renamed from: i  reason: collision with root package name */
    private int f66698i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f66699j;

    /* renamed from: k  reason: collision with root package name */
    private int f66700k;

    /* renamed from: l  reason: collision with root package name */
    boolean f66701l;

    /* renamed from: m  reason: collision with root package name */
    final Rect f66702m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f66703n;

    /* renamed from: o  reason: collision with root package name */
    private final C4997i f66704o;

    /* renamed from: p  reason: collision with root package name */
    private final C9154b f66705p;

    /* renamed from: q  reason: collision with root package name */
    private b f66706q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean M(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements b.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f66710a;

        a(b bVar) {
            this.f66710a = bVar;
        }

        public void a() {
            this.f66710a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f66710a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements C9272b {
        c() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f66702m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f66699j, i11 + FloatingActionButton.this.f66699j, i12 + FloatingActionButton.this.f66699j, i13 + FloatingActionButton.this.f66699j);
        }

        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public boolean d() {
            return FloatingActionButton.this.f66701l;
        }
    }

    class d<T extends FloatingActionButton> implements b.j {
        d(C9091k<T> kVar) {
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59358w);
    }

    private b getImpl() {
        if (this.f66706q == null) {
            this.f66706q = h();
        }
        return this.f66706q;
    }

    private b h() {
        return new c(this, new c());
    }

    private int k(int i10) {
        int i11 = this.f66698i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(C9070d.f59404d) : resources.getDimensionPixelSize(C9070d.f59402c) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private void l(Rect rect) {
        j(rect);
        int i10 = -this.f66706q.v();
        rect.inset(i10, i10);
    }

    private void q(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f66702m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f66693d;
            if (colorStateList == null) {
                C6260a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f66694e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C4993e.e(colorForState, mode));
        }
    }

    private b.k v(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public boolean a() {
        return this.f66705p.c();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(C9091k<? extends FloatingActionButton> kVar) {
        getImpl().g(new d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f66691b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f66692c;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f66698i;
    }

    public int getExpandedComponentIdHint() {
        return this.f66705p.b();
    }

    public C9088h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f66695f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f66695f;
    }

    public k getShapeAppearanceModel() {
        return (k) i.g(getImpl().t());
    }

    public C9088h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f66697h;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return k(this.f66697h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f66693d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f66694e;
    }

    public boolean getUseCompatPadding() {
        return this.f66701l;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!C4600b0.S(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void n(b bVar, boolean z10) {
        getImpl().w(v(bVar), z10);
    }

    public boolean o() {
        return getImpl().y();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f66699j = (sizeDimension - this.f66700k) / 2;
        getImpl().f0();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f66702m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9345a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9345a aVar = (C9345a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f66705p.d((Bundle) i.g(aVar.f64614c.get("expandableWidgetHelper")));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C9345a aVar = new C9345a(onSaveInstanceState);
        aVar.f64614c.put("expandableWidgetHelper", this.f66705p.e());
        return aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f66703n);
            if (!this.f66703n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().z();
    }

    public void s() {
        t((b) null);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f66691b != colorStateList) {
            this.f66691b = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f66692c != mode) {
            this.f66692c = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().N(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().U(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f66698i) {
            this.f66698i = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().g0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().O(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f66705p.f(i10);
    }

    public void setHideMotionSpec(C9088h hVar) {
        getImpl().P(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C9088h.c(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f66693d != null) {
                r();
            }
        }
    }

    public void setImageResource(int i10) {
        this.f66704o.i(i10);
        r();
    }

    public void setMaxImageSize(int i10) {
        this.f66700k = i10;
        getImpl().S(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().W(z10);
    }

    public void setShapeAppearanceModel(k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(C9088h hVar) {
        getImpl().Y(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C9088h.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f66698i = 0;
        if (i10 != this.f66697h) {
            this.f66697h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f66693d != colorStateList) {
            this.f66693d = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f66694e != mode) {
            this.f66694e = mode;
            r();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f66701l != z10) {
            this.f66701l = z10;
            getImpl().C();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void t(b bVar) {
        u(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void u(b bVar, boolean z10) {
        getImpl().c0(v(bVar), z10);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f66707a;

        /* renamed from: b  reason: collision with root package name */
        private b f66708b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f66709c;

        public BaseBehavior() {
            this.f66709c = true;
        }

        private static boolean J(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void K(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f66702m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i10 = 0;
                int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    C4600b0.Z(floatingActionButton, i10);
                }
                if (i11 != 0) {
                    C4600b0.Y(floatingActionButton, i11);
                }
            }
        }

        private boolean N(View view, FloatingActionButton floatingActionButton) {
            return this.f66709c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f66707a == null) {
                this.f66707a = new Rect();
            }
            Rect rect = this.f66707a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.f66708b, false);
                return true;
            }
            floatingActionButton.u(this.f66708b, false);
            return true;
        }

        private boolean P(View view, FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.n(this.f66708b, false);
                return true;
            }
            floatingActionButton.u(this.f66708b, false);
            return true;
        }

        /* renamed from: I */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f66702m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: L */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!J(view)) {
                return false;
            } else {
                P(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: M */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> r10 = coordinatorLayout.r(floatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f20925h == 0) {
                fVar.f20925h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59631B2);
            this.f66709c = obtainStyledAttributes.getBoolean(C9078l.f59642C2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f66690r
            android.content.Context r11 = Xa.C9359a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f66702m = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f66703n = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = Ea.C9078l.f60014l2
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r1 = Ea.C9078l.f60036n2
            android.content.res.ColorStateList r1 = Ra.c.a(r11, r0, r1)
            r10.f66691b = r1
            int r1 = Ea.C9078l.f60047o2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.k(r1, r3)
            r10.f66692c = r1
            int r1 = Ea.C9078l.f60157y2
            android.content.res.ColorStateList r1 = Ra.c.a(r11, r0, r1)
            r10.f66695f = r1
            int r1 = Ea.C9078l.f60102t2
            int r1 = r0.getInt(r1, r2)
            r10.f66697h = r1
            int r1 = Ea.C9078l.f60091s2
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f66698i = r1
            int r1 = Ea.C9078l.f60058p2
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f66696g = r1
            int r1 = Ea.C9078l.f60069q2
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = Ea.C9078l.f60124v2
            float r3 = r0.getDimension(r3, r2)
            int r4 = Ea.C9078l.f60146x2
            float r2 = r0.getDimension(r4, r2)
            int r4 = Ea.C9078l.f59620A2
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f66701l = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = Ea.C9070d.f59427o0
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = Ea.C9078l.f60135w2
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = Ea.C9078l.f60168z2
            Fa.h r5 = Fa.C9088h.b(r11, r0, r5)
            int r8 = Ea.C9078l.f60113u2
            Fa.h r8 = Fa.C9088h.b(r11, r0, r8)
            Ua.c r9 = Ua.k.f64059m
            Ua.k$b r11 = Ua.k.g(r11, r12, r13, r6, r9)
            Ua.k r11 = r11.m()
            int r6 = Ea.C9078l.f60080r2
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = Ea.C9078l.f60025m2
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.i r0 = new androidx.appcompat.widget.i
            r0.<init>(r10)
            r10.f66704o = r0
            r0.g(r12, r13)
            Oa.b r12 = new Oa.b
            r12.<init>(r10)
            r10.f66705p = r12
            com.google.android.material.floatingactionbutton.b r12 = r10.getImpl()
            r12.X(r11)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f66691b
            android.graphics.PorterDuff$Mode r13 = r10.f66692c
            android.content.res.ColorStateList r0 = r10.f66695f
            int r7 = r10.f66696g
            r11.x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.T(r4)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.N(r1)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.Q(r3)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.U(r2)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.Y(r5)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.P(r8)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.O(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f66695f != colorStateList) {
            this.f66695f = colorStateList;
            getImpl().V(this.f66695f);
        }
    }
}
