package Q0;

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
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LQ0/m;", "", "<init>", "()V", "LQ0/m$a;", "mutator", "LXH/N;", "f", "(LQ0/m$a;)V", "R", "Ln0/L;", "priority", "Lkotlin/Function1;", "LdI/e;", "block", "d", "(Ln0/L;LnI/l;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "e", "(LnI/a;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material3/internal/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LbK/a;", "b", "LbK/a;", "mutex", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f12016a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17052a f12017b = g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LQ0/m$a;", "", "Ln0/L;", "priority", "LQJ/F0;", "job", "<init>", "(Ln0/L;LQJ/F0;)V", "other", "", "a", "(LQ0/m$a;)Z", "LXH/N;", "b", "()V", "Ln0/L;", "getPriority", "()Ln0/L;", "LQJ/F0;", "getJob", "()LQJ/F0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C5589L f12018a;

        /* renamed from: b  reason: collision with root package name */
        private final F0 f12019b;

        public a(C5589L l10, F0 f02) {
            this.f12018a = l10;
            this.f12019b = f02;
        }

        public final boolean a(a aVar) {
            return this.f12018a.compareTo(aVar.f12018a) >= 0;
        }

        public final void b() {
            F0.a.a(this.f12019b, (CancellationException) null, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {180, 103}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12020c;

        /* renamed from: d  reason: collision with root package name */
        Object f12021d;

        /* renamed from: e  reason: collision with root package name */
        Object f12022e;

        /* renamed from: f  reason: collision with root package name */
        int f12023f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f12024g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5589L f12025h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m f12026i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super R>, Object> f12027j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5589L l10, m mVar, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f12025h = l10;
            this.f12026i = mVar;
            this.f12027j = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f12025h, this.f12026i, this.f12027j, eVar);
            bVar.f12024g = obj;
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
                int r1 = r8.f12023f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0040
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r8.f12021d
                Q0.m r0 = (Q0.m) r0
                java.lang.Object r1 = r8.f12020c
                bK.a r1 = (bK.C17052a) r1
                java.lang.Object r2 = r8.f12024g
                Q0.m$a r2 = (Q0.m.a) r2
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
                java.lang.Object r1 = r8.f12022e
                Q0.m r1 = (Q0.m) r1
                java.lang.Object r3 = r8.f12021d
                nI.l r3 = (nI.C17642l) r3
                java.lang.Object r5 = r8.f12020c
                bK.a r5 = (bK.C17052a) r5
                java.lang.Object r6 = r8.f12024g
                Q0.m$a r6 = (Q0.m.a) r6
                XH.y.b(r9)
                r9 = r5
                goto L_0x0081
            L_0x0040:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f12024g
                QJ.Q r9 = (QJ.Q) r9
                Q0.m$a r1 = new Q0.m$a
                n0.L r5 = r8.f12025h
                dI.i r9 = r9.getCoroutineContext()
                QJ.F0$b r6 = QJ.F0.f137562d0
                dI.i$b r9 = r9.get(r6)
                kotlin.jvm.internal.C17542s.g(r9)
                QJ.F0 r9 = (QJ.F0) r9
                r1.<init>(r5, r9)
                Q0.m r9 = r8.f12026i
                r9.f(r1)
                Q0.m r9 = r8.f12026i
                bK.a r9 = r9.f12017b
                nI.l<dI.e<? super R>, java.lang.Object> r5 = r8.f12027j
                Q0.m r6 = r8.f12026i
                r8.f12024g = r1
                r8.f12020c = r9
                r8.f12021d = r5
                r8.f12022e = r6
                r8.f12023f = r3
                java.lang.Object r3 = r9.e(r4, r8)
                if (r3 != r0) goto L_0x007d
                return r0
            L_0x007d:
                r3 = r5
                r7 = r6
                r6 = r1
                r1 = r7
            L_0x0081:
                r8.f12024g = r6     // Catch:{ all -> 0x00a3 }
                r8.f12020c = r9     // Catch:{ all -> 0x00a3 }
                r8.f12021d = r1     // Catch:{ all -> 0x00a3 }
                r8.f12022e = r4     // Catch:{ all -> 0x00a3 }
                r8.f12023f = r2     // Catch:{ all -> 0x00a3 }
                java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
                if (r2 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r6
            L_0x0096:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f12016a     // Catch:{ all -> 0x00a1 }
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
                java.util.concurrent.atomic.AtomicReference r0 = r0.f12016a     // Catch:{ all -> 0x00a1 }
                d0.i.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                throw r9     // Catch:{ all -> 0x00a1 }
            L_0x00b1:
                r1.d(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f12016a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.f12016a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(C5589L l10, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super R> eVar) {
        return S.f(new b(l10, this, lVar, (C17164e<? super b>) null), eVar);
    }

    public final boolean e(C17631a<C16807N> aVar) {
        boolean b10 = C17052a.C3460a.b(this.f12017b, (Object) null, 1, (Object) null);
        if (b10) {
            try {
                aVar.invoke();
            } finally {
                C17052a.C3460a.c(this.f12017b, (Object) null, 1, (Object) null);
            }
        }
        return b10;
    }
}
