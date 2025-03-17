package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class W4 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42366c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W4(c cVar) {
        super(0);
        this.f42366c = cVar;
    }

    public final Object invoke() {
        boolean z10 = false;
        int d10 = this.f42366c.d(b.SCREEN_NUMBER, 0);
        int d11 = this.f42366c.d(b.SESSION_ID, 0);
        c cVar = this.f42366c;
        b bVar = b.PAUSED_SESSION_ID;
        int d12 = cVar.d(bVar, -1);
        c cVar2 = this.f42366c;
        b bVar2 = b.PAUSED_SCREEN_NUMBER;
        int d13 = cVar2.d(bVar2, -1);
        boolean z11 = (d12 == -1 || d13 == -1) ? false : true;
        boolean z12 = d11 != d12;
        if (d10 != d13) {
            z10 = true;
        }
        if (z11 && !z12 && !z10) {
            return P0.PROPAGATE_STOP;
        }
        this.f42366c.o(bVar);
        this.f42366c.o(bVar2);
        return P0.EVALUATE;
    }
}
