package com.google.android.material.internal;

import Ea.C9072f;
import Ea.C9078l;
import I2.C4600b0;
import I2.C4638v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f66830a;

    /* renamed from: b  reason: collision with root package name */
    private int f66831b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66832c;

    /* renamed from: d  reason: collision with root package name */
    private int f66833d;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9078l.f59653D2, 0, 0);
        this.f66830a = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59675F2, 0);
        this.f66831b = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59664E2, 0);
        obtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(C9072f.f59469L);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.f66832c;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f66831b;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f66830a;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f66833d;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f66833d = 0;
            return;
        }
        this.f66833d = 1;
        boolean z11 = C4600b0.z(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C9072f.f59469L, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = C4638v.b(marginLayoutParams);
                    i15 = C4638v.a(marginLayoutParams);
                } else {
                    i15 = 0;
                    i14 = 0;
                }
                int measuredWidth = i17 + i14 + childAt.getMeasuredWidth();
                if (!this.f66832c && measuredWidth > i16) {
                    i18 = this.f66830a + paddingTop;
                    this.f66833d++;
                    i17 = paddingRight;
                }
                childAt.setTag(C9072f.f59469L, Integer.valueOf(this.f66833d - 1));
                int i20 = i17 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i14, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += i14 + i15 + childAt.getMeasuredWidth() + this.f66831b;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                int i19 = i10;
                int i20 = i11;
            } else {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                int i21 = paddingLeft;
                if (paddingLeft + i13 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i14 = i21;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.f66830a + paddingTop;
                }
                int measuredWidth = i14 + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i14 + i13 + i12 + childAt.getMeasuredWidth() + this.f66831b;
                if (i18 == getChildCount() - 1) {
                    i17 += i12;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i10) {
        this.f66831b = i10;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i10) {
        this.f66830a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f66832c = z10;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66832c = false;
        d(context, attributeSet);
    }
}
