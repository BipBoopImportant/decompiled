package a9;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.w6  reason: case insensitive filesystem */
public final class C6963w6 implements G6 {

    /* renamed from: a  reason: collision with root package name */
    public final K6 f42924a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f42925b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f42926c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42927d;

    public C6963w6(K6 k62, Handler handler) {
        C17542s.j(k62, "animationSupervisor");
        C17542s.j(handler, "uiHandler");
        this.f42924a = k62;
        this.f42925b = handler;
    }

    public final void a(Window window) {
        C17542s.j(window, "window");
        View decorView = window.getDecorView();
        C17542s.i(decorView, "window.decorView");
        boolean z10 = this.f42927d;
        boolean b10 = this.f42924a.b(decorView);
        this.f42927d = b10;
        if (z10 && !b10) {
            Handler handler = this.f42925b;
            Runnable runnable = this.f42926c;
            if (runnable == null) {
                C17542s.z("onDrawRunnable");
                runnable = null;
            }
            handler.post(runnable);
        }
    }
}
