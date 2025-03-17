package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

class a {
    static Typeface a(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Typeface b10 = b.b(context, obtainStyledAttributes.getString(i10));
        obtainStyledAttributes.recycle();
        return b10;
    }
}
