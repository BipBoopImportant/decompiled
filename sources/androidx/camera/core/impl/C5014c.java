package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.c  reason: case insensitive filesystem */
final class C5014c extends S {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16861a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f16862b;

    C5014c(Executor executor, Handler handler) {
        if (executor != null) {
            this.f16861a = executor;
            if (handler != null) {
                this.f16862b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public Executor b() {
        return this.f16861a;
    }

    public Handler c() {
        return this.f16862b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return this.f16861a.equals(s10.b()) && this.f16862b.equals(s10.c());
    }

    public int hashCode() {
        return ((this.f16861a.hashCode() ^ 1000003) * 1000003) ^ this.f16862b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f16861a + ", schedulerHandler=" + this.f16862b + "}";
    }
}
