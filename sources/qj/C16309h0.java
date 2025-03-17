package QJ;

import WJ.C16748i;
import dI.C17169j;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQJ/h0;", "Ljava/util/concurrent/Executor;", "LQJ/M;", "dispatcher", "<init>", "(LQJ/M;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "a", "LQJ/M;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.h0  reason: case insensitive filesystem */
final class C16309h0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final M f137633a;

    public C16309h0(M m10) {
        this.f137633a = m10;
    }

    public void execute(Runnable runnable) {
        M m10 = this.f137633a;
        C17169j jVar = C17169j.f142968a;
        if (C16748i.d(m10, jVar)) {
            C16748i.c(this.f137633a, jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f137633a.toString();
    }
}
