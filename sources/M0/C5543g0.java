package m0;

import QJ.F0;
import QJ.Q;
import QJ.S;
import XH.C16807N;
import bK.C17052a;
import bK.g;
import d0.i;
import dI.C17164e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH@¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lm0/g0;", "", "<init>", "()V", "Lm0/g0$a;", "mutator", "LXH/N;", "f", "(Lm0/g0$a;)V", "R", "Lm0/e0;", "priority", "Lkotlin/Function1;", "LdI/e;", "block", "d", "(Lm0/e0;LnI/l;LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LbK/a;", "b", "LbK/a;", "mutex", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.g0  reason: case insensitive filesystem */
public final class C5543g0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f25743a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17052a f25744b = g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm0/g0$a;", "", "Lm0/e0;", "priority", "LQJ/F0;", "job", "<init>", "(Lm0/e0;LQJ/F0;)V", "other", "", "a", "(Lm0/g0$a;)Z", "LXH/N;", "b", "()V", "Lm0/e0;", "getPriority", "()Lm0/e0;", "LQJ/F0;", "getJob", "()LQJ/F0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.g0$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C5539e0 f25745a;

        /* renamed from: b  reason: collision with root package name */
        private final F0 f25746b;

        public a(C5539e0 e0Var, F0 f02) {
            this.f25745a = e0Var;
            this.f25746b = f02;
        }

        public final boolean a(a aVar) {
            return this.f25745a.compareTo(aVar.f25745a) >= 0;
        }

        public final void b() {
            this.f25746b.i(new C5541f0());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend")
    /* renamed from: m0.g0$b */
    static final class b extends l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f25747c;

        /* renamed from: d  reason: collision with root package name */
        Object f25748d;

        /* renamed from: e  reason: collision with root package name */
        Object f25749e;

        /* renamed from: f  reason: collision with root package name */
        int f25750f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f25751g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5539e0 f25752h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5543g0 f25753i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super R>, Object> f25754j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5539e0 e0Var, C5543g0 g0Var, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f25752h = e0Var;
            this.f25753i = g0Var;
            this.f25754j = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f25752h, this.f25753i, this.f25754j, eVar);
            bVar.f25751g = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super R> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0096=Splitter:B:20:0x0096, B:27:0x00a9=Splitter:B:27:0x00a9} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f25750f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0040
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r8.f25748d
                m0.g0 r0 = (m0.C5543g0) r0
                java.lang.Object r1 = r8.f25747c
                bK.a r1 = (bK.C17052a) r1
                java.lang.Object r2 = r8.f25751g
                m0.g0$a r2 = (m0.C5543g0.a) r2
                XH.y.b(r9)     // Catch:{ all -> 0x0020 }
                goto L_0x0096
            L_0x0020:
                r9 = move-exception
                goto L_0x00a9
            L_0x0023:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x002b:
                java.lang.Object r1 = r8.f25749e
                m0.g0 r1 = (m0.C5543g0) r1
                java.lang.Object r3 = r8.f25748d
                nI.l r3 = (nI.C17642l) r3
                java.lang.Object r5 = r8.f25747c
                bK.a r5 = (bK.C17052a) r5
                java.lang.Object r6 = r8.f25751g
                m0.g0$a r6 = (m0.C5543g0.a) r6
                XH.y.b(r9)
                r9 = r5
                goto L_0x0081
            L_0x0040:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f25751g
                QJ.Q r9 = (QJ.Q) r9
                m0.g0$a r1 = new m0.g0$a
                m0.e0 r5 = r8.f25752h
                dI.i r9 = r9.getCoroutineContext()
                QJ.F0$b r6 = QJ.F0.f137562d0
                dI.i$b r9 = r9.get(r6)
                kotlin.jvm.internal.C17542s.g(r9)
                QJ.F0 r9 = (QJ.F0) r9
                r1.<init>(r5, r9)
                m0.g0 r9 = r8.f25753i
                r9.f(r1)
                m0.g0 r9 = r8.f25753i
                bK.a r9 = r9.f25744b
                nI.l<dI.e<? super R>, java.lang.Object> r5 = r8.f25754j
                m0.g0 r6 = r8.f25753i
                r8.f25751g = r1
                r8.f25747c = r9
                r8.f25748d = r5
                r8.f25749e = r6
                r8.f25750f = r3
                java.lang.Object r3 = r9.e(r4, r8)
                if (r3 != r0) goto L_0x007d
                return r0
            L_0x007d:
                r3 = r5
                r7 = r6
                r6 = r1
                r1 = r7
            L_0x0081:
                r8.f25751g = r6     // Catch:{ all -> 0x00a3 }
                r8.f25747c = r9     // Catch:{ all -> 0x00a3 }
                r8.f25748d = r1     // Catch:{ all -> 0x00a3 }
                r8.f25749e = r4     // Catch:{ all -> 0x00a3 }
                r8.f25750f = r2     // Catch:{ all -> 0x00a3 }
                java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
                if (r2 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r6
            L_0x0096:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f25743a     // Catch:{ all -> 0x00a1 }
                d0.i.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                r1.d(r4)
                return r9
            L_0x00a1:
                r9 = move-exception
                goto L_0x00b1
            L_0x00a3:
                r0 = move-exception
                r2 = r6
                r7 = r1
                r1 = r9
                r9 = r0
                r0 = r7
            L_0x00a9:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f25743a     // Catch:{ all -> 0x00a1 }
                d0.i.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                throw r9     // Catch:{ all -> 0x00a1 }
            L_0x00b1:
                r1.d(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.C5543g0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object e(C5543g0 g0Var, C5539e0 e0Var, C17642l lVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = C5539e0.Default;
        }
        return g0Var.d(e0Var, lVar, eVar);
    }

    /* access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f25743a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.f25743a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(C5539e0 e0Var, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super R> eVar) {
        return S.f(new b(e0Var, this, lVar, (C17164e<? super b>) null), eVar);
    }
}
