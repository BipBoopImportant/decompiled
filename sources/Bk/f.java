package bK;

import QJ.C16320n;
import QJ.C16324p;
import QJ.M;
import QJ.V;
import QJ.q1;
import QJ.r;
import WJ.C16732A;
import XH.C16807N;
import XH.C16814e;
import ZJ.C17016k;
import androidx.concurrent.futures.b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import nI.C17642l;
import nI.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017RR\u0010\u001f\u001a@\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00180\u0018j\u0002`\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00078\u0002X\u0004¨\u0006#"}, d2 = {"LbK/f;", "LbK/j;", "LbK/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "A", "(Ljava/lang/Object;)I", "LXH/N;", "C", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "F", "e", "a", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "LZJ/k;", "", "LdI/i;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "LnI/q;", "onSelectCancellationUnlockConstructor", "c", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends j implements C17052a {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f141200i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h  reason: collision with root package name */
    private final q<C17016k<?>, Object, Object, q<Throwable, Object, C17168i, C16807N>> f141201h;
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u001fj\u0002` H\u0001¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020\u00022\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u000b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b+\u0010,J.\u0010-\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fH\u0001¢\u0006\u0004\b-\u0010.J\u001e\u00101\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0001¢\u0006\u0004\b1\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010;\u001a\u00020\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u000f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"LbK/f$a;", "LQJ/n;", "LXH/N;", "LQJ/q1;", "LQJ/p;", "cont", "", "owner", "<init>", "(LbK/f;LQJ/p;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "LdI/i;", "onCancellation", "j", "(LXH/N;Ljava/lang/Object;LnI/q;)Ljava/lang/Object;", "f", "(LXH/N;LnI/q;)V", "exception", "D", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "T", "(Ljava/lang/Object;)V", "cause", "", "p", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "K", "(LnI/l;)V", "LWJ/A;", "segment", "", "index", "d", "(LWJ/A;I)V", "LQJ/M;", "i", "(LQJ/M;LXH/N;)V", "e", "(LXH/N;LnI/l;)V", "LXH/x;", "result", "resumeWith", "a", "LQJ/p;", "b", "Ljava/lang/Object;", "c", "()Z", "isActive", "h", "isCompleted", "isCancelled", "getContext", "()LdI/i;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements C16320n<C16807N>, q1 {

        /* renamed from: a  reason: collision with root package name */
        public final C16324p<C16807N> f141202a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f141203b;

        public a(C16324p<? super C16807N> pVar, Object obj) {
            this.f141202a = pVar;
            this.f141203b = obj;
        }

        /* access modifiers changed from: private */
        public static final C16807N g(f fVar, a aVar, Throwable th2) {
            fVar.d(aVar.f141203b);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(f fVar, a aVar, Throwable th2, C16807N n10, C17168i iVar) {
            f.f141200i.set(fVar, aVar.f141203b);
            fVar.d(aVar.f141203b);
            return C16807N.f139792a;
        }

        public Object D(Throwable th2) {
            return this.f141202a.D(th2);
        }

        public void K(C17642l<? super Throwable, C16807N> lVar) {
            this.f141202a.K(lVar);
        }

        public void T(Object obj) {
            this.f141202a.T(obj);
        }

        public boolean c() {
            return this.f141202a.c();
        }

        public void d(C16732A<?> a10, int i10) {
            this.f141202a.d(a10, i10);
        }

        @C16814e
        /* renamed from: e */
        public void I(C16807N n10, C17642l<? super Throwable, C16807N> lVar) {
            this.f141202a.I(n10, lVar);
        }

        /* renamed from: f */
        public <R extends C16807N> void P(R r10, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar) {
            f.f141200i.set(f.this, this.f141203b);
            this.f141202a.I(r10, new C17056e(f.this, this));
        }

        public C17168i getContext() {
            return this.f141202a.getContext();
        }

        public boolean h() {
            return this.f141202a.h();
        }

        /* renamed from: i */
        public void E(M m10, C16807N n10) {
            this.f141202a.E(m10, n10);
        }

        public boolean isCancelled() {
            return this.f141202a.isCancelled();
        }

        /* renamed from: j */
        public <R extends C16807N> Object u(R r10, Object obj, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar) {
            Object u10 = this.f141202a.u(r10, obj, new C17055d(f.this, this));
            if (u10 != null) {
                f.f141200i.set(f.this, this.f141203b);
            }
            return u10;
        }

        public boolean p(Throwable th2) {
            return this.f141202a.p(th2);
        }

        public void resumeWith(Object obj) {
            this.f141202a.resumeWith(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f141205a;
        this.f141201h = new C17053b(this);
    }

    private final int A(Object obj) {
        while (c()) {
            Object obj2 = f141200i.get(this);
            if (obj2 != g.f141205a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object B(f fVar, Object obj, C17164e<? super C16807N> eVar) {
        if (fVar.a(obj)) {
            return C16807N.f139792a;
        }
        Object C10 = fVar.C(obj, eVar);
        return C10 == C17187b.f() ? C10 : C16807N.f139792a;
    }

    private final Object C(Object obj, C17164e<? super C16807N> eVar) {
        C16324p<? super C16807N> b10 = r.b(C17187b.c(eVar));
        try {
            h(new a(b10, obj));
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
    public static final q D(f fVar, C17016k kVar, Object obj, Object obj2) {
        return new C17054c(fVar, obj);
    }

    /* access modifiers changed from: private */
    public static final C16807N E(f fVar, Object obj, Throwable th2, Object obj2, C17168i iVar) {
        fVar.d(obj);
        return C16807N.f139792a;
    }

    private final int F(Object obj) {
        while (!t()) {
            if (obj == null) {
                return 1;
            }
            int A10 = A(obj);
            if (A10 == 1) {
                return 2;
            }
            if (A10 == 2) {
                return 1;
            }
        }
        f141200i.set(this, obj);
        return 0;
    }

    public boolean a(Object obj) {
        int F10 = F(obj);
        if (F10 == 0) {
            return true;
        }
        if (F10 == 1) {
            return false;
        }
        if (F10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public boolean c() {
        return m() == 0;
    }

    public void d(Object obj) {
        while (c()) {
            Object obj2 = f141200i.get(this);
            if (obj2 != g.f141205a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (b.a(f141200i, this, obj2, g.f141205a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public Object e(Object obj, C17164e<? super C16807N> eVar) {
        return B(this, obj, eVar);
    }

    public String toString() {
        return "Mutex@" + V.b(this) + "[isLocked=" + c() + ",owner=" + f141200i.get(this) + ']';
    }
}
