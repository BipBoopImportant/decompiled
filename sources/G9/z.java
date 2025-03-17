package G9;

import java.util.concurrent.Callable;

final class z extends B {

    /* renamed from: f  reason: collision with root package name */
    private final Callable f36350f;

    /* synthetic */ z(Callable callable, A a10) {
        super(false, 1, 5, (String) null, (Throwable) null, (A) null);
        this.f36350f = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return (String) this.f36350f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
