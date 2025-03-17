package i1;

import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.S;
import XH.C16807N;
import XH.y;
import d0.i;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import mI.C17604b;
import nI.C17642l;
import nI.p;

@C17604b
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJN\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0001\b\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\u0017"}, d2 = {"Li1/l;", "T", "", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Li1/l$a;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "b", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "LQJ/Q;", "sessionInitializer", "Lkotlin/Function2;", "LdI/e;", "session", "d", "(Ljava/util/concurrent/atomic/AtomicReference;LnI/l;LnI/p;LdI/e;)Ljava/lang/Object;", "c", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l<T> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Li1/l$a;", "T", "", "LQJ/F0;", "job", "value", "<init>", "(LQJ/F0;Ljava/lang/Object;)V", "a", "LQJ/F0;", "()LQJ/F0;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final F0 f24387a;

        /* renamed from: b  reason: collision with root package name */
        private final T f24388b;

        public a(F0 f02, T t10) {
            this.f24387a = f02;
            this.f24388b = t10;
        }

        public final F0 a() {
            return this.f24387a;
        }

        public final T b() {
            return this.f24388b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, d2 = {"R", "T", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {67, 69}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f24389c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f24390d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Q, T> f24391e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AtomicReference<a<T>> f24392f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<T, C17164e<? super R>, Object> f24393g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<? super Q, ? extends T> lVar, AtomicReference<a<T>> atomicReference, p<? super T, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f24391e = lVar;
            this.f24392f = atomicReference;
            this.f24393g = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f24391e, this.f24392f, this.f24393g, eVar);
            bVar.f24390d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super R> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            a aVar2;
            F0 a10;
            Object f10 = C17187b.f();
            int i10 = this.f24389c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f24390d;
                aVar2 = new a(I0.m(q10.getCoroutineContext()), this.f24391e.invoke(q10));
                a andSet = this.f24392f.getAndSet(aVar2);
                if (!(andSet == null || (a10 = andSet.a()) == null)) {
                    this.f24390d = aVar2;
                    this.f24389c = 1;
                    if (I0.g(a10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                aVar2 = (a) this.f24390d;
                y.b(obj);
            } else if (i10 == 2) {
                aVar = (a) this.f24390d;
                try {
                    y.b(obj);
                    i.a(this.f24392f, aVar, (Object) null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                p<T, C17164e<? super R>, Object> pVar = this.f24393g;
                Object b10 = aVar2.b();
                this.f24390d = aVar2;
                this.f24389c = 2;
                obj = pVar.invoke(b10, this);
                if (obj == f10) {
                    return f10;
                }
                aVar = aVar2;
                i.a(this.f24392f, aVar, (Object) null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVar2;
                i.a(this.f24392f, aVar, (Object) null);
                throw th;
            }
        }
    }

    public static <T> AtomicReference<a<T>> a() {
        return b(new AtomicReference((Object) null));
    }

    private static <T> AtomicReference<a<T>> b(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }

    public static final T c(AtomicReference<a<T>> atomicReference) {
        a aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final <R> Object d(AtomicReference<a<T>> atomicReference, C17642l<? super Q, ? extends T> lVar, p<? super T, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super R> eVar) {
        return S.f(new b(lVar, atomicReference, pVar, (C17164e<? super b>) null), eVar);
    }
}
