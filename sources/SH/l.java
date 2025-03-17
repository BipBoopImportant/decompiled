package sH;

import QJ.F0;
import XH.C16807N;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
public final class l extends C17544u implements C17642l<Throwable, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ F0 f146999c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(F0 f02) {
        super(1);
        this.f146999c = f02;
    }

    public final void a(Throwable th2) {
        if (th2 != null) {
            this.f146999c.i(new CancellationException(th2.getMessage()));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return C16807N.f139792a;
    }
}
