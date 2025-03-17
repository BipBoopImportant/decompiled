package androidx.room;

import QJ.C16310i;
import QJ.C16320n;
import QJ.C16324p;
import QJ.Q;
import QJ.d1;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"R", "Landroidx/room/x;", "Lkotlin/Function1;", "LdI/e;", "", "block", "d", "(Landroidx/room/x;LnI/l;LdI/e;)Ljava/lang/Object;", "LdI/i;", "context", "Lkotlin/Function2;", "LQJ/Q;", "transactionBlock", "c", "(Landroidx/room/x;LdI/i;LnI/p;LdI/e;)Ljava/lang/Object;", "LdI/f;", "dispatcher", "b", "(Landroidx/room/x;LdI/f;)LdI/i;", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17168i f44438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16320n<R> f44439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f44440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<Q, C17164e<? super R>, Object> f44441d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
        /* renamed from: androidx.room.y$a$a  reason: collision with other inner class name */
        static final class C0763a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f44442c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f44443d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ x f44444e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C16320n<R> f44445f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ p<Q, C17164e<? super R>, Object> f44446g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0763a(x xVar, C16320n<? super R> nVar, p<? super Q, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super C0763a> eVar) {
                super(2, eVar);
                this.f44444e = xVar;
                this.f44445f = nVar;
                this.f44446g = pVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0763a aVar = new C0763a(this.f44444e, this.f44445f, this.f44446g, eVar);
                aVar.f44443d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0763a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17164e eVar;
                Object f10 = C17187b.f();
                int i10 = this.f44442c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    C17168i.b bVar = ((Q) this.f44443d).getCoroutineContext().get(C17165f.f142966s0);
                    C17542s.g(bVar);
                    C17168i a10 = y.b(this.f44444e, (C17165f) bVar);
                    C16320n<R> nVar = this.f44445f;
                    x.a aVar = x.f139812b;
                    p<Q, C17164e<? super R>, Object> pVar = this.f44446g;
                    this.f44443d = nVar;
                    this.f44442c = 1;
                    obj = C16310i.g(a10, pVar, this);
                    if (obj == f10) {
                        return f10;
                    }
                    eVar = nVar;
                } else if (i10 == 1) {
                    eVar = (C17164e) this.f44443d;
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar.resumeWith(x.b(obj));
                return C16807N.f139792a;
            }
        }

        a(C17168i iVar, C16320n<? super R> nVar, x xVar, p<? super Q, ? super C17164e<? super R>, ? extends Object> pVar) {
            this.f44438a = iVar;
            this.f44439b = nVar;
            this.f44440c = xVar;
            this.f44441d = pVar;
        }

        public final void run() {
            try {
                C16310i.e(this.f44438a.minusKey(C17165f.f142966s0), new C0763a(this.f44440c, this.f44439b, this.f44441d, (C17164e<? super C0763a>) null));
            } catch (Throwable th2) {
                this.f44439b.p(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {62}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f44447c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f44448d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ x f44449e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super R>, Object> f44450f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(x xVar, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f44449e = xVar;
            this.f44450f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f44449e, this.f44450f, eVar);
            bVar.f44448d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super R> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            I i10;
            Throwable th2;
            Object f10 = C17187b.f();
            int i11 = this.f44447c;
            if (i11 == 0) {
                XH.y.b(obj);
                C17168i.b bVar = ((Q) this.f44448d).getCoroutineContext().get(I.f44244c);
                C17542s.g(bVar);
                I i12 = (I) bVar;
                i12.a();
                try {
                    this.f44449e.beginTransaction();
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    i10 = i12;
                    th = th4;
                    i10.j();
                    throw th;
                }
                try {
                    C17642l<C17164e<? super R>, Object> lVar = this.f44450f;
                    this.f44448d = i12;
                    this.f44447c = 1;
                    Object invoke = lVar.invoke(this);
                    if (invoke == f10) {
                        return f10;
                    }
                    i10 = i12;
                    obj = invoke;
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    i10 = i12;
                    th2 = th6;
                    this.f44449e.endTransaction();
                    throw th2;
                }
            } else if (i11 == 1) {
                i10 = (I) this.f44448d;
                try {
                    XH.y.b(obj);
                } catch (Throwable th7) {
                    th2 = th7;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f44449e.setTransactionSuccessful();
            try {
                this.f44449e.endTransaction();
                i10.j();
                return obj;
            } catch (Throwable th8) {
                th = th8;
                i10.j();
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C17168i b(x xVar, C17165f fVar) {
        I i10 = new I(fVar);
        return fVar.plus(i10).plus(d1.a(xVar.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(i10))));
    }

    private static final <R> Object c(x xVar, C17168i iVar, p<? super Q, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super R> eVar) {
        C16324p pVar2 = new C16324p(C17187b.c(eVar), 1);
        pVar2.C();
        try {
            xVar.getTransactionExecutor().execute(new a(iVar, pVar2, xVar, pVar));
        } catch (RejectedExecutionException e10) {
            pVar2.p(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object w10 = pVar2.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    public static final <R> Object d(x xVar, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super R> eVar) {
        C17165f fVar = null;
        b bVar = new b(xVar, lVar, (C17164e<? super b>) null);
        I i10 = (I) eVar.getContext().get(I.f44244c);
        if (i10 != null) {
            fVar = i10.b();
        }
        return fVar != null ? C16310i.g(fVar, bVar, eVar) : c(xVar, eVar.getContext(), bVar, eVar);
    }
}
