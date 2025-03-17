package QJ;

import XH.C16807N;
import XH.C16814e;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import nI.C17642l;
import nI.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002JO\u0010\f\u001a\u0004\u0018\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H'¢\u0006\u0004\b\u0001\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\n2\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\n0\u0017j\u0002`\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H'¢\u0006\u0004\b\u001f\u0010 JC\u0010!\u001a\u00020\n\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H&¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$¨\u0006)"}, d2 = {"LQJ/n;", "T", "LdI/e;", "R", "value", "", "idempotent", "Lkotlin/Function3;", "", "LdI/i;", "LXH/N;", "onCancellation", "u", "(Ljava/lang/Object;Ljava/lang/Object;LnI/q;)Ljava/lang/Object;", "exception", "D", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "(Ljava/lang/Object;)V", "cause", "", "p", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "K", "(LnI/l;)V", "LQJ/M;", "E", "(LQJ/M;Ljava/lang/Object;)V", "I", "(Ljava/lang/Object;LnI/l;)V", "P", "(Ljava/lang/Object;LnI/q;)V", "c", "()Z", "isActive", "h", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.n  reason: case insensitive filesystem */
public interface C16320n<T> extends C17164e<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(C16320n nVar, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return nVar.p(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    Object D(Throwable th2);

    void E(M m10, T t10);

    @C16814e
    void I(T t10, C17642l<? super Throwable, C16807N> lVar);

    void K(C17642l<? super Throwable, C16807N> lVar);

    <R extends T> void P(R r10, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar);

    void T(Object obj);

    boolean c();

    boolean h();

    boolean isCancelled();

    boolean p(Throwable th2);

    <R extends T> Object u(R r10, Object obj, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar);
}
