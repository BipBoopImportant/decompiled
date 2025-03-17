package a9;

import D8.c;
import G8.g;
import HJ.C15854t;
import S8.a;
import java.lang.Thread;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

public final class P implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f42188b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f42189c = new c("CrashHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f42190a;

    public P(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f42190a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = (r1 = r1.c()).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a() {
        /*
            D8.c r0 = f42189c
            java.lang.String r1 = "Trying to attach Crash reporter..."
            r0.f(r1)
            u8.a$a r1 = u8.C8886a.f56874d
            u8.a r1 = r1.a()
            if (r1 == 0) goto L_0x0020
            A8.b r1 = r1.c()
            if (r1 == 0) goto L_0x0020
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r1 = r1.b()
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.f()
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0042
            boolean r1 = f42188b
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = "The Crash reporter is already attached, aborting"
            r0.f(r1)
            goto L_0x0045
        L_0x002d:
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            a9.P r2 = new a9.P
            r2.<init>(r1)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)
            r1 = 1
            f42188b = r1
            java.lang.String r1 = "The Crash reporter has been successfully attached"
        L_0x003e:
            r0.f(r1)
            goto L_0x0045
        L_0x0042:
            java.lang.String r1 = "The Crash reporter could not be attached because it was disabled from Project Config"
            goto L_0x003e
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.P.a():void");
    }

    public final void uncaughtException(Thread thread, Throwable th2) {
        C17542s.j(thread, "thread");
        C17542s.j(th2, "throwable");
        String b10 = g.b(th2, 0, 1, (Object) null);
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        if (C15854t.d0(b10, "com.contentsquare", false, 2, (Object) null)) {
            a.b(a.f39924a, message, b10, (Map) null, 4, (Object) null);
        }
        c.a aVar = c.f34592b;
        D8.a d10 = aVar.d();
        if (d10 != null) {
            d10.b("FATAL", "CSLIB", message, th2);
        }
        D8.a d11 = aVar.d();
        if (d11 != null) {
            d11.d();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f42190a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
