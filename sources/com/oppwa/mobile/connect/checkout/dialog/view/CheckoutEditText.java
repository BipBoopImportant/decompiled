package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.oppwa.mobile.connect.R;

public class CheckoutEditText extends TextInputEditText {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f121339b = {R.attr.state_error};

    /* renamed from: a  reason: collision with root package name */
    private boolean f121340a;

    public CheckoutEditText(Context context) {
        super(context);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Typeface a10 = a.a(context, attributeSet, R.styleable.CheckoutView, R.styleable.CheckoutView_typeface);
        if (a10 != null) {
            setTypeface(a10);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        if (!this.f121340a) {
            return super.onCreateDrawableState(i10);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        View.mergeDrawableStates(onCreateDrawableState, f121339b);
        return onCreateDrawableState;
    }

    public void setErrorState(boolean z10) {
        if (this.f121340a != z10) {
            this.f121340a = z10;
            refreshDrawableState();
        }
    }

    public CheckoutEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CheckoutEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
