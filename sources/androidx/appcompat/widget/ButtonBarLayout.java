package androidx.appcompat.widget;

import I2.C4600b0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import i.C5426f;
import i.C5430j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16165a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16166b;

    /* renamed from: c  reason: collision with root package name */
    private int f16167c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24094N0);
        C4600b0.n0(this, context, C5430j.f24094N0, attributeSet, obtainStyledAttributes, 0, 0);
        this.f16165a = obtainStyledAttributes.getBoolean(C5430j.f24098O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f16165a);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f16166b;
    }

    private void setStacked(boolean z10) {
        if (this.f16166b == z10) {
            return;
        }
        if (!z10 || this.f16165a) {
            this.f16166b = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(C5426f.f24004x);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f16165a) {
            if (size > this.f16167c && b()) {
                setStacked(false);
            }
            this.f16167c = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f16165a && !b() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a11 = a(a10 + 1);
                if (a11 >= 0) {
                    paddingTop += getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (C4600b0.A(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f16165a != z10) {
            this.f16165a = z10;
            if (!z10 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
