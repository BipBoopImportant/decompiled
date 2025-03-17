package com.google.android.material.floatingactionbutton;

import Ea.C9077k;
import Ea.C9078l;
import Fa.C9088h;
import I2.C4600b0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: A  reason: collision with root package name */
    static final Property<View, Float> f66674A;

    /* renamed from: B  reason: collision with root package name */
    static final Property<View, Float> f66675B;

    /* renamed from: C  reason: collision with root package name */
    static final Property<View, Float> f66676C;

    /* renamed from: D  reason: collision with root package name */
    static final Property<View, Float> f66677D;

    /* renamed from: z  reason: collision with root package name */
    private static final int f66678z = C9077k.f59585B;

    /* renamed from: r  reason: collision with root package name */
    private final int f66679r;

    /* renamed from: s  reason: collision with root package name */
    private int f66680s;

    /* renamed from: t  reason: collision with root package name */
    private int f66681t;

    /* renamed from: u  reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f66682u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f66683v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f66684w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f66685x;

    /* renamed from: y  reason: collision with root package name */
    protected ColorStateList f66686y;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C4600b0.E(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            C4600b0.F0(view, f10.intValue(), view.getPaddingTop(), C4600b0.D(view), view.getPaddingBottom());
        }
    }

    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C4600b0.D(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            C4600b0.F0(view, C4600b0.E(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    static {
        Class<Float> cls = Float.class;
        f66674A = new a(cls, "width");
        f66675B = new b(cls, "height");
        f66676C = new c(cls, "paddingStart");
        f66677D = new d(cls, "paddingEnd");
    }

    /* access modifiers changed from: private */
    public void k(int i10, e eVar) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            throw null;
        }
        throw new IllegalStateException("Unknown strategy type: " + i10);
    }

    private void l() {
        this.f66686y = getTextColors();
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f66682u;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        int i10 = this.f66679r;
        return i10 < 0 ? (Math.min(C4600b0.E(this), C4600b0.D(this)) * 2) + getIconSize() : i10;
    }

    public C9088h getExtendMotionSpec() {
        throw null;
    }

    public C9088h getHideMotionSpec() {
        throw null;
    }

    public C9088h getShowMotionSpec() {
        throw null;
    }

    public C9088h getShrinkMotionSpec() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f66683v && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f66683v = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f66685x = z10;
    }

    public void setExtendMotionSpec(C9088h hVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(C9088h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f66683v != z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(C9088h hVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C9088h.c(getContext(), i10));
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (this.f66683v && !this.f66684w) {
            this.f66680s = C4600b0.E(this);
            this.f66681t = C4600b0.D(this);
        }
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (this.f66683v && !this.f66684w) {
            this.f66680s = i10;
            this.f66681t = i12;
        }
    }

    public void setShowMotionSpec(C9088h hVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C9088h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(C9088h hVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(C9088h.c(getContext(), i10));
    }

    public void setTextColor(int i10) {
        super.setTextColor(i10);
        l();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f66687a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f66688b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f66689c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f66688b = false;
            this.f66689c = true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f66688b || this.f66689c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f66687a == null) {
                this.f66687a = new Rect();
            }
            Rect rect = this.f66687a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        private boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f66689c ? 3 : 0, (e) null);
        }

        /* renamed from: J */
        public boolean f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: L */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!K(view)) {
                return false;
            } else {
                Q(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: M */
        public boolean p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> r10 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        /* access modifiers changed from: protected */
        public void O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f66689c ? 2 : 1, (e) null);
        }

        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f20925h == 0) {
                fVar.f20925h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59981i2);
            this.f66688b = obtainStyledAttributes.getBoolean(C9078l.f59992j2, false);
            this.f66689c = obtainStyledAttributes.getBoolean(C9078l.f60003k2, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        l();
    }
}
