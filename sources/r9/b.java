package R9;

import K9.C6620s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f39752a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f39753b = Executors.defaultThreadFactory();

    public b(String str) {
        C6620s.m(str, "Name must not be null");
        this.f39752a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f39753b.newThread(new c(runnable, 0));
        newThread.setName(this.f39752a);
        return newThread;
    }
}
