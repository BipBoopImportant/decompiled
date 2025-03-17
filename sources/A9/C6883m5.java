package a9;

import D8.c;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.m5  reason: case insensitive filesystem */
public final class C6883m5 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42717a = new c("CanDrawOverlaysWorkAround");

    /* renamed from: b  reason: collision with root package name */
    public final a f42718b = new a();

    /* renamed from: a9.m5$a */
    public static final class a {
        public static boolean a(Context context) {
            C17542s.j(context, "context");
            return Settings.canDrawOverlays(context);
        }
    }

    public final boolean a(Context context) {
        C17542s.j(context, "context");
        if (Build.VERSION.SDK_INT <= 27) {
            this.f42718b.getClass();
            if (a.a(context)) {
                return true;
            }
            try {
                Object systemService = context.getSystemService("window");
                C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) systemService;
                View view = new View(context);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 2038, 16, -2);
                view.setLayoutParams(layoutParams);
                windowManager.addView(view, layoutParams);
                windowManager.removeView(view);
                return true;
            } catch (WindowManager.BadTokenException | WindowManager.InvalidDisplayException e10) {
                H1.a(this.f42717a, "Failed to draw overlay", e10);
                return false;
            }
        } else {
            this.f42718b.getClass();
            return a.a(context);
        }
    }
}
