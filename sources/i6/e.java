package I6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class e implements ThreadFactory {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicInteger f36950d = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadGroup f36951a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f36952b = new AtomicInteger(1);

    /* renamed from: c  reason: collision with root package name */
    private final String f36953c;

    public e() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f36951a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f36953c = "lottie-" + f36950d.getAndIncrement() + "-thread-";
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f36951a;
        Thread thread = new Thread(threadGroup, runnable, this.f36953c + this.f36952b.getAndIncrement(), 0);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
