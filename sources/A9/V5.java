package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class V5 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42354c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public V5(c cVar) {
        super(0);
        this.f42354c = cVar;
    }

    public final Object invoke() {
        if (!this.f42354c.b(b.PAUSE_TRACKING, false)) {
            return P0.EVALUATE;
        }
        int d10 = this.f42354c.d(b.SESSION_ID, 0);
        int d11 = this.f42354c.d(b.SCREEN_NUMBER, 0);
        this.f42354c.j(b.PAUSED_SESSION_ID, d10);
        this.f42354c.j(b.PAUSED_SCREEN_NUMBER, d11);
        return P0.PROPAGATE_STOP;
    }
}
