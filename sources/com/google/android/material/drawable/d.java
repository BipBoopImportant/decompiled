package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.util.Arrays;
import y2.C6260a;

public final class d {

    private static class a {
        static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class b {
        static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    public static Drawable b(Drawable drawable, Drawable drawable2, int i10, int i11) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i10 == -1) {
            i10 = h(drawable, drawable2);
        }
        if (i11 == -1) {
            i11 = g(drawable, drawable2);
        }
        if (i10 > drawable.getIntrinsicWidth() || i11 > drawable.getIntrinsicHeight()) {
            float f10 = ((float) i10) / ((float) i11);
            if (f10 >= ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int i12 = intrinsicWidth;
                i11 = (int) (((float) intrinsicWidth) / f10);
                i10 = i12;
            } else {
                i11 = drawable.getIntrinsicHeight();
                i10 = (int) (f10 * ((float) i11));
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i10, i11);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return d(drawable, colorStateList, mode, false);
    }

    private static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = C6260a.r(drawable).mutate();
            if (mode != null) {
                C6260a.p(drawable, mode);
            }
        } else if (z10) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] e(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static ColorStateList f(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !a.a(drawable)) {
            return null;
        }
        return b.a(drawable).getColorStateList();
    }

    private static int g(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int h(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.AttributeSet i(android.content.Context r3, int r4, java.lang.CharSequence r5) {
        /*
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
        L_0x0008:
            int r0 = r3.next()     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            r1 = 2
            if (r0 == r1) goto L_0x0012
            r2 = 1
            if (r0 != r2) goto L_0x0008
        L_0x0012:
            if (r0 != r1) goto L_0x0043
            java.lang.String r0 = r3.getName()     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0027
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = move-exception
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            goto L_0x004b
        L_0x0027:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            java.lang.String r1 = "Must have a <"
            r0.append(r1)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            java.lang.String r5 = "> start tag"
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            java.lang.String r5 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            r3.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            throw r3     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
        L_0x0043:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
            throw r3     // Catch:{ XmlPullParserException -> 0x0025, IOException -> 0x0023 }
        L_0x004b:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.drawable.d.i(android.content.Context, int, java.lang.CharSequence):android.util.AttributeSet");
    }

    public static void j(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            b.a(outline, path);
        } else if (i10 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    public static void k(Drawable drawable, int i10) {
        if (i10 != 0) {
            C6260a.n(drawable, i10);
        } else {
            C6260a.o(drawable, (ColorStateList) null);
        }
    }

    public static PorterDuffColorFilter l(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
