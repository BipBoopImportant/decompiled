package Zc;

import K9.C6620s;
import java.io.Closeable;

final class K implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f65084a;

    /* synthetic */ K(o oVar, J j10) {
        this.f65084a = oVar;
        C6620s.p(((Thread) oVar.f65131d.getAndSet(Thread.currentThread())) == null);
    }

    public final void close() {
        this.f65084a.f65131d.set((Object) null);
        this.f65084a.d();
    }
}
