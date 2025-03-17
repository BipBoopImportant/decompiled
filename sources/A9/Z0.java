package a9;

import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class Z0 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f42408c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z0(E e10) {
        super(0);
        this.f42408c = e10;
    }

    public final Object invoke() {
        return this.f42408c.f41974b.d("session_recording") ? P0.EVALUATE : P0.PROPAGATE_STOP;
    }
}
