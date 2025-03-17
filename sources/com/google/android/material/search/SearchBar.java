package com.google.android.material.search;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9071e;
import Ea.C9077k;
import I2.C4600b0;
import La.C9138a;
import Ua.C9286g;
import Ua.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.t;
import y2.C6260a;

public class SearchBar extends Toolbar {

    /* renamed from: J0  reason: collision with root package name */
    private static final int f67065J0 = C9077k.f59607q;

    /* renamed from: A0  reason: collision with root package name */
    private final Drawable f67066A0;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f67067B0;

    /* renamed from: C0  reason: collision with root package name */
    private final boolean f67068C0;

    /* renamed from: D0  reason: collision with root package name */
    private View f67069D0;

    /* renamed from: E0  reason: collision with root package name */
    private Integer f67070E0;

    /* renamed from: F0  reason: collision with root package name */
    private Drawable f67071F0;

    /* renamed from: G0  reason: collision with root package name */
    private int f67072G0;

    /* renamed from: H0  reason: collision with root package name */
    private boolean f67073H0;

    /* renamed from: I0  reason: collision with root package name */
    private C9286g f67074I0;

    /* renamed from: U  reason: collision with root package name */
    private final TextView f67075U;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f67076y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f67077z0;

    static class a extends O2.a {
        public static final Parcelable.Creator<a> CREATOR = new C1170a();

        /* renamed from: c  reason: collision with root package name */
        String f67079c;

        /* renamed from: com.google.android.material.search.SearchBar$a$a  reason: collision with other inner class name */
        class C1170a implements Parcelable.ClassLoaderCreator<a> {
            C1170a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            /* renamed from: c */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f67079c);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f67079c = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private int S(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    private void T() {
        View view = this.f67069D0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i10 = measuredWidth2 + measuredWidth;
            int measuredHeight = this.f67069D0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            U(this.f67069D0, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
        }
    }

    private void U(View view, int i10, int i11, int i12, int i13) {
        if (C4600b0.z(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    private Drawable V(Drawable drawable) {
        int i10;
        if (!this.f67067B0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f67070E0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = C9138a.d(this, drawable == this.f67066A0 ? C9068b.f59347n : C9068b.f59345m);
        }
        Drawable r10 = C6260a.r(drawable.mutate());
        C6260a.n(r10, i10);
        return r10;
    }

    private void W(int i10, int i11) {
        View view = this.f67069D0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void X() {
        if (this.f67077z0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C9070d.f59372A);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = S(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = S(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = S(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = S(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void Y() {
        if (Build.VERSION.SDK_INT >= 34) {
            boolean z10 = true;
            int i10 = 0;
            if (getLayoutDirection() != 1) {
                z10 = false;
            }
            ImageButton d10 = t.d(this);
            int width = (d10 == null || !d10.isClickable()) ? 0 : z10 ? getWidth() - d10.getLeft() : d10.getRight();
            ActionMenuView a10 = t.a(this);
            if (a10 != null) {
                i10 = z10 ? a10.getRight() : getWidth() - a10.getLeft();
            }
            float f10 = (float) (-(z10 ? i10 : width));
            if (!z10) {
                width = i10;
            }
            setHandwritingBoundsOffsets(f10, 0.0f, (float) (-width), 0.0f);
        }
    }

    private void Z() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f67073H0) {
                if (eVar.c() == 0) {
                    eVar.g(53);
                }
            } else if (eVar.c() == 53) {
                eVar.g(0);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton d10 = t.d(this);
        if (d10 != null) {
            d10.setClickable(!z10);
            d10.setFocusable(!z10);
            Drawable background = d10.getBackground();
            if (background != null) {
                this.f67071F0 = background;
            }
            d10.setBackgroundDrawable(z10 ? null : this.f67071F0);
            Y();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f67076y0 && this.f67069D0 == null && !(view instanceof ActionMenuView)) {
            this.f67069D0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f67069D0;
    }

    /* access modifiers changed from: package-private */
    public float getCompatElevation() {
        C9286g gVar = this.f67074I0;
        return gVar != null ? gVar.w() : C4600b0.u(this);
    }

    public float getCornerSize() {
        return this.f67074I0.J();
    }

    /* access modifiers changed from: protected */
    public int getDefaultMarginVerticalResource() {
        return C9070d.f59373B;
    }

    /* access modifiers changed from: protected */
    public int getDefaultNavigationIconResource() {
        return C9071e.f59448c;
    }

    public CharSequence getHint() {
        return this.f67075U.getHint();
    }

    /* access modifiers changed from: package-private */
    public int getMenuResId() {
        return this.f67072G0;
    }

    public int getStrokeColor() {
        return this.f67074I0.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f67074I0.H();
    }

    public CharSequence getText() {
        return this.f67075U.getText();
    }

    public TextView getTextView() {
        return this.f67075U;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f67074I0);
        X();
        Z();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        T();
        Y();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        W(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText((CharSequence) aVar.f67079c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f67079c = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f67069D0;
        if (view2 != null) {
            removeView(view2);
            this.f67069D0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f67073H0 = z10;
        Z();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        C9286g gVar = this.f67074I0;
        if (gVar != null) {
            gVar.a0(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f67075U.setHint(charSequence);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(V(drawable));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (!this.f67068C0) {
            super.setNavigationOnClickListener(onClickListener);
            setNavigationIconDecorative(onClickListener == null);
        }
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f67074I0.j0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f67074I0.k0(f10);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f67075U.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof f;
        if (z10) {
            ((f) menu).i0();
        }
        super.x(i10);
        this.f67072G0 = i10;
        if (z10) {
            ((f) menu).h0();
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h  reason: collision with root package name */
        private boolean f67078h = false;

        public ScrollingViewBehavior() {
        }

        private void Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        /* access modifiers changed from: protected */
        public boolean T() {
            return true;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean l10 = super.l(coordinatorLayout, view, view2);
            if (!this.f67078h && (view2 instanceof AppBarLayout)) {
                this.f67078h = true;
                Y((AppBarLayout) view2);
            }
            return l10;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public void setHint(int i10) {
        this.f67075U.setHint(i10);
    }

    public void setText(int i10) {
        this.f67075U.setText(i10);
    }
}
