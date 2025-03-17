package r6;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.ar.core.ImageMetadata;
import j.C5443a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.xmlpull.v1.XmlPullParserException;
import u2.C6012a;
import w2.C6214h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\t*\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u0019\u001a\u00020\u0000*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)D", "", "g", "(Landroid/content/Context;)J", "", "resId", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", "d", "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "resources", "f", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/r;", "e", "(Landroid/content/Context;)Landroidx/lifecycle/r;", "b", "(Landroid/content/Context;)Landroid/content/Context;", "application", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: r6.d  reason: case insensitive filesystem */
public final class C8696d {
    public static final double a(Context context) {
        try {
            Object j10 = C6012a.j(context, ActivityManager.class);
            C17542s.g(j10);
            return ((ActivityManager) j10).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Context b(Context context) {
        return context.getApplicationContext();
    }

    public static final Drawable c(Context context, int i10) {
        Drawable b10 = C5443a.b(context, i10);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable d(Resources resources, int i10, Resources.Theme theme) {
        Drawable e10 = C6214h.e(resources, i10, theme);
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final r e(Context context) {
        while (!(context instanceof C5221y)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((C5221y) context).getLifecycle();
    }

    @SuppressLint({"ResourceType"})
    public static final Drawable f(Context context, Resources resources, int i10) {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return d(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final long g(Context context) {
        int i10;
        try {
            Object j10 = C6012a.j(context, ActivityManager.class);
            C17542s.g(j10);
            ActivityManager activityManager = (ActivityManager) j10;
            i10 = (context.getApplicationInfo().flags & ImageMetadata.SHADING_MODE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i10 = 256;
        }
        return ((long) i10) * 1048576;
    }
}
