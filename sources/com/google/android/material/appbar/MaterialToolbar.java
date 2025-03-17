package com.google.android.material.appbar;

import Ea.C9068b;
import Ea.C9077k;
import I2.C4600b0;
import Ua.C9286g;
import Ua.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.t;
import com.sugarcube.app.base.data.source.CatalogRepository;
import y2.C6260a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: C0  reason: collision with root package name */
    private static final int f65952C0 = C9077k.f59590G;

    /* renamed from: D0  reason: collision with root package name */
    private static final ImageView.ScaleType[] f65953D0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: A0  reason: collision with root package name */
    private ImageView.ScaleType f65954A0;

    /* renamed from: B0  reason: collision with root package name */
    private Boolean f65955B0;

    /* renamed from: U  reason: collision with root package name */
    private Integer f65956U;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f65957y0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f65958z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59350o0);
    }

    private Pair<Integer, Integer> S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : d.f(background);
        if (valueOf != null) {
            C9286g gVar = new C9286g();
            gVar.b0(valueOf);
            gVar.Q(context);
            gVar.a0(C4600b0.u(this));
            C4600b0.t0(this, gVar);
        }
    }

    private void U(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, CatalogRepository.FETCH_FLAG_SDB), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.f65957y0 || this.f65958z0) {
            TextView g10 = t.g(this);
            TextView e10 = t.e(this);
            if (g10 != null || e10 != null) {
                Pair<Integer, Integer> S10 = S(g10, e10);
                if (this.f65957y0 && g10 != null) {
                    U(g10, S10);
                }
                if (this.f65958z0 && e10 != null) {
                    U(e10, S10);
                }
            }
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f65956U == null) {
            return drawable;
        }
        Drawable r10 = C6260a.r(drawable.mutate());
        C6260a.n(r10, this.f65956U.intValue());
        return r10;
    }

    private void X() {
        ImageView c10 = t.c(this);
        if (c10 != null) {
            Boolean bool = this.f65955B0;
            if (bool != null) {
                c10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f65954A0;
            if (scaleType != null) {
                c10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f65954A0;
    }

    public Integer getNavigationIconTint() {
        return this.f65956U;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f65955B0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f65955B0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f65954A0 != scaleType) {
            this.f65954A0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f65956U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f65958z0 != z10) {
            this.f65958z0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f65957y0 != z10) {
            this.f65957y0 = z10;
            requestLayout();
        }
    }

    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof f;
        if (z10) {
            ((f) menu).i0();
        }
        super.x(i10);
        if (z10) {
            ((f) menu).h0();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f65952C0
            android.content.Context r8 = Xa.C9359a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = Ea.C9078l.f59896a5
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r10 = Ea.C9078l.f59929d5
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L_0x002b
            int r10 = Ea.C9078l.f59929d5
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L_0x002b:
            int r10 = Ea.C9078l.f59951f5
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f65957y0 = r10
            int r10 = Ea.C9078l.f59940e5
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f65958z0 = r10
            int r10 = Ea.C9078l.f59918c5
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L_0x004c
            android.widget.ImageView$ScaleType[] r0 = f65953D0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004c
            r10 = r0[r10]
            r7.f65954A0 = r10
        L_0x004c:
            int r10 = Ea.C9078l.f59907b5
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x0060
            int r10 = Ea.C9078l.f59907b5
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f65955B0 = r10
        L_0x0060:
            r9.recycle()
            r7.T(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
