package androidx.camera.core.impl;

import C.C4391e0;
import androidx.camera.core.impl.H0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class P0 {

    /* renamed from: b  reason: collision with root package name */
    public static final O0 f16760b = O0.b();

    /* renamed from: c  reason: collision with root package name */
    private static final P0 f16761c = new P0();

    /* renamed from: a  reason: collision with root package name */
    private final F0<O0> f16762a = F0.h(f16760b);

    private static class a<T> implements H0.a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final H2.a<T> f16763a;

        a(H2.a<T> aVar) {
            this.f16763a = aVar;
        }

        public void a(T t10) {
            this.f16763a.accept(t10);
        }

        public void onError(Throwable th2) {
            C4391e0.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }
    }

    public static P0 b() {
        return f16761c;
    }

    public O0 a() {
        try {
            return this.f16762a.a().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, H2.a<O0> aVar) {
        this.f16762a.c(executor, new a(aVar));
    }

    public void d(O0 o02) {
        this.f16762a.g(o02);
    }
}
