package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

public abstract class S {
    public static S a(Executor executor, Handler handler) {
        return new C5014c(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
