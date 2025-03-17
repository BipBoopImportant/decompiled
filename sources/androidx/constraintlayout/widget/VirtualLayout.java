package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p2.l;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: j  reason: collision with root package name */
    private boolean f20284j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20285k;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f20616V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20675c1) {
                    this.f20284j = true;
                } else if (index == f.f20738j1) {
                    this.f20285k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20284j || this.f20285k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f20148b; i10++) {
                    View q10 = constraintLayout.q(this.f20147a[i10]);
                    if (q10 != null) {
                        if (this.f20284j) {
                            q10.setVisibility(visibility);
                        }
                        if (this.f20285k && elevation > 0.0f) {
                            q10.setTranslationZ(q10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(l lVar, int i10, int i11) {
    }
}
