package D4;

import QJ.C16320n;
import QJ.Q;
import SJ.C16423B;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u000e\u001a\u00028\u0000H\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LD4/X;", "T", "LD4/W;", "LQJ/Q;", "LSJ/B;", "scope", "channel", "<init>", "(LQJ/Q;LSJ/B;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)Z", "element", "LXH/N;", "y", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "LSJ/n;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "block", "v", "(LnI/a;LdI/e;)Ljava/lang/Object;", "LSJ/B;", "getChannel", "()LSJ/B;", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X<T> implements W<T>, Q, C16423B<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16423B<T> f34224a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Q f34225b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {100}, m = "awaitClose")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f34226c;

        /* renamed from: d  reason: collision with root package name */
        Object f34227d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f34228e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ X<T> f34229f;

        /* renamed from: g  reason: collision with root package name */
        int f34230g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(X<T> x10, C17164e<? super a> eVar) {
            super(eVar);
            this.f34229f = x10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34228e = obj;
            this.f34230g |= Integer.MIN_VALUE;
            return this.f34229f.v((C17631a<C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f34231c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16320n<? super C16807N> nVar) {
            super(1);
            this.f34231c = nVar;
        }

        public final void a(Throwable th2) {
            C16320n<C16807N> nVar = this.f34231c;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public X(Q q10, C16423B<? super T> b10) {
        C17542s.j(q10, "scope");
        C17542s.j(b10, "channel");
        this.f34224a = b10;
        this.f34225b = q10;
    }

    public boolean a(Throwable th2) {
        return this.f34224a.a(th2);
    }

    public C17168i getCoroutineContext() {
        return this.f34225b.getCoroutineContext();
    }

    public Object k(T t10) {
        return this.f34224a.k(t10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object v(nI.C17631a<XH.C16807N> r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof D4.X.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            D4.X$a r0 = (D4.X.a) r0
            int r1 = r0.f34230g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34230g = r1
            goto L_0x0018
        L_0x0013:
            D4.X$a r0 = new D4.X$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f34228e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f34230g
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f34227d
            QJ.F0 r6 = (QJ.F0) r6
            java.lang.Object r6 = r0.f34226c
            nI.a r6 = (nI.C17631a) r6
            XH.y.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0076
        L_0x0031:
            r7 = move-exception
            goto L_0x0084
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            XH.y.b(r7)
            dI.i r7 = r5.getCoroutineContext()     // Catch:{ all -> 0x0031 }
            QJ.F0$b r2 = QJ.F0.f137562d0     // Catch:{ all -> 0x0031 }
            dI.i$b r7 = r7.get(r2)     // Catch:{ all -> 0x0031 }
            if (r7 == 0) goto L_0x007c
            QJ.F0 r7 = (QJ.F0) r7     // Catch:{ all -> 0x0031 }
            r0.f34226c = r6     // Catch:{ all -> 0x0031 }
            r0.f34227d = r7     // Catch:{ all -> 0x0031 }
            r0.f34230g = r3     // Catch:{ all -> 0x0031 }
            QJ.p r2 = new QJ.p     // Catch:{ all -> 0x0031 }
            dI.e r4 = eI.C17187b.c(r0)     // Catch:{ all -> 0x0031 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0031 }
            r2.C()     // Catch:{ all -> 0x0031 }
            D4.X$b r3 = new D4.X$b     // Catch:{ all -> 0x0031 }
            r3.<init>(r2)     // Catch:{ all -> 0x0031 }
            r7.s(r3)     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r2.w()     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = eI.C17187b.f()     // Catch:{ all -> 0x0031 }
            if (r7 != r2) goto L_0x0073
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0031 }
        L_0x0073:
            if (r7 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r6.invoke()
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x007c:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            r0.<init>(r7)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0084:
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.X.v(nI.a, dI.e):java.lang.Object");
    }

    public Object y(T t10, C17164e<? super C16807N> eVar) {
        return this.f34224a.y(t10, eVar);
    }
}
