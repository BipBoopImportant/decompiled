package androidx.work;

import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.concurrent.futures.c;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import ob.C10101e;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "LdI/i;", "context", "LQJ/T;", "start", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "block", "Lob/e;", "j", "(LdI/i;LQJ/T;LnI/p;)Lob/e;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;LnI/a;)Lob/e;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.v  reason: case insensitive filesystem */
public final class C7052v {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: androidx.work.v$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45319c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f45320d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<Q, C17164e<? super T>, Object> f45321e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.a<T> f45322f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar, c.a<T> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f45321e = pVar;
            this.f45322f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f45321e, this.f45322f, eVar);
            aVar.f45320d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45319c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f45320d;
                p<Q, C17164e<? super T>, Object> pVar = this.f45321e;
                this.f45319c = 1;
                obj = pVar.invoke(q10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (CancellationException unused) {
                    this.f45322f.d();
                } catch (Throwable th2) {
                    this.f45322f.f(th2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f45322f.c(obj);
            return C16807N.f139792a;
        }
    }

    public static final <V> C10101e<V> f(Executor executor, String str, C17631a<? extends V> aVar) {
        C17542s.j(executor, "<this>");
        C17542s.j(str, "debugTag");
        C17542s.j(aVar, "block");
        C10101e<V> a10 = c.a(new r(executor, str, aVar));
        C17542s.i(a10, "getFuture { completer ->… }\n        debugTag\n    }");
        return a10;
    }

    /* access modifiers changed from: private */
    public static final Object g(Executor executor, String str, C17631a aVar, c.a aVar2) {
        C17542s.j(aVar2, "completer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar2.a(new C7050t(atomicBoolean), C7040i.INSTANCE);
        executor.execute(new C7051u(atomicBoolean, aVar2, aVar));
        return str;
    }

    /* access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* access modifiers changed from: private */
    public static final void i(AtomicBoolean atomicBoolean, c.a aVar, C17631a aVar2) {
        if (!atomicBoolean.get()) {
            try {
                aVar.c(aVar2.invoke());
            } catch (Throwable th2) {
                aVar.f(th2);
            }
        }
    }

    public static final <T> C10101e<T> j(C17168i iVar, T t10, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar) {
        C17542s.j(iVar, "context");
        C17542s.j(t10, "start");
        C17542s.j(pVar, "block");
        C10101e<T> a10 = c.a(new C7048q(iVar, t10, pVar));
        C17542s.i(a10, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return a10;
    }

    public static /* synthetic */ C10101e k(C17168i iVar, T t10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            t10 = T.DEFAULT;
        }
        return j(iVar, t10, pVar);
    }

    /* access modifiers changed from: private */
    public static final Object l(C17168i iVar, T t10, p pVar, c.a aVar) {
        C17542s.j(aVar, "completer");
        aVar.a(new C7049s((F0) iVar.get(F0.f137562d0)), C7040i.INSTANCE);
        return C16314k.d(S.a(iVar), (C17168i) null, t10, new a(pVar, aVar, (C17164e<? super a>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void m(F0 f02) {
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
    }
}
