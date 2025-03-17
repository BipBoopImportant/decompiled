package WJ;

import QJ.C16287E;
import QJ.C16305f0;
import QJ.C16320n;
import QJ.C16323o0;
import QJ.C16324p;
import QJ.M;
import QJ.V;
import QJ.e1;
import XH.C16807N;
import androidx.concurrent.futures.b;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001a\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0014R\u001c\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010$\u001a\u00020#8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0004¨\u0006@"}, d2 = {"LWJ/h;", "T", "LQJ/f0;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "LdI/e;", "LQJ/M;", "dispatcher", "continuation", "<init>", "(LQJ/M;LdI/e;)V", "", "o", "()Z", "LXH/N;", "j", "()V", "r", "LQJ/p;", "k", "()LQJ/p;", "LQJ/n;", "", "s", "(LQJ/n;)Ljava/lang/Throwable;", "cause", "q", "(Ljava/lang/Throwable;)Z", "", "i", "()Ljava/lang/Object;", "LXH/x;", "result", "resumeWith", "(Ljava/lang/Object;)V", "LdI/i;", "context", "value", "l", "(LdI/i;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "d", "LQJ/M;", "e", "LdI/e;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "m", "reusableCancellableContinuation", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "b", "()LdI/e;", "delegate", "getContext", "()LdI/i;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.h  reason: case insensitive filesystem */
public final class C16747h<T> extends C16305f0<T> implements e, C17164e<T> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139550h = AtomicReferenceFieldUpdater.newUpdater(C16747h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final M f139551d;

    /* renamed from: e  reason: collision with root package name */
    public final C17164e<T> f139552e;

    /* renamed from: f  reason: collision with root package name */
    public Object f139553f = C16748i.f139555a;

    /* renamed from: g  reason: collision with root package name */
    public final Object f139554g = K.g(getContext());

    public C16747h(M m10, C17164e<? super T> eVar) {
        super(-1);
        this.f139551d = m10;
        this.f139552e = eVar;
    }

    private final C16324p<?> m() {
        Object obj = f139550h.get(this);
        if (obj instanceof C16324p) {
            return (C16324p) obj;
        }
        return null;
    }

    public C17164e<T> b() {
        return this;
    }

    public e getCallerFrame() {
        C17164e<T> eVar = this.f139552e;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public C17168i getContext() {
        return this.f139552e.getContext();
    }

    public Object i() {
        Object obj = this.f139553f;
        this.f139553f = C16748i.f139555a;
        return obj;
    }

    public final void j() {
        do {
        } while (f139550h.get(this) == C16748i.f139556b);
    }

    public final C16324p<T> k() {
        AtomicReferenceFieldUpdater n10 = f139550h;
        while (true) {
            Object obj = n10.get(this);
            if (obj == null) {
                f139550h.set(this, C16748i.f139556b);
                return null;
            } else if (obj instanceof C16324p) {
                if (b.a(f139550h, this, obj, C16748i.f139556b)) {
                    return (C16324p) obj;
                }
            } else if (obj != C16748i.f139556b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(C17168i iVar, T t10) {
        this.f139553f = t10;
        this.f137629c = 1;
        this.f139551d.F0(iVar, this);
    }

    public final boolean o() {
        return f139550h.get(this) != null;
    }

    public final boolean q(Throwable th2) {
        AtomicReferenceFieldUpdater n10 = f139550h;
        while (true) {
            Object obj = n10.get(this);
            C16735D d10 = C16748i.f139556b;
            if (C17542s.e(obj, d10)) {
                if (b.a(f139550h, this, d10, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f139550h, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        C16324p<?> m10 = m();
        if (m10 != null) {
            m10.q();
        }
    }

    public void resumeWith(Object obj) {
        C17168i context;
        Object i10;
        Object b10 = C16287E.b(obj);
        if (C16748i.d(this.f139551d, getContext())) {
            this.f139553f = b10;
            this.f137629c = 0;
            C16748i.c(this.f139551d, getContext(), this);
            return;
        }
        C16323o0 b11 = e1.f137624a.b();
        if (b11.Y0()) {
            this.f139553f = b10;
            this.f137629c = 0;
            b11.S0(this);
            return;
        }
        b11.W0(true);
        try {
            context = getContext();
            i10 = K.i(context, this.f139554g);
            this.f139552e.resumeWith(obj);
            C16807N n10 = C16807N.f139792a;
            K.f(context, i10);
            do {
            } while (b11.h1());
        } catch (Throwable th2) {
            b11.P0(true);
            throw th2;
        }
        b11.P0(true);
    }

    public final Throwable s(C16320n<?> nVar) {
        C16735D d10;
        AtomicReferenceFieldUpdater n10 = f139550h;
        do {
            Object obj = n10.get(this);
            d10 = C16748i.f139556b;
            if (obj != d10) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f139550h, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } while (!b.a(f139550h, this, d10, nVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f139551d + ", " + V.c(this.f139552e) + ']';
    }
}
