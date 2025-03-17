package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class G5 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42025c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G5(c cVar) {
        super(0);
        this.f42025c = cVar;
    }

    public final Object invoke() {
        return this.f42025c.b(b.FORGET_ME, false) ? P0.PROPAGATE_STOP : P0.EVALUATE;
    }
}
