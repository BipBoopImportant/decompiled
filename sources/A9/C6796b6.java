package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: a9.b6  reason: case insensitive filesystem */
public final class C6796b6 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f42472c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6796b6(c cVar) {
        super(0);
        this.f42472c = cVar;
    }

    public final Object invoke() {
        return !this.f42472c.b(b.TRACKING_ENABLE, false) ? P0.PROPAGATE_STOP : P0.EVALUATE;
    }
}
