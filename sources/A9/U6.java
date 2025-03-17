package a9;

import D8.c;
import H2.a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.C17542s;

public final class U6 {

    /* renamed from: a  reason: collision with root package name */
    public static final U6 f42329a = new U6();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f42330b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f42331c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedBlockingQueue f42332d = new LinkedBlockingQueue(200);

    /* renamed from: e  reason: collision with root package name */
    public static final c f42333e = new c("ContentsquareConsumerExecutor");

    public static void b(a aVar, C6799c1 c1Var) {
        if (A6.a()) {
            aVar.accept(c1Var);
        } else {
            new Handler(Looper.getMainLooper()).post(new T6(aVar, c1Var));
        }
    }

    public static final void d(a aVar, C6799c1 c1Var) {
        C17542s.j(aVar, "$consumer");
        C17542s.j(c1Var, "$runtime");
        aVar.accept(c1Var);
    }

    public final void a(a<C6799c1> aVar) {
        C17542s.j(aVar, "consumer");
        c(false, aVar);
    }

    public final synchronized void c(boolean z10, a<C6799c1> aVar) {
        c cVar;
        String str;
        try {
            C17542s.j(aVar, "consumer");
            if (f42330b) {
                X8.c c10 = X8.c.c();
                if (c10 != null) {
                    C6799c1 f10 = c10.f();
                    C17542s.i(f10, "runtimeModule.runTime");
                    b(aVar, f10);
                } else {
                    f42333e.k("Contentsquare SDK: Unable to call the public API, make sure you are not opted out of the Contentsquare tracker and SDK was correctly initialized.");
                }
            } else {
                if (!z10) {
                    if (!f42331c) {
                        cVar = f42333e;
                        str = "Contentsquare call ignored because SDK is not initialized yet.";
                        cVar.k(str);
                    }
                }
                if (!f42332d.offer(aVar)) {
                    cVar = f42333e;
                    str = "Contentsquare SDK: Initialization pending, API command buffer is full.";
                    cVar.k(str);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
