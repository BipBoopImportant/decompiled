package a9;

import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.x;

/* renamed from: a9.c5  reason: case insensitive filesystem */
public final class C6803c5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16320n<C16807N> f42485a;

    public C6803c5(C16324p pVar) {
        this.f42485a = pVar;
    }

    public final void run() {
        C16320n<C16807N> nVar = this.f42485a;
        x.a aVar = x.f139812b;
        nVar.resumeWith(x.b(C16807N.f139792a));
    }
}
