package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.n;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.t0  reason: case insensitive filesystem */
public interface C5048t0 {

    /* renamed from: androidx.camera.core.impl.t0$a */
    public interface a {
        void a(C5048t0 t0Var);
    }

    n b();

    int c();

    void close();

    void d();

    int e();

    void f(a aVar, Executor executor);

    n g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
