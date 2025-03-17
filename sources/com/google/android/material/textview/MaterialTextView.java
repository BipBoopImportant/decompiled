package com.google.android.material.textview;

import Ea.C9068b;
import Ea.C9078l;
import Ra.b;
import Ra.c;
import Xa.C9359a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void d(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, C9078l.f59805R4);
        int i11 = i(getContext(), obtainStyledAttributes, C9078l.f59825T4, C9078l.f59835U4);
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    private static boolean f(Context context) {
        return b.b(context, C9068b.f59342k0, true);
    }

    private static int g(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C9078l.f59845V4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(C9078l.f59855W4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void h(AttributeSet attributeSet, int i10, int i11) {
        int g10;
        Context context = getContext();
        if (f(context)) {
            Resources.Theme theme = context.getTheme();
            if (!j(context, theme, attributeSet, i10, i11) && (g10 = g(theme, attributeSet, i10, i11)) != -1) {
                d(theme, g10);
            }
        }
    }

    private static int i(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C9078l.f59845V4, i10, i11);
        int i12 = i(context, obtainStyledAttributes, C9078l.f59865X4, C9078l.f59875Y4);
        obtainStyledAttributes.recycle();
        return i12 != -1;
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (f(context)) {
            d(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        super(C9359a.c(context, attributeSet, i10, 0), attributeSet, i10);
        h(attributeSet, i10, 0);
    }
}
