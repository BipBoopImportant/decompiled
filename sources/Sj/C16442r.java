package SJ;

import QJ.C16332t0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSJ/A;", "", "cause", "LXH/N;", "a", "(LSJ/A;Ljava/lang/Throwable;)V", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: SJ.r  reason: case insensitive filesystem */
final /* synthetic */ class C16442r {
    public static final void a(C16422A<?> a10, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = C16332t0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        a10.i(cancellationException);
    }
}
