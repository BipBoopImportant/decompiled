package QJ;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class h1 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f137634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f137635b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f137636c;

    public /* synthetic */ h1(int i10, String str, AtomicInteger atomicInteger) {
        this.f137634a = i10;
        this.f137635b = str;
        this.f137636c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return i1.c(this.f137634a, this.f137635b, this.f137636c, runnable);
    }
}
