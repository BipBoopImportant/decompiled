package Zc;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class w implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f65140a;

    public /* synthetic */ w(ThreadFactory threadFactory) {
        this.f65140a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f65140a.newThread(new v(runnable));
    }
}
