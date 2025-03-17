package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ar.core.ImageMetadata;
import i.C5426f;
import i.C5430j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f15948a;

    /* renamed from: b  reason: collision with root package name */
    private View f15949b;

    /* renamed from: c  reason: collision with root package name */
    private View f15950c;

    /* renamed from: d  reason: collision with root package name */
    private View f15951d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f15952e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f15953f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f15954g;

    /* renamed from: h  reason: collision with root package name */
    boolean f15955h;

    /* renamed from: i  reason: collision with root package name */
    boolean f15956i;

    /* renamed from: j  reason: collision with root package name */
    private int f15957j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C4989a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24145a);
        this.f15952e = obtainStyledAttributes.getDrawable(C5430j.f24150b);
        this.f15953f = obtainStyledAttributes.getDrawable(C5430j.f24160d);
        this.f15957j = obtainStyledAttributes.getDimensionPixelSize(C5430j.f24190j, -1);
        boolean z10 = true;
        if (getId() == C5426f.f24005y) {
            this.f15955h = true;
            this.f15954g = obtainStyledAttributes.getDrawable(C5430j.f24155c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f15955h ? !(this.f15952e == null && this.f15953f == null) : this.f15954g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15952e;
        if (drawable != null && drawable.isStateful()) {
            this.f15952e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f15953f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f15953f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f15954g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f15954g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f15949b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15952e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f15953f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f15954g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f15950c = findViewById(C5426f.f23981a);
        this.f15951d = findViewById(C5426f.f23986f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f15948a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f15949b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f15955h
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f15954g
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f15952e
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f15950c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f15952e
            android.view.View r7 = r4.f15950c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f15950c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f15950c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f15950c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f15951d
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f15952e
            android.view.View r7 = r4.f15951d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f15951d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f15951d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f15951d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f15952e
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f15956i = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f15953f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f15950c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f15957j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f15950c != null) {
            int mode = View.MeasureSpec.getMode(i11);
            View view = this.f15949b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f15950c) ? a(this.f15950c) : !b(this.f15951d) ? a(this.f15951d) : 0) + a(this.f15949b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f15952e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f15952e);
        }
        this.f15952e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f15950c;
            if (view != null) {
                this.f15952e.setBounds(view.getLeft(), this.f15950c.getTop(), this.f15950c.getRight(), this.f15950c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f15955h ? this.f15952e == null && this.f15953f == null : this.f15954g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f15954g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f15954g);
        }
        this.f15954g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f15955h && (drawable2 = this.f15954g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f15955h ? this.f15952e == null && this.f15953f == null : this.f15954g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f15953f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f15953f);
        }
        this.f15953f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f15956i && (drawable2 = this.f15953f) != null) {
                drawable2.setBounds(this.f15949b.getLeft(), this.f15949b.getTop(), this.f15949b.getRight(), this.f15949b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f15955h ? this.f15952e == null && this.f15953f == null : this.f15954g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f15949b;
        if (view != null) {
            removeView(view);
        }
        this.f15949b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f15948a = z10;
        setDescendantFocusability(z10 ? ImageMetadata.HOT_PIXEL_MODE : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f15952e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f15953f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f15954g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f15952e && !this.f15955h) || (drawable == this.f15953f && this.f15956i) || ((drawable == this.f15954g && this.f15955h) || super.verifyDrawable(drawable));
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
