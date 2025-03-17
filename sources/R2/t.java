package R2;

import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import SJ.C16438n;
import SJ.C16444t;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LR2/t;", "T", "", "LQJ/Q;", "scope", "Lkotlin/Function1;", "", "LXH/N;", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "LdI/e;", "consumeMessage", "<init>", "(LQJ/Q;LnI/l;LnI/p;LnI/p;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "LQJ/Q;", "b", "LnI/p;", "LSJ/j;", "c", "LSJ/j;", "messageQueue", "LR2/a;", "d", "LR2/a;", "remainingMessages", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Q f12481a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<T, C17164e<? super C16807N>, Object> f12482b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16434j<T> f12483c = C16437m.b(Integer.MAX_VALUE, (C16428d) null, (C17642l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C4797a f12484d = new C4797a(0);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Throwable, C16807N> f12485c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t<T> f12486d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, C16807N> f12487e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Throwable, C16807N> lVar, t<T> tVar, p<? super T, ? super Throwable, C16807N> pVar) {
            super(1);
            this.f12485c = lVar;
            this.f12486d = tVar;
            this.f12487e = pVar;
        }

        public final void a(Throwable th2) {
            C16807N n10;
            this.f12485c.invoke(th2);
            this.f12486d.f12483c.a(th2);
            do {
                Object f10 = C16438n.f(this.f12486d.f12483c.r());
                if (f10 != null) {
                    this.f12487e.invoke(f10, th2);
                    n10 = C16807N.f139792a;
                    continue;
                } else {
                    n10 = null;
                    continue;
                }
            } while (n10 != null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12488c;

        /* renamed from: d  reason: collision with root package name */
        int f12489d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t<T> f12490e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t<T> tVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f12490e = tVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f12490e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f12489d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r6)
                goto L_0x005d
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f12488c
                nI.p r1 = (nI.p) r1
                XH.y.b(r6)
                goto L_0x0051
            L_0x0022:
                XH.y.b(r6)
                R2.t<T> r6 = r5.f12490e
                R2.a r6 = r6.f12484d
                int r6 = r6.b()
                if (r6 <= 0) goto L_0x006c
            L_0x0031:
                R2.t<T> r6 = r5.f12490e
                QJ.Q r6 = r6.f12481a
                QJ.S.g(r6)
                R2.t<T> r6 = r5.f12490e
                nI.p r1 = r6.f12482b
                R2.t<T> r6 = r5.f12490e
                SJ.j r6 = r6.f12483c
                r5.f12488c = r1
                r5.f12489d = r3
                java.lang.Object r6 = r6.j(r5)
                if (r6 != r0) goto L_0x0051
                return r0
            L_0x0051:
                r4 = 0
                r5.f12488c = r4
                r5.f12489d = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L_0x005d
                return r0
            L_0x005d:
                R2.t<T> r6 = r5.f12490e
                R2.a r6 = r6.f12484d
                int r6 = r6.a()
                if (r6 != 0) goto L_0x0031
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x006c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public t(Q q10, C17642l<? super Throwable, C16807N> lVar, p<? super T, ? super Throwable, C16807N> pVar, p<? super T, ? super C17164e<? super C16807N>, ? extends Object> pVar2) {
        C17542s.j(q10, "scope");
        C17542s.j(lVar, "onComplete");
        C17542s.j(pVar, "onUndeliveredElement");
        C17542s.j(pVar2, "consumeMessage");
        this.f12481a = q10;
        this.f12482b = pVar2;
        F0 f02 = (F0) q10.getCoroutineContext().get(F0.f137562d0);
        if (f02 != null) {
            f02.s(new a(lVar, this, pVar));
        }
    }

    public final void e(T t10) {
        Object k10 = this.f12483c.k(t10);
        if (k10 instanceof C16438n.a) {
            Throwable e10 = C16438n.e(k10);
            if (e10 == null) {
                e10 = new C16444t("Channel was closed normally");
            }
            throw e10;
        } else if (!C16438n.j(k10)) {
            throw new IllegalStateException("Check failed.");
        } else if (this.f12484d.c() == 0) {
            F0 unused = C16314k.d(this.f12481a, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        }
    }
}
