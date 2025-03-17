package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;

public class MotionHelper extends ConstraintHelper implements MotionLayout.c {

    /* renamed from: j  reason: collision with root package name */
    private boolean f20004j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20005k;

    /* renamed from: l  reason: collision with root package name */
    private float f20006l;

    /* renamed from: m  reason: collision with root package name */
    protected View[] f20007m;

    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    public void b(MotionLayout motionLayout, int i10) {
    }

    public void c(MotionLayout motionLayout, int i10, int i11) {
    }

    public float getProgress() {
        return this.f20006l;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f20566O6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20582Q6) {
                    this.f20004j = obtainStyledAttributes.getBoolean(index, this.f20004j);
                } else if (index == f.f20574P6) {
                    this.f20005k = obtainStyledAttributes.getBoolean(index, this.f20005k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f20006l = f10;
        int i10 = 0;
        if (this.f20148b > 0) {
            this.f20007m = l((ConstraintLayout) getParent());
            while (i10 < this.f20148b) {
                x(this.f20007m[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f20005k;
    }

    public boolean v() {
        return this.f20004j;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
