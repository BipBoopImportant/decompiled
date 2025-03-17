package androidx.camera.core.impl;

import I.n;
import androidx.camera.core.impl.H0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import ob.C10101e;

public final class Z<T> implements H0<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final Z<Object> f16832b = new Z<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final C10101e<T> f16833a;

    private Z(T t10) {
        this.f16833a = n.p(t10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(H0.a aVar) {
        try {
            aVar.a(this.f16833a.get());
        } catch (InterruptedException | ExecutionException e10) {
            aVar.onError(e10);
        }
    }

    public static <U> H0<U> f(U u10) {
        return u10 == null ? f16832b : new Z(u10);
    }

    public C10101e<T> a() {
        return this.f16833a;
    }

    public void c(Executor executor, H0.a<? super T> aVar) {
        this.f16833a.a(new Y(this, aVar), executor);
    }

    public void d(H0.a<? super T> aVar) {
    }
}
