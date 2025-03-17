package androidx.appcompat.widget;

import I2.C4600b0;
import I2.C4618k0;
import I2.C4620l0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import i.C5421a;
import i.C5430j;

abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final a f15937a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f15938b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f15939c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuPresenter f15940d;

    /* renamed from: e  reason: collision with root package name */
    protected int f15941e;

    /* renamed from: f  reason: collision with root package name */
    protected C4618k0 f15942f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15943g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15944h;

    protected class a implements C4620l0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15945a = false;

        /* renamed from: b  reason: collision with root package name */
        int f15946b;

        protected a() {
        }

        public void a(View view) {
            this.f15945a = true;
        }

        public void b(View view) {
            if (!this.f15945a) {
                AbsActionBarView absActionBarView = AbsActionBarView.this;
                absActionBarView.f15942f = null;
                AbsActionBarView.super.setVisibility(this.f15946b);
            }
        }

        public void c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f15945a = false;
        }

        public a d(C4618k0 k0Var, int i10) {
            AbsActionBarView.this.f15942f = k0Var;
            this.f15946b = i10;
            return this;
        }
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public C4618k0 f(int i10, long j10) {
        C4618k0 k0Var = this.f15942f;
        if (k0Var != null) {
            k0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C4618k0 b10 = C4600b0.e(this).b(1.0f);
            b10.f(j10);
            b10.h(this.f15937a.d(b10, i10));
            return b10;
        }
        C4618k0 b11 = C4600b0.e(this).b(0.0f);
        b11.f(j10);
        b11.h(this.f15937a.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        return this.f15942f != null ? this.f15937a.f15946b : getVisibility();
    }

    public int getContentHeight() {
        return this.f15941e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C5430j.f24145a, C5421a.f23888c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C5430j.f24190j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f15940d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f15944h = false;
        }
        if (!this.f15944h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f15944h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f15944h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15943g = false;
        }
        if (!this.f15943g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f15943g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15943g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f15941e = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C4618k0 k0Var = this.f15942f;
            if (k0Var != null) {
                k0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15937a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5421a.f23886a, typedValue, true) || typedValue.resourceId == 0) {
            this.f15938b = context;
        } else {
            this.f15938b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
