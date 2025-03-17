package com.google.android.material.snackbar;

import Ea.C9068b;
import Ea.C9074h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.sugarcube.app.base.data.source.CatalogRepository;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: J  reason: collision with root package name */
    private static final int[] f67212J;

    /* renamed from: K  reason: collision with root package name */
    private static final int[] f67213K;

    /* renamed from: H  reason: collision with root package name */
    private final AccessibilityManager f67214H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f67215I;

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), CatalogRepository.FETCH_FLAG_SDB));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public static class a extends BaseTransientBottomBar.r<Snackbar> {
        /* renamed from: c */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i10 = C9068b.f59319Y;
        f67212J = new int[]{i10};
        f67213K = new int[]{i10, C9068b.f59322a0};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, a aVar) {
        super(context, viewGroup, view, aVar);
        this.f67214H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup k0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button l0() {
        return m0().getActionView();
    }

    private SnackbarContentLayout m0() {
        return (SnackbarContentLayout) this.f67158i.getChildAt(0);
    }

    private TextView n0() {
        return m0().getMessageView();
    }

    private static boolean o0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f67213K);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        B(1);
    }

    public static Snackbar q0(View view, CharSequence charSequence, int i10) {
        return r0((Context) null, view, charSequence, i10);
    }

    private static Snackbar r0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup k02 = k0(view);
        if (k02 != null) {
            if (context == null) {
                context = k02.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(o0(context) ? C9074h.f59513B : C9074h.f59519c, k02, false);
            Snackbar snackbar = new Snackbar(context, k02, snackbarContentLayout, snackbarContentLayout);
            snackbar.w0(charSequence);
            snackbar.X(i10);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public void A() {
        super.A();
    }

    public int F() {
        int F10 = super.F();
        if (F10 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f67214H.getRecommendedTimeoutMillis(F10, (this.f67215I ? 4 : 0) | 3);
        } else if (!this.f67215I || !this.f67214H.isTouchExplorationEnabled()) {
            return F10;
        } else {
            return -2;
        }
    }

    public void b0() {
        super.b0();
    }

    public Snackbar s0(int i10, View.OnClickListener onClickListener) {
        return t0(E().getText(i10), onClickListener);
    }

    public Snackbar t0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button l02 = l0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            l02.setVisibility(8);
            l02.setOnClickListener((View.OnClickListener) null);
            this.f67215I = false;
        } else {
            this.f67215I = true;
            l02.setVisibility(0);
            l02.setText(charSequence);
            l02.setOnClickListener(new c(this, onClickListener));
        }
        return this;
    }

    public Snackbar u0(int i10) {
        return v0(ColorStateList.valueOf(i10));
    }

    public Snackbar v0(ColorStateList colorStateList) {
        this.f67158i.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar w0(CharSequence charSequence) {
        n0().setText(charSequence);
        return this;
    }
}
