package Qb;

import java.util.concurrent.atomic.AtomicInteger;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f62943a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f62944b = new AtomicInteger();

    public void a() {
        this.f62944b.getAndIncrement();
    }

    public void b() {
        this.f62943a.getAndIncrement();
    }

    public void c() {
        this.f62944b.set(0);
    }
}
