package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: a9.f5  reason: case insensitive filesystem */
public final class C6827f5 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42563c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6827f5(c cVar) {
        super(0);
        this.f42563c = cVar;
    }

    public final Object invoke() {
        return this.f42563c.d(b.SCREEN_NUMBER, 0) == 0 ? P0.PROPAGATE_STOP : P0.EVALUATE;
    }
}
