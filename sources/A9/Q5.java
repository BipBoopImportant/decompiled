package a9;

import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class Q5 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f42230c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q5(boolean z10) {
        super(0);
        this.f42230c = z10;
    }

    public final Object invoke() {
        return this.f42230c ? P0.PROPAGATE_STOP : P0.EVALUATE;
    }
}
