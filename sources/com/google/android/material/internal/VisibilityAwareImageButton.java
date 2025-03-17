package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f66862a;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f66862a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f66862a;
    }

    public void setVisibility(int i10) {
        b(i10, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66862a = getVisibility();
    }
}
