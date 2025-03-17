package bK;

import QJ.C16320n;
import QJ.C16324p;
import QJ.q1;
import QJ.r;
import TH.C16488b;
import WJ.C16732A;
import WJ.C16733B;
import WJ.C16740a;
import XH.C16807N;
import ZJ.C17016k;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0004R\u000b\u0010(\u001a\u00020\u00018\u0002X\u0004R\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0004R\u000b\u0010*\u001a\u00020\u00018\u0002X\u0004R\u000b\u0010+\u001a\u00020\u00018\u0002X\u0004¨\u0006,"}, d2 = {"LbK/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "LXH/N;", "i", "(LdI/e;)Ljava/lang/Object;", "l", "()I", "k", "()V", "LQJ/q1;", "waiter", "", "j", "(LQJ/q1;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "b", "LQJ/n;", "h", "(LQJ/n;)V", "release", "a", "I", "Lkotlin/Function3;", "", "LdI/i;", "LnI/q;", "onCancellationRelease", "m", "availablePermits", "LbK/m;", "head", "deqIdx", "tail", "enqIdx", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f141208c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f141209d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f141210e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f141211f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f141212g;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final int f141213a;

    /* renamed from: b  reason: collision with root package name */
    private final q<Throwable, C16807N, C17168i, C16807N> f141214b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements p<Long, m, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f141215a = new a();

        a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t(((Number) obj).longValue(), (m) obj2);
        }

        public final m t(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements p<Long, m, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141216a = new b();

        b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t(((Number) obj).longValue(), (m) obj2);
        }

        public final m t(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    static {
        Class<j> cls = j.class;
        Class<Object> cls2 = Object.class;
        f141208c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        f141209d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        f141210e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f141211f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        f141212g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public j(int i10, int i11) {
        this.f141213a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        } else if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        } else {
            m mVar = new m(0, (m) null, 2);
            this.head$volatile = mVar;
            this.tail$volatile = mVar;
            this._availablePermits$volatile = i10 - i11;
            this.f141214b = new i(this);
        }
    }

    private final Object i(C17164e<? super C16807N> eVar) {
        C16324p<? super C16807N> b10 = r.b(C17187b.c(eVar));
        try {
            if (!j(b10)) {
                h(b10);
            }
            Object w10 = b10.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10 == C17187b.f() ? w10 : C16807N.f139792a;
        } catch (Throwable th2) {
            b10.O();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public final boolean j(q1 q1Var) {
        Object c10;
        m mVar = (m) f141210e.get(this);
        long andIncrement = f141211f.getAndIncrement(this);
        a aVar = a.f141215a;
        AtomicReferenceFieldUpdater q10 = f141210e;
        long h10 = andIncrement / ((long) l.f141222f);
        loop0:
        while (true) {
            c10 = C16740a.c(mVar, h10, aVar);
            if (C16733B.c(c10)) {
                break;
            }
            C16732A b10 = C16733B.b(c10);
            while (true) {
                C16732A a10 = (C16732A) q10.get(this);
                if (a10.f139524c >= b10.f139524c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(q10, this, a10, b10)) {
                        if (a10.p()) {
                            a10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        m mVar2 = (m) C16733B.b(c10);
        int h11 = (int) (andIncrement % ((long) l.f141222f));
        if (C16488b.a(mVar2.v(), h11, (Object) null, q1Var)) {
            q1Var.d(mVar2, h11);
            return true;
        }
        if (!C16488b.a(mVar2.v(), h11, l.f141218b, l.f141219c)) {
            return false;
        }
        if (q1Var instanceof C16320n) {
            C17542s.h(q1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((C16320n) q1Var).P(C16807N.f139792a, this.f141214b);
        } else if (q1Var instanceof C17016k) {
            ((C17016k) q1Var).c(C16807N.f139792a);
        } else {
            throw new IllegalStateException(("unexpected: " + q1Var).toString());
        }
        return true;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private final void k() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f141212g
            int r0 = r0.get(r3)
            int r1 = r3.f141213a
            if (r0 <= r1) goto L_0x0018
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f141212g
            int r2 = r3.f141213a
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bK.j.k():void");
    }

    private final int l() {
        int andDecrement;
        do {
            andDecrement = f141212g.getAndDecrement(this);
        } while (andDecrement > this.f141213a);
        return andDecrement;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(j jVar, Throwable th2, C16807N n10, C17168i iVar) {
        jVar.release();
        return C16807N.f139792a;
    }

    private final boolean u(Object obj) {
        if (obj instanceof C16320n) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            C16320n nVar = (C16320n) obj;
            Object u10 = nVar.u(C16807N.f139792a, (Object) null, this.f141214b);
            if (u10 == null) {
                return false;
            }
            nVar.T(u10);
            return true;
        } else if (obj instanceof C17016k) {
            return ((C17016k) obj).f(this, C16807N.f139792a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    private final boolean v() {
        Object c10;
        m mVar = (m) f141208c.get(this);
        long andIncrement = f141209d.getAndIncrement(this);
        long h10 = andIncrement / ((long) l.f141222f);
        b bVar = b.f141216a;
        AtomicReferenceFieldUpdater p10 = f141208c;
        loop0:
        while (true) {
            c10 = C16740a.c(mVar, h10, bVar);
            if (C16733B.c(c10)) {
                break;
            }
            C16732A b10 = C16733B.b(c10);
            while (true) {
                C16732A a10 = (C16732A) p10.get(this);
                if (a10.f139524c >= b10.f139524c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(p10, this, a10, b10)) {
                        if (a10.p()) {
                            a10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        m mVar2 = (m) C16733B.b(c10);
        mVar2.c();
        if (mVar2.f139524c > h10) {
            return false;
        }
        int h11 = (int) (andIncrement % ((long) l.f141222f));
        Object andSet = mVar2.v().getAndSet(h11, l.f141218b);
        if (andSet == null) {
            int f10 = l.f141217a;
            for (int i10 = 0; i10 < f10; i10++) {
                if (mVar2.v().get(h11) == l.f141219c) {
                    return true;
                }
            }
            return !C16488b.a(mVar2.v(), h11, l.f141218b, l.f141220d);
        } else if (andSet == l.f141221e) {
            return false;
        } else {
            return u(andSet);
        }
    }

    public final Object b(C17164e<? super C16807N> eVar) {
        if (l() > 0) {
            return C16807N.f139792a;
        }
        Object i10 = i(eVar);
        return i10 == C17187b.f() ? i10 : C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public final void h(C16320n<? super C16807N> nVar) {
        while (l() <= 0) {
            C17542s.h(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((q1) nVar)) {
                return;
            }
        }
        nVar.P(C16807N.f139792a, this.f141214b);
    }

    public final int m() {
        return Math.max(f141212g.get(this), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void release() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f141212g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f141213a
            if (r0 >= r1) goto L_0x0016
            if (r0 < 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = r3.v()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0016:
            r3.k()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f141213a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bK.j.release():void");
    }

    public final boolean t() {
        while (true) {
            int i10 = f141212g.get(this);
            if (i10 > this.f141213a) {
                k();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (f141212g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
