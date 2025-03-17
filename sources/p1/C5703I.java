package p1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a&\u0010\t\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00012\u00020\u0001\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lp1/w0;", "Landroid/graphics/ColorFilter;", "b", "(Lp1/w0;)Landroid/graphics/ColorFilter;", "Lp1/v0;", "color", "Lp1/d0;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "a", "(JI)Landroid/graphics/ColorFilter;", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.I  reason: case insensitive filesystem */
public final class C5703I {
    public static final ColorFilter a(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C5724j0.f27315a.a(j10, i10) : new PorterDuffColorFilter(C5751x0.k(j10), C5700F.c(i10));
    }

    public static final ColorFilter b(C5749w0 w0Var) {
        return w0Var.a();
    }
}
