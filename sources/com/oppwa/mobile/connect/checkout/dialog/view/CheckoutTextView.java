package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.oppwa.mobile.connect.R;

public class CheckoutTextView extends AppCompatTextView {
    public CheckoutTextView(Context context) {
        super(context);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Typeface a10 = a.a(context, attributeSet, R.styleable.CheckoutView, R.styleable.CheckoutView_typeface);
        if (a10 != null) {
            setTypeface(a10);
        }
    }

    public CheckoutTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CheckoutTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
