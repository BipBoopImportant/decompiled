package com.auth0.android.request.internal;

import D2.i;
import XH.C16807N;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/auth0/android/request/internal/f;", "Lcom/auth0/android/request/internal/k;", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Landroid/os/Looper;", "looper", "Landroid/os/Handler;", "c", "(Landroid/os/Looper;)Landroid/os/Handler;", "Ljava/lang/Runnable;", "runnable", "LXH/N;", "b", "(Ljava/lang/Runnable;)V", "a", "Ljava/util/concurrent/Executor;", "Landroid/os/Handler;", "mainHandler", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f46452a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Handler f46453b;

    public f(Executor executor) {
        C17542s.j(executor, "backgroundExecutor");
        this.f46452a = executor;
    }

    private final Handler c(Looper looper) {
        Handler a10 = i.a(looper);
        C17542s.i(a10, "createAsync(looper)");
        return a10;
    }

    public void a(Runnable runnable) {
        C17542s.j(runnable, "runnable");
        this.f46452a.execute(runnable);
    }

    public void b(Runnable runnable) {
        C17542s.j(runnable, "runnable");
        if (this.f46453b == null) {
            synchronized (this) {
                try {
                    if (this.f46453b == null) {
                        Looper mainLooper = Looper.getMainLooper();
                        C17542s.i(mainLooper, "getMainLooper()");
                        this.f46453b = c(mainLooper);
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Handler handler = this.f46453b;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x000e
            r1 = 4
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            java.lang.String r2 = "newFixedThreadPool(MAX_CONCURRENT_THREADS)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
        L_0x000e:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.request.internal.f.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
