package QJ;

import GJ.C15765h;
import GJ.C15768k;
import XH.C16807N;
import XH.C16814e;
import dI.C17160a;
import dI.C17164e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00058VX\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0004\u001a\u0004\b%\u0010\u0007R\u001a\u0010*\u001a\u00020\u00058VX\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0004\u001a\u0004\b(\u0010\u0007R\u001a\u0010+\u001a\u00020\u00058VX\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b+\u0010\u0007R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-8VX\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"LQJ/R0;", "LdI/a;", "LQJ/F0;", "<init>", "()V", "", "start", "()Z", "LXH/N;", "j0", "(LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LQJ/k0;", "s", "(LnI/l;)LQJ/k0;", "onCancelling", "invokeImmediately", "A0", "(ZZLnI/l;)LQJ/k0;", "cause", "i", "(Ljava/util/concurrent/CancellationException;)V", "LQJ/w;", "child", "LQJ/u;", "q", "(LQJ/w;)LQJ/u;", "", "toString", "()Ljava/lang/String;", "c", "isActive$annotations", "isActive", "h", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "LGJ/h;", "e", "()LGJ/h;", "getChildren$annotations", "children", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class R0 extends C17160a implements F0 {

    /* renamed from: a  reason: collision with root package name */
    public static final R0 f137599a = new R0();

    private R0() {
        super(F0.f137562d0);
    }

    @C16814e
    public C16315k0 A0(boolean z10, boolean z11, C17642l<? super Throwable, C16807N> lVar) {
        return S0.f137600a;
    }

    public boolean c() {
        return true;
    }

    public C15765h<F0> e() {
        return C15768k.j();
    }

    public boolean h() {
        return false;
    }

    @C16814e
    public void i(CancellationException cancellationException) {
    }

    public boolean isCancelled() {
        return false;
    }

    @C16814e
    public Object j0(C17164e<? super C16807N> eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @C16814e
    public C16333u q(C16337w wVar) {
        return S0.f137600a;
    }

    @C16814e
    public C16315k0 s(C17642l<? super Throwable, C16807N> lVar) {
        return S0.f137600a;
    }

    @C16814e
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @C16814e
    public CancellationException x() {
        throw new IllegalStateException("This job is always active");
    }
}
