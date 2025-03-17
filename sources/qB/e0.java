package Qb;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xa.C8971l;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f62974a = H.c("awaitEvenIfOnMainThread task continuation executor");

    @Deprecated
    public static <T> T b(C8971l<T> lVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        lVar.h(f62974a, new d0(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000, TimeUnit.MILLISECONDS);
        }
        if (lVar.q()) {
            return lVar.m();
        }
        if (lVar.o()) {
            throw new CancellationException("Task is already canceled");
        } else if (lVar.p()) {
            throw new IllegalStateException(lVar.l());
        } else {
            throw new TimeoutException();
        }
    }

    public static boolean c(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z10 = false;
        try {
            nanos = timeUnit.toNanos(j10);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z10 = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }
}
