package cK;

import GJ.C15765h;
import QJ.C16315k0;
import QJ.C16320n;
import QJ.C16324p;
import QJ.C16333u;
import QJ.C16337w;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Y;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import nI.C17642l;
import nI.p;
import xa.C8961b;
import xa.C8965f;
import xa.C8971l;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "Lxa/l;", "LQJ/Y;", "c", "(Lxa/l;)LQJ/Y;", "Lxa/b;", "cancellationTokenSource", "d", "(Lxa/l;Lxa/b;)LQJ/Y;", "g", "(Lxa/l;LdI/e;)Ljava/lang/Object;", "h", "(Lxa/l;Lxa/b;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cK.d  reason: case insensitive filesystem */
public final class C17078d {

    @Metadata(d1 = {"\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000HA¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHA¢\u0006\u0004\b\u0016\u0010\u0003J*\u0010\u001c\u001a\u00020\u001b2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000e0\u0017j\u0002`\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000e0\u0017j\u0002`\u0019H\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%J*\u0010*\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010'*\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0003¢\u0006\u0004\b*\u0010+J>\u00101\u001a\u00028\u0001\"\n\b\u0001\u0010-*\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00028\u00012\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00028\u00010/H\u0001¢\u0006\u0004\b1\u00102J\u001c\u00103\u001a\u00020\"2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(H\u0001¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u00020\n8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b5\u0010\fR\u0014\u00108\u001a\u00020\n8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b7\u0010\fR\u0014\u00109\u001a\u00020\n8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b9\u0010\fR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0018\u0010)\u001a\u0006\u0012\u0002\b\u00030(8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"cK/d$a", "LQJ/Y;", "f", "(LdI/e;)Ljava/lang/Object;", "o", "()Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "LXH/N;", "i", "(Ljava/util/concurrent/CancellationException;)V", "LQJ/w;", "child", "LQJ/u;", "q", "(LQJ/w;)LQJ/u;", "j0", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LQJ/k0;", "s", "(LnI/l;)LQJ/k0;", "onCancelling", "invokeImmediately", "A0", "(ZZLnI/l;)LQJ/k0;", "LdI/i;", "context", "plus", "(LdI/i;)LdI/i;", "LdI/i$b;", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "minusKey", "(LdI/i$c;)LdI/i;", "c", "isActive", "h", "isCompleted", "isCancelled", "LGJ/h;", "LQJ/F0;", "e", "()LGJ/h;", "children", "getKey", "()LdI/i$c;", "kotlinx-coroutines-play-services"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cK.d$a */
    public static final class a implements Y<T> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C16339x<T> f141374a;

        a(C16339x<T> xVar) {
            this.f141374a = xVar;
        }

        public C16315k0 A0(boolean z10, boolean z11, C17642l<? super Throwable, C16807N> lVar) {
            return this.f141374a.A0(z10, z11, lVar);
        }

        public boolean c() {
            return this.f141374a.c();
        }

        public C15765h<F0> e() {
            return this.f141374a.e();
        }

        public Object f(C17164e<? super T> eVar) {
            return this.f141374a.f(eVar);
        }

        public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
            return this.f141374a.fold(r10, pVar);
        }

        public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
            return this.f141374a.get(cVar);
        }

        public C17168i.c<?> getKey() {
            return this.f141374a.getKey();
        }

        public boolean h() {
            return this.f141374a.h();
        }

        public void i(CancellationException cancellationException) {
            this.f141374a.i(cancellationException);
        }

        public boolean isCancelled() {
            return this.f141374a.isCancelled();
        }

        public Object j0(C17164e<? super C16807N> eVar) {
            return this.f141374a.j0(eVar);
        }

        public C17168i minusKey(C17168i.c<?> cVar) {
            return this.f141374a.minusKey(cVar);
        }

        public T o() {
            return this.f141374a.o();
        }

        public C17168i plus(C17168i iVar) {
            return this.f141374a.plus(iVar);
        }

        public C16333u q(C16337w wVar) {
            return this.f141374a.q(wVar);
        }

        public C16315k0 s(C17642l<? super Throwable, C16807N> lVar) {
            return this.f141374a.s(lVar);
        }

        public boolean start() {
            return this.f141374a.start();
        }

        public CancellationException x() {
            return this.f141374a.x();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cK.d$b */
    static final class b<TResult> implements C8965f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<T> f141375a;

        b(C16320n<? super T> nVar) {
            this.f141375a = nVar;
        }

        public final void onComplete(C8971l<T> lVar) {
            Exception l10 = lVar.l();
            if (l10 != null) {
                C16320n<T> nVar = this.f141375a;
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(y.a(l10)));
            } else if (lVar.o()) {
                C16320n.a.a(this.f141375a, (Throwable) null, 1, (Object) null);
            } else {
                C16320n<T> nVar2 = this.f141375a;
                x.a aVar2 = x.f139812b;
                nVar2.resumeWith(x.b(lVar.m()));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cK.d$c */
    static final class c implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8961b f141376a;

        c(C8961b bVar) {
            this.f141376a = bVar;
        }

        public final void a(Throwable th2) {
            this.f141376a.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public static final <T> Y<T> c(C8971l<T> lVar) {
        return d(lVar, (C8961b) null);
    }

    private static final <T> Y<T> d(C8971l<T> lVar, C8961b bVar) {
        C16339x b10 = C16343z.b((F0) null, 1, (Object) null);
        if (lVar.p()) {
            Exception l10 = lVar.l();
            if (l10 != null) {
                b10.g(l10);
            } else if (lVar.o()) {
                F0.a.a(b10, (CancellationException) null, 1, (Object) null);
            } else {
                b10.J(lVar.m());
            }
        } else {
            lVar.b(C17075a.f141371a, new C17076b(b10));
        }
        if (bVar != null) {
            b10.s(new C17077c(bVar));
        }
        return new a(b10);
    }

    /* access modifiers changed from: private */
    public static final void e(C16339x xVar, C8971l lVar) {
        Exception l10 = lVar.l();
        if (l10 != null) {
            xVar.g(l10);
        } else if (lVar.o()) {
            F0.a.a(xVar, (CancellationException) null, 1, (Object) null);
        } else {
            xVar.J(lVar.m());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8961b bVar, Throwable th2) {
        bVar.a();
        return C16807N.f139792a;
    }

    public static final <T> Object g(C8971l<T> lVar, C17164e<? super T> eVar) {
        return h(lVar, (C8961b) null, eVar);
    }

    private static final <T> Object h(C8971l<T> lVar, C8961b bVar, C17164e<? super T> eVar) {
        if (lVar.p()) {
            Exception l10 = lVar.l();
            if (l10 != null) {
                throw l10;
            } else if (!lVar.o()) {
                return lVar.m();
            } else {
                throw new CancellationException("Task " + lVar + " was cancelled normally.");
            }
        } else {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            lVar.b(C17075a.f141371a, new b(pVar));
            if (bVar != null) {
                pVar.K(new c(bVar));
            }
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10;
        }
    }
}
