package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.n;
import java.util.concurrent.atomic.AtomicReference;
import qb.C10162g;
import qb.C10177v;
import qb.C10178w;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    private static h f67866b = new h();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<n> f67867a = new AtomicReference<>(new n.b().c());

    h() {
    }

    public static h c() {
        return f67866b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        return this.f67867a.get().c(cls);
    }

    public <KeyT extends C10162g, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) {
        return this.f67867a.get().d(keyt, cls);
    }

    public synchronized <KeyT extends C10162g, PrimitiveT> void d(l<KeyT, PrimitiveT> lVar) {
        this.f67867a.set(new n.b(this.f67867a.get()).d(lVar).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(C10178w<InputPrimitiveT, WrapperPrimitiveT> wVar) {
        this.f67867a.set(new n.b(this.f67867a.get()).e(wVar).c());
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(C10177v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) {
        return this.f67867a.get().e(vVar, cls);
    }
}
