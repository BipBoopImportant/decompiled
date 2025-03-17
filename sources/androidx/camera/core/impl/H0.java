package androidx.camera.core.impl;

import java.util.concurrent.Executor;
import ob.C10101e;

public interface H0<T> {

    public interface a<T> {
        void a(T t10);

        void onError(Throwable th2);
    }

    C10101e<T> a();

    void c(Executor executor, a<? super T> aVar);

    void d(a<? super T> aVar);
}
