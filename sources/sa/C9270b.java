package Sa;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import x2.C6244c;

/* renamed from: Sa.b  reason: case insensitive filesystem */
public class C9270b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f63247a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f63248b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f63249c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f63250d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f63251e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f63252f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f63253g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f63254h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f63255i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f63256j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f63257k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f63258l = C9270b.class.getSimpleName();

    private C9270b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f63247a) {
            int[] iArr = f63250d;
            return new ColorStateList(new int[][]{f63256j, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f63252f), c(colorStateList, iArr), c(colorStateList, f63248b)});
        }
        int[] iArr2 = f63252f;
        int[] iArr3 = f63253g;
        int[] iArr4 = f63254h;
        int[] iArr5 = f63255i;
        int[] iArr6 = f63248b;
        int[] iArr7 = f63249c;
        int[] iArr8 = f63250d;
        int[] iArr9 = f63251e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f63256j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), c(colorStateList, iArr5), 0, c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    @TargetApi(21)
    private static int b(int i10) {
        return C6244c.p(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f63247a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f63257k, 0)) != 0) {
            Log.w(f63258l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
