package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: a9.w5  reason: case insensitive filesystem */
public final class C6962w5 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42923c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6962w5(c cVar) {
        super(0);
        this.f42923c = cVar;
    }

    public final Object invoke() {
        return this.f42923c.b(b.SESSION_REPLAY_FORCE_START, false) ? P0.PROPAGATE_START : P0.EVALUATE;
    }
}
