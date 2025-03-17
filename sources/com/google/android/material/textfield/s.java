package com.google.android.material.textfield;

import I2.C4600b0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import y2.C6260a;

class s {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C6260a.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C6260a.o(drawable, colorStateList);
            } else {
                C6260a.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C6260a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static ImageView.ScaleType b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    private static int[] c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C6260a.r(drawable).mutate();
            C6260a.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    static void e(CheckableImageButton checkableImageButton) {
    }

    private static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean O10 = C4600b0.O(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        boolean z11 = onLongClickListener != null;
        if (O10 || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(O10);
        checkableImageButton.setPressable(O10);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i10 = 2;
        }
        C4600b0.z0(checkableImageButton, i10);
    }

    static void g(CheckableImageButton checkableImageButton, int i10) {
        checkableImageButton.setMinimumWidth(i10);
        checkableImageButton.setMinimumHeight(i10);
    }

    static void h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
