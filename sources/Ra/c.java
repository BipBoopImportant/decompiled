package Ra;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

public class c {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = j.C5443a.a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = j.C5443a.a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.c.a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = j.C5443a.a(r1, (r0 = r2.n(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.Context r1, androidx.appcompat.widget.M r2, int r3) {
        /*
            boolean r0 = r2.s(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.n(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = j.C5443a.a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.c(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.c.b(android.content.Context, androidx.appcompat.widget.M, int):android.content.res.ColorStateList");
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = j.C5443a.b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable d(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = j.C5443a.b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.c.d(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static float e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int f(TypedArray typedArray, int i10, int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    public static d g(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
