package QJ;

import QJ.C16325p0;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LQJ/q0;", "LQJ/o0;", "<init>", "()V", "LXH/N;", "D1", "", "now", "LQJ/p0$c;", "delayedTask", "y1", "(JLQJ/p0$c;)V", "Ljava/lang/Thread;", "o1", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.q0  reason: case insensitive filesystem */
public abstract class C16327q0 extends C16323o0 {
    /* access modifiers changed from: protected */
    public final void D1() {
        Thread o12 = o1();
        if (Thread.currentThread() != o12) {
            C16298c.a();
            LockSupport.unpark(o12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Thread o1();

    /* access modifiers changed from: protected */
    public void y1(long j10, C16325p0.c cVar) {
        W.f137603h.p2(j10, cVar);
    }
}
