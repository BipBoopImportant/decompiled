package QJ;

import XH.C16807N;
import XH.x;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LQJ/W0;", "LQJ/K0;", "LdI/e;", "LXH/N;", "continuation", "<init>", "(LdI/e;)V", "", "cause", "x", "(Ljava/lang/Throwable;)V", "e", "LdI/e;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class W0 extends K0 {

    /* renamed from: e  reason: collision with root package name */
    private final C17164e<C16807N> f137605e;

    public W0(C17164e<? super C16807N> eVar) {
        this.f137605e = eVar;
    }

    public boolean w() {
        return false;
    }

    public void x(Throwable th2) {
        C17164e<C16807N> eVar = this.f137605e;
        x.a aVar = x.f139812b;
        eVar.resumeWith(x.b(C16807N.f139792a));
    }
}
