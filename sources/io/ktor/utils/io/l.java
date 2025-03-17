package io.ktor.utils.io;

import GJ.C15765h;
import QJ.C16315k0;
import QJ.C16333u;
import QJ.C16337w;
import QJ.F0;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00060\u000ej\u0002`\u000fH\u0001¢\u0006\u0004\b \u0010!J>\u0010*\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\u0018\u0010(\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00110%j\u0002`'H\u0001¢\u0006\u0004\b*\u0010+J*\u0010,\u001a\u00020)2\u0018\u0010(\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00110%j\u0002`'H\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0011HAø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001c\u00101\u001a\u0002002\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0001¢\u0006\u0004\b1\u00102J\u0018\u00104\u001a\u0002002\u0006\u00103\u001a\u000200H\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\"H\u0001¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030@8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\"8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bD\u00107R\u0014\u0010F\u001a\u00020\"8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bF\u00107R\u0014\u0010H\u001a\u00020\"8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bG\u00107R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bI\u0010J\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lio/ktor/utils/io/l;", "", "Lio/ktor/utils/io/t;", "LQJ/F0;", "delegate", "Lio/ktor/utils/io/c;", "channel", "<init>", "(LQJ/F0;Lio/ktor/utils/io/c;)V", "LQJ/w;", "child", "LQJ/u;", "q", "(LQJ/w;)LQJ/u;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "LXH/N;", "i", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "LdI/i$b;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "x", "()Ljava/util/concurrent/CancellationException;", "", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LQJ/k0;", "A0", "(ZZLnI/l;)LQJ/k0;", "s", "(LnI/l;)LQJ/k0;", "j0", "(LdI/e;)Ljava/lang/Object;", "LdI/i;", "minusKey", "(LdI/i$c;)LdI/i;", "context", "plus", "(LdI/i;)LdI/i;", "start", "()Z", "", "toString", "()Ljava/lang/String;", "a", "LQJ/F0;", "b", "Lio/ktor/utils/io/c;", "()Lio/ktor/utils/io/c;", "LGJ/h;", "e", "()LGJ/h;", "children", "c", "isActive", "isCancelled", "h", "isCompleted", "getKey", "()LdI/i$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l implements F0, t {

    /* renamed from: a  reason: collision with root package name */
    private final F0 f143823a;

    /* renamed from: b  reason: collision with root package name */
    private final c f143824b;

    public l(F0 f02, c cVar) {
        C17542s.j(f02, "delegate");
        C17542s.j(cVar, "channel");
        this.f143823a = f02;
        this.f143824b = cVar;
    }

    public C16315k0 A0(boolean z10, boolean z11, C17642l<? super Throwable, C16807N> lVar) {
        C17542s.j(lVar, "handler");
        return this.f143823a.A0(z10, z11, lVar);
    }

    /* renamed from: a */
    public c d() {
        return this.f143824b;
    }

    public boolean c() {
        return this.f143823a.c();
    }

    public C15765h<F0> e() {
        return this.f143823a.e();
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        C17542s.j(pVar, "operation");
        return this.f143823a.fold(r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        C17542s.j(cVar, "key");
        return this.f143823a.get(cVar);
    }

    public C17168i.c<?> getKey() {
        return this.f143823a.getKey();
    }

    public boolean h() {
        return this.f143823a.h();
    }

    public void i(CancellationException cancellationException) {
        this.f143823a.i(cancellationException);
    }

    public boolean isCancelled() {
        return this.f143823a.isCancelled();
    }

    public Object j0(C17164e<? super C16807N> eVar) {
        return this.f143823a.j0(eVar);
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        C17542s.j(cVar, "key");
        return this.f143823a.minusKey(cVar);
    }

    public C17168i plus(C17168i iVar) {
        C17542s.j(iVar, "context");
        return this.f143823a.plus(iVar);
    }

    public C16333u q(C16337w wVar) {
        C17542s.j(wVar, "child");
        return this.f143823a.q(wVar);
    }

    public C16315k0 s(C17642l<? super Throwable, C16807N> lVar) {
        C17542s.j(lVar, "handler");
        return this.f143823a.s(lVar);
    }

    public boolean start() {
        return this.f143823a.start();
    }

    public String toString() {
        return "ChannelJob[" + this.f143823a + ']';
    }

    public CancellationException x() {
        return this.f143823a.x();
    }
}
