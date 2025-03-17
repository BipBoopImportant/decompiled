package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Path f66828a;

    /* renamed from: b  reason: collision with root package name */
    private float f66829b;

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f66828a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f66828a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.f66829b;
    }
}
