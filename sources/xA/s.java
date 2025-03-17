package xa;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class s<T> implements t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f57783a = new CountDownLatch(1);

    /* synthetic */ s(r rVar) {
    }

    public final void a(T t10) {
        this.f57783a.countDown();
    }

    public final void b() {
        this.f57783a.await();
    }

    public final void c(Exception exc) {
        this.f57783a.countDown();
    }

    public final boolean d(long j10, TimeUnit timeUnit) {
        return this.f57783a.await(j10, timeUnit);
    }

    public final void onCanceled() {
        this.f57783a.countDown();
    }
}
