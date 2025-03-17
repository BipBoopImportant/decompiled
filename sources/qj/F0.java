package QJ;

import GJ.C15765h;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 (2\u00020\u0001:\u0001)J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H'¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010#\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"LQJ/F0;", "LdI/i$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "LXH/N;", "i", "(Ljava/util/concurrent/CancellationException;)V", "LQJ/w;", "child", "LQJ/u;", "q", "(LQJ/w;)LQJ/u;", "j0", "(LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LQJ/k0;", "s", "(LnI/l;)LQJ/k0;", "onCancelling", "invokeImmediately", "A0", "(ZZLnI/l;)LQJ/k0;", "c", "isActive", "h", "isCompleted", "isCancelled", "LGJ/h;", "e", "()LGJ/h;", "children", "d0", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface F0 extends C17168i.b {

    /* renamed from: d0  reason: collision with root package name */
    public static final b f137562d0 = b.f137563a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(F0 f02, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                f02.i(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(F0 f02, R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
            return C17168i.b.a.a(f02, r10, pVar);
        }

        public static <E extends C17168i.b> E c(F0 f02, C17168i.c<E> cVar) {
            return C17168i.b.a.b(f02, cVar);
        }

        public static /* synthetic */ C16315k0 d(F0 f02, boolean z10, boolean z11, C17642l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return f02.A0(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static C17168i e(F0 f02, C17168i.c<?> cVar) {
            return C17168i.b.a.c(f02, cVar);
        }

        public static C17168i f(F0 f02, C17168i iVar) {
            return C17168i.b.a.d(f02, iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LQJ/F0$b;", "LdI/i$c;", "LQJ/F0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17168i.c<F0> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f137563a = new b();

        private b() {
        }
    }

    C16315k0 A0(boolean z10, boolean z11, C17642l<? super Throwable, C16807N> lVar);

    boolean c();

    C15765h<F0> e();

    boolean h();

    void i(CancellationException cancellationException);

    boolean isCancelled();

    Object j0(C17164e<? super C16807N> eVar);

    C16333u q(C16337w wVar);

    C16315k0 s(C17642l<? super Throwable, C16807N> lVar);

    boolean start();

    CancellationException x();
}
