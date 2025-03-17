package Zc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ga.C7899a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import xa.C8971l;
import xa.C8972m;

/* renamed from: Zc.g  reason: case insensitive filesystem */
public class C9398g {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f65091b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static C9398g f65092c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Handler f65093a;

    private C9398g(Looper looper) {
        this.f65093a = new C7899a(looper);
    }

    public static C9398g a() {
        C9398g gVar;
        synchronized (f65091b) {
            try {
                if (f65092c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f65092c = new C9398g(handlerThread.getLooper());
                }
                gVar = f65092c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Executor d() {
        return u.INSTANCE;
    }

    public <ResultT> C8971l<ResultT> b(Callable<ResultT> callable) {
        C8972m mVar = new C8972m();
        c(new t(callable, mVar));
        return mVar.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
