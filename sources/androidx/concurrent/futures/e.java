package androidx.concurrent.futures;

import QJ.C16324p;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import ob.C10101e;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"T", "Lob/e;", "b", "(Lob/e;LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "c", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, k = 2, mv = {1, 4, 0})
public final class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "L;", "it", "LXH/N;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C10101e f20000c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10101e eVar) {
            super(1);
            this.f20000c = eVar;
        }

        public final void a(Throwable th2) {
            this.f20000c.cancel(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public static final <T> Object b(C10101e<T> eVar, C17164e<? super T> eVar2) {
        try {
            if (eVar.isDone()) {
                return a.F(eVar);
            }
            C16324p pVar = new C16324p(C17187b.c(eVar2), 1);
            eVar.a(new g(eVar, pVar), d.INSTANCE);
            pVar.K(new a(eVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar2);
            }
            return w10;
        } catch (ExecutionException e10) {
            throw c(e10);
        }
    }

    /* access modifiers changed from: private */
    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            C17542s.t();
        }
        return cause;
    }
}
