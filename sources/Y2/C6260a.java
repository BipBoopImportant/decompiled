package y2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: y2.a  reason: case insensitive filesystem */
public final class C6260a {

    /* renamed from: y2.a$a  reason: collision with other inner class name */
    static class C0497a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: y2.a$b */
    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        C0497a.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return C0497a.b(drawable);
    }

    public static void c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    @Deprecated
    public static int d(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(Drawable drawable) {
        return C0497a.c(drawable);
    }

    public static int f(Drawable drawable) {
        return b.a(drawable);
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0497a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    @Deprecated
    public static boolean h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Deprecated
    public static void j(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void k(Drawable drawable, float f10, float f11) {
        C0497a.e(drawable, f10, f11);
    }

    public static void l(Drawable drawable, int i10, int i11, int i12, int i13) {
        C0497a.f(drawable, i10, i11, i12, i13);
    }

    public static boolean m(Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void n(Drawable drawable, int i10) {
        C0497a.g(drawable, i10);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        C0497a.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        C0497a.i(drawable, mode);
    }

    public static <T extends Drawable> T q(Drawable drawable) {
        return drawable instanceof C6261b ? ((C6261b) drawable).a() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return drawable;
    }
}
