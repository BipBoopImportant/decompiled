package n0;

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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH@¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u0003R(\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Ln0/N;", "", "<init>", "()V", "Ln0/N$a;", "mutator", "LXH/N;", "h", "(Ln0/N$a;)V", "R", "Ln0/L;", "priority", "Lkotlin/Function1;", "LdI/e;", "block", "d", "(Ln0/L;LnI/l;LdI/e;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "f", "(Ljava/lang/Object;Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "", "g", "()Z", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LbK/a;", "b", "LbK/a;", "mutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.N  reason: case insensitive filesystem */
public final class C5591N {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f26356a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17052a f26357b = g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ln0/N$a;", "", "Ln0/L;", "priority", "LQJ/F0;", "job", "<init>", "(Ln0/L;LQJ/F0;)V", "other", "", "a", "(Ln0/N$a;)Z", "LXH/N;", "b", "()V", "Ln0/L;", "getPriority", "()Ln0/L;", "LQJ/F0;", "getJob", "()LQJ/F0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n0.N$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C5589L f26358a;

        /* renamed from: b  reason: collision with root package name */
        private final F0 f26359b;

        public a(C5589L l10, F0 f02) {
            this.f26358a = l10;
            this.f26359b = f02;
        }

        public final boolean a(a aVar) {
            return this.f26358a.compareTo(aVar.f26358a) >= 0;
        }

        public final void b() {
            this.f26359b.i(new C5590M());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {214, 126}, m = "invokeSuspend")
    /* renamed from: n0.N$b */
    static final class b extends l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f26360c;

        /* renamed from: d  reason: collision with root package name */
        Object f26361d;

        /* renamed from: e  reason: collision with root package name */
        Object f26362e;

        /* renamed from: f  reason: collision with root package name */
        int f26363f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f26364g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5589L f26365h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5591N f26366i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super R>, Object> f26367j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5589L l10, C5591N n10, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f26365h = l10;
            this.f26366i = n10;
            this.f26367j = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f26365h, this.f26366i, this.f26367j, eVar);
            bVar.f26364g = obj;
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
                int r1 = r8.f26363f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0040
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r8.f26361d
                n0.N r0 = (n0.C5591N) r0
                java.lang.Object r1 = r8.f26360c
                bK.a r1 = (bK.C17052a) r1
                java.lang.Object r2 = r8.f26364g
                n0.N$a r2 = (n0.C5591N.a) r2
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
                java.lang.Object r1 = r8.f26362e
                n0.N r1 = (n0.C5591N) r1
                java.lang.Object r3 = r8.f26361d
                nI.l r3 = (nI.C17642l) r3
                java.lang.Object r5 = r8.f26360c
                bK.a r5 = (bK.C17052a) r5
                java.lang.Object r6 = r8.f26364g
                n0.N$a r6 = (n0.C5591N.a) r6
                XH.y.b(r9)
                r9 = r5
                goto L_0x0081
            L_0x0040:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f26364g
                QJ.Q r9 = (QJ.Q) r9
                n0.N$a r1 = new n0.N$a
                n0.L r5 = r8.f26365h
                dI.i r9 = r9.getCoroutineContext()
                QJ.F0$b r6 = QJ.F0.f137562d0
                dI.i$b r9 = r9.get(r6)
                kotlin.jvm.internal.C17542s.g(r9)
                QJ.F0 r9 = (QJ.F0) r9
                r1.<init>(r5, r9)
                n0.N r9 = r8.f26366i
                r9.h(r1)
                n0.N r9 = r8.f26366i
                bK.a r9 = r9.f26357b
                nI.l<dI.e<? super R>, java.lang.Object> r5 = r8.f26367j
                n0.N r6 = r8.f26366i
                r8.f26364g = r1
                r8.f26360c = r9
                r8.f26361d = r5
                r8.f26362e = r6
                r8.f26363f = r3
                java.lang.Object r3 = r9.e(r4, r8)
                if (r3 != r0) goto L_0x007d
                return r0
            L_0x007d:
                r3 = r5
                r7 = r6
                r6 = r1
                r1 = r7
            L_0x0081:
                r8.f26364g = r6     // Catch:{ all -> 0x00a3 }
                r8.f26360c = r9     // Catch:{ all -> 0x00a3 }
                r8.f26361d = r1     // Catch:{ all -> 0x00a3 }
                r8.f26362e = r4     // Catch:{ all -> 0x00a3 }
                r8.f26363f = r2     // Catch:{ all -> 0x00a3 }
                java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
                if (r2 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r6
            L_0x0096:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f26356a     // Catch:{ all -> 0x00a1 }
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
                java.util.concurrent.atomic.AtomicReference r0 = r0.f26356a     // Catch:{ all -> 0x00a1 }
                d0.i.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
                throw r9     // Catch:{ all -> 0x00a1 }
            L_0x00b1:
                r1.d(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.C5591N.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, d2 = {"T", "R", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {214, 167}, m = "invokeSuspend")
    /* renamed from: n0.N$c */
    static final class c extends l implements p<Q, C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f26368c;

        /* renamed from: d  reason: collision with root package name */
        Object f26369d;

        /* renamed from: e  reason: collision with root package name */
        Object f26370e;

        /* renamed from: f  reason: collision with root package name */
        Object f26371f;

        /* renamed from: g  reason: collision with root package name */
        int f26372g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f26373h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5589L f26374i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5591N f26375j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<T, C17164e<? super R>, Object> f26376k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ T f26377l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5589L l10, C5591N n10, p<? super T, ? super C17164e<? super R>, ? extends Object> pVar, T t10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f26374i = l10;
            this.f26375j = n10;
            this.f26376k = pVar;
            this.f26377l = t10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f26374i, this.f26375j, this.f26376k, this.f26377l, eVar);
            cVar.f26373h = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super R> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00b1=Splitter:B:27:0x00b1, B:20:0x009e=Splitter:B:20:0x009e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f26372g
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0042
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r9.f26369d
                n0.N r0 = (n0.C5591N) r0
                java.lang.Object r1 = r9.f26368c
                bK.a r1 = (bK.C17052a) r1
                java.lang.Object r2 = r9.f26373h
                n0.N$a r2 = (n0.C5591N.a) r2
                XH.y.b(r10)     // Catch:{ all -> 0x0020 }
                goto L_0x009e
            L_0x0020:
                r10 = move-exception
                goto L_0x00b1
            L_0x0023:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002b:
                java.lang.Object r1 = r9.f26371f
                n0.N r1 = (n0.C5591N) r1
                java.lang.Object r3 = r9.f26370e
                java.lang.Object r5 = r9.f26369d
                nI.p r5 = (nI.p) r5
                java.lang.Object r6 = r9.f26368c
                bK.a r6 = (bK.C17052a) r6
                java.lang.Object r7 = r9.f26373h
                n0.N$a r7 = (n0.C5591N.a) r7
                XH.y.b(r10)
                r10 = r6
                goto L_0x0087
            L_0x0042:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f26373h
                QJ.Q r10 = (QJ.Q) r10
                n0.N$a r1 = new n0.N$a
                n0.L r5 = r9.f26374i
                dI.i r10 = r10.getCoroutineContext()
                QJ.F0$b r6 = QJ.F0.f137562d0
                dI.i$b r10 = r10.get(r6)
                kotlin.jvm.internal.C17542s.g(r10)
                QJ.F0 r10 = (QJ.F0) r10
                r1.<init>(r5, r10)
                n0.N r10 = r9.f26375j
                r10.h(r1)
                n0.N r10 = r9.f26375j
                bK.a r10 = r10.f26357b
                nI.p<T, dI.e<? super R>, java.lang.Object> r5 = r9.f26376k
                T r6 = r9.f26377l
                n0.N r7 = r9.f26375j
                r9.f26373h = r1
                r9.f26368c = r10
                r9.f26369d = r5
                r9.f26370e = r6
                r9.f26371f = r7
                r9.f26372g = r3
                java.lang.Object r3 = r10.e(r4, r9)
                if (r3 != r0) goto L_0x0083
                return r0
            L_0x0083:
                r3 = r6
                r8 = r7
                r7 = r1
                r1 = r8
            L_0x0087:
                r9.f26373h = r7     // Catch:{ all -> 0x00ab }
                r9.f26368c = r10     // Catch:{ all -> 0x00ab }
                r9.f26369d = r1     // Catch:{ all -> 0x00ab }
                r9.f26370e = r4     // Catch:{ all -> 0x00ab }
                r9.f26371f = r4     // Catch:{ all -> 0x00ab }
                r9.f26372g = r2     // Catch:{ all -> 0x00ab }
                java.lang.Object r2 = r5.invoke(r3, r9)     // Catch:{ all -> 0x00ab }
                if (r2 != r0) goto L_0x009a
                return r0
            L_0x009a:
                r0 = r1
                r1 = r10
                r10 = r2
                r2 = r7
            L_0x009e:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f26356a     // Catch:{ all -> 0x00a9 }
                d0.i.a(r0, r2, r4)     // Catch:{ all -> 0x00a9 }
                r1.d(r4)
                return r10
            L_0x00a9:
                r10 = move-exception
                goto L_0x00b9
            L_0x00ab:
                r0 = move-exception
                r2 = r7
                r8 = r1
                r1 = r10
                r10 = r0
                r0 = r8
            L_0x00b1:
                java.util.concurrent.atomic.AtomicReference r0 = r0.f26356a     // Catch:{ all -> 0x00a9 }
                d0.i.a(r0, r2, r4)     // Catch:{ all -> 0x00a9 }
                throw r10     // Catch:{ all -> 0x00a9 }
            L_0x00b9:
                r1.d(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.C5591N.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object e(C5591N n10, C5589L l10, C17642l lVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = C5589L.Default;
        }
        return n10.d(l10, lVar, eVar);
    }

    /* access modifiers changed from: private */
    public final void h(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f26356a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.f26356a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(C5589L l10, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super R> eVar) {
        return S.f(new b(l10, this, lVar, (C17164e<? super b>) null), eVar);
    }

    public final <T, R> Object f(T t10, C5589L l10, p<? super T, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super R> eVar) {
        return S.f(new c(l10, this, pVar, t10, (C17164e<? super c>) null), eVar);
    }

    public final boolean g() {
        return C17052a.C3460a.b(this.f26357b, (Object) null, 1, (Object) null);
    }

    public final void i() {
        C17052a.C3460a.c(this.f26357b, (Object) null, 1, (Object) null);
    }
}
