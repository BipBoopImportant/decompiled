package Ma;

import Ea.C9070d;
import Ea.C9078l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import com.google.android.material.internal.s;

/* renamed from: Ma.c  reason: case insensitive filesystem */
public class C9141c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray i12 = s.i(context, (AttributeSet) null, C9078l.f59916c3, i10, i11, new int[0]);
        int dimensionPixelSize = i12.getDimensionPixelSize(C9078l.f59949f3, context.getResources().getDimensionPixelSize(C9070d.f59393V));
        int dimensionPixelSize2 = i12.getDimensionPixelSize(C9078l.f59960g3, context.getResources().getDimensionPixelSize(C9070d.f59394W));
        int dimensionPixelSize3 = i12.getDimensionPixelSize(C9078l.f59938e3, context.getResources().getDimensionPixelSize(C9070d.f59392U));
        int dimensionPixelSize4 = i12.getDimensionPixelSize(C9078l.f59927d3, context.getResources().getDimensionPixelSize(C9070d.f59391T));
        i12.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i13 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i13;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
