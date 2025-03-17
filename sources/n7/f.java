package N7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.d;
import j.C5443a;
import u2.C6012a;
import w2.C6214h;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f39160a = true;

    public static Drawable a(Context context, int i10, Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, int i10) {
        return c(context, context2, i10, (Resources.Theme) null);
    }

    private static Drawable c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f39160a) {
                return e(context2, i10, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f39160a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C6012a.e(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    private static Drawable d(Context context, int i10, Resources.Theme theme) {
        return C6214h.e(context.getResources(), i10, theme);
    }

    private static Drawable e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            d dVar = new d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return C5443a.b(context, i10);
    }
}
