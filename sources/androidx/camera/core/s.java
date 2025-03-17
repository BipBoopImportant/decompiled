package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

final class s extends e {

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f17076d = new AtomicBoolean(false);

    s(n nVar) {
        super(nVar);
    }

    public void close() {
        if (!this.f17076d.getAndSet(true)) {
            super.close();
        }
    }
}
