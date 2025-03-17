package j5;

import I2.C0;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import f5.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj5/f;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lf5/l;", "c", "(Landroid/content/Context;)Lf5/l;", "Landroid/graphics/Rect;", "a", "(Landroid/content/Context;)Landroid/graphics/Rect;", "LI2/C0;", "b", "(Landroid/content/Context;)LI2/C0;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f54042a = new f();

    private f() {
    }

    public final Rect a(Context context) {
        C17542s.j(context, "context");
        Rect a10 = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        C17542s.i(a10, "wm.currentWindowMetrics.bounds");
        return a10;
    }

    public final C0 b(Context context) {
        C17542s.j(context, "context");
        WindowInsets a10 = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        C17542s.i(a10, "context.getSystemService…indowMetrics.windowInsets");
        C0 y10 = C0.y(a10);
        C17542s.i(y10, "toWindowInsetsCompat(platformInsets)");
        return y10;
    }

    public final l c(Context context) {
        C17542s.j(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        C0 y10 = C0.y(windowManager.getCurrentWindowMetrics().getWindowInsets());
        C17542s.i(y10, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect a10 = windowManager.getCurrentWindowMetrics().getBounds();
        C17542s.i(a10, "wm.currentWindowMetrics.bounds");
        return new l(a10, y10);
    }
}
